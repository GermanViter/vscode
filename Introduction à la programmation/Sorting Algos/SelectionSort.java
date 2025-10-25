import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = new int[7];
        remplirTableau(nums);
        afficherTableaux(nums);
        selectionSort(nums);
        afficherTableaux(nums);
    }

    public static int[] selectionSort(int[] nums) {
        //int min = nums[0];
        //int minIndex = min;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void remplirTableau(int[] nums) {
        Random rand = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100);
        }
    }

    public static void afficherTableaux(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[nums.length - 1] + "]\n");
    }
}
