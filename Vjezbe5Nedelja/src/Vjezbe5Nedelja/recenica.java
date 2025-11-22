package Vjezbe5Nedelja;
import java.util.Scanner;

public class recenica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi recenicu: \n");
		String recenica = sc.nextLine();
		recenica.trim();
		if (recenica.isEmpty()) {
			System.out.println("Nije nista unijeto");
			}
		else {
			String[] rijeci = recenica.split("\\s+");
			System.out.println("Ukupan broj rijeci je: " + rijeci.length);
		}
		sc.close();
	}
}
