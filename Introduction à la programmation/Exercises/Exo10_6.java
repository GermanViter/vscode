public class Exo10_6 {
    public static long factorielle(int n) {
        long fact = 1L;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorielle(5));
    }
}
