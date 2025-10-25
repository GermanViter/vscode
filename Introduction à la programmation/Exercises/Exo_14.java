public class Exo_14 {
    public static boolean estUnPalindrome(String mot) {
        char[] tabLettres = mot.toLowerCase().toCharArray();

        int droite = tabLettres.length - 1;
        int gauche = 0;

        while (gauche < droite) {
            if (tabLettres[gauche] != tabLettres[droite]) {
                return false;
            }
            gauche++;
            droite--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(estUnPalindrome("LavAl"));
    }
}
