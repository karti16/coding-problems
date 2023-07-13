public class test {
  public static void main(String[] args) {
    int n = 27;
    int m = 3;

    System.out.println(nThRoot(n, m));

  }

  static int nThRoot(int n, int m) {
    int low = 1;
    int high = n;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      int val = (int) Math.pow(mid, m);
      if (val == n) {
        return (mid);
      } else if (val < n) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return (-1);
  }
}