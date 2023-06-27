import java.util.ArrayList;
import java.util.List;

public class test {
  public static void main(String[] args) {
    int[] nums = { 2, 2, 1, 3 };
    int n1 = Integer.MIN_VALUE;
    int n2 = Integer.MIN_VALUE;
    int c1 = 0;
    int c2 = 0;

    for (int num : nums) {
      if (c1 == 0 && n2 != num) {
        c1 = 1;
        n1 = num;
      } else if (c2 == 0 && n1 != num) {
        c2 = 1;
        n2 = num;
      } else if (n2 == num) {
        c2++;
      } else if (n1 == num) {
        c1++;
      } else {
        c1--;
        c2--;
      }
    }

    List<Integer> res = new ArrayList<>();
    c1 = 0;
    c2 = 0;
    for (int num : nums) {
      if (num == n1)
        c1++;
      if (num == n2)
        c2++;
    }

    int minCount = (int) nums.length / 3 + 1;
    if (c1 >= minCount)
      res.add(n1);
    if (c2 >= minCount)
      res.add(n2);

    System.out.println(res);

  }

}
