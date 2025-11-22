import java.util.Scanner;

public class BrojIncidenata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj incidenata: ");
        int x0 = 0;
        int y0 = 0;
        int N = sc.nextInt();
        double najudaljeniji = 0;
        double najblizi = Double.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            System.out.println("Unesi x koordinatu: ");
            int x = sc.nextInt();
            System.out.println("Unesi y koordinatu: ");
            int y = sc.nextInt();

            double manhatnRastojanje = Math.abs(x - x0) + Math.abs(y - y0);

            System.out.printf("Euklidsko rastojanje je: %.2f\n", manhatnRastojanje);

            if (manhatnRastojanje > najudaljeniji) {
                najudaljeniji = manhatnRastojanje;
            } 
            if (najblizi > manhatnRastojanje) {
                najblizi = manhatnRastojanje;
            }



        }
        System.out.println(najblizi);
        System.out.println(najudaljeniji);
        
        sc.close();
    }
}
/*U gradu su ulice raspoređene kao kvadratna mreža (grid). Policijska stanica
nalazi se na koordinatama (x0
, y0
). U gradu se desilo N incidenata na
lokacijama (xi,yi). Manhattan rastojanje između dvije tačke definiše se kao:
d = ∣xi−x0∣ + ∣yi−y0∣. Potrebno je izračunati za svaki incident Manhattan
rastojanje do stanice i ispisati ga, a zatim na kraju odrediti i koji incident je bio
najbliži, a koji najdalji stanici. */
