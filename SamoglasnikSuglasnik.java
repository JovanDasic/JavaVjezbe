package Vjezbe5Nedelja;

import java.util.Scanner;

public class SamoglasnikSuglasnik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi rijec: \n");
		String rijec = sc.nextLine();
		char[] samoglasnici = {'a', 'e', 'i', 'o', 'u'};
		int brojSamoglasnika = 0;
		
		for (int i = 0; i < rijec.length(); i ++) {
			char karakter = rijec.charAt(i);
			for (char samoglasnik : samoglasnici) {
				if (karakter == samoglasnik) {
					brojSamoglasnika ++;
				}
			}			
		}
		int brojSuglasnika = rijec.length() - brojSamoglasnika;
		System.out.println("Broj samoglasnika: " + brojSamoglasnika + "\n" + "Broj suglasnika: " + brojSuglasnika);
		sc.close();
	}

}
