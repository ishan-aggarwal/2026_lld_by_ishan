package com.ishan.design_patterns.creational.prototype.usecase.user;

/**
 * Concrete Prototype implementation.
 *
 * <p>
 * Design decisions:
 * - Immutable class (all fields final)
 * - Safe for reuse as a prototype
 * - copy() performs a controlled shallow copy
 * </p>
 */
public class User implements Prototype<User> {

    private final long userId;
    private final String username;
    private final String email;
    private final String displayName;
    private final int age;
    private final UserType type;

    public User(long userId,
                String username,
                String email,
                String displayName,
                int age,
                UserType type) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.displayName = displayName;
        this.age = age;
        this.type = type;
    }

    public long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getAge() {
        return age;
    }

    public UserType getType() {
        return type;
    }

    /**
     * Prototype cloning logic.
     *
     * <p>
     * Strings and enums are immutable, so a shallow copy is safe.
     * If mutable fields are added later, this method is the single
     * place to evolve into a deep copy.
     * </p>
     */
    @Override
    public User copy() {
        return new User(
                userId,
                username,
                email,
                displayName,
                age,
                type
        );
    }
}
