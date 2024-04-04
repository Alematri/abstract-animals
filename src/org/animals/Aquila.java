package org.animals;

public class Aquila extends Animale {
    @Override
    public void verso() {
        System.out.println("Grido dell'aquila!");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }
}