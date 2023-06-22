import java.util.ArrayList;
import java.util.List;

public class test {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    int k = 4;
    int counter = 0;
    int num = -1;

    List<Integer> res = new ArrayList<>();

    int top = 0;
    int left = 0;
    int right = matrix[0].length - 1;
    int bottom = matrix.length - 1;

    while (left <= right && top <= bottom) {
      // top row
      for (int i = left; i <= right; i++) {
        res.add(matrix[top][i]);
        counter++;
        if (counter == k) {
          num = matrix[top][i];
        }
      }
      top++;

      // right col
      for (int i = top; i <= bottom; i++) {
        res.add(matrix[i][right]);
        counter++;
        if (counter == k) {
          num = matrix[i][right];
        }
      }
      right--;

      if (!(left <= right && top <= bottom)) {
        break;
      }

      // bottom row
      for (int i = right; i >= left; i--) {
        res.add(matrix[bottom][i]);
        counter++;
        if (counter == k) {
          num = matrix[bottom][i];
        }
      }
      bottom--;

      // left col
      for (int i = bottom; i >= top; i--) {
        res.add(matrix[i][left]);
        counter++;
        if (counter == k) {
          num = matrix[i][left];
        }
      }
      left++;

    }
    System.out.println(num); // 6
    System.out.println(res); // [1, 2, 3, 6, 9, 8, 7, 4, 5]
  }
}
