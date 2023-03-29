import java.util.ArrayList;
import java.util.Collections;

public class test {
  public static void main(String[] args) {
    int num = 36;
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 1; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        list.add(i);
        if (i != num / i) {
          list.add(num / i);
        }
      }
    }
    Collections.sort(list);
    System.out.println(list);

  }
}
