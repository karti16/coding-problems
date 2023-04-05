import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
    int n = 10;
    ArrayList<Integer> list = new ArrayList<>();
    fibonacci(list, 1, 1, n);
    System.out.println(list);
  }

  static void fibonacci(ArrayList<Integer> list, int first, int second, int n) {
    if (n == 0) {
      return;
    } else {
      list.add(first);
      fibonacci(list, second, (first + second), n - 1);

    }
  }
}
