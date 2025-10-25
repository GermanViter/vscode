public class Exo9_10 {
    public static void main(String[] args) {
        int somme = 0;
        int i = 0;

        while (i < args.length) {
            somme += Integer.valueOf(args[i]);
            i++;
        }
        System.out.println(somme);
    }
}
