import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    int n = 5;
    int[] dp = new int[n + 1];
    Arrays.fill(dp, -1);
    int result = solve(n, dp);
    System.out.println(result); // 8
  }

  public static int solve(int n, int[] dp) {
    if (n < 0) return 0;
    if (n == 0) return 1;

    if (dp[n] != -1) return dp[n];

    dp[n] = solve(n - 1, dp) + solve(n - 2, dp);

    return dp[n];
  }
}
