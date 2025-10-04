public class Floor {
    public static void main(String[] args) {
        int x = 10;
        int n = 4;
        int proizvod = x;

        for (int i = 1; i < n; i++) {
            proizvod *= x;
        }
        System.out.println(proizvod);
}
}
