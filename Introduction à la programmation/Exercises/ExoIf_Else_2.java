public class ExoIf_Else_2 {
    public static void main(String[] args) {
        int note = 78;
        if (note >= 90) {
            System.out.println("Excellent");
        } else if (note >= 75) {
            System.out.println("Passable");
        } else if (note >= 60) {
            System.out.println("Passable");
        } else {
            System.out.println("Échec");
        }
    }
}