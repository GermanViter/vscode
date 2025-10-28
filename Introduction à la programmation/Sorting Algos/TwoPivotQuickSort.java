import java.util.Random;

public class TwoPivotQuickSort {
  public static void main(String[] args) {
    int[] nums = new int[7];
    remplirTableau(nums);
    System.out.print("Tableau de base : ");
    afficherTableaux(nums);

    dualPivotQuickSort(nums, 0, nums.length - 1);
    System.out.print("Tableau arrengé : ");
    afficherTableaux(nums);
  }

  public static void dualPivotQuickSort(int[] nums, int debut, int fin) {
    if (debut < fin) {
      int[] pivots = partitions(nums, debut, fin);
      int front1 = pivots[0];
      int front2 = pivots[1];

      dualPivotQuickSort(nums, debut, front1 - 1);
      dualPivotQuickSort(nums, front1 + 1, front2 - 1);
      dualPivotQuickSort(nums, front2 + 1, fin);
    }
  }

  public static int[] partitions(int[] nums, int debut, int fin) {
    if (nums[debut] > nums[fin]) {
      swap(nums, debut, fin);
    }

    int pivot1 = nums[debut];
    int pivot2 = nums[fin];

    int i = debut + 1;
    int front1 = debut + 1; // frontière pour < pivot1
    int front2 = fin - 1; // frontière pour > pivot2

    while (i <= front2) {
      if (nums[i] < pivot1) {
        swap(nums, i, front1);
        front1++;
        i++;
      } else if (nums[i] > pivot2) {
        swap(nums, i, front2);
        front2--;
      } else {
        i++;
      }
    }
    front1--;
    front2++;

    swap(nums, front1, debut);
    swap(nums, front2, fin);

    return new int[] { front1, front2 };
  }

  public static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
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
