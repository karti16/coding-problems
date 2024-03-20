public class Test {

  public static void main(String[] args) {
    int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    int max = Integer.MIN_VALUE;

    int l = 0;
    int r = height.length - 1;

    while (l < r) {
      int w = Math.min(height[l], height[r]) * (r - l);
      max = Math.max(max, w);

      if (height[l] < height[r]) {
        l++;
      } else {
        r--;
      }
    }

    System.out.println(max);
  }
}
