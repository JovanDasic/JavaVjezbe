import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int velicinaNiza = sc.nextInt();
        int[] bodovi = new int[velicinaNiza];

        for (int i = 0; i < bodovi.length; i++) {
            System.out.println("Unesite element niza: ");
            bodovi[i] = sc.nextInt();

        }
        double prosjek;
        double suma = 0;
        for (int x : bodovi) {
            suma += x;
        }
        prosjek = suma / velicinaNiza;
        System.out.println(prosjek);

        int min = 100;
        for (int x : bodovi) {
            if (x < min) {
                min = x;
            }
        }

        sc.close();
    }
}
