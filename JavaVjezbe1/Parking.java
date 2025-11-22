import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj automobila: ");
        int n = sc.nextInt();
        int zarada = 0;
        int pojedninacneZarade;
        int brojSati;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesi broj sati: ");
            brojSati = sc.nextInt();
            if (brojSati > 5) {
                pojedninacneZarade = (brojSati - 5) + 10;
            }
            else {
                pojedninacneZarade = brojSati * 2;
            }
            zarada += pojedninacneZarade;
        }
        System.out.println(zarada);
    }
}
