public class Exo_16 {
    public static String remplacer(String mot, char c1, char c2) {
        return mot.replace(c1, c2);
    }

    public static void main(String[] args) {
        String motModifie = remplacer("banana", 'a', 'o');
        System.out.println(motModifie); // affiche "bonono"
    }
}

