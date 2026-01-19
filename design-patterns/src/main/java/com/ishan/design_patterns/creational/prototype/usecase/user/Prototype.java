package com.ishan.design_patterns.creational.prototype.usecase.user;

/**
 * Generic Prototype contract.
 *
 * <p>
 * Purpose:
 * - Explicitly defines cloning behavior
 * - Avoids java.lang.Cloneable and its pitfalls
 * - Type-safe and intention-revealing
 * </p>
 */
public interface Prototype<T> {

    /**
     * Creates and returns a copy of the current object.
     *
     * @return cloned instance
     */
    T copy();
}
