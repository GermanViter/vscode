public class Exo9_24 {
    public static void main(String[] args) {
        String[] mots = {"arbre", "Grizzly", "chat", "animal", "chien"};

        for (int i = 0; i < mots.length; i++) {
            if ((mots[i].contains("a"))) {
                continue;
            }
            System.out.println(mots[i]);
        }
    }
}
