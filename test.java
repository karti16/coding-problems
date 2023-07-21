public class test {
  public static void main(String[] args) {
    int[] arr1 = { 2, 3, 45 };
    int[] arr2 = { 4, 6, 7, 8 };
    int k = 4;

    int res = kThElement(arr1, arr2, k);
    System.out.println(res);
  }

  static int kThElement(int[] arr1, int[] arr2, int k) {
    int n1 = arr1.length;
    int n2 = arr2.length;
    if (n2 < n1)
      return kThElement(arr2, arr1, k);

    int low = Math.max(0, k - n2);
    int high = Math.min(k, n1);

    while (low <= high) {
      int cut1 = (low + high) / 2;
      int cut2 = k - cut1;

      int left1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
      int left2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];

      int right1 = cut1 == n1 ? Integer.MAX_VALUE : arr1[cut1];
      int right2 = cut2 == n2 ? Integer.MAX_VALUE : arr2[cut2];
      if (left1 <= right2 && left2 <= right1) {
        return Math.max(left1, left2);
      } else if (left1 > right2) {
        high = cut1 - 1;
      } else {
        low = cut1 + 1;
      }
    }

    return -1;
  }
}