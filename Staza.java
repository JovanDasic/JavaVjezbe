import java.util.Scanner;

public class Staza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj trkaca: ");
        int n = sc.nextInt();
        System.out.println("Unesi poluprecnik manjeg kruga: ");
        int R1 = sc.nextInt();
        System.out.println("Unesi poluprecnik veceg kruga: ");
        int R2 = sc.nextInt();

        int trkaciNaStazi = 0;
        int xTrkaca;
        int yTrkaca;
        double najudaljenijiTrkac = 0;
        double temp = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesi x koordinatu trkaca: ");
            xTrkaca = sc.nextInt();

            System.out.println("Unesi y koordinatu trkaca: ");
            yTrkaca = sc.nextInt();

            double euklidskoRastojanje = Math.sqrt(Math.pow(xTrkaca, 2) + Math.pow(yTrkaca, 2));
            if (euklidskoRastojanje <= R2 && euklidskoRastojanje >= R1 && yTrkaca > 0) {
                trkaciNaStazi ++;
            }

            if (euklidskoRastojanje > najudaljenijiTrkac) {
                najudaljenijiTrkac = euklidskoRastojanje;
            }
        }
        System.out.printf("Broj trkaca na stazi je %d\n", trkaciNaStazi);
        System.out.printf("Najudaljeniji trkac je udaljen %f\n", najudaljenijiTrkac);
        }

    }
