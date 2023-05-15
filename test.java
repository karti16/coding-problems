import java.util.ArrayList;
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };
    int max_flips = 1;
    int ans = 0;
    int flips = 0;
    int j = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        flips++;
      }

      if (flips > max_flips) {
        if (arr[j] == 0) {
          flips--;
          j++;
        }
      }

      ans = Math.max(ans, i - j + 1);
    }

    System.out.println(ans);

  }
}