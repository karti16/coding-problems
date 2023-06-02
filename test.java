import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int target = 10;
    int n = arr.length;
    ArrayList<Integer> ds = new ArrayList<>();
    printPermutation(0, ds, arr, n, target, 0);
  }

  static void printPermutation(int i, ArrayList<Integer> ds, int[] arr, int n, int target, int sum) {

    if (i == n) { // if i = n print list
      if (sum == target) { // check if sum = target
        System.out.println(ds);
      }
      return;
    }

    ds.add(arr[i]); // push arr[i] to list
    sum += arr[i]; // add num to sum
    printPermutation(i + 1, ds, arr, n, target, sum); // call recursion // take

    int last = ds.size() - 1;
    ds.remove(last); // remove that arr[i]
    sum -= arr[i]; // sun num from sum
    printPermutation(i + 1, ds, arr, n, target, sum); // call recursion // not take
  }
}

// [1, 2, 3, 4]
// [1, 2, 7]
// [1, 3, 6]
// [1, 4, 5]
// [1, 9]
// [2, 3, 5]
// [2, 8]
// [3, 7]
// [4, 6]
// [10]
