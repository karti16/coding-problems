public class Test {

  public static void main(String[] args) {
    int n = 3;
    for (int i = -n; i <= n; i++) {

      int l = i;
      if (i < 0) {
        l = i * -1;
      }

      for (int s = 0; s < n - l; s++) {
        System.out.print(" ");
      }

      for (int j = 0; j < l + 1; j++) {

        if (j == 0 || j == l || i == -n || i == n) {
          System.out.print("* ");

        } else {
          System.out.print("  ");

        }

      }
      System.out.println();
    }
  }
}
