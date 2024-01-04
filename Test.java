import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
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
    backTrack(i + 1, arr, res, subset);
  }
}
