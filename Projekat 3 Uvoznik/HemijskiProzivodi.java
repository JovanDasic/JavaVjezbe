package Uvoznik;

public class HemijskiProzivodi extends Proizvod{
	private double temperaturaSkladistenja;
	private boolean zapaljivo;
	
	public HemijskiProzivodi(String opisProizvoda, String zemljaProizvodnje, int barkod, int godinaProizvodnje, double uvoznaCijena, double temperaturaSkladistenja, boolean zapaljivo) {
		super(opisProizvoda, zemljaProizvodnje, barkod, godinaProizvodnje, uvoznaCijena);
		this.temperaturaSkladistenja = temperaturaSkladistenja;
		this.zapaljivo = zapaljivo;
	}
	public void setTemperaturaSkladistenja(double temperaturaSkladistenja) {
		this.temperaturaSkladistenja = temperaturaSkladistenja;
	}
	public void setZapaljivo(boolean zapaljivo) {
		this.zapaljivo = zapaljivo;
	}
	public double getTemperaturaSkladistenja() {
		return temperaturaSkladistenja;
	}
	public boolean getZapaljivo() {
		return zapaljivo;
	}
	public double getCijena() {
		double cijena;
		if (this.zapaljivo) {
			cijena = getUvoznaCijena() * 1.15;
		} else {
			cijena = getUvoznaCijena() * 1.10;
		}
		return cijena;
	}
	@Override
	public String toString() {
	    return super.toString() + 
	           "  Temperatura skladištenja: " + temperaturaSkladistenja + "°C" +
	           "  Zapaljivo: " + (zapaljivo ? "da" : "ne")  +
	           "  Maloprodajna cijena: " + String.format("%.2f", getCijena()) + " EUR" + "]";
	}

}
