public class Exo9_3 {
    public static void main(String[] args) {
        String[] mots = {"Java", "Programmation", "Code", "Tableau", "if"};
        int motsLong = 0;

        for (String m : mots) {
            if (m.length() >= 5) {
                motsLong++;
            }
        }
        System.out.println("Mots de 5 lettres ou plus : " + motsLong);
    }
}
