import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    int[] arr = { 2, 2, 1 };
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();

    Arrays.sort(arr);
    backTrack(0, arr, res, subset);

    System.out.println(res.toString());
  }

  public static void backTrack(
      int i,
      int[] arr,
      List<List<Integer>> res,
      List<Integer> subset) {

    if (i >= arr.length) {
      res.add(new ArrayList<>(subset));
      return;
    }

    subset.add(arr[i]);
    backTrack(i + 1, arr, res, subset);
    subset.remove(subset.size() - 1);

    while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
      i += 1;
    }
    backTrack(i + 1, arr, res, subset);
  }
}