
public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      // numbers
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }

      // space

      // numbers
      for (int j = i; j >= i; j--) {
        System.out.print(j + " ");
      }

      System.out.println("");
    }
  }
}
