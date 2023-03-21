
public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      // space
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print("  ");
      }

      // char
      char ch = 'A';
      int breakPoint = (2 * i + 1) / 2;
      for (int j = 1; j <= 2 * i + 1; j++) {
        System.out.print(ch + " ");
        if (j <= breakPoint)
          ch = (char) (ch + 1);
        else
          ch = (char) (ch - 1);
      }

      // space
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print("  ");
      }
      System.out.println("");
    }
  }
}
