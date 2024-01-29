import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    int[] nums = { 1000000000, 1000000000, 1000000000, 1000000000 };
    long target = -294967296;

    System.out.println(target - nums[0] + nums[1]);
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> quad = new ArrayList<>();
    Arrays.sort(nums);
    kSum(4, 0, target, res, quad, nums);
    System.out.println(res);

  }

  public static void kSum(int k, int start, long target, List<List<Integer>> res, List<Integer> quad, int[] nums) {
    if (k != 2) {
      for (int i = start; i < nums.length - k + 1; i++) {
        if (i > start && nums[i] == nums[i - 1]) {
          continue;
        }
        quad.add(nums[i]);
        long temp = (long) target - nums[i];
        kSum(k - 1, i + 1, temp, res, quad, nums);
        quad.remove(quad.size() - 1);
      }
      return;
    }

    System.out.println("lll : " + target);
    int left = start;
    int right = nums.length - 1;

    while (left < right) {
      int sum = nums[left] + nums[right];
      System.out.println(sum);
      System.out.println(target);
      if (sum > target) {
        right--;
      } else if (sum < target) {
        left++;
      } else {
        quad.add(nums[left]);
        quad.add(nums[right]);
        res.add(new ArrayList<>(quad));
        quad.remove(quad.size() - 1);
        quad.remove(quad.size() - 1);

        left++;

        while (left < right && nums[left] == nums[left - 1]) {
          left++;
        }
      }
    }
  }
}