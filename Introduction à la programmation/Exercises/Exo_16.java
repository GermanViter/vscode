public class Exo_16 {
    public static String remplacer(String mot, char c1, char c2) {
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) == c1) {
                mot.charAt(i) = c2;
            }
        }
        return mot;
    }
    public static void main(String[] args) {
        remplacer("banana", 'a', 'o');
    }
}
