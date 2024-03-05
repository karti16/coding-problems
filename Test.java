public class Test {

  public static void main(String[] args) {
    String s = "aabccabba";

    int l = 0;
    int r = s.length() - 1;

    while (l < r && s.charAt(l) == s.charAt(r)) {
      char tmp = s.charAt(l);

      while (l <= r && s.charAt(l) == tmp) l += 1;
      while (l <= r && s.charAt(r) == tmp) r -= 1;
    }

    System.out.println(r - l + 1);
  }
}
