package JavaVjezbe10;

public abstract class Vozilo {
	private int id;
	private int maxBrzina;
	 
	public Vozilo(int id, int maxBrzina) {
		super();
		this.id = id;
		this.maxBrzina = maxBrzina;
	}
	public String info() {
		return "ID: " + this.id + " Max Brzina: " + this.maxBrzina;
	}
	public abstract double izracunajVrijemeDostave(double udaljenostKm);
	
}
