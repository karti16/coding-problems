
public class Test {

  public static void main(String[] args) {
    int num = 5;

    int low = 1;
    int high = num;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      int val = mid * mid;

      if (val <= num) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    System.out.println(high);

  }

}
