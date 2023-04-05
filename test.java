public class test {
  public static void main(String[] args) {
    String str = "rhar";
    boolean res = checkPalindrome(str, 0);
    System.out.println(res);
  }

  static boolean checkPalindrome(String str, int i) {
    if (str.length() == 0 || str.length() == 1)
      return true;
    if (i >= 0 && str.charAt(i) != str.charAt(str.length() - i - 1)) {
      return false;
    }
    if (i < (str.length() / 2)) {
      return checkPalindrome(str, i + 1);
    }

    return true;
  }

}
