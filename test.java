import java.util.HashMap;

public class test {

  public static void main(String[] args) {
    int[] r1 = { 1, 5, 10, 50, 100, 500, 1000 };
    char[] r2 = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };

    HashMap<Character, Integer> roman = new HashMap<>();

    for (int i = 0; i < r1.length; i++) {
      roman.put(r2[i], r1[i]);
    }

    String str = "MCMXCIV";
    int num = 0;

    int len = str.length();

    for (int i = 0; i < len; i++) {

      if (i + 1 < len && roman.get(str.charAt(i)) < roman.get(str.charAt(i + 1))) {
        num -= roman.get(str.charAt(i));
      } else {
        num += roman.get(str.charAt(i));

      }

    }

    System.out.println(num);
  }
}
