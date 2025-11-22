public class Blago {
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 2;
        int x2 = 6;
        int y2 = 6;
        int x3 = x2 + 2;
        int y3 = y2 - 3; 

        int a = x2 - x1 + 2;
        int b = -3 - (y2 - y1);

        double vazdusnoRastojanje = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.println("Koordinate su x="+x3+" y="+y3);
        System.out.println("Vazdusno rastojanje je " +vazdusnoRastojanje);


        /*6. Zamislite da ste dobili tajanstveno pismo sa mapom i uputstvima za pronalaženje
skrivenog blaga. Uputstva su sljedeća: "Trebate da krenete od starog hrasta koji ima
sledeću poziciju G (x1,y1). Onda trebate ići pravo do stare kuće koja se nalazi na poziciji
K(x2,y2). Blago je zakopano u susjedstvu, gdje se nalazi kuća, i to desno od pozicije kuće za
dvije pozicije, i ispod za tri pozicije. Izračunajte koordinate blaga. Izračunajte (vazdušno)
rastojanje od hrasta do blaga. Izračunajte rastojanje od hrasta do blaga tako da morate
obići i kuću. */
    }

    
}
