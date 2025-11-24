package JavaVjezbe10;

public class Automobil extends Vozilo {

	public Automobil(int id, int maxBrzina) {
		super(id, maxBrzina);
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		return udaljenostKm * 2;
	}

}
