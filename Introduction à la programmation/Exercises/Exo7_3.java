public class Exo7_3 {
    public static void main(String[] args) {
        int a = 12;
        int b = 20;

        if (a > b) {
            System.out.printf("%d est plus grand que %d\n", a, b);
        } else if (a < b) {
            System.out.printf("%d est plus grand que %d\n", b, a);
        } else {
            System.out.printf("%d et %d sont égaux\n", a, b);
        }
    }
}
