public class Zaposleni {
    private String ime;
    private String prezime;
    private int godineStaza;
    private double plata;

    public Zaposleni(String ime, String prezime, int godineStaza, double plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.godineStaza = godineStaza;
        this.plata = plata;
    }

    public String getIme() {
        return this.ime;
    }
    public String getPrezime() {
        return this.prezime;
    }
    public int getGodineStaza() {
        return this.godineStaza;
    }
    public double getPlata() {
        return this.plata;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void setGodineStaza(int godineStaza) {
        if (godineStaza > 0) {
            this.godineStaza = godineStaza;
        } else {
            System.out.println("Broj godina mora biti pozitivan!");
        }
        
    }
    public void setPlata(double plata) {
        if (plata > 0) {
            this.plata = plata;
        } else {
            System.out.println("Plata mora biti veca od 0!");
        }
    }
    public void ispisi() {
        System.out.printf("Ime: %s, Prezime: %s, Staz: %d godina, Plata: %.2f eura\n", ime, prezime, godineStaza, plata);
    }
    public void povecajPlatuAkoTreba() {
        if (plata < 800 && godineStaza > 10) {
            double staraPlata = plata;
            plata = staraPlata * 1.06;
            System.out.printf("Plata je povecana sa %.2f eura na %.2f eura\n", staraPlata, plata);
        }
    } 

    public static void main(String[] args) {
        Zaposleni zaposleni1 = new Zaposleni("Jovan", "Jovanovic", 5, 1000);
        Zaposleni zaposleni2 = new Zaposleni("Marko", "Markovic", 10, 1200);
        Zaposleni zaposleni3 = new Zaposleni("Janko", "Jankovic", 3, 800);
        Zaposleni zaposleni4 = new Zaposleni("Milos", "Milosevic", 4, 900);
        Zaposleni zaposleni5 = new Zaposleni("Petar", "Petrovic", 12, 700);

        zaposleni1.ispisi();
        zaposleni2.ispisi();
        zaposleni3.ispisi();
        zaposleni4.ispisi();
        zaposleni5.ispisi();
        zaposleni5.povecajPlatuAkoTreba();
        zaposleni5.ispisi();

    }
}
/*. Kreirati klasu Zaposleni koja ima sledeće atribute: ime, prezime, godine_staza, 
plata. Voditi računa koji tipovi podataka se vezuju za navedene atribute. Obavezno 
je  kreirati konstruktor kojim se objekat klase može kreirati.  
a. Kreirati getter i setter metode kojima se može pristupiti određenom 
atributu objekta, kao i eventualno taj atribut izmijeniti (pomoću seter 
metode).  
b. Klasa Zaposleni mora da sadrži metodu koja vrši ispisivanje zaposlenih (Ime 
i prezime, godine staza).  
c. Kreirati makar 5 objekata klase Zaposleni i testirati getter i setter metode, 
kao i ispis Zaposlenih (ispis objekta klase).  
d. U klasi Zaposleni potrebno je napraviti metodu koja će ispisati ime 
zaposlenog koji ima najveću platu.  
e. Potrebno je dodati i metodu koja će provjeriti iznos plate i ako je manja od 
800 uvećaće je 6 posto u slučaju da zaposleni ima preko 10 godina staža.  */