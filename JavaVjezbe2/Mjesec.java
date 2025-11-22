import java.util.Scanner;

public class Mjesec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int broj;

        while (true) {
            System.out.println("Unesi broj mjeseca: ");
            try {
                broj = sc.nextInt();
                if (broj > 12 || broj < 1) {
                System.out.println("Nije validan broj ");
                }
                else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Nije unijet broj");
                sc.next();
            }
        }

        switch (broj) {
            case 1:
            System.out.println("Januar");
            break;
            case 2:
            System.out.println("Februar");
            break;
            case 3:
            System.out.println("Mart");
            break;
            case 4:
            System.out.println("April");
            break;
            case 5:
            System.out.println("Maj");
            break;
            case 6:
            System.out.println("Jun");
            break;
            case 7:
            System.out.println("Jul");
            break;
            case 8:
            System.out.println("Avgust");
            break;
            case 9:
            System.out.println("Septembar");
            break;
            case 10:
            System.out.println("Oktobar");
            break;
            case 11:
            System.out.println("Novembar");
            break;
            case 12:
            System.out.println("Decembar");
            break;
        }
        
    }
}
/*9. Napisati program koji na osnovu unesenog broja, od 1 do 12, ispisuje odgovarajući
tekstualni oblik za i-ti mjesec. U slučaju da je broj van ovog opsega, ispisuje se poruka
„Nedozvoljen broj“.
 */