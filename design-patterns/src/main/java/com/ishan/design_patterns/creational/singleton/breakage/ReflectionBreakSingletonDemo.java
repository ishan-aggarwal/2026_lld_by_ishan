package com.ishan.design_patterns.creational.singleton.breakage;

import java.lang.reflect.Constructor;

// Reflection can access private constructors and create multiple instances unless
// the constructor explicitly defends against it.

public class ReflectionBreakSingletonDemo {

    static class SingletonVulnerableToReflection {

        private static SingletonVulnerableToReflection instance;

        private SingletonVulnerableToReflection() {
        }

        public static SingletonVulnerableToReflection getInstance() {
            if (instance == null) {
                instance = new SingletonVulnerableToReflection();
            }
            return instance;
        }
    }

    public static void main(String[] args) {

        SingletonVulnerableToReflection instance1 =
                SingletonVulnerableToReflection.getInstance();

        SingletonVulnerableToReflection instance2 = null;

        try {
            Constructor<SingletonVulnerableToReflection> constructor =
                    SingletonVulnerableToReflection.class
                            .getDeclaredConstructor();

            constructor.setAccessible(true);
            instance2 = constructor.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Instance 1 identityHashCode: "
                + System.identityHashCode(instance1));

        System.out.println("Instance 2 identityHashCode: "
                + System.identityHashCode(instance2));

        System.out.println(
                "\nResult: Reflection bypasses the private constructor and breaks the Singleton."
        );
    }
}
