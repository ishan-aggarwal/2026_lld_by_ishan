package com.ishan.lsp.bird_example.compliant;

public class BirdClient {
    public static void main(String[] args) {

        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.eat();
        penguin.eat();

        Flyable flyableBird = new Eagle();
        flyableBird.fly();

        /*
         * ✔ No runtime exception
         * ✔ Correct substitution
         * ✔ LSP satisfied
         */
    }
}
