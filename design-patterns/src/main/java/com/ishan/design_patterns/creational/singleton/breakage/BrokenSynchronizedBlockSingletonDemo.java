package com.ishan.design_patterns.creational.singleton.breakage;

public class BrokenSynchronizedBlockSingletonDemo {

    static class SingletonWithIncompleteSynchronization {

        private static SingletonWithIncompleteSynchronization instance;

        private SingletonWithIncompleteSynchronization() {
        }

        public static SingletonWithIncompleteSynchronization getInstance() {
            if (instance == null) { // ❌ first check outside synchronized
                simulateDelay();
                synchronized (SingletonWithIncompleteSynchronization.class) {
                    // ❌ missing second null check
                    instance = new SingletonWithIncompleteSynchronization();
                }
            }
            return instance;
        }

        private static void simulateDelay() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {
            }
        }
    }

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println(
                    "Thread " + Thread.currentThread().getName()
                            + " calling getInstance()"
            );

            SingletonWithIncompleteSynchronization instance =
                    SingletonWithIncompleteSynchronization.getInstance();

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
                "\nResult: Singleton is broken due to missing second null check inside synchronized block."
        );
    }
}
