package Vjezbe5Nedelja;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println("Unesi rijec: ");
		Scanner sc = new Scanner(System.in);
		String rijec = sc.nextLine();
		
		rijec.replaceAll("\\s+", "").toLowerCase();
		
		String obrnutaRijec = new  StringBuilder(rijec).reverse().toString();
		
		if (rijec.equals(obrnutaRijec)) {
			System.out.println("Jeste palindrom");
		} else {
			System.out.println("Nije palindrom");
		}
		sc.close();
	}
}
