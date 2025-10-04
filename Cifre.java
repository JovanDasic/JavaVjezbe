import java.util.Scanner;

public class Cifre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        int broj = sc.nextInt();
        int count = 0;
        int zbir = 0;
        int temp = broj;

        while (temp != 0) {
            int cifra = temp % 10;
            zbir += cifra;
            count ++;
            temp /= 10;

        }
        System.out.println("Suma cifara je " +zbir);
    }
    
}
