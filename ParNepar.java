import java.util.Scanner;

public class ParNepar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int broj;

        while (true) {
            System.out.print("Unesi broj: ");
            try {
                broj = sc.nextInt();  // pokušava da pročita int
                break;   // uspešno, izlazak iz petlje
            } catch (Exception e) {
                System.out.println("Niste uneli validan broj. Pokušajte ponovo.");
                sc.next(); // baca nevalidan token da bi se Scanner oslobodio
            }
        }
        if (broj != 0) {
            if (broj % 2 == 0) {
            System.out.println("Broj je paran.");
        }
        else {
            System.out.println("Broj je neparan.");
        }
        }
        if (broj > 0) {
            System.out.println("Broj je pozitivan.");
        }
        else {
            System.out.println("Broj je negativan.");
        }
        
    }
}
/*8. Napisati program koji od korisnika traži da unese jedan cijeli broj. Program treba da
odredi: da li je broj paran ili neparan, da li je broj pozitivan ili negativan (nulu tretirati kao
pozitivan broj). Na kraju se štampa odgovarajuća poruka u formatu: "Broj je
pozitivan/paran", "Broj je negativan/neparan", u zavisnosti od rezultata provjere.
 */