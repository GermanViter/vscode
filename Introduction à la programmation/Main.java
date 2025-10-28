import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[rand.nextInt(0, 10000)];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(101);
        }

        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[nums.length - 1] + "]\n");
        System.out.println(nums.length);
    }
}
