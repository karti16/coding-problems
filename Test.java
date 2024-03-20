import java.util.HashSet;

public class Test {

  public static void main(String[] args) {
    String s = "abcabcbb";
    int l = 0;

    int maxLength = 0;
    HashSet<Character> charSet = new HashSet<>();

    for (int r = 0; r < s.length(); r++) {
      while (charSet.contains(s.charAt(r))) {
        charSet.remove(s.charAt(l));
        l++;
      }

      charSet.add(s.charAt(r));
      maxLength = Math.max(maxLength, r - l + 1);
    }

    System.out.println(maxLength);
  }
}
