public class ExoSwitch_3 {
    public static void main(String[] args) {
        char note = 'B';

        switch (note) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Très bien");
                break;
            case 'C':
                System.out.println("Bien");
                break;
            default:
                System.out.println("Note invallide");
                break;
        }
    }
}
