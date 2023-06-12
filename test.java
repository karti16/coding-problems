import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    int l = 0;
    int r = matrix.length - 1;

    while (l < r) {
      for (int i = 0; i < r - l; i++) {
        int top = l;
        int bottom = r;
        int topRight = matrix[top][r - i];

        // move bottom right into top right
        matrix[top][r - i] = matrix[bottom - i][r];

        // move bottom left into bottom right
        matrix[bottom - i][r] = matrix[bottom][l + i];

        // move top left into bottom left
        matrix[bottom][l + i] = matrix[top + i][l];

        // move top right into top left
        matrix[top + i][l] = topRight;

      }
      l++;
      r--;
    }
    for (int[] a : matrix) {
      System.out.println(Arrays.toString(a));
    }
    // [3, 6, 9]
    // [2, 5, 8]
    // [1, 4, 7]
  }
}
