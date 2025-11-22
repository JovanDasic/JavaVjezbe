public class Taksi {
    public static void main(String[] args) {
        double km = 20;
        double pocetnaCijena = 1;
        double cijenaZaKilometar = 0.5;
        double ukupnaCijena = pocetnaCijena + cijenaZaKilometar * km;

        System.out.println("Ukupna cijena je " + ukupnaCijena + " eura.");
    }
}
