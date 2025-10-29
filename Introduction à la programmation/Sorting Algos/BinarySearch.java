public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[7];
        Functions.remplirTableau(nums);
        QuickSort.quickSort(nums);
        Functions.afficherTableaux(nums);
        int x = nums[2];
        int result = binarySearch(nums, x, 0, nums.length);
        System.out.println(result);
    }

    public static void binarySearch(int[] nums, int x) {
        binarySearch(nums, x, 0, nums.length);
    }

    private static int binarySearch(int[] nums, int x ,int debut, int fin) { 
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
}
