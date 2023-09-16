public class test {

  public static void main(String[] args) {
    String s = "aabcb";
    int sum = 0;
    int len = s.length();

    for (int i = 0; i < len; i++) {
      int[] charCount = new int[26];

      for (int j = i; j < len; j++) {
        char c = s.charAt(j);
        charCount[c - 'a']++;
        sum += beautySum(charCount);
      }

    }

    System.out.println(sum); // 5

  }

  public static int beautySum(int[] arr) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int n : arr) {
      if (n != 0) {
        min = Math.min(min, n);
        max = Math.max(max, n);
      }
    }

    return max - min;
  }
}
