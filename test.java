import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
    int[] arr = { 10, 22, 12, 3, 0, 6 };
    int max = Integer.MIN_VALUE;
    ArrayList<Integer> leader = new ArrayList<>();

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] >= max) {
        max = arr[i];
        leader.add(arr[i]);
      }
    }
    // Collections.sort(leader, Collections.reverseOrder()); // if needed in
    // reverseSorted
    System.out.println(leader); // [6, 12, 22]
  }
}
