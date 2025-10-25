public class Exo7_15 {
    public static void main(String[] args) {
        switch (args[0]) {
            case "start":
                System.out.println("Lencement  du programme");
                break;
            case "stop":
                System.out.println("Arrêt demandé");
                break;
            case "rest":
                System.out.println("Réinitialisation");
                break;
            default:
                System.out.println("Commande inconnue");
                break;
        }
    }
}
