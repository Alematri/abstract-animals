package org.animals;

public class Delfino extends Animale implements Nuotante  {
    @Override
    public void verso() {
        System.out.println("Verso del delfino!");
    }

    @Override
    public void mangia() {
        System.out.println("Pesce");
    }
    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}