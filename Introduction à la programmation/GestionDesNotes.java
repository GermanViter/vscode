import java.util.Scanner;

public class GestionDesNotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combiens d'étudiants ? ");
        int nbrDEleves = scan.nextInt();
        int somme = 0;

        int[] eleves = new int[nbrDEleves];
        System.out.println("Entrez les notes de vos élèves : ");
        for (int i = 0; i < eleves.length; i++) {
            eleves[i] = Integer.valueOf(scan.next());
            somme += eleves[i];
        }
        double moyenne = somme / (double) eleves.length;
        quickSort(eleves, 0, eleves.length - 1);
        System.out.print("Notes triés : ");
        afficherNotes(eleves);
        System.out.printf("Moyenne : %.1f\n", moyenne);
        System.out.printf("Note la plus basse : %d\n", eleves[0]);
        System.out.printf("Note la plus haute : %d\n", eleves[eleves.length - 1]);

    }

    public static void afficherNotes(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[nums.length - 1] + "]\n");
    }

    public static int[] quickSort(int[] nums, int debut, int fin) {
        if (debut < fin) {
            int indexPivot = partitions(nums, debut, fin);

            quickSort(nums, debut, indexPivot - 1);
            quickSort(nums, indexPivot + 1, fin);
        }
        return nums;
    }

    public static int partitions(int[] nums, int debut, int fin) {
        int pivot = nums[fin];
        int i = debut - 1;

        for (int j = debut; j < fin; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i + 1, fin);

        return i + 1;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}