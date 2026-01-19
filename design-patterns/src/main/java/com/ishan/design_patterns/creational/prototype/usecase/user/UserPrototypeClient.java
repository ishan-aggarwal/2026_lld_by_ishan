package com.ishan.design_patterns.creational.prototype.usecase.user;

/**
 * Client class demonstrating the Prototype Design Pattern.
 *
 * <p>
 * Responsibilities:
 * - Create and register base prototypes
 * - Request cloned instances from the registry
 * - Never directly instantiate objects after registration
 * </p>
 */
public class UserPrototypeClient {

    public static void main(String[] args) {

        // Step 1: Create the registry
        UserPrototypeRegistry registry = new UserPrototypeRegistryImpl();

        // Step 2: Create base prototype objects
        User adminPrototype = new User(
                1L,
                "admin",
                "admin@system.com",
                "System Admin",
                35,
                UserType.ADMIN
        );

        User readerPrototype = new User(
                2L,
                "reader",
                "reader@system.com",
                "Default Reader",
                25,
                UserType.READER
        );

        User writerPrototype = new User(
                3L,
                "writer",
                "writer@system.com",
                "Default Writer",
                28,
                UserType.WRITER
        );

        // Step 3: Register prototypes
        registry.register(adminPrototype);
        registry.register(readerPrototype);
        registry.register(writerPrototype);

        // Step 4: Clone objects from registry
        User admin1 = registry.clone(UserType.ADMIN);
        User admin2 = registry.clone(UserType.ADMIN);

        User reader1 = registry.clone(UserType.READER);

        // Step 5: Validate cloning behavior
        System.out.println("admin1 == admin2 : " + (admin1 == admin2)); // false
        System.out.println("admin1 type      : " + admin1.getType());
        System.out.println("reader1 type     : " + reader1.getType());

        /*
         * Key Observations:
         * - Each clone is a distinct object
         * - All clones share the same base configuration
         * - Client never depends on concrete construction logic
         */
    }
}
