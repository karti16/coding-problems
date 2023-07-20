public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 13, 17, 23 };
    int n = arr.length;
    int k = 5;
    int[] howMany = new int[n - 1];

    for (int gasStation = 1; gasStation <= k; gasStation++) {
      double maxSection = -1;
      int maxInd = -1;

      for (int i = 0; i < n - 1; i++) {
        double diff = arr[i + 1] - arr[i];
        double sectionLength = diff / ((double) howMany[i] + 1);
        if (sectionLength > maxSection) {
          maxSection = sectionLength;
          maxInd = i;
        }
      }
      howMany[maxInd]++;
    }
    double maxAns = -1;

    for (int i = 0; i < n - 1; i++) {
      double diff = arr[i + 1] - arr[i];
      double sectionLength = diff / ((double) howMany[i] + 1);
      maxAns = Math.max(maxAns, sectionLength);
    }

    System.out.println(maxAns);
  }
}