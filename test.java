import java.util.Arrays;

public class test {
  public static void main(String[] args) {

    int[][] matrix = {
        { 6, 5, 1, 8, 7, 3, 2, 9, 4 },
        { 7, 4, 3, 2, 5, 9, 1, 6, 8 },
        { 9, 8, 2, 1, 6, 4, 3, 5, 7 },
        { 1, 2, 5, 4, 3, 6, 8, 7, 9 },
        { 4, 3, 9, 5, 8, 7, 6, 1, 2 },
        { 8, 6, 7, 9, 1, 2, 5, 4, 3 },
        { 5, 7, 8, 3, 9, 1, 4, 2, 6 },
        { 2, 1, 6, 7, 4, 8, 9, 3, 5 },
        { 3, 9, 4, 6, 2, 5, 7, 8, 1 }
    };

    int size = 9;

    for (int i = 0; i < matrix.length; i++) {
      if (!checkCol(matrix[i])) {
        System.out.println("incorrect");
      }
    }

  }

  static boolean checkCol(int arr[]) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum == 45;
  }

}
