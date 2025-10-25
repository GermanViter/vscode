import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[7];
        remplirTableau(nums);

        System.out.print("Tableau de base : ");
        afficherTableaux(nums);

        quickSort(nums, 0, nums.length - 1);
        System.out.print("Tableau arrengé : ");
        afficherTableaux(nums);
    }

    public static int[] quickSort(int[] nums, int debut, int fin) {
        if (debut < fin) {
            int indexPartition = partitions(nums, debut, fin);

            quickSort(nums, debut, indexPartition - 1);
            quickSort(nums, indexPartition + 1, fin);
        }
        return nums;
    }

    public static int partitions(int[] nums, int debut, int fin) {
        int pivot = nums[fin];
        int i = debut - 1;

        for (int j = debut; j < fin; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, fin);
        return i + 1;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
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
