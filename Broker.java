package JavaVjezbe6;

public class Broker {
	public static void main(String[] args) {
		String a = "S50 S40 B50 B100";
		int saldo = 0;
		String[] transakcije = a.split("\\s+");
		for (String t : transakcije) {
			char tip = t.charAt(0);
			int iznos = Integer.parseInt(t.substring(1));
			
			if (tip == 'S') {
				saldo += iznos;
			} else if (tip == 'B') {
				saldo -= iznos;
			} else {
				System.out.println("Nepravilan unos");
			}
		}
		System.out.println(saldo);
	}

}
/*Napisati program koji za unijeti string provjerava da li je broker u plusu ili 
minus nakon trgovine akcijama. Prefiks stringa sadrzi S kada je odradjena 
prodaja, a B kada je odradjena kupovina akcija. 
Ulaz: a = “S50 S40 B50 B100”;  */ 