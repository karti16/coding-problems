import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 12, 5, 34, 67, 9, 55 };
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }

      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }

    System.out.println(Arrays.toString(arr));

  }
}
