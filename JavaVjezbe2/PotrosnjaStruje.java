import java.util.Scanner;

public class PotrosnjaStruje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko domacinstava? ");
        int n = sc.nextInt();
        int potrosnje[] = new int[n];
        int zbir = 0;
        int zbir2 = 0;

        for (int i = 0; i < n; i ++) {
            System.out.println("Unesi potrosnju u kWh: ");
            int potrosnja = sc.nextInt();
            potrosnje[i] = potrosnja;
        }
        for (int i = 0; i < n; i ++) {
            zbir += potrosnje[i];
        }

        for (int i = 0; i < n; i ++) {
            if (potrosnje[i] > 500) {
                zbir2 += potrosnje[i];
            }
        }
        System.out.println(zbir);
        System.out.println(zbir2);
    }
}
/*12. Za 𝑁 domaćinstava unosi se mjesečna potrošnja struje (kWh). Računati ukupnu
potrošnju i posebno zbir za ona domaćinstva čija je potrošnja > 500 kWh.
 */
