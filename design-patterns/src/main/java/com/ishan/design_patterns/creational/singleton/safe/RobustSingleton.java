package com.ishan.design_patterns.creational.singleton.safe;

import java.io.ObjectStreamException;
import java.io.Serializable;

public final class RobustSingleton implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    // 1️⃣ volatile → required for correct double-checked locking
    private static volatile RobustSingleton instance;

    // 2️⃣ Guard flag to prevent reflection
    private static boolean instanceCreated = false;

    private RobustSingleton() {
        // Prevent reflection attack
        if (instanceCreated) {
            throw new RuntimeException("Use getInstance() method");
        }
        instanceCreated = true;
    }

    // 3️⃣ Thread-safe lazy initialization
    public static RobustSingleton getInstance() {
        if (instance == null) {
            synchronized (RobustSingleton.class) {
                if (instance == null) {
                    instance = new RobustSingleton();
                }
            }
        }
        return instance;
    }

    // 4️⃣ Prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this singleton is not allowed");
    }

    // 5️⃣ Prevent serialization break
    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }
}
