package org.animals;

public class Passerotto extends Animale {
    @Override
    public void verso() {
        System.out.println("Cinguettio!");
    }

    @Override
    public void mangia() {
        System.out.println("Semi e insetti");
    }
}