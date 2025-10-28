public class Exo9_9 {
  public static void main(String[] args) {
    int a = 3;
    int b = 10;
    int i = 0;

    while (i <= b) {
      if (i % 2 == 0 && i >= a) {
        System.out.println("nombre pair : " + i);
      }
      i++;
    }
  }
}
