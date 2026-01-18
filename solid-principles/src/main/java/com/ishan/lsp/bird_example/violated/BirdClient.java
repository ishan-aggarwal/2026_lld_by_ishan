package com.ishan.lsp.bird_example.violated;

public class BirdClient {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();
        eagle.eat();
        penguin.eat();
        eagle.fly();
        penguin.fly(); // LSP principal broke
        /*
         * Bird promises fly()
         * Penguin cannot honor that contract
         * Substitution breaks at runtime
         */

    }
}