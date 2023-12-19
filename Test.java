public class Test {

  public static void main(String[] args) {
    int x = 2;
    int n = 3;

    int res = helper(x, Math.abs(n));

    System.out.println(n >= 0 ? res : 1 / res);
  }

  public static int helper(int x, int n) {
    if (x == 0) return 0;
    if (n == 0) return 1;

    int res = helper(x, n / 2);
    res = res * res;
    return n % 2 == 0 ? res : res * x;
  }
}
