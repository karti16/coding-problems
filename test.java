public class test {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 7, 11 };
    int k = 5;
    int low = 0;
    int high = arr.length - 1;
    int missing = 0;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      missing = arr[mid] - (mid + 1);

      if (missing < k) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    int ans = low + k;
    System.out.println(ans);

  }
}