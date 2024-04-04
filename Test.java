public class Test {

  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 0;

    int l = 0;
    int r = nums.length - 1;

    while (l <= r) {
      int m = l + (r - l) / 2;
      if (target == nums[m]) {
        System.out.println(m);
        break;
      }
      // left side
      if (nums[l] <= nums[m]) {
        if (target >= nums[l] && target <= nums[m]) {
          r = m - 1;
        } else {
          l = m + 1;
        }
      } else {
        // right side
        if (target >= nums[m] && target <= nums[r]) {
          l = m + 1;
        } else {
          r = m - 1;
        }
      }
    }
  }
}
