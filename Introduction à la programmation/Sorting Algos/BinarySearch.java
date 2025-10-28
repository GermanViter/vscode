import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[7];
        remplirTableau(nums);
        QuickSort.quickSort(nums);
        afficherTableaux(nums);
        int x = nums[2];
        int result = binarySearch(nums, x, 0, nums.length);
        System.out.println(result);
    }

    public static void binarySearch(int[] nums) {
        binarySearch(nums, x, 0, nums.length);
    }

    public static int binarySearch(int[] nums, int x ,int debut, int fin) { 
        while (debut <= fin) {
            int mid = debut + (fin - debut) / 2;
            if (x == nums[mid]) {
                return nums[mid];
            } 
            if (x > nums[mid]) {
                debut = mid + 1;
            } else {
                fin = mid - 1;
            }
        }

        return -1;
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
