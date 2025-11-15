package JavaVjezbe8;

public class TV extends EProizvodi {
	private int velicinaEkrana;
	
	public TV(String opisProizvoda, String sifraProizvoda, double uvoznaCijena, int velicinaEkrana) {
		super(opisProizvoda, sifraProizvoda, uvoznaCijena);
		this.velicinaEkrana = velicinaEkrana;
	}
	public void setVelicinaEkrana(int velicinaEkrana) {
		this.velicinaEkrana = velicinaEkrana;
	}
	public int getVelicinaEkrana() {
		return velicinaEkrana;
	}
	@Override
	public double izracunajMaloprodajnuCijenu() {
		if (getTipUredjaja().equals("TV") && getVelicinaEkrana() > 65) {
			return getUvoznaCijena() * 1.05 * 1.1;
		} else if (getSifraProizvoda().substring(0, 2).equals("TV")) {
			return getUvoznaCijena() * 1.05;
		} else return 0;
	}
	@Override 
	public String toString() {
		return "Tip uredjaja: " + getTipUredjaja() + " Opis proizvoda: " + getOpisProizvoda() + " Sifra proizvoda:  " + 
		getSifraProizvoda() + " Uvozna cijena: " + 
		getUvoznaCijena() + "€ Velicina ekrana: " + getVelicinaEkrana() + " inca Maloprodajna cijena:  " + izracunajMaloprodajnuCijenu() + "€ \n";
	}

}
