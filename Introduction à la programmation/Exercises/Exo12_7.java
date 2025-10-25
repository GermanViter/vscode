import java.util.Scanner;

public class Exo12_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] nums = new double[3];
        double somme = 0;

        System.out.print("Entrez vos trois numeros : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.valueOf(scan.next());
            somme += nums[i];
        }
        double moyenne = somme / nums.length;

        System.out.printf("La moyenne est : %.2f", moyenne);
    }
}
