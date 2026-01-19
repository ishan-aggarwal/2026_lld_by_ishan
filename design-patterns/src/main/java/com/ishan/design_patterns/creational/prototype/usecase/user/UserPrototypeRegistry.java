package com.ishan.design_patterns.creational.prototype.usecase.user;

/**
 * Registry for managing and cloning User prototypes.
 *
 * <p>
 * Clients should NEVER receive the raw prototype instance.
 * The registry enforces cloning as the only access mechanism.
 * </p>
 */
public interface UserPrototypeRegistry {

    /**
     * Registers a base prototype.
     *
     * @param user prototype instance
     */
    void register(User user);

    /**
     * Returns a cloned instance of the registered prototype.
     *
     * @param type user type
     * @return cloned User
     * @throws IllegalArgumentException if no prototype exists
     */
    User clone(UserType type);
}
