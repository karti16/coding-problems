public class test {
  public static void main(String[] args) {
    int[] nums = { 1, 3, 4, 5, 7, 10, 11 };
    int target = 9;

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int sum = nums[left] + nums[right];
      if (sum > target) {
        right--;
      } else if (sum < target) {
        left++;
      } else {
        break;
      }
    }

    System.out.println(left + ", " + right);
  }
}
