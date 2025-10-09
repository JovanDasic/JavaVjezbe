public class Zadatak1 {
    public static void main(String[] args) {
        int[] niz = new int[10];
        for (int i = 0; i < niz.length; i++) {
            niz[i] = 10 - i;
        }
    

        for (int broj : niz) {
            System.out.println(broj);
        }
    }
}
