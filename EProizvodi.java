package JavaVjezbe8;
import java.util.ArrayList;

public abstract class EProizvodi {
	private String opisProizvoda;
	private String sifraProizvoda;
	private double uvoznaCijena;
	
	public EProizvodi (String opisProizvoda, String sifraProizvoda, double uvoznaCijena) {
		this.opisProizvoda = opisProizvoda;
		this.sifraProizvoda = sifraProizvoda;
		this.uvoznaCijena = uvoznaCijena;
	}
	public String getOpisProizvoda() {
		return opisProizvoda;
	}
	public String getSifraProizvoda() {
		return sifraProizvoda;
	}
	public double getUvoznaCijena() {
		return uvoznaCijena;
	}
	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}
	public void setSifraProizvoda(String sifraProizvoda) {
		this.sifraProizvoda = sifraProizvoda;
	}
	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}
	public String getTipUredjaja() {
		return getSifraProizvoda().substring(0, 2);
	}
	public abstract double izracunajMaloprodajnuCijenu();
	public static ArrayList <EProizvodi> filtrirajPoTipu(ArrayList <EProizvodi> niz, String tipUredjaja) {
		ArrayList <EProizvodi> noviNiz = new ArrayList <EProizvodi>();
		for (EProizvodi e : niz) {
			if (e.getTipUredjaja().equals(tipUredjaja)) {
				noviNiz.add(e);
			}
		}
		return noviNiz;
	}
}
