package JavaVjezbe8;

public class Telefon extends EProizvodi {
	private String operativniSistem;
	private int velicinaEkrana;

	public Telefon(String opisProizvoda, String sifraProizvoda, double uvoznaCijena, String operativniSistem, int velicinaEkrana) {
		super(opisProizvoda, sifraProizvoda, uvoznaCijena);
		this.operativniSistem = operativniSistem;
		this.velicinaEkrana = velicinaEkrana;
	}
	public String getOperativniSistem() {
		return operativniSistem;
	}
	public int getVelicinaEkrana() {
		return velicinaEkrana;
	}
	public void setOperativniSistem (String operativniSistem) {
		this.operativniSistem = operativniSistem;
	}
	public void setVelicinaEkrana (int velicinaEkrana) {
		this.velicinaEkrana = velicinaEkrana;
	}
	@Override
	public double izracunajMaloprodajnuCijenu() {
		if (getTipUredjaja().equals("TE") && getVelicinaEkrana() > 6) {
			return getUvoznaCijena() * 1.05 * 1.03;
		} else if (getSifraProizvoda().substring(0, 2).equals("TE")) {
			return getUvoznaCijena() * 1.05;
		} else return 0;
	}
	@Override 
	public String toString() {
		return "Tip uredjaja: " + getTipUredjaja() + " Opis proizvoda: " + getOpisProizvoda() + " Sifra proizvoda: " + getSifraProizvoda() + " Uvozna cijena: " + 
		getUvoznaCijena() + "€ Operativni sistem:  " + getOperativniSistem() + " Velicina ekrana: " + getVelicinaEkrana() + " inca Maloprodajna cijena:  " + izracunajMaloprodajnuCijenu() + "€ \n";
	}
	

}
