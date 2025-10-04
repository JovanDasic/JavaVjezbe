public class Kod {
    public static void main(String[] args) {
        int broj = 999;
        String brojString = Integer.toString(broj);
        char prvaCifraChar = brojString.charAt(0);
        char drugaCifraChar = brojString.charAt(1);
        char trecaCifraChar = brojString.charAt(2);

        int prvaCifra2 = Integer.parseInt(String.valueOf(prvaCifraChar));
        int drugaCifra2 = Integer.parseInt(String.valueOf(drugaCifraChar));
        int trecaCifra2 = Integer.parseInt(String.valueOf(trecaCifraChar));

        int proizvod = prvaCifra2 * drugaCifra2 * trecaCifra2;
        int zbir = prvaCifra2 + drugaCifra2 + trecaCifra2;

        System.out.printf("Tajni kod je %d ", proizvod-zbir);

    }
} 
/*7. Dobili ste zadatak da dešifrujete kod kojim se otvaraju tajna vrata. Otkrili ste da na
osnovu poznatog trocifrenog broja možete pronaći kod koji otvara tajna vrata tako što od
proizvoda cifara tog broja oduzmete zbir cifara istog broja */
