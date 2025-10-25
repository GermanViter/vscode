public class Exo9_23 {
    public static void main(String[] args) {
        String[] mots = {"chat", "chien", "", "oiseau"};

        for (int i = 0; i < mots.length; i++) {
            if (mots[i].length() == 0) {
                System.out.printf("Première chaîne vide à l’indice : %d\n", i);
            }
        }
    }
}
