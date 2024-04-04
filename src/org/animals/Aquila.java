package org.animals;

public class Aquila extends Animale implements Volante {
    @Override
    public void verso() {
        System.out.println("Grido dell'aquila!");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando");
    }
}