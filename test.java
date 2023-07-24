public class test {

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 4, 7, 11, 15 },
        { 2, 5, 8, 12, 19 },
        { 3, 6, 9, 16, 22 },
        { 10, 13, 14, 17, 24 },
        { 18, 21, 23, 26, 30 }
    };

    int target = 16;
    int n = matrix.length;
    int m = matrix[0].length;
    int row = n - 1;
    int col = 0;

    while (row >= 0 && col < m) {
      if (matrix[row][col] == target) {
        System.out.println(row + "," + col);
        break;

      } else if (matrix[row][col] < target) {
        col++;
      } else {
        row--;
      }
    }

  }
}
