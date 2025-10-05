public class StudentskaSluzba {
    private String ime;
    private String prezime;
    private String brojIndeksa;
    private int ocjena1;
    private int ocjena2;
    private int ocjena3;
    private static int brojStudenata = 0;

    public StudentskaSluzba(String ime, String prezime, String brojIndeksa, int ocjena1, int ocjena2, int ocjena3) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.ocjena1 = ocjena1;
        this.ocjena2 = ocjena2;
        this.ocjena3 = ocjena3;
        brojStudenata ++;
    }
    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public String getBrojIndeksa() {
        return brojIndeksa;
    }
    public int getOcjena1() {
        return ocjena1;
        }
    public int getOcjena2() {
        return ocjena2;
    }
    public int getOcjena3() {
        return ocjena3;
        }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setprezime(String prezime) {
        this.prezime = prezime;
    }
    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    public void setOcjena1(int ocjena1) {
        this.ocjena1 = ocjena1;
    }
    public void setOcjena2(int ocjena2) {
        this.ocjena2 = ocjena2;
    }
    public void setOcjena3(int ocjena3) {
        this.ocjena3 = ocjena3;
    }
    public void ispisi() {
        System.out.printf("%s %s %s %d %d %d\n", ime, prezime, brojIndeksa, ocjena1, ocjena2, ocjena3);
    }
    public double prosjek() {
        return (ocjena1 + ocjena2 + ocjena3) / 3.0; 
    }

    public void provjeriKredit() {
        double prosjek = prosjek();
        if (prosjek >= 9) {
            System.out.printf("Student %s %s ISPUNJAVA uslov za studentski kredit!\n", ime, prezime);
        } else {
            System.out.printf("Student %s %s NE ispunjava uslov! za studentski kredit\n", ime, prezime);
        }
    }
    public static void ispisiBrojStudenata() {
        System.out.printf("Ukupan broj studenata je: %d", brojStudenata);
    }
    public static void main(String[] args) {
        StudentskaSluzba s1 = new StudentskaSluzba("Jovan", "Jovanovic", "23/132", 8, 9 , 10);
        StudentskaSluzba s2 = new StudentskaSluzba("Marko", "Markovic", "22/100", 10, 9 , 10);
        StudentskaSluzba s3 = new StudentskaSluzba("Janko", "Jankovic", "21//100", 6, 9 , 10);

        s1.ispisi();
        s1.provjeriKredit();

        s2.ispisi();
        s2.provjeriKredit();

        s3.ispisi();
        s3.provjeriKredit();

        ispisiBrojStudenata();
    }
}
/*2. Kreirati jednostavan program za potrebe studentske službe. U sistemu je potrebno 
omogućiti upravljanje podacima o studentima (ime, prezime, broj indeksa i dodati tri 
ocjene).  
a. U testnoj klasi potrebno je dodati nove studente i informacije o njima.  
b. Na osnovu unešenih ocjena potrebno je izračunati prosječnu ocjenu i na 
osnovu prosjeka odrediti da li student može ostvariti pravo na studentski 
kredit (prosjek veći od 9).  
c. 
Na kraju programa, koristeći statičku promjenljivu, potrebno je odštampati 
spisak studenata u formatu: (Ime , Prezime, Stipendija (Da/Ne)).  
Napomena: Ne koristiti nizove, pa se možete ograničiti na 3-4 studenta za koje 
unosite podatke.  */