package restoran;

public class Main {
    public static void main(String[] args) {
        Restoran r = new Restoran("Restoran1", "Ulica Slobode 10", "9157853634");

        r.dodajZaposlenog(new Konobar(1, "Marko", "Markovic", 6.5, 40, 5));
        r.dodajZaposlenog(new Kuvar(2, "Ivan", "Ivanovic", 8.0, 42));
        r.dodajZaposlenog(new Menadzer(3, "Jovan", "Dasic", 10.0, 38, 200));
        r.dodajZaposlenog(new Konobar(4, "Petar", "Petrovic", 6.0, 36, 8));
        r.dodajZaposlenog(new Kuvar(5, "Janko", "Jankovic", 9.0, 40));

        r.obracunPlata();
    }
}
