import java.util.Scanner;

public class ObradaIzuzetaka2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cijena = 0;
        boolean ispravno = false;

        while (!ispravno) {
            System.out.print("Unesite cijenu proizvoda: ");
            String unos = sc.nextLine();

            try {
                cijena = Double.parseDouble(unos);

                if (cijena <= 0) {
                    throw new IllegalArgumentException("Cijena mora biti veca od 0!");
                }

                ispravno = true;

            } catch (NumberFormatException e) {
                System.out.println("Greska: Morate unijeti broj!");
            } catch (IllegalArgumentException e) {
                System.out.println("Greska: Cijena mora biti veca od 0!");
            }
        }

        System.out.printf("Cijena proizvoda %.2f je ispravna.%n", cijena);
        sc.close();
    }
}
