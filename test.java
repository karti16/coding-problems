public class test {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2 };
    int[] arr2 = { 3, 4 };

    double res = findMedian(arr1, arr2);
    System.out.println(res); // 2.5
  }

  static double findMedian(int[] arr1, int[] arr2) {
    if (arr2.length < arr1.length)
      return findMedian(arr2, arr1);

    int n1 = arr1.length;
    int n2 = arr2.length;

    int low = 0;
    int high = n1;

    while (low <= high) {
      int cut1 = (low + high) / 2;
      int cut2 = (n1 + n2 + 1) / 2 - cut1;

      int left1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
      int left2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];

      int right1 = cut1 == n1 ? Integer.MAX_VALUE : arr1[cut1];
      int right2 = cut2 == n2 ? Integer.MAX_VALUE : arr2[cut2];

      if (left1 <= right2 && left2 <= right1) {
        if ((n1 + n2) % 2 == 0) {
          return ((Math.min(right1, right2) + Math.max(left1, left2)) / 2.0);
        } else {
          return Math.max(left1, left2);
        }
      } else if (left1 > right2) {
        high = cut1 - 1;
      } else {
        low = cut1 + 1;
      }

    }

    return 0.0;
  }
}