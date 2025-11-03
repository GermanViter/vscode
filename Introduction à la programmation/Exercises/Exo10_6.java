public class Exo10_6 {
    public static int factorielle(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorielle(5));
    }
}
