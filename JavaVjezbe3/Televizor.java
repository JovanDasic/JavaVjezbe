public class Televizor {
    private int brojKanala;
    private String nazivKanala;
    private int jacinaTona;

    public Televizor(int brojKanala, String nazivKanala, int jacinaTona) {
        this.nazivKanala = nazivKanala;
        if (brojKanala >= 1) {
            this.brojKanala = brojKanala;
        } else {
            this.brojKanala = 1;
        }
        if (jacinaTona > 0 && jacinaTona < 10) {
            this.jacinaTona = jacinaTona;
        } else {
            this.jacinaTona = 5;
        }
    }
    public int getBrojKanala() {
        return brojKanala;
    }
    public String getNazivKanala() {
        return nazivKanala;
    }
    public int getJacinaTona() {
        return jacinaTona;
    }
    public void setBrojKanala(int brojKanala) {
        if (brojKanala >= 1) {
           this.brojKanala = brojKanala;
        } else {
            System.out.println("Broj kanala mora biti vec ili jednak 1!");
        }
    }
    public void setNazivKanala(String nazivKanala) {
        this.nazivKanala = nazivKanala;
    }
    public void setJacinaTona(int jacinaTona) { 
        if (jacinaTona >= 0 && jacinaTona <= 10) { 
             this.jacinaTona = jacinaTona; 
        } 
        else { 
            System.out.println("Jačina tona mora biti između 0 i 10."); 
        }
    }
    public void pojacajTon() {
        if (jacinaTona < 10){
            jacinaTona ++;
        } else {
            System.out.println("Ton je na maksimumu.");
        }
    }
    public void ispisi() {
        System.out.printf("Kanal %d: %s, ton: %d\n", brojKanala, nazivKanala, jacinaTona);
    }
    public static void main(String[] args) {
        Televizor tv = new Televizor(5, "Vijesti", 3);
        tv.ispisi();
        tv.pojacajTon();
        tv.ispisi();
        tv.setBrojKanala(3);
        tv.setNazivKanala("PRVA");
        tv.setJacinaTona(2);
        tv.ispisi();
    }
    
}

/* 
4. Napisati klasu Televizor sa atributima: brojKanala (int, mora biti ≥ 1), nazivKanala 
(String), jacinaTona (int, između 0 i 10). Potrebno je odraditi:  
a. Konstruktor koji postavlja početne vrijednosti atributa.  
b. Getere i setere za sve atribute (sa provjerama da broj kanala ≥ 1 i da je jačina 
tona u opsegu 0–10).  
c. Metod pojacajTon() koji uvećava jačinu tona za 1, ali ne može preći 10.  
d. Metod ispisi() koji ispisuje broj kanala, naziv kanala i trenutnu jačinu tona.  */
