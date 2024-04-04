package org.animals;

public class Main2 {
    public static void main(String[] args) {
        Passerotto passerotto = new Passerotto();
        faiVolare(passerotto);

        Aquila aquila = new Aquila();
        faiVolare(aquila);

        Delfino delfino = new Delfino();
        faiNuotare(delfino);
    }

    public static void faiVolare(Volante animale) {
        System.out.println(animale.getClass().getSimpleName() + " sta volando!");
        animale.vola();
    }

    public static void faiNuotare(Nuotante animale) {
        System.out.println(animale.getClass().getSimpleName() + " sta nuotando!");
        animale.nuota();
    }
}