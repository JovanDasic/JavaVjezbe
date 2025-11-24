package JavaVjezbe10;

public class Bicikl extends Vozilo implements Ekonomican {

	public Bicikl(int id, int maxBrzina) {
		super(id, maxBrzina);
	}

	@Override
	public double potrosnjaPoKm() {
		return 0;
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		return udaljenostKm * 4;
	}

}
