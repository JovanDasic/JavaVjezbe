package JavaVjezbe8;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <EProizvodi> sviUredjaji = new ArrayList <EProizvodi>();
		
		while (true) {
			System.out.println("1. Unos uredjaja");
			System.out.println("2. Pregled svih uredjaja sa maloprodajnom cijenom");
			System.out.println("3. Pregled uredjaja odredjenog tipa");
			System.out.println("4. Izlaz");
			
			int unos = sc.nextInt();
			sc.nextLine();
			
			if (unos == 1) {
				System.out.println("Unesi opis proizvoda: ");
				String opisProizvoda = sc.nextLine();
				System.out.println("Unesi sifru proizvoda: ");
				String sifraProizvoda = sc.nextLine();
				System.out.println("Unesi uvoznu cijenu: ");
				double uvoznaCijena = sc.nextDouble();
				sc.nextLine();
				String tipUredjaja = sifraProizvoda.substring(0, 2);
				if (tipUredjaja.equals("TE")) {
					System.out.println("Unesi operativni sistem telefona: ");
					String operativniSistem = sc.nextLine();
					System.out.println("Unesi velicinu ekrana: ");
					int velicinaEkrana = sc.nextInt();
					sc.nextLine();
					sviUredjaji.add(new Telefon(opisProizvoda, sifraProizvoda, uvoznaCijena, operativniSistem, velicinaEkrana));
					System.out.println("Unos uspjesan.");
				} else if (tipUredjaja.equals("TV")) {
					System.out.println("Unesi velicinu ekrana: ");
					int velicinaEkrana = sc.nextInt();
					sc.nextLine();
					sviUredjaji.add(new TV(opisProizvoda, sifraProizvoda, uvoznaCijena, velicinaEkrana));
					System.out.println("Unos uspjesan.");
				} else if (tipUredjaja.equals("RA")) {
					System.out.println("Unesi procesor racunara: ");
					String procesor = sc.nextLine();
					System.out.println("Unesi memoriju racunara: ");
					int memorija = sc.nextInt();
					sc.nextLine();
					sviUredjaji.add(new Racunari(opisProizvoda, sifraProizvoda, uvoznaCijena, procesor, memorija));
					System.out.println("Unos uspjesan.");
				} else {
					System.out.println("Sifra uredjaja nije ispravna.");
				}
			} else if (unos == 2) {
				for (EProizvodi e : sviUredjaji) {
					System.out.print(e);
				}
			} else if (unos == 3) {
				System.out.println("Unesi tip: ");
				String tipUredjaja = sc.nextLine();
				ArrayList <EProizvodi> filtriraniNiz = EProizvodi.filtrirajPoTipu(sviUredjaji, tipUredjaja);
				for (EProizvodi e : filtriraniNiz) {
					System.out.println(e);
				}
			} else if (unos == 4) {
				System.out.println("Napustanje programa...");
				break;
			}
		}
		sc.close();
	}
}
