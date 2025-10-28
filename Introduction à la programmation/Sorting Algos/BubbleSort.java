import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = new int[7];

        System.out.print("Tableau de base : ");
        afficherTableaux(nums);
        bubbleSort(nums);
        System.out.println(" ");

        System.out.print("Tableau arrengé : ");
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i]);
            }
        }
        System.out.print("]\n");
    }

    public static int[] bubbleSort(int[] nums) {
        int i = 1;
        while (i < nums.length) {
            if (nums[i] < nums[i - 1]) {
                int temp = nums[i - 1];
                nums[i - 1] = nums[i];
                nums[i] = temp;
                i = 1;
                continue;
            }
            i++;
        }
        return nums;
    }

    public static void afficherTableaux(int[] nums) {
        Random rand = new Random();

        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100) + 1;

            if (i != nums.length - 1) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i]);
            }
        }
        System.out.print("]\n");
    }
}
