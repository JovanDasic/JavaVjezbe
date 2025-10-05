public class BankovniRacun {
    private String imeVlasnika;
    private double stanje;

    public BankovniRacun(String imeVlasnika, double stanje) {
        this.imeVlasnika = imeVlasnika;
        this.stanje = stanje;
    }

    public String getIme() {
        return imeVlasnika;
    }
    public double getStanje() {
        return stanje;
    }
    public void setIme(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }
    public void setStanje(double stanje) {
        this.stanje = stanje;
    }
    public void uplati(double iznos) {
        stanje += iznos;
        System.out.printf("Uplaceno je je %.2f. Novo stanje je %.2f\n", iznos, stanje);
    }
    public void isplati(double iznos) {
        if (stanje >= iznos) {
            stanje -= iznos;
            System.out.printf("Isplaceno je %.2f. Novo stanje je %.2f\n", iznos, stanje);
        } else {
            System.out.println("Nemate dovoljno sredstava na racunu");
        }
    }
    public void ispisi() {
        System.out.printf("Trenutno stanje je %.2f.\n", stanje);
    }
    public static void main(String[] args) {
        BankovniRacun racun1 = new BankovniRacun("Jovan", 1000);
        System.out.printf("Ime: %s Stanje: %.2f\n", racun1.getIme(), racun1.getStanje());
        racun1.ispisi();
        racun1.uplati(100);
        racun1.isplati(200);
        racun1.ispisi();
    }
}
/*4. Napisati klasu BankovniRacun sa atributima: imeVlasnika, stanje (double).  
a. Kreirati konstruktor, getere i setere.  
b. Dodati metod uplati(double iznos) koji povećava stanje.  
c. Dodati metod isplati(double iznos) koji smanjuje stanje samo ako ima 
dovoljno sredstava.  
d. Dodati metod ispisi() koji prikazuje trenutno stanje računa.  */