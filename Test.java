public class Test {

  public static void main(String[] args) {
    int[] arr1 = { 2 };
    int[] arr2 = { 1, 3 };

    System.out.println(findMedianSortedArrays(arr1, arr2));
  }

  // 1,2,3,4,5,6,7,8,9,10
  // 1,2,3,4,5
  // total 15
  // half 7
  public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
    int total = arr1.length + arr2.length;
    int half = total / 2;

    int l = 0;
    int r = arr1.length - 1;
    System.out.println(l + ", " + r);

    while (l <= r) {
      int i = l + (r - l) / 2;
      int j = half - i;

      System.out.println(i + ", " + j);
      int arr1Left = i > 0 ? arr1[i - 1] : Integer.MIN_VALUE;
      int arr1Right = i < arr1.length ? arr1[i] : Integer.MAX_VALUE;

      int arr2Left = j > 0 ? arr2[j - 1] : Integer.MIN_VALUE;
      int arr2Right = j < arr2.length ? arr2[j] : Integer.MAX_VALUE;

      if (arr1Left <= arr2Right && arr2Left <= arr1Right) {
        if (total % 2 == 1) {
          return Math.min(arr1Right, arr2Right);
        } else {
          return (
            (Math.max(arr1Left, arr2Left) + Math.min(arr1Right, arr2Right)) /
            2.0
          );
        }
      } else if (arr1Left > arr2Right) {
        r = i - 1;
      } else {
        l = i + 1;
      }
    }

    return 0.0;
  }
}
