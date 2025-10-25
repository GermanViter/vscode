public class BouclesFor_5 {
    public static void main(String[] args) {
        int[] nums = {43,256,3,796,35,67};

        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println(nums[nums.length - 1] + "]");
    }
}
