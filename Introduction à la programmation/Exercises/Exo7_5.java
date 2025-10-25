public class Exo7_5 {
    public static void main(String[] args) {
        //Si le nom est "admin" et le mot de passe est "1234", affiche “Bienvenue admin”, sinon “Identifiants incorrects”.
        if ((args[0].equals("admin")) && (args[1].equals("1234"))) {
            System.out.println("Bienvenue admin");
        } else {
            System.out.println("Identifiants incorrects");
        }
    }
}