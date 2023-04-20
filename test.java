import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 6, 9, 12, 7, 5 };
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));

  }

  static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pIndex = partition(arr, low, high);
      quickSort(arr, low, pIndex - 1);
      quickSort(arr, pIndex + 1, high);
    }
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j) {
      while (arr[i] <= pivot && i <= high - 1) {
        i++;
      }

      while (arr[j] > pivot && j >= low + 1) {
        j--;
      }

      if (i < j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }

    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    return j;
  }

}