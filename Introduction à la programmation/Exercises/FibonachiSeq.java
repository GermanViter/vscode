public class FibonachiSeq {
    public static void main(String[] args) {
        int[] nums = new int[22];
        nums[0] = 0;
        nums[1] = 1;

        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
