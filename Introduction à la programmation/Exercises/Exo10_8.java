public class Exo10_8 {
    public static int maxTableau(int[] nums) {
        int valeurMax = nums[0];

        for (int n : nums) {
            if (n > valeurMax) {
                valeurMax = n;
            }
        }
        return valeurMax;
    }
    public static void main(String[] args) {
        int[] nums = {3, 9, 2, 14, 5};
        System.out.println(maxTableau(nums));
    }
}


