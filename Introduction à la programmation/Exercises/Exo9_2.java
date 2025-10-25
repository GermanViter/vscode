public class Exo9_2 {
    public static void main(String[] args) {
        int somme = 0;
        int[] nombres = {4, 7, 2, 9}; 

        for (int n : nombres) {
            somme += n;
        }
        System.out.println("Somme des éléments : " + somme);
    } 
}