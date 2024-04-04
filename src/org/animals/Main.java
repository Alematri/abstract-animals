package org.animals;

public class Main {
    public static void main(String[] args) {
        Animale cane = new Cane();
        Animale passerotto = new Passerotto();
        Animale aquila = new Aquila();
        Animale delfino = new Delfino();

        cane.emettereSuono();
        passerotto.emettereSuono();
        aquila.emettereSuono();
        delfino.emettereSuono();
    }
}