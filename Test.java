import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };

    int[] res = new int[nums.length];
    Arrays.fill(res, 1);

    int p = 1;

    for (int i = 0; i < nums.length; i++) {
      res[i] *= p;
      p *= nums[i];
    }

    p = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      res[i] *= p;
      p *= nums[i];
    }
    System.out.println(Arrays.toString(res));
  }
}
