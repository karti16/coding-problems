public class Test {

  public static void main(String[] args) {
    String s = "AABABBA";
    int[] freq = new int[26];
    int mostFreqLetter = 0;
    int k = 1;
    int l = 0;
    int max = 0;

    for (int r = 0; r < s.length(); r++) {
      freq[s.charAt(r) - 'A']++;
      mostFreqLetter = Math.max(mostFreqLetter, freq[s.charAt(r) - 'A']);

      int lettersToChange = (r - l + 1) - mostFreqLetter;
      if (lettersToChange > k) {
        freq[s.charAt(l) - 'A']--;
        l += 1;
      }

      max = Math.max(max, r - l + 1);
    }

    System.out.println(max);
  }
}
