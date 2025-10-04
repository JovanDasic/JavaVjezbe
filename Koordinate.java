public class Koordinate {
    public static void main(String[] args) {
        int x1 = -5;
        int x2 = 3;
        int y1 = 2;
        int y2 = -2;

        int a = Math.abs(x1) + Math.abs(x2);
        int b = Math.abs(y1) + Math.abs(y2);

        int p = a * b;
        int o = 2 * a + 2 * b;

        System.out.printf("Povrsina je %d\n", p);
        System.out.printf("Obim je %d", o);
    }
}
