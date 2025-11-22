import java.util.Scanner;

public class Matrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi broj redova: ");
        int brojRedova = sc.nextInt();
        System.out.print("Unesi broj kolona: ");
        int brojKolona = sc.nextInt();

        int[][] matrica = new int[brojRedova][brojKolona];
        for (int i = 0; i < brojRedova; i++) {
            for (int j = 0; j < brojKolona; j++) {
                System.out.print("Unesi element niza: ");
                int element = sc.nextInt();
                matrica[i][j] = element;
            }
        }


        // ispisi matricu
        for (int i = 0; i < brojRedova; i++) {
            for (int j = 0; j < brojKolona; j ++) {
                System.out.print(matrica[i][j] + "");
            }
            System.out.println("");
        }

        // saberi sve clanove
        int suma = 0;
        for (int i = 0; i < brojRedova; i ++) {
            for (int j = 0; j < brojKolona; j++) {
                suma += matrica[i][j];
            }
        }
        System.out.println("Suma svih clanova matrice je " + suma);

        // printaj najveci clan
        int max = 0;
        int pozicijaI = 0;
        int pozicijaJ = 0;
        for (int i = 0; i < brojRedova; i++) {
            for (int j = 0; j < brojKolona; j++) {
                if (matrica[i][j] > max) {
                    max = matrica[i][j];
                    pozicijaI = i;
                    pozicijaJ = j;
                }
            }
        }
        System.out.println("Najveci clan matrice je " + max + " na poziciji " + pozicijaI + " " + pozicijaJ);
        // printaj najmanji clan matrice
        int min = 9999999;
        for (int i = 0; i < brojRedova; i ++) {
            for (int j = 0; j < brojKolona; j++) {
                if (matrica[i][j] < min) {
                    min = matrica[i][j];
                }
            }
        }
        System.out.println("Najmanji clan matrice je " + min);

        // suma glavne dijagonale
        int sumaDijagonale = 0;
        for (int i = 0; i < brojRedova; i++) {
            sumaDijagonale += matrica[i][i];
        }
        System.out.println("Suma glavne dijagonale je " + sumaDijagonale);
        

        // suma sporedne dijagonale
        int sumaSporedneDijagonale = 0;
        for (int i = brojRedova - 1; i >= 0; i--) {
            sumaSporedneDijagonale += matrica[i][i];
        }
        System.out.println("Suma sporedne dijagonale je " + sumaSporedneDijagonale);
        sc.close();
    }   

}
