package org.animals;

public class Main1 {
    public static void main(String[] args) {
        Cane cane = new Cane();
        System.out.println("Cane:");
        cane.verso();
        cane.mangia();
        cane.dormi();

        Passerotto passerotto = new Passerotto();
        System.out.println("Passerotto:");
        passerotto.verso();
        passerotto.mangia();
        passerotto.dormi();

        Aquila aquila = new Aquila();
        System.out.println("Aquila:");
        aquila.verso();
        aquila.mangia();
        aquila.dormi();

        Delfino delfino = new Delfino();
        System.out.println("Delfino:");
        delfino.verso();
        delfino.mangia();
        delfino.dormi();
    }
}