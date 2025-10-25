public class Exo_19 {
    public static int[] creerTab(int n) {
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
             nums[i] = (int) (Math.random() * 101);
        }
        return nums;
    }
    public static void afficherTab(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                System.out.print(nums[i] + ",");
            } else {
                System.out.print(nums[i]);
            }
        }
        System.out.print("]\n");
    }
    public static void inverserTab(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
            left++;
        }
        afficherTab(nums);
    }
    public static void main(String[] args) {
        int[] nums = creerTab(5);
        afficherTab(nums);
        inverserTab(nums);
    }
}