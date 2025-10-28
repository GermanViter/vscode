import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[7];
        remplirTableau(nums);
        afficherTableaux(nums);
        System.out.println(binarySearch(nums));

    }

    public static int binarySearch(int[] nums) {
        int debut = 0;
        int fin = nums.length - 1;
        int milieux = (debut + fin) / 2;

        return nums[milieux];
    }

    public static int[] remplirTableau(int[] nums) {
        Random rand = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100) + 1;
        }
        return nums;
    }

    public static void afficherTableaux(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[nums.length - 1] + "]\n");
    }
}
