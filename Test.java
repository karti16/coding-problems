public class Test {

  public static void main(String[] args) {
    String s1 = "adc";
    String s2 = "dcda";

    if (s1.length() > s2.length()) {
      System.out.println(false);
    }

    int[] s1Count = new int[26];
    int[] s2Count = new int[26];

    int matches = 0;

    for (int i = 0; i < s1.length(); i++) {
      s1Count[s1.charAt(i) - 'a'] += 1;
      s2Count[s2.charAt(i) - 'a'] += 1;
    }

    for (int i = 0; i < 26; i++) {
      matches += (s1Count[i] == s2Count[i] ? 1 : 0);
    }

    int l = 0;

    for (int r = s1.length(); r < s2.length(); r++) {
      if (matches == 26) {
        break;
      }

      int index = s2.charAt(r) - 'a';
      s2Count[index] += 1;

      if (s1Count[index] == s2Count[index]) {
        matches += 1;
      } else if (s1Count[index] + 1 == s2Count[index]) {
        matches -= 1;
      }

      index = s2.charAt(l) - 'a';
      s2Count[index] -= 1;

      if (s1Count[index] == s2Count[index]) {
        matches += 1;
      } else if (s1Count[index] - 1 == s2Count[index]) {
        matches -= 1;
      }
      l += 1;
    }

    System.out.println(matches == 26);
  }
}
