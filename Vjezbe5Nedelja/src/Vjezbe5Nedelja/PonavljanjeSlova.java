package Vjezbe5Nedelja;

import java.util.Scanner;

public class PonavljanjeSlova {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi rijec: \n");
		String rijec = sc.nextLine();
		boolean ponavljaSe = false;
		
		for (int i = 0; i < rijec.length() - 1; i++) {
			if (rijec.charAt(i) == rijec.charAt(i + 1)) {
				System.out.print("Karakter " + rijec.charAt(i) + " se ponavlja uzastopno.\n");
				ponavljaSe = true;
				break;
			} else {
				continue;
			}
		}
		if (!ponavljaSe) {
			System.out.println("Nema ponavljanja karaktera uzastopno");
		}
		sc.close();
	}

}
