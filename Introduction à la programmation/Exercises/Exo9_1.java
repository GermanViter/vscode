public class Exo9_1 {
    public static void main(String[] args) {
        /*
         * Argument 0 : Alice
         * Argument 1 : Bob
         * Argument 2 : Carla
         */
        for (int i = 0; i < args.length; i++) {
            System.out.printf("Argument %d : %s\n", i, args[i]);
        }
    }
}
