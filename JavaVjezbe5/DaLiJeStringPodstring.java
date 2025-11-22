package Vjezbe5Nedelja;
import java.util.Scanner;

public class DaLiJeStringPodstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi string: \n");
		String prvi = sc.nextLine();
		System.out.print("Unesi podstring za provjeru: \n");
		String drugi = sc.nextLine();
		
		boolean jestePodstring = false;
		
		for (int i = 0; i <= prvi.length() - drugi.length(); i++) {
			if (drugi.equals(prvi.substring(i, i + drugi.length()))) {
				jestePodstring = true;
			}
		}
		if (jestePodstring) {
			System.out.println(drugi + " jeste podstring od " + prvi);
		} else {
			System.out.println(drugi + " nije podstring od " + prvi);
		}
	}
}
