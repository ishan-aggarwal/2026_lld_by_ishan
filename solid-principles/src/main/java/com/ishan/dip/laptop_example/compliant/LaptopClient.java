package com.ishan.dip.laptop_example.compliant;

public class LaptopClient {
    public static void main(String[] args) {
        Keyboard keyboard = new BluetoothKeyboard();
        Mouse mouse = new BluetoothMouse();
        Laptop laptop = new Laptop(keyboard, mouse);
        System.out.println(laptop);

        Keyboard keyboard1 = new WiredKeyboard();
        Laptop laptop1 = new Laptop(keyboard1, mouse);
    }
}
