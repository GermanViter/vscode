public class Exo7_11 {
    public static void main(String[] args) {
        String[] couleurs = {"Rouge", "Vert", "Bleu"};
        String[] codes = {"R", "G", "B"};

        for (int i = 0; i < codes.length; i++) {
            System.out.printf("""
                    Code : %s
                    Couleur : %s
                    """, codes[i], couleurs[i]);
            System.out.println();
        }
    }
}
