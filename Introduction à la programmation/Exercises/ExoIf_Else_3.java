public class ExoIf_Else_3 {
    public static void main(String[] args) {
        int niveau = 25;
        if (niveau < 10) {
            System.out.println("Débutant");
        } else if (niveau >= 10 && niveau <= 19) {
            System.out.println("Intermédiaire");
        } else if (niveau >= 20 && niveau <= 29) {
            System.out.println("Avancé");
        } else {
            System.out.println("Maitre");
        }
    }
}
