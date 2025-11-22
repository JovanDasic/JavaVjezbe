import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] brojevi = new int[duzinaNiza];

        for (int i = 0; i < duzinaNiza; i++) {
            System.out.print("Unesi element niza: ");
            brojevi[i] = sc.nextInt();
        }

        for (int i = 0; i < duzinaNiza - 1; i++) {
            for (int j = 0; j < duzinaNiza - i - 1; i++) {
                if (brojevi[j] > brojevi[j+1]) {
                    int temp = brojevi[j];
                    brojevi[j] = brojevi[j+1];
                    brojevi[j+1] = temp;
                }
            }
        }
        for (int x : brojevi) {
            System.out.println(x);
        }
    }
}
