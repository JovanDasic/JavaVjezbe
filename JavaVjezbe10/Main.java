package JavaVjezbe10;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList <Vozilo> vozila = new ArrayList <Vozilo>();
		vozila.add(new Automobil(1, 150));
		vozila.add(new Automobil(2, 200));
		vozila.add(new Bicikl(3, 30));
		vozila.add(new Bicikl(4, 20));
		vozila.add(new Bicikl(5, 25));
		vozila.add(new Motor(6, 50));
		vozila.add(new Motor(7, 70));
		
		double udaljenost = 10;
		
		for (Vozilo v: vozila) {
			double vrijeme = v.izracunajVrijemeDostave(udaljenost);
			System.out.println(v.info());
			System.out.println("Vrijeme dostave je " + vrijeme + " sekundi");
			
			if (v instanceof Ekonomican) {
				double potrosnja = ((Ekonomican) v).potrosnjaPoKm() * udaljenost;
				System.out.println("Potrosnja je " + potrosnja);

			}
			System.out.println();
		}
	}
}
