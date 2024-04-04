import org.animals.*;

public class Main {
    public static void main(String[] args) {
        Cane cane = new Cane();
        cane.verso();
        cane.mangia();
        cane.dormi();

        Passerotto passerotto = new Passerotto();
        passerotto.verso();
        passerotto.mangia();
        passerotto.dormi();

        Aquila aquila = new Aquila();
        aquila.verso();
        aquila.mangia();
        aquila.dormi();

        Delfino delfino = new Delfino();
        delfino.verso();
        delfino.mangia();
        delfino.dormi();
    }
}