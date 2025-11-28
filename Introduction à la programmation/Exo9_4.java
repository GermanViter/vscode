public class Exo9_4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        int somme = 0;
        System.out.print("Nombres recus : ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            somme += Integer.valueOf(args[i]);
        }
        double moyenne = somme / (double) args.length;
        System.out.printf("\nMoyenne : %.1f\n", moyenne);
    }
}
