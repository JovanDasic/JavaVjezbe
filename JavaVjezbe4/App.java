class BankovniRacun {
    private String imeVlasnika;
    private double stanje;

    public BankovniRacun(String imeVlasnika, double stanje){
        this.stanje = stanje;
        this.imeVlasnika = imeVlasnika;
    }

    public String getImeVlasnika() {
        return this.imeVlasnika;
    }
    public double getStanje() {
        return this.stanje;
    }
    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    } 
    public void setStanje(double stanje) {
        this.stanje = stanje;
    }
    public void uplati(double iznos) {
        this.stanje += iznos;
    }
    public void isplati(double iznos) {
        if (this.stanje >= iznos ) {
            this.stanje -= iznos;
        }
        else {
            System.out.println("Nemate dovoljno sredstava!");
        }
    }
    public void ispisi(double stanje) {
        System.out.println("Trenutno stanje je: " + this.stanje);
    }

}
class Transakcija {
    private double iznos;
    private String tip;
    private String opis;

    public Transakcija(double iznos, String tip, String opis) {
        setIznos(iznos);
        this.tip = tip;
        this.opis = opis;
    }

    public double getIznos() {
        return this.iznos >= 0 ? this.iznos : 0;
    }
    public String getTip() {
        return this.tip;
    }
    public String getOpis() {
        return this.opis;
    }
    public void setIznos(double iznos) {
        if (iznos >= 0) {
            this.iznos = iznos;
        } else {
            this.iznos = 0;
        }
    }
    public void setTip(String tip) {
        this.tip = tip;
    }
    public void setOpis(String opis) {
        this.opis = opis;
    }
    public boolean jeUplata(String tip) {
        return this.tip.equals("Uplata");
        
    } 
}
public class App {
    public static void main(String[] args) {
        BankovniRacun racun1 = new BankovniRacun("Jovan Jovanovic", 100);
        BankovniRacun racun2 = new BankovniRacun("Marko Markovic", 250);
        Transakcija transakcija1 = new Transakcija(100, "Uplata", "Mjesecna naknada");
        Transakcija transakcija2 = new Transakcija(200, "Isplata", "Kupovina");

        if (t1.jeUplata()) {
            racun.uplati(t1.getIznos());
        } else {
            racun.isplati(t1.getIznos());
        }

        if (t2.jeUplata()) {
            racun.uplati(t2.getIznos());
        } else {
            racun.isplati(t2.getIznos());
        }

        racun.ispisi();
    }
    
}