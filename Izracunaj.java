package Vjezbe5Nedelja;
import java.util.Scanner;

public class Izracunaj {
	
	public static int izracunaj(String izraz) {
		String prviDio;
		String drugiDio;
		int prviBroj;
		int drugiBroj;
		char operator = ' ';
		int pozicijaOperatora = -1;
		int rezultat = 0;
		
		for (int i = 0; i < izraz.length(); i++) {
			if (izraz.charAt(i) == '+' || izraz.charAt(i) == '-' || izraz.charAt(i) == '*' || izraz.charAt(i) == '/') {
				operator = izraz.charAt(i);
				pozicijaOperatora = i;
				break;
			}
		}
		
		prviDio = izraz.substring(0, pozicijaOperatora);
		drugiDio = izraz.substring(pozicijaOperatora + 1);
		
		prviBroj = Integer.parseInt(prviDio.trim());
		drugiBroj = Integer.parseInt(drugiDio.trim());
		
		switch (operator) {
		case '+':
			rezultat = prviBroj + drugiBroj;
			break;
		case '-':
			rezultat = prviBroj - drugiBroj;
			break;
		case '*':
			rezultat = prviBroj * drugiBroj;
			break;
		case '/':
			rezultat = prviBroj / drugiBroj;
			break;
		default:
			System.out.println("Nepoznata operacija");
		}
		
		return rezultat;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi izraz: \n");
		String izraz = sc.nextLine();
		
		int rezultat = izracunaj(izraz);
		
		System.out.println("Rezultat je " + rezultat);
		
		sc.close();

	}

}
