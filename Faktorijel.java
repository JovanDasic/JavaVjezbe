public class Faktorijel {
    public static void main(String[] args) {
        int n = 10;
        int faktorijel = 1;
        for (int i = 1; i < n+1; i++) {
            faktorijel *= i;
        }
        System.out.printf("Faktorijel broja %d je %d.", n, faktorijel);
    }
}
