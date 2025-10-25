public class Calculatrice {
    public static void main(String[] args) {
        switch (args[1]) {
            case "+":
                System.out.println(args[0] + " + " + args[2] + " = " + (Integer.valueOf(args[0]) + Integer.valueOf(args[2])));
                break; 
            case "-":
                System.out.println(args[0] + " - " + args[2] + " = " + (Integer.valueOf(args[0]) - Integer.valueOf(args[2])));
                break;
            case "*":
                System.out.println(args[0] + " * " + args[2] + " = " + (Integer.valueOf(args[0]) * Integer.valueOf(args[2])));
                break;
            case "/":
                if (Integer.valueOf(args[0]) != 0 || Integer.valueOf(args[2]) != 0) {
                    System.out.println(args[0] + " / " + args[2] + " = " + (Integer.valueOf(args[0]) / Integer.valueOf(args[2])));
                } else {
                    System.out.println("ERREUR: DIVISION PAR 0 IMPOSSIBLE");
                }
                break;
            default:
                break;
        }
    }
}
