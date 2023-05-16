import java.util.ArrayList;
import java.util.HashMap;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 1, 0, 1, 1 };
    int k = 3;
    int sum = arr[0];
    int maxLen = 0;
    int left = 0, right = 0;

    while (right < arr.length) {
      while (left <= right && sum > k) {
        sum -= arr[left++];
      }

      if (sum == k) {
        maxLen = Math.max(maxLen, right - left + 1);
      }
      
      right++;
      if (right < arr.length) {
        sum += arr[right];
      }

    }

    System.out.println(maxLen);
  }
}