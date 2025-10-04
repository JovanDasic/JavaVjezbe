import java.util.Scanner;

public class RasporedBrojeva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi duzinu liste: ");
        int duzinaListe = sc.nextInt();
        int brojevi[] = new int[duzinaListe];
        boolean pravilno = true;

        for (int i = 0; i < duzinaListe; i++) {
            System.out.print("Unesi broj: \n");
            int broj = sc.nextInt();
            brojevi[i] = broj;
        }

        int faza = 0;
    

        for (int i = 0; i < duzinaListe; i++) {
            if (faza == 0) {
                if (brojevi[i] < 0) {
                    faza = 0;
                } else if (brojevi[i] == 0) {
                    faza = 1;
                } else {
                    faza = 2;
                }
            } else if (faza == 1) {
                if (brojevi[i] == 0) {
                    continue;
                } else if (brojevi[i] < 0) {
                    pravilno = false;
                    break;
                } else {
                    faza = 2;
                }
            } else if (faza == 2) {
                if (brojevi[i] > 0) {
                    continue;
                } else {
                    pravilno = false;
                    break;
                }
            }
        }
        if (pravilno) {
            System.out.println("Pravilan raspored!");
        } else {
            System.out.println("Nepravilan raspored!");
        }
        sc.close();
    }
}
