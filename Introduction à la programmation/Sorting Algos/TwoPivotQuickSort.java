public class TwoPivotQuickSort {
  public static void main(String[] args) {
    int[] nums = new int[7];
    Functions.remplirTableau(nums);
    System.out.print("Tableau de base : ");
    Functions.afficherTableaux(nums);

    dualPivotQuickSort(nums, 0, nums.length - 1);
    System.out.print("Tableau arrengé : ");
    Functions.afficherTableaux(nums);
  }

  public static void dualPivotQuickSort(int[] nums) {
    dualPivotQuickSort(nums, 0, nums.length - 1);
  }

  private static void dualPivotQuickSort(int[] nums, int debut, int fin) {
    if (debut < fin) {
      int[] pivots = partitions(nums, debut, fin);
      int front1 = pivots[0];
      int front2 = pivots[1];

      dualPivotQuickSort(nums, debut, front1 - 1);
      dualPivotQuickSort(nums, front1 + 1, front2 - 1);
      dualPivotQuickSort(nums, front2 + 1, fin);
    }
  }

  private static int[] partitions(int[] nums, int debut, int fin) {
    if (nums[debut] > nums[fin]) {
      Functions.swap(nums, debut, fin);
    }

    int pivot1 = nums[debut];
    int pivot2 = nums[fin];

    int i = debut + 1;
    int front1 = debut + 1; // frontière pour < pivot1
    int front2 = fin - 1; // frontière pour > pivot2

    while (i <= front2) {
      if (nums[i] < pivot1) {
        Functions.swap(nums, i, front1);
        front1++;
        i++;
      } else if (nums[i] > pivot2) {
        Functions.swap(nums, i, front2);
        front2--;
      } else {
        i++;
      }
    }
    front1--;
    front2++;

    Functions.swap(nums, front1, debut);
    Functions.swap(nums, front2, fin);

    return new int[] { front1, front2 };
  }
}
