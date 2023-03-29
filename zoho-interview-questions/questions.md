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

## 3. Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.

```
W	E	L	C	O
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

---

## 4. Evaluate 9×9.

```java
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

```

## 5. Alternate sorting: Given an array of integers, rearrange the array in such a way that the first element is first maximum and second element is first minimum.

    Input  : {1, 2, 3, 4, 5, 6, 7}
    Output : {7, 1, 6, 2, 5, 3, 4}

```java
  // optimal solution
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    int len = arr.length;

    Arrays.sort(arr);

    int i = 0;
    int j = len - 1;
    while (i < j) {
      System.out.print(arr[j--] + ", ");
      System.out.print(arr[i++] + ", ");
    }
    if (len % 2 != 0) {
      System.out.print(arr[i]);
    }
  }
}

```

```java
// my solution
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    int len = arr.length;

    // sort in desc order
    int[] descArr = new int[len];
    for (int i = 0; i < len; i++)
      descArr[i] = arr[i];

    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        int temp = 0;
        if (descArr[i] < descArr[j]) {
          temp = descArr[j];
          descArr[j] = descArr[i];
          descArr[i] = temp;
        }
      }
    }

    // sort in asc order
    int[] ascArr = new int[len];
    for (int i = 0; i < len; i++)
      ascArr[i] = arr[i];

    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        int temp = 0;
        if (ascArr[i] > ascArr[j]) {
          temp = ascArr[j];
          ascArr[j] = ascArr[i];
          ascArr[i] = temp;
        }
      }
    }
    int[] resArr = new int[len];
    int countD = 0;
    int countA = 0;

    for (int i = 0; i < len; i++) {
      if (i % 2 == 0) {
        resArr[i] = descArr[countD];
        countD++;
      } else {
        resArr[i] = ascArr[countA];
        countA++;
      }

    }

    System.out.println(Arrays.toString(descArr));
    System.out.println(Arrays.toString(ascArr));
    System.out.println(Arrays.toString(resArr));

  }

}

```

## 6. Reverse The number 123 to 321

```java
public class test {
  public static void main(String[] args) {
    int num = 7789;
    int revNum = 0;

    while (num > 0) {
      int lastNum = num % 10;
      revNum = revNum * 10 + lastNum;
      num = num / 10;
    }

    System.out.println(revNum);

  }
}

```

## 7. Check palindrome

```java
public class test {
  public static void main(String[] args) {
    int num = 778;
    int dup = num;
    int revNum = 0;

    while (num > 0) {
      int lastNum = num % 10;
      revNum = revNum * 10 + lastNum;
      num = num / 10;
    }

    if (revNum == dup) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

  }
}
```

## 8. Check if number is Armstrong number

```java
import java.lang.Math;

public class test {
  public static void main(String[] args) {
    int num = 153;
    int dup = num;
    int digits = 3;
    int sum = 0;

    while (num > 0) {
      int lastNum = num % 10;
      sum += (Math.pow(lastNum, digits));
      num = num / 10;
    }
    if (dup == sum) {
      System.out.println("Armstrong Number");
    } else {
      System.out.println("Not Armstrong Number");
    }

  }
}

```

## 9. Print all Divisor of a number

```java
import java.util.ArrayList;
import java.util.Collections;

public class test {
  public static void main(String[] args) {
    int num = 36;
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 1; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        list.add(i);
        if (i != num / i) {
          list.add(num / i);
        }
      }
    }
    Collections.sort(list);
    System.out.println(list);

  }
}
```
