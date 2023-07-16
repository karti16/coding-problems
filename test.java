public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 5, 9 };
    int threshold = 6;
    int low = 1;
    int high = findMaxMin(arr)[1];

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (checkPossible(arr, mid, threshold)) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    System.out.println(low);
  }

  static boolean checkPossible(int[] arr, int mid, int threshold) {
    int sum = 0;
    for (int a : arr) {
      sum += Math.ceil((double) a / (double) mid);
    }
    return sum <= threshold;
  }

  static int[] findMaxMin(int[] arr) {
    int[] ans = { Integer.MAX_VALUE, Integer.MIN_VALUE };
    for (int a : arr) {
      ans[0] = Math.min(a, ans[0]);
      ans[1] = Math.max(a, ans[1]);
    }
    return ans;
  }
}