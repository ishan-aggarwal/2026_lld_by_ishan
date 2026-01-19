package com.ishan.design_patterns.creational.prototype.usecase.user;

import java.util.HashMap;
import java.util.Map;

/**
 * Concrete implementation of UserPrototypeRegistry.
 *
 * <p>
 * Responsibilities:
 * - Store base prototype objects
 * - Guard prototype integrity
 * - Centralize cloning logic
 * </p>
 */
public class UserPrototypeRegistryImpl implements UserPrototypeRegistry {

    private final Map<UserType, User> prototypes = new HashMap<>();

    @Override
    public void register(User user) {
        if (user == null || user.getType() == null) {
            throw new IllegalArgumentException("User and UserType must not be null");
        }
        prototypes.put(user.getType(), user);
    }

    @Override
    public User clone(UserType type) {
        User prototype = prototypes.get(type);

        if (prototype == null) {
            throw new IllegalArgumentException(
                    "No User prototype registered for type: " + type
            );
        }

        return prototype.copy();
    }
}
