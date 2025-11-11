package JavaVjezbe6;

enum Studenti {
	MARKO_MARKOVIC(9, 9, 10),
	JOVAN_JOVANOVIC(9, 6, 8),
	IVAN_IVANOVIC(8, 9, 8),
	PETAR_PETROVIC(10, 10, 8),
	JANKO_JANKOVIC(7, 7, 8);
	
	private int ocjena1;
	private int ocjena2;
	private int ocjena3;
	
	private Studenti(int ocjena1,int  ocjena2,int ocjena3) {
		this.ocjena1 = ocjena1;
		this.ocjena2 = ocjena2;
		this.ocjena3 = ocjena3;
	}
	public double izracunajProsjek() {
		return (ocjena1 + ocjena2 + ocjena3) / 3.0;
	}
	public String getImePrezime() {
		return this.name().replace("_", " ");
	}
}
public class zadatak {
	public static void main(String[] args) {
		for (Studenti s : Studenti.values()) {
			System.out.println(s.getImePrezime() + " Prosjek: " + s.izracunajProsjek());
		}
	}
}
