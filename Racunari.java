package JavaVjezbe8;

public class Racunari extends EProizvodi{
	private String procesor;
	private int memorija;
	
	public Racunari(String opisProizvoda, String sifraProizvoda, double uvoznaCijena, String procesor, int memorija) {
		super(opisProizvoda, sifraProizvoda, uvoznaCijena);
		this.procesor = procesor;
		this.memorija = memorija;
	}
	public void setMemorija(int memorija) {
		this.memorija = memorija;
	}
	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	public int getMemorija() {
		return memorija;
	}
	public String getProcesor() {
		return procesor;
	}
	@Override
	public double izracunajMaloprodajnuCijenu() {
		if (getTipUredjaja().equals("RA")) {
			return getUvoznaCijena() * 1.05;
		} else return 0;
	}
	@Override 
	public String toString() {
		return "Tip uredjaja: " + getTipUredjaja() + " Opis proizvoda: " + getOpisProizvoda() + " Sifra proizvoda: " + getSifraProizvoda() + " Uvozna cijena: " + 
		getUvoznaCijena() + "€ Procesor:  " + getProcesor() + " Memorija:  " + getMemorija() + "GB Maloprodajna cijena:  " + izracunajMaloprodajnuCijenu() + "€ \n";
	}
}
