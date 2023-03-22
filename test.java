
public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      // Upside
      // stars
      for (int j = 0; j <= n - i - 1; j++) {
        System.out.print("* ");
      }

      // space
      for (int j = 0; j <= 2 * i - 1; j++) {
        System.out.print("  ");
      }

      // stars
      for (int j = 0; j <= n - i - 1; j++) {
        System.out.print("* ");
      }
      System.out.println("");

    }
    // Upside Down
    // stars
    int space2 = 8;
    for (int i = 0; i < n; i++) {

      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }

      // space
      for (int j = 0; j < space2; j++) {
        System.out.print("  ");
      }

      // stars
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      space2 -= 2;
      System.out.println("");
    }

  }
}
