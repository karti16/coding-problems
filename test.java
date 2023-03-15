import java.util.Arrays;
import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String str = sc.next();
    int size = (int) Math.ceil(Math.sqrt(str.length()));
    System.out.println(size);

    System.out.println("Enter the sub-string : ");
    String subStr = sc.next();
    // String str = "WELCOMETOZOHOCORPORATION";
    char arr[][] = new char[size][size];
    int k = 0;
    int strLen = str.length() - 1;
    int subStrLen = subStr.length() - 1;
    int countH = 0, countV = 0;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (k <= strLen) {
          arr[i][j] = str.charAt(k);
          k++;

        }
      }
    }
    for (char[] k1 : arr)
      System.out.println(Arrays.toString(k1));

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (arr[i][j] == subStr.charAt(countH)) {
          // find in column
          for (int l = j; l < size && countH <= subStrLen; l++) {
            if (arr[i][l] == subStr.charAt(countH)) {
              System.out.println(arr[i][l] + "-" + subStr.charAt(countH));
              if (countH == subStrLen) {
                System.out.println("start : [" + i + "," + j + "]");
                System.out.println("end : [" + l + "," + j + "]");
              }
              countH++;
            }

          }

        }
      }
    }
  }

}
