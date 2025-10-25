public class Exo7_6 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        
        int somme = 0;
        for (String n : args) {
            somme += Integer.valueOf(n);
        }
        double moyenne = somme / (double) args.length; //calcule la moyenne

        System.out.println((moyenne >= 12) ? "Réussite" : "Échec");
    }
}
