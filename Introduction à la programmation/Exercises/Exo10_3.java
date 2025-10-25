public class Exo10_3 {
    public static int max(int x, int y) {
        if (x - y > 0) {
            return x;
        } else if (x - y < 0) {
            return y;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(max(8, 12));
    }
}
