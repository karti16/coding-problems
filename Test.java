public class Test {

  public static void main(String[] args) {
    int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    int res = 0;
    int l = 0;
    int r = height.length - 1;
    int leftMax = height[l];
    int rightMax = height[r];

    while (l < r) {
      if (leftMax < rightMax) {
        l++;
        leftMax = Math.max(leftMax, height[l]);
        res += leftMax - height[l];
      } else {
        r--;
        rightMax = Math.max(rightMax, height[r]);
        res += rightMax - height[r];
      }
    }

    System.out.println(res);
  }
}
