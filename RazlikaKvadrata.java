import java.util.Scanner;
public class RazlikaKvadrata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println(a*a - b*b);
    }
}
