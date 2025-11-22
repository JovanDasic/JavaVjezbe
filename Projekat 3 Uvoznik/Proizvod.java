package Uvoznik;

public class Proizvod {
	private String opisProizvoda;
	private String zemljaProizvodnje;
	private int barkod;
	private int godinaProizvodnje;
	private double uvoznaCijena;
	
	public Proizvod(String opisProizvoda, String zemljaProizvodnje, int barkod, int godinaProizvodnje, double uvoznaCijena) {
		this.opisProizvoda = opisProizvoda;
		this.zemljaProizvodnje = zemljaProizvodnje;
		this.barkod = barkod;
		this.godinaProizvodnje = godinaProizvodnje;
		this.uvoznaCijena = uvoznaCijena;
	}
	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}
	public void setZemljaProizvodnje(String zemljaProizvodnje) {
		this.zemljaProizvodnje = zemljaProizvodnje;
	}
	public void setBarkod(int barkod) {
		this.barkod = barkod;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}
	public double getUvoznaCijena() {
		return uvoznaCijena;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public int getBarkod() {
		return barkod;
	}
	public String getZemljaProizvodnje() {
		return zemljaProizvodnje;
	}
	public String getOpisProizvoda() {
		return opisProizvoda;
	}
	@Override
	public String toString() {
	    return "Proizvod [" +
	            "opisProizvoda=" + opisProizvoda +
	            ", zemljaProizvodnje=" + zemljaProizvodnje +
	            ", barkod=" + barkod +
	            ", godinaProizvodnje=" + godinaProizvodnje +
	            ", uvoznaCijena=" + uvoznaCijena;
	}

}
