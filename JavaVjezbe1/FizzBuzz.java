import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("Unesi broj: ");
            try {
                n = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Niste unijeli broj! Pokusajte ponovo!");
            }
        }

        if (n % 5 == 0 && n % 3 != 0) {
            System.out.println("Fizz");
        }
        else if (n % 3 == 0 && n % 5 != 0) {
            System.out.println("Buzz");
        }
        else if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else {
            System.out.println(n);
        }
    }
}
/*11. Napisati program za igru fizz_buzz. Nakon unosa cijelog broj N treba provjeriti sledeća
pravila:
-Ako je broj djeljiv sa 5 ali ne i sa 3 poruka treba da bude “Fizz”
-Ako je broj djeljiv sa 3 ali ne i sa 5 poruka treba da bude “Buzz”
-Ako je broj djeljiv sa oba 3 i 5 poruka treba da bude “FizzBuzz”
-Ako broj nije djeljiv ni sa 3 ni sa 5, poruka treba da bude broj N. */