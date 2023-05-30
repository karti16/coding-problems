public class test {
  public static void main(String[] args) {
    int[] arr = { 100, 180, 260, 310, 40, 535, 695 };

    int mini = arr[0];
    int profit = 0;

    for (int i = 1; i < arr.length; i++) {
      int cost = arr[i] - mini;
      profit = Math.max(cost, profit);
      mini = Math.min(arr[i], mini);
    }

    System.out.println(profit);
  }
}