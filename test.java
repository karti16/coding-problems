import java.util.HashMap;

public class test {
  public static void main(String[] args) {
    int[] nums = { 15, -2, 2, -8, 1, 7, 10, 23 };
    int k = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    int sum = 0;
    int maxLen = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (sum == k) {
        maxLen = i + 1;
      } else {
        if (map.get(sum) != null) {
          maxLen = Math.max(maxLen, i - map.get(sum));
        } else {
          map.put(sum, i);
        }
      }
    }

    System.out.println(maxLen);
  }

}
