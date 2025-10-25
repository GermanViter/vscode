public class Exo7_14 {
    public static void main(String[] args) {
        String choix = "B";
        
        switch (choix) {
            case "A":
                System.out.println("Accueil");
                break;
            case "B":
                System.out.println("Profil");
                break;
            case "C":
                System.out.println("Déconnection");
            default:
                System.out.println("Optio inconnue");
                break;
        }
    }
}
