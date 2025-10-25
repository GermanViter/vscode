public class Exo10_4 {
    public static double moyenne(double x, double y, double z) {
        double[] nums = {x, y, z};
        double somme = 0;
        
        for (double n : nums) {
            somme += n;
        }
        double m = somme / nums.length;
        return m;
    }
    public static void main(String[] args) {
        System.out.println(moyenne(12.5, 15.0, 17.5));
    }
}
