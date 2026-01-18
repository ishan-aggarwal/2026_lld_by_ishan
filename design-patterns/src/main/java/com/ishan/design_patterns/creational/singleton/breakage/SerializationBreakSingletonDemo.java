package com.ishan.design_patterns.creational.singleton.breakage;

import java.io.*;

public class SerializationBreakSingletonDemo {

    static class SingletonVulnerableToSerialization implements Serializable {

        private static final long serialVersionUID = 1L;

        private static SingletonVulnerableToSerialization instance;

        private SingletonVulnerableToSerialization() {
        }

        public static SingletonVulnerableToSerialization getInstance() {
            if (instance == null) {
                instance = new SingletonVulnerableToSerialization();
            }
            return instance;
        }
    }

    public static void main(String[] args) {

        SingletonVulnerableToSerialization instance1 =
                SingletonVulnerableToSerialization.getInstance();

        SingletonVulnerableToSerialization instance2 =
                serializeAndDeserialize(instance1);

        System.out.println("Instance 1 identityHashCode: "
                + System.identityHashCode(instance1));

        System.out.println("Instance 2 identityHashCode: "
                + System.identityHashCode(instance2));

        System.out.println(
                "\nResult: Deserialization creates a new instance and breaks the Singleton."
        );
    }

    private static SingletonVulnerableToSerialization serializeAndDeserialize(
            SingletonVulnerableToSerialization source) {

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(source);
            oos.flush();

            ByteArrayInputStream bais =
                    new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);

            return (SingletonVulnerableToSerialization) ois.readObject();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
