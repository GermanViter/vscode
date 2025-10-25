import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = new int[7];
        boolean aEteAppelee = false;

        afficherTableaux(nums, aEteAppelee);
        insertionSort(nums);
        System.out.print("[");
            for (int i = 0; i < nums.length - 1; i++) {
                System.out.print(nums[i] + ", ");
            }
            System.out.print(nums[nums.length - 1] + "]\n");

    }

    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        return nums;
    }

    public static void afficherTableaux(int[] nums, boolean aEteAppelee) {
            Random rand = new Random();

            for (int i = 0; i < nums.length; i++) {
                nums[i] = rand.nextInt(100) + 1;
            }
            aEteAppelee = true;

            System.out.print("[");
            for (int i = 0; i < nums.length - 1; i++) {
                System.out.print(nums[i] + ", ");
            }
            System.out.print(nums[nums.length - 1] + "]\n");
    }
}
