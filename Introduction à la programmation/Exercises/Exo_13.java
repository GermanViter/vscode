public class Exo_13 {
    public static int compterVoyelles(char[] tab) {
        String voyelles = "aeiouyAEIOUY"; // maj et min
        int compteur = 0;

        for (char c : tab) {
            if (voyelles.indexOf(c) != -1) { 
                compteur++;
            }
        }
        return compteur;
    }

    public static void main(String[] args) {
        char[] tabChar = {'a', 'b', 'e', 'f', 'i', 'o', 'u', 'p'};
        System.out.println("Nombre de voyelles : " + compterVoyelles(tabChar));
    }
}
