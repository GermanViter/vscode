public class Exo10_9 {
    public static int[] array(int nbElement) {
        int[] nums = new int[nbElement];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 101);
        }
        return nums;
    }

    public static int valeurMax(int[] nums) {
        int max = nums[0];
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static int valeurMin(int[] nums) {
        int min = nums[0];

        for (int n : nums) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int nbElement = 5;
        int[] nums = array(nbElement);

        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                System.out.print(nums[i] + ",");
            } else {
                System.out.print(nums[i] + "]");
            }
        }
        int max = valeurMax(nums);
        int min = valeurMin(nums);

        System.out.println();
        System.out.println("Le maximum est : " + max);
        System.out.println("Le minimum est : " + min);
    }
}
