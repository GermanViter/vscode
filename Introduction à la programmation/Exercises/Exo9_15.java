public class Exo9_15 {
    public static void main(String[] args) {
        int[] nombres = {3, 6, 9, 12};
        int somme = 0;

        for (int i : nombres) {
            somme += i;    
        }
        System.out.println("Somme des elements : " + somme);
    }
}
