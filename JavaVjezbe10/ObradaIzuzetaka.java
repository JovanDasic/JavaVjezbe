package JavaVjezbe10;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ObradaIzuzetaka {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ispravno = false;
		double cijena = 0;
		
		while (!ispravno) {
			try {
				System.out.println("Unesi cijenu");
				cijena = sc.nextDouble();
				
				if (cijena <= 0) {
					throw new IllegalArgumentException("Cijena mora biti veca od 0!");
				}
				
				ispravno = true; 
				
			} catch (InputMismatchException e) {
				System.out.println("Unesite broj, a ne tekst!");
				sc.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println("Cijena mora biti veca od 0!");
			}
					
		}
		System.out.println("Cijena je: " + cijena);	
		sc.close();
	}

}
