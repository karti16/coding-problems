public class test {
  public static void main(String[] args) {
    int[] nums = { 3, 4, 5, 5, 5, 6, 7 };
    int target = 5;

    boolean result = search(nums, target);
    System.out.println(result);
  }

  static boolean search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int mid;
    while (left <= right) {
      mid = left + (right - left) / 2;
      if (nums[mid] == target)
        return true;

      if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
        left += 1;
        right -= 1;
        continue;
      }
      // condition for left side is sort
      if (nums[left] <= nums[mid]) {
        if (target >= nums[left] && target <= nums[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (target >= nums[mid] && target <= nums[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return false;
  }
}