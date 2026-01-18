package com.ishan.dip.laptop_example.compliant;

public class Laptop {
    private Keyboard keyboard;
    private Mouse mouse;

    public Laptop(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

// now my main laptop class which was concrete class
// is not dependent on other concrete classses
// it is dependent on abstact classes...
// By doing this, the direction of original dependency is inverted: low level classes are now dependent on high level abstractions.
// This is how we achieve Dependency Inversion Principle.
//  - The high level modules should not depend on low level modules. Both should depend on abstractions.
