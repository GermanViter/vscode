public class Exo9_7 {
    public static void main(String[] args) {
        int i = 0;
        while (i < args.length) {
            if (args[i].equals("stop")) {
                break;
            }
            System.out.println(args[i]);
            i++;
        }
    }
}
