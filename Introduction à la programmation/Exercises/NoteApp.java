public class NoteApp {
    public static void main(String[] args) {
        int note = Integer.valueOf(args[0]);

        if (note > 100 || note < 0) {
            System.out.println("Note invalide");
        } else if (note < 60) {
            System.out.println("Échec");
        } else if (note >= 60 && note <= 69) {
            System.out.println("Passable");
        } else if (note >= 70 && note <= 84) {
            System.out.println("Bien");
        } else if (note >= 85) {
            System.out.println("Excellent");
        }
    }
}
