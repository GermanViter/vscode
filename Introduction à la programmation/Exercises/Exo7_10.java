public class Exo7_10 {
    public static void checkTypeOfTriangle(int a, int b, int c) {
        if (a == b && a == c) {
             System.out.println("Triangle Équilatéral");
        } else if (a == b ^ a == c) {
            System.out.println("Triangle Isocèle");
        } else {
            System.out.println("Triangle Sclène");
        }
    }
    public static void main(String[] args) {
        checkTypeOfTriangle(5, 5, 4);
    }
}
