package com.ishan.design_patterns.creational.singleton.breakage;

public class LazySingletonThreadBreakDemo {

    static class LazySingletonWithoutSynchronization {

        private static LazySingletonWithoutSynchronization instance;

        private LazySingletonWithoutSynchronization() {
        }

        public static LazySingletonWithoutSynchronization getInstance() {
            if (instance == null) {
                // Artificial delay to amplify race condition
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {
                }
                instance = new LazySingletonWithoutSynchronization();
            }
            return instance;
        }
    }

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println(
                    "Thread " + Thread.currentThread().getName()
                            + " calling getInstance()"
            );

            LazySingletonWithoutSynchronization instance =
                    LazySingletonWithoutSynchronization.getInstance();

            System.out.println(
                    "Thread " + Thread.currentThread().getName()
                            + " got instance with identityHashCode: "
                            + System.identityHashCode(instance)
            );
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ignored) {
        }

        System.out.println(
                "\nResult: Different identityHashCodes demonstrate that the Singleton is broken due to a race condition."
        );
    }
}
