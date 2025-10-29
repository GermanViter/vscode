public class QuickSort {
  public static void main(String[] args) {
    int[] nums = new int[7];
    Functions.remplirTableau(nums);

    System.out.print("Tableau de base : ");
    Functions.afficherTableaux(nums);

    quickSort(nums, 0, nums.length - 1);
    System.out.print("Tableau arrengé : ");
    Functions.afficherTableaux(nums);
  }

  public static void quickSort(int[] nums) {
    quickSort(nums, 0, nums.length - 1);
  }

  private static int[] quickSort(int[] nums, int debut, int fin) {
    if (debut < fin) {
      int indexPartition = partitions(nums, debut, fin);

      quickSort(nums, debut, indexPartition - 1);
      quickSort(nums, indexPartition + 1, fin);
    }
    return nums;
  }

  private static int partitions(int[] nums, int debut, int fin) {
    int pivot = nums[fin];
    int i = debut - 1;

    for (int j = debut; j < fin; j++) {
      if (nums[j] < pivot) {
        i++;
        Functions.swap(nums, i, j);
      }
    }
    Functions.swap(nums, i + 1, fin);
    return i + 1;
  }
}
