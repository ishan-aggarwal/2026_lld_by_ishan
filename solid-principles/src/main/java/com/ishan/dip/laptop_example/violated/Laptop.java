package com.ishan.dip.laptop_example.violated;

public class Laptop {
    private final WiredKeyboard wiredKeyboard;
    private final WiredMouse wiredMouse;

    public Laptop(WiredKeyboard wiredKeyboard, WiredMouse wiredMouse) {
        this.wiredKeyboard = wiredKeyboard;
        this.wiredMouse = wiredMouse;
    }
}

/*
 * laptop class which is a concrete class
 * is directly dependent on other concrete classes
 *
 * Here we have a class Laptop that depends on a WiredKeyboard and WiredMouse.
 * The low level classes are directly dependent on other low level classes.
 * Thus the classes are tightly coupled. This is a violation of the Dependency Inversion Principle.
 */
