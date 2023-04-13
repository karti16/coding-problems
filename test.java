import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 12, 5, 34, 67, 9, 55 };
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      int j = i;
      while (j > 0 && arr[j] < arr[j - 1]) {

        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;

      }
    }

    System.out.println(Arrays.toString(arr));

  }
}
