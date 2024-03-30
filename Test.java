import java.util.Arrays;
import java.util.Stack;

public class Test {

  public static void main(String[] args) {
    int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
    Stack<Integer> stack = new Stack<>();
    int[] res = new int[temperatures.length];

    for (int i = 0; i < temperatures.length; i++) {
      while (!stack.empty() && temperatures[i] > temperatures[stack.peek()]) {
        int idx = stack.pop();
        res[idx] = i - idx;
      }

      stack.push(i);
    }

    System.out.println(Arrays.toString(res));
  }
}
