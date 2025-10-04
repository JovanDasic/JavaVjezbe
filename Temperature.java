public class Temperature {
    public static void main(String[] args) {
        int[] temperatures = {3, -5, 4, -2, 0, 1, -8};
        int n = 7;
        int nIndeksi = 0;
        int popuniIndeks = 0;

        for (int temperature : temperatures) {
            if (temperature < 0) {
                nIndeksi++;
            }
        }
 
        int[] indeksi = new int[nIndeksi];

        for (int i = 0; i < n; i++) {
            if (temperatures[i] < 0) {
                
                indeksi[popuniIndeks] = i;
                popuniIndeks ++;
            }
        }   
        System.out.print("Indeksi su: ");
        for (int i = 0; i < nIndeksi; i++) {
            System.out.printf("%d", indeksi[i] + 1);
            if (nIndeksi - i != 1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
            
        }
        

        /*Poznate su temperature za svaki dan nekog perioda. Napisati program kojim
se određuje redni broj dana u tom periodu kada je temperatura poslednji put
bila negativna (dani se broje od 1 do n). */
    }
    
}
