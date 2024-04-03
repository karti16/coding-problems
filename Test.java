import java.util.Arrays;
import java.util.Stack;

public class Test {

  public static void main(String[] args) {
    int[] pos = { 10, 8, 0, 5, 3 };
    int[] speed = { 2, 4, 1, 1, 3 };
    int target = 12;

    int[][] posSpeed = new int[pos.length][2];

    for (int i = 0; i < pos.length; i++) {
      posSpeed[i][0] = pos[i];
      posSpeed[i][1] = speed[i];
    }

    Arrays.sort(posSpeed, (a, b) -> Integer.compare(b[0], a[0]));
    Stack<Double> stack = new Stack<>();

    for (int i = 0; i < pos.length; i++) {
      int p = posSpeed[i][0];
      int s = posSpeed[i][1];
      double currentTime = (double) (target - p) / s;

      if (!stack.isEmpty() && currentTime <= stack.peek()) {
        continue;
      } else {
        stack.push(currentTime);
      }
    }
    System.out.println(stack.size());
  }
}
