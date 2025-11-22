package restoran;
import java.util.ArrayList;

public class Restoran {
    private String naziv;
    private String adresa;
    private String PIB;
    private ArrayList<Zaposleni> zaposleni;

    public Restoran(String naziv, String adresa, String PIB) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.PIB = PIB;
        this.zaposleni = new ArrayList<>();
    }

    public void dodajZaposlenog(Zaposleni z) {
        zaposleni.add(z);
    }

    public void ukloniZaposlenog(int id) {
        zaposleni.removeIf(z -> z.getId() == id);
    }

    public Zaposleni pretraziPoID(int id) {
        for (Zaposleni z : zaposleni) {
            if (z.getId() == id)
                return z;
        }
        return null;
    }

    public void obracunPlata() {
        System.out.println("ID  Ime i Prezime  Tip  Sati  Dodatak  Plata(EUR)");
        System.out.println("-------------------------------------------------------------");
        for (Zaposleni z : zaposleni) {
            System.out.println(z);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Ukupan trošak plata: " + ukupniTrosak());
    }

    public double ukupniTrosak() {
        double suma = 0;
        for (Zaposleni z : zaposleni)
            suma += z.izracunajPlatu();
        return suma;
    }
}
