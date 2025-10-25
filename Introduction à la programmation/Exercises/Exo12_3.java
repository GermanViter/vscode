import java.util.Scanner;

public class Exo12_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[2];
        int somme = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Entrez le numero %d : ", i + 1);
            nums[i] = scan.nextInt();
            somme += nums[i];
        }
        System.out.printf("Somme des deux chiffres : %d", somme);

        scan.close();
    }
}
