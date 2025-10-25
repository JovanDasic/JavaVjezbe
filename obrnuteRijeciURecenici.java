package Vjezbe5Nedelja;

import java.util.Scanner;

public class obrnuteRijeciURecenici {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi recenicu: ");
		String recenica = sc.nextLine();
		String[] rijeci = recenica.trim().split("\\s+");
		String[] noveRijeci = new String[rijeci.length];
		int i = 0;
		for (String rijec : rijeci) {
			String novaRijec = new StringBuilder(rijec).reverse().toString();
			noveRijeci[i] = novaRijec;
			i++;
		}
		for (String novaRijec : noveRijeci) {
			System.out.print(novaRijec + " ");
		}
		sc.close();
	}

}
