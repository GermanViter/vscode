public class Exo7_8 {
    public static void main(String[] args) {
        String[] mots = {"bonjour", "test", "interdit"};
        //Si un des éléments du tableau est "interdit", affiche “Attention : mot interdit détecté.”

        for (String m : mots) {
            if (m.equals("interdit")) {
                System.out.println("Attention : mot interdit détecté.");;
            }
        }   
    }
}
