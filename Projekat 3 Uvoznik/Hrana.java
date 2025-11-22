package Uvoznik;

public class Hrana extends Proizvod{
	private int brojKalorija;
	private String datumRokUpotrebe;
	
	public Hrana (String opisProizvoda, String zemljaProizvodnje, int barkod, int godinaProizvodnje, double uvoznaCijena, int brojKalorija, String datumRokUpotrebe) {
		super(opisProizvoda, zemljaProizvodnje, barkod, godinaProizvodnje, uvoznaCijena);
		this.brojKalorija = brojKalorija;
		this.datumRokUpotrebe = datumRokUpotrebe;
	}
	public int getBrojKalorija() {
		return brojKalorija;
	}
	public String getDatumRokUpotrebe() {
		return datumRokUpotrebe;
	}
	public void setBrojKalorija(int brojKalorija) {
		this.brojKalorija = brojKalorija;
	}
	public void setDatumRokUpotrebe(String datumRokUpotrebe) {
		this.datumRokUpotrebe = datumRokUpotrebe;
	}
	
	public double getCijena() {
	
	    int trenutnaGodina = 2025;
	    int trenutniMjesec = 11;
	    int godinaRoka = Integer.parseInt(datumRokUpotrebe.substring(0, 4));
	    int mjesecRoka = Integer.parseInt(datumRokUpotrebe.substring(5, 7));
	
	    int razlikaUMjesecima = (godinaRoka - trenutnaGodina) * 12 + (mjesecRoka - trenutniMjesec);
	
	    if (razlikaUMjesecima < 6)
	        return getUvoznaCijena() * 1.05;
	    else
	        return getUvoznaCijena() * 1.10;
	}
	@Override
	public String toString() {
	    return super.toString() +
	           "  Broj kalorija: " + brojKalorija +
	           "  Datum roka upotrebe: " + datumRokUpotrebe +
	           "  Maloprodajna cijena: " + String.format("%.2f", getCijena()) + " EUR" + "]";
	}

}
