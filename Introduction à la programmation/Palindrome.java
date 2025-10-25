
import java.util.Scanner;

public class Palindrome {
    public static boolean checkIfIntIsPalindrome(int x) {
        String str = String.valueOf(x);
        int right = str.length() - 1;
        int left = 0;
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        
        while (left < right) {
            if (str.charAt(left) != (str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Entrez votre nombre entier : ");
        int choiDuJoueur = scan.nextInt();
        //System.out.println();

        System.out.println((checkIfIntIsPalindrome(choiDuJoueur)) ? "Votre nombre est un palindrome" : "Votre nombre n'est pas un palindrome");
    }
}
