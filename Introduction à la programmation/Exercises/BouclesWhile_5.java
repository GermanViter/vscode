public class BouclesWhile_5 {
    public static void main(String[] args) {
        int[] nums =  {43,256,3,796,35,67};

        int i = 0;
        System.out.print("[");
        while (i < nums.length - 1) {
            System.out.print(nums[i] + ", ");
            i++;
        }
        System.out.println(nums[nums.length - 1] + "]");
    }
}
