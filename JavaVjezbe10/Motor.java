 package JavaVjezbe10;

public class Motor extends Vozilo implements Ekonomican {

	public Motor(int id, int maxBrzina) {
		super(id, maxBrzina);
	}

	@Override
	public double potrosnjaPoKm() {
		return 2;
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		return udaljenostKm * 3;
	}

}
