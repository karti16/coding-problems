public class test {
  public static void main(String[] args) {
    int[] bloomDay = { 1, 10, 3, 10, 2 };
    int m = 3;
    int k = 1;
    long val = (long) m * (long) k;

    if (val > bloomDay.length) {
      System.out.println("Not possible");
    }

    int[] temp = findMaxMin(bloomDay);
    int low = temp[0];
    int high = temp[1];

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (possible(bloomDay, mid, m, k)) {
        high = mid - 1;

      } else {
        low = mid + 1;
      }
    }

    System.out.println(low);

  }

  static boolean possible(int[] arr, int day, int m, int k) {
    int count = 0;
    int noOfBoq = 0;

    for (int a : arr) {
      if (a <= day) {
        count++;
      } else {
        noOfBoq += count / k;
        count = 0;
      }
    }
    noOfBoq += count / k;
    return noOfBoq >= m;

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