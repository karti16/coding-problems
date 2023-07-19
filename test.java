import java.util.Arrays;

public class test {
  public static void main(String[] args) {

    int[] arr = { 1, 2, 3 };
    Arrays.sort(arr);
    int cows = 2;

    int low = 1;
    int high = arr[arr.length - 1] - arr[0];

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (isPossible(arr, mid, cows)) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    System.out.println(high);
  }

  static boolean isPossible(int[] arr, int distance, int cows) {
    int cowCount = 1;
    int last = arr[0];

    for (int a : arr) {
      if (a - last >= distance) {
        cowCount++;
        last = a;
      }
      if (cowCount == cows) {
        return true;
      }
    }
    return false;
  }
}