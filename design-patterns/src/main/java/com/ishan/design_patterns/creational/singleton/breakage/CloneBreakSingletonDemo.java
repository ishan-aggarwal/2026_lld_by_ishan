package com.ishan.design_patterns.creational.singleton.breakage;

public class CloneBreakSingletonDemo {

    static class CloneableSingletonWithoutProtection implements Cloneable {

        private static CloneableSingletonWithoutProtection instance;

        private CloneableSingletonWithoutProtection() {
        }

        public static CloneableSingletonWithoutProtection getInstance() {
            if (instance == null) {
                instance = new CloneableSingletonWithoutProtection();
            }
            return instance;
        }

        @Override
        protected CloneableSingletonWithoutProtection clone() {
            try {
                return (CloneableSingletonWithoutProtection) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }
    }

    public static void main(String[] args) {

        CloneableSingletonWithoutProtection instance1 =
                CloneableSingletonWithoutProtection.getInstance();

        CloneableSingletonWithoutProtection instance2 =
                instance1.clone();

        System.out.println("Instance 1 identityHashCode: "
                + System.identityHashCode(instance1));

        System.out.println("Instance 2 identityHashCode: "
                + System.identityHashCode(instance2));

        System.out.println(
                "\nResult: Singleton is broken because clone() creates a new instance."
        );
    }
}
