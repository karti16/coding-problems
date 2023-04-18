import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 4, 3, 5, 7, 2, 9 };
    int n = arr.length;
    mergeSort(arr, 0, n - 1);
    for (int i : arr) {
      System.out.print(i + " ");
    }

  }

  static void mergeSort(int[] arr, int start, int end) {
    if (start >= end)
      return;
    int mid = start + (end - start) / 2;
    mergeSort(arr, start, mid);
    mergeSort(arr, mid + 1, end);
    merge(arr, start, mid, end);
  }

  static void merge(int[] arr, int start, int mid, int end) {

    ArrayList<Integer> temp = new ArrayList<>();

    int left = start;
    int right = mid + 1;

    while (left <= mid && right <= end) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }

    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    while (right <= end) {
      temp.add(arr[right]);
      right++;
    }

    for (int i = start; i < end; i++) {
      arr[i] = temp.get(i - start);
    }

  }
}