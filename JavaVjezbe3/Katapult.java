import java.util.Scanner;

public class Katapult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj katapulta: ");
        int n = sc.nextInt();

        System.out.println("Unesi distancu katapulta: ");
        int d = sc.nextInt();
        
        System.out.println("Unesite health dvorca: ");
        int HD = sc.nextInt();
        
        System.out.println("Unesite napad katapulta: ");
        int KA = sc.nextInt();

        int brKatapultaIzDometa = 0;

        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesi x koordinatu: ");
            int x1 = sc.nextInt();

            System.out.println("Unesi y koordinatu: ");
            int y1 = sc.nextInt(); 
            int manhatnRastojanje = Math.abs(y1) + Math.abs(x1);
            if (manhatnRastojanje <= d) {
                brKatapultaIzDometa ++;
            }
        }
        if (brKatapultaIzDometa + KA >= HD) {
            System.out.println("Dvorac je srusen");
        } else {
            System.out.println("Dvorac nije srusen");
        }
        sc.close();
    }
}
