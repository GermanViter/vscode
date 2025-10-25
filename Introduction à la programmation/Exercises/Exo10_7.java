import java.util.Scanner;

public class Exo10_7 {
    public static String reverseString(String word) {
        int left = 0;
        //int right = word.length() - 1;
        char[] ansArray = word.toCharArray();
        int right = ansArray.length - 1;

        while (left < right) {
            char temp = ansArray[left];
            ansArray[left] = ansArray[right];
            ansArray[right] = temp;
            left++;
            right--;         
        }
        String ans = new String(ansArray);
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez le mot à renverser : ");
        String word = scan.nextLine();
        System.out.println(reverseString(word));
    }
}
