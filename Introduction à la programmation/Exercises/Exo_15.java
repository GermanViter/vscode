public class Exo_15 {
    public static boolean contientNombre(int[] nums, int x) {
        for (int n : nums) {
            if (n == x) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2, 5, 83, 12};
        int x = 84;

        System.out.println(contientNombre(nums, x));
    }
}
