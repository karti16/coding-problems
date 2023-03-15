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

    if (checkCol(matrix, size) && checkRow(matrix, size) && check3x3(matrix, size)) {
      System.out.println("correct");
    } else {
      System.out.println("incorrect");
    }

  }

  static boolean checkCol(int[][] arr, int size) {
    for (int i = 0; i < size; i++) {
      if (!calculateSum(arr[i])) {
        return false;
      }
    }
    return true;
  }

  static boolean checkRow(int[][] arr, int size) {
    for (int i = 0; i < size; i++) {
      int temp[] = new int[9];
      for (int j = 0; j < size; j++) {
        temp[j] = arr[j][i];
      }
      if (!calculateSum(temp)) {
        return false;
      }
    }
    return true;
  }

  static boolean check3x3(int[][] arr, int size) {
    for (int boxR = 0; boxR < size; boxR += 3) {
      for (int boxC = 0; boxC < size; boxC += 3) {
        int count = 0;
        int temp[] = new int[9];
        for (int i = boxR; i < boxR + 3; i++) {
          for (int j = boxC; j < boxC + 3; j++) {
            temp[count] = arr[i][j];
            count++;
          }
        }
        if (!calculateSum(temp)) {
          return false;
        }
      }
    }

    return true;
  }

  static boolean calculateSum(int arr[]) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum == 45;
  }

}
