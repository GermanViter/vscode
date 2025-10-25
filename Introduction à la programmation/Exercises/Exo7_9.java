public class Exo7_9 {
    public static void main(String[] args) {
        String n = args[0];

        System.out.printf("Mot : %s\n", n);
        System.out.printf("Longueur : %d\n", n.length());
        if (n.length() < 5) {
            System.out.println("Mot court");
        } else if (n.length() <= 7) {
            System.out.println("Mot moyen");
        } else {
            System.out.println("Mot long");
        }
    }
}
