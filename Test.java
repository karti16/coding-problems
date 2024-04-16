public class Test {

  public static void main(String[] args) {
    int size = 6;
    int interval = 1;

    while (interval < size) {
      for (int i = 0; i < size - interval; i += 2 * interval) {
        System.out.println(i + ", " + (i + interval) + " - i : " + interval);
      }

      interval *= 2;
    }
  }
}
