import java.util.Scanner;

public class Karte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj karata: ");
        int n = sc.nextInt();
        int[] karte = new int[n];

        System.out.println("Unesite karte:");
        for (int i = 0; i < n; i++) {
            karte[i] = sc.nextInt();
        }

        boolean pravilno = true;
        boolean naisaoNaNeparnu = false;

        for (int karta : karte) {
            if (karta % 2 == 0) {
                if (naisaoNaNeparnu) {
                    pravilno = false;
                    break;
                }
            } else {
                naisaoNaNeparnu = true;
            }
        }

        if (pravilno) {
            System.out.println("Karte su pravilno slozene.");
        } else {
            System.out.println("Karte nisu pravilno slozene.");
        }
    }
}
/*35.Marko se zabavlja kartama. Sve karte koje je imao u ruci je složio tako da
prvo idu sve karte sa parnim brojevima, a zatim one sa neparnim brojevima
(moguće je i da je Marko imao samo parne ili samo neparne karte). Napiši
program koji proverava da li je Marko ispravno složio karte.
 */
