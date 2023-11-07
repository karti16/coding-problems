import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    int[] arr = { 1, 23, 45, 32, 2, 7, 8, 34, 66, 34 };
    int[] res = mergeSort(arr);

    System.out.println(Arrays.toString(res));
  }

  public static int[] mergeSort(int[] arr) {
    if (arr.length == 1) {
      return arr;
    }
    int start = 0;
    int end = arr.length;
    int mid = end / 2;
    int[] l = mergeSort(Arrays.copyOfRange(arr, start, mid));
    int[] r = mergeSort(Arrays.copyOfRange(arr, mid, end));

    return merge(l, r);
  }

  public static int[] merge(int[] left, int[] right) {
    int[] joined = new int[left.length + right.length];
    int i = 0;
    int l = 0;
    int r = 0;
    while (l < left.length && r < right.length) {
      if (left[l] < right[r]) {
        joined[i++] = left[l++];
      } else {
        joined[i++] = right[r++];
      }
    }

    while (l < left.length) {
      joined[i++] = left[l++];
    }
    while (r < right.length) {
      joined[i++] = right[r++];
    }

    return joined;
  }
}