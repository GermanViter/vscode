public class Exo_17 {
    public static int compteurLettre(String mot, char c) {
        int compteur = 0;
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) == c) {
                compteur++;
            }
        }
        return compteur;
    }
    public static void main(String[] args) {
        System.out.println(compteurLettre("Hello World", 'o'));
    }
}
