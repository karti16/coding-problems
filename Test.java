public class Test {
  public static void main(String[] args) {
    int x = 2;
    int p = -5;
    int n = Math.abs(p);
    double ans = 1;
    while (n > 0) {
      if (n % 2 == 1) {
        ans *= x;
        n = n - 1;
      } else {
        x *= x;
        n /= 2;
      }
    }

    if (p < 0) {
      ans = 1 / ans;
    }
    System.out.println(ans);
  }
}
