package Uvoznik;

public class Garderoba extends Proizvod {
	private String materijalProizvodnje;
	private String sezona;

	public Garderoba(String opisProizvoda, String zemljaProizvodnje, int barkod, int godinaProizvodnje, double uvoznaCijena, String materijalProizvodnje, String sezona) {
		super(opisProizvoda, zemljaProizvodnje, barkod, godinaProizvodnje, uvoznaCijena);
		this.materijalProizvodnje = materijalProizvodnje;
		this.sezona = sezona;
	}
	public void setMaterijalProizvoda(String materijalProizvodnje) {
		this.materijalProizvodnje = materijalProizvodnje;
	}
	public void setSezona(String sezona) {
		this.sezona = sezona;
	}
	public String getMaterijalProizvodnje() {
		return materijalProizvodnje;
	}
	public String getSezona() {
		return sezona;
	}
	public double getCijena() {
		return getUvoznaCijena() * 1.05;
	}
	@Override
	public String toString() {
	    return super.toString() +
	           "  Materijal proizvodnje: " + materijalProizvodnje +
	           "  Sezona: " + sezona +
	           "  Maloprodajna cijena: " + String.format("%.2f", getCijena()) + " EUR"  + "]";
	}

}
