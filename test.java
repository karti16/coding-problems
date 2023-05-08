import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 9, 0, 7, 1, 2 };
    int max = arr[0];
    int max_2 = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max_2 = max;
        max = arr[i];
      } else if (arr[i] < max && arr[i] != max_2) {
        max_2 = arr[i];
      }
    }

    System.out.println(max + ", " + max_2);

  }

}