import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    int[] arr = { 4, 3, 70, 15, 118 };

    int maxDigit = 0;

    for (int i = 0; i < arr.length; i++) {
      String s = Integer.toString(arr[i]);
      maxDigit = s.length() > maxDigit ? s.length() : maxDigit;
    }

    for (int i = 0; i < arr.length; i++) {
      StringBuilder sb = new StringBuilder(Integer.toString(arr[i]));
      sb.reverse();
      if (sb.length() < maxDigit) {
        while (sb.length() < maxDigit) {
          sb.append("0");
        }

        arr[i] = Integer.parseInt(sb.toString());
      } else {
        arr[i] = Integer.parseInt(sb.substring(0, maxDigit));

      }
    }

    System.out.println(Arrays.toString(arr));
  }
}