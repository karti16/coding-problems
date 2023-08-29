
public class test {

  public static void main(String[] args) {
    String s = "   -42";

    int i = 0;

    while (i < s.length() && s.charAt(i) == ' ') {
      i++;
    }

    s = s.substring(i);
    i = 0;

    int sign = 1;

    if (s.charAt(0) == '-' || s.charAt(0) == '+') {
      sign = s.charAt(0) == '-' ? -1 : 1;
      i++;
    }
    s = s.substring(i);

    int num = 0;
    for (i = 0; i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'; i++) {
      num = (num * 10) + s.charAt(i) - '0';
    }

    System.out.println(num * sign);
  }
}
