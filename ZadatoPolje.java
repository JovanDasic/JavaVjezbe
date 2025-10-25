package Vjezbe5Nedelja;

import java.util.Scanner;

public class ZadatoPolje {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi string: ");
		String nuleJedinice = sc.nextLine();
		System.out.println("Unesi poziciju: ");
		int pozicija = sc.nextInt();
		int zadnjaPozicija = nuleJedinice.length() - 1;
		char brojDesno;
		char brojLijevo;
		
		if (pozicija == 0) {
			brojDesno = nuleJedinice.charAt(pozicija + 1);
			brojLijevo = '2';  // 2 znaci da ne postoji pozicija i na kraju printa "ne postoji pozicija"
		} else if (pozicija == zadnjaPozicija) {
			brojLijevo = nuleJedinice.charAt(pozicija - 1);
			brojDesno = '2';  // 2 znaci da ne postoji pozicija i na kraju printa "ne postoji pozicija"
		} else {
			brojDesno = nuleJedinice.charAt(pozicija + 1);
			brojLijevo = nuleJedinice.charAt(pozicija - 1);
		}
		if (brojDesno == '0') {
			System.out.println("Pozicija desno nije slobodna.");
		} else if (brojDesno == '1') {
			System.out.println("Pozicija desno jeste slobodna.");
		} else {
			System.out.println("Pozicija desno ne postoji");
		}
		if (brojLijevo == '0' ) {
			System.out.println("Pozicija lijevo nije slobodna.");
		} else if (brojLijevo == '1' ) {
			System.out.println("Pozicija lijevo jeste slobodna.");
		} else {
			System.out.println("Pozicija lijevo ne postoji.");
		}

	}

}
