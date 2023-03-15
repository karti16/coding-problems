## 1. Print words in X shape

```
g           s
 e         k
  e       e
   k     e
    s   g
     f r
      o
     f r
    s   g
   k     e
  e       e
 e         k
g           s
```

```java
public class java{
    public static void main(String[] args){
        String str = "geeksforgeeks";
        int len = str.length();
        for (int i = 0; i < len; i++){
            int j = len - 1 - i;
            for(int k = 0; k < len; k++){
                if(k == i || k == j){
                    System.out.print(str.charAt(k));
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println("");
        }
    }
}
```

---

## 2. Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions

    1. 5 if a perfect square
    2. 4 if multiple of 4 and divisible by 6
    3. 3 if even number

     And sort the numbers based on the weight and print it as follows

     <10,its_weight>,<36,its weight><89,its weight>

     Should display the numbers based on increasing order.

```java
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class test {
  public static void main(String[] args) {

    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Enter size of array");
    // int size = scanner.nextInt();
    // int arr[] = new int[size];
    // System.out.println("Enter element");
    // for (int i = 0; i < size; i++) {
    // arr[i] = scanner.nextInt();
    // }
    // System.out.println(Arrays.toString(arr));

    int arr[] = new int[] { 10, 36, 54, 89, 12 };
    int sumArr[] = new int[arr.length];
    int temp = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      int sum = 0;

      double sqrt = (int) Math.sqrt(arr[i]);
      if ((sqrt * sqrt) == arr[i]) {
        sum += 5;
      }
      if (arr[i] % 4 == 0 || arr[i] % 6 == 0) {
        sum += 4;
      }
      if (arr[i] % 2 == 0) {
        sum += 3;
      }
      sumArr[i] = sum;
    }

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length - 1; j++) {
        if (sumArr[i] < sumArr[j]) {
          temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;

          temp = sumArr[j];
          sumArr[j] = sumArr[i];
          sumArr[i] = temp;
        }
      }

    }

    for (int i = 0; i < arr.length - 1; i++) {
      System.out.print("<" + arr[i] + "," + sumArr[i] + ">, ");
    }

  }

}

```

---

### 3.  Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.
```
w	e	L	C	O
M	E	T	O	Z
O	H	O	C	O
R	P	O	R	A
T	I	O	n	

And print the start and ending index as
Start index : <1,2>
End index: <3, 2>
```

```java
import java.util.Arrays;
import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String str = sc.next();
    // String str = "WELCOMETOZOHOCORPORATION";
    int size = (int) Math.ceil(Math.sqrt(str.length()));

    String subStr = sc.next();
    // String subStr = "COC";

    System.out.println("Enter the sub-string : ");
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
        countH = countV = 0;
        if (arr[i][j] == subStr.charAt(countH)) {

          // find in top to bottom
          for (int l = i; l < size && countH <= subStrLen; l++) {
            if (arr[l][j] == subStr.charAt(countH)) {
              if (countH == subStrLen) {
                System.out.println("start : [" + i + "," + j + "]");
                System.out.println("end : [" + l + "," + j + "]");
                break;
              }
              countH++;
            }
          }

          // find left to right
          for(int l = j; l < size && countV <= subStrLen; l++){
            if (arr[i][l] == subStr.charAt(countV)) {
              if (countV == subStrLen) {
                System.out.println("start : [" + i + "," + j + "]");
                System.out.println("end : [" + i + "," + l + "]");
                break;
              }
              countV++;
            }
          }

        }
      }
    }
  }

}

```
