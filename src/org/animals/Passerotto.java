package org.animals;

public class Passerotto extends Animale implements Volante {
    @Override
    public void verso() {
        System.out.println("Cinguettio!");
    }

    @Override
    public void mangia() {
        System.out.println("Semi e insetti");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando ma un po più in basso di un aquila XD");
    }
}