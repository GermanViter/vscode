public class ExoSwitch_2 {
    public static void main(String[] args) {
        String choix = "thé";

        switch (choix) {
            case "café":
                System.out.println("vous avex choisi du caffé");
                break;
            case "thé":
                System.out.println("vous avex choisi du thé");
                break;
            case "jus":
                System.out.println("vous avex choisi du jus");
                break;
            default:
                System.out.println("boisson inconnue");
                break;
        }
    }
}
