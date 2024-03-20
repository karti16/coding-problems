public class Test {

  public static void main(String[] args) {
    String str = "A man, a plan, a canal: Panama";
    int l = 0;
    int r = str.length() - 1;
    boolean isPalindrome = true;

    while (l < r) {
      while (l < r && !isAlphaNumeric(str.charAt(l))) {
        l += 1;
      }
      while (r > l && !isAlphaNumeric(str.charAt(r))) {
        r -= 1;
      }
      char a = Character.toLowerCase(str.charAt(l));
      char b = Character.toLowerCase(str.charAt(r));

      if (a != b) {
        isPalindrome = false;
        break;
      }
      l += 1;
      r -= 1;
    }

    System.out.println(isPalindrome ? "Palindrome" : "Not a palindrome");
  }

  public static boolean isAlphaNumeric(char c) {
    return (
      ((int) c >= (int) 'A' && (int) c <= (int) 'Z') ||
      ((int) c >= (int) 'a' && (int) c <= (int) 'z') ||
      ((int) c >= (int) '0' && (int) c <= (int) '9')
    );
  }
}
