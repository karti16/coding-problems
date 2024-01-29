import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    String a = "f";
    String b = "eeg";

    int aCount = countSubsequence(a);
    int bCount = countSubsequence(b);

    System.out.println(aCount >= bCount ? a : b);

  }

  public static int countSubsequence(String s) {
    int mod = (int) 1e9 + 7;
    HashMap<Character, Integer> lo = new HashMap<>();
    int[] dp = new int[s.length() + 1];

    dp[0] = 1;

    for (int i = 1; i <= s.length(); i++) {
      dp[i] = (2 * (dp[i - 1] % mod)) % mod;

      char ch = s.charAt(i - 1);

      if (lo.containsKey(ch)) {
        int j = lo.get(ch);
        dp[i] = dp[i] - dp[j - 1];

      }

      lo.put(ch, i);
    }

    return dp[s.length()] - 1;
  }
}