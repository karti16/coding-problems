# Coding-challenge

## Problems and solution from leetcode and other similar sites.

1. [Pattern Problems](./pattern.md)

## List of Problems

| S. no | Problem                                                                                                               |
| ----- | --------------------------------------------------------------------------------------------------------------------- |
| 1.    | [Binary Search](#1-binary-search)                                                                                     |
| 2.    | [Array Linear Search](#2-array-linear-search)                                                                         |
| 3.    | [Binary Search in Infinite Array](#3-binary-search-in-infinte-array)                                                  |
| 4.    | [Ceil and floor of a number from array](#4-ceil-and-floor-of-a-number-from-array)                                     |
| 5.    | [Count Numbers with Even Number of Digits](#5-count-numbers-with-even-number-of-digits)                               |
| 6.    | [Find First and Last Position of Element in Sorted Array](#6-find-first-and-last-position-of-element-in-sorted-array) |
| 7.    | [Find in 2d sorted Array](#7-find-in-2d-sorted-array)                                                                 |
| 8.    | [Print words in X shape](#8-print-words-in-x-shape)                                                                   |
| 9.    | [Find some of weights of number](#10-find-some-of-weights-of-numbers)                                                 |
| 10.   | [Search substring in 2d array](#10-search-substring-in-2d-array)                                                      |
| 11.   | [Evaluate 9×9 sudoko](#11-evaluate-9×9-sudoko)                                                                        |
| 12.   | [Alternate sorting](#12-alternate-sorting)                                                                            |
| 13.   | [Reverse The number 123 to 321](#13-reverse-the-number-123-to-321)                                                    |
| 14.   | [Check palindrome](#14-check-palindrome)                                                                              |
| 15.   | [Check if number is Armstrong number](#15-check-if-number-is-armstrong-number)                                        |
| 16.   | [Print all Divisor of a number](#16-print-all-divisor-of-a-number)                                                    |
| 17.   | [Check number is Prime or not](#17-check-number-is-prime-or-not)                                                      |
| 18.   | [Find GCD / HCF of two numbers](#18-find-gcd--hcf-of-two-numbers)                                                     |

## 1. Binary Search

```java
	public class Java {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 3;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
      }
    }
```

**[⬆ Back to Top](#list-of-problems)**

## 2. Array Linear Search

```java
public class Java {
 public static void main(String args[]) {
     int[] nums = { 1, 2, 3, 4, 5, 6, 67 };
     int target = 4;
     System.out.println(linearSearch(nums, target));
 }

 static int linearSearch(int[] arr, int target) {
     if (arr.length == 0) {
         return -1;
     }

     for (int i = 0; i < arr.length; i++) {
         if (arr[i] == target) {
             return i;
         }
     }
     return -1;
   }
 }
```

**[⬆ Back to Top](#list-of-problems)**

## 3. Binary Search in Infinte Array

```java
 public class Java {
 public static void main(String[] args) throws Exception {
     int[] arr = { 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30 };
     int target = 30;
     System.out.println(ans(arr, target));
 }

 static int ans(int[] arr, int target) {

     int start = 0;
     int end = 1;

     while (target > arr[end]) {
         int temp = end + 1;
         end = end + (end - start + 1) * 2;
         start = temp;
     }
     return binarySearch(arr, target, start, end);
 }

 static int binarySearch(int[] arr, int target, int start, int end) {

     while (start <= end) {
         int mid = start + (end - start) / 2;
         if (target < arr[mid]) {
             end = mid - 1;
         } else if (target > arr[mid]) {
             start = mid + 1;
         } else {
             return mid;
         }
     }
     return -1;
   }
 }
```

**[⬆ Back to Top](#list-of-problems)**

## 4. Ceil and floor of a number from array

```java
public class Java {
 public static void main(String[] args) {
     int[] arr = { 1, 3, 5, 7, 8, 9, 12, 14, 17 };
     int target = 15;
     System.out.println("ceil: " + ceil(arr, target));
     System.out.println("floor: " + floor(arr, target));
 }

 static int ceil(int[] arr, int target) {
     int start = 0;
     int end = arr.length - 1;

     while (start <= end) {
         int mid = (start + end) / 2;
         if (arr[mid] < target) {
             start = mid + 1;
         } else if (arr[mid] > target) {
             end = mid - 1;
         } else {
             return mid;
         }
     }
     return start;
 }

 static int floor(int[] arr, int target) {
     int start = 0;
     int end = arr.length - 1;

     while (start <= end) {
         int mid = (start + end) / 2;
         if (arr[mid] < target) {
             start = mid + 1;
         } else if (arr[mid] > target) {
             end = mid - 1;
         } else {
             return mid;
         }
     }
     return end;
   }
 }

```

**[⬆ Back to Top](#list-of-problems)**

## 5. Count Numbers with Even Number of Digits

```java
public class Java {
 public static void main(String[] args) {
     int[] nums = { 155, 24, 4, 777, 37, 4 };
     System.out.println(findNumbers(nums));
 }

 static int findNumbers(int[] nums) {
     int count = 0;
     if (nums.length == 0) {
         return count;
     }

     for (int n : nums) {
         if (isEven(n)) {
             count++;
         }
     }
     return count;
 }

 static boolean isEven(int n) {
     int count = 0;

     while (n > 0) {
         count++;
         n = n / 10;
     }
     return count % 2 == 0;
 }
}

```

**[⬆ Back to Top](#list-of-problems)**

## 6. Find First and Last Position of Element in Sorted Array

```java
 public class Java {
     public static void main(String[] args) {
         int[] nums = { 3, 4, 5, 5, 5, 6, 7 };
         int target = 5;

         int[] result = findFirstAndLast(nums, target);
         System.out.println(Arrays.toString(result));
     }

     static int[] findFirstAndLast(int[] nums, int target) {
         int[] ans = { -1, -1 };

         ans[0] = search(nums, target, true);
         if (ans[0] != -1) {
             ans[1] = search(nums, target, false);
         }

         return ans;

     }

     static int search(int[] nums, int target, boolean findFirstIndex) {
         int ans = -1;
         int start = 0;
         int end = nums.length - 1;
         while (start <= end) {
             int mid = start + (end - start) / 2;

             if (target < nums[mid]) {
                 end = mid - 1;
             } else if (target > nums[mid]) {
                 start = mid + 1;
             } else {
                 ans = mid;
                 if (findFirstIndex) {
                     end = mid - 1;
                 } else {
                     start = mid + 1;
                 }
             }
         }
         return ans;
     }
 }
```

**[⬆ Back to Top](#list-of-problems)**

## 7. Find in 2d sorted Array

```java
 import java.util.Arrays;

 public class Java {
     public static void main(String[] args) {
         int[][] matrix = {
                 { 10, 20, 30, 40 },
                 { 15, 25, 35, 45 },
                 { 28, 39, 37, 49 },
                 { 33, 34, 38, 59 }
         };
         int target = 37;
         int[] ans = search(matrix, target);
         System.out.println(Arrays.toString(ans));
     }

     static int[] search(int[][] matrix, int target) {
         int r = 0;
         int c = matrix.length - 1;

         while (r < matrix.length && c >= 0) {
             if (matrix[r][c] == target) {
                 return new int[] { r, c };
             }

             if (matrix[r][c] < target) {
                 r++;
             } else {
                 c--;
             }
         }

         return new int[] { -1, -1 };
     }
 }

```

**[⬆ Back to Top](#list-of-problems)**

## 8. Print word in X shape

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

**[⬆ Back to Top](#list-of-problems)**

## 9. Find some of weights of numbers

    Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions

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

**[⬆ Back to Top](#list-of-problems)**

## 10. Search substring in 2d array

    Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.

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

**[⬆ Back to Top](#list-of-problems)**

## 11. Evaluate 9×9 sudoko

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

**[⬆ Back to Top](#list-of-problems)**

## 12. Alternate sorting

    Alternate sorting: Given an array of integers, rearrange the array in such a way that the first element is first maximum and second element is first minimum.

    Input  : {1, 2, 3, 4, 5, 6, 7}
    Output : {7, 1, 6, 2, 5, 3, 4}

```java

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

**[⬆ Back to Top](#list-of-problems)**

## 13. Reverse The number 123 to 321

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

**[⬆ Back to Top](#list-of-problems)**

## 14. Check palindrome

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

**[⬆ Back to Top](#list-of-problems)**

## 15. Check if number is Armstrong number

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

**[⬆ Back to Top](#list-of-problems)**

## 16. Print all Divisor of a number

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

**[⬆ Back to Top](#list-of-problems)**

## 17. Check number is prime or not

```java

public class test {
  public static void main(String[] args) {
    int num = 10;
    int factors = 0;
    for (int i = 1; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        factors++;
        if (num / i != i) {
          factors++;
        }
      }
    }
    if (factors == 2) {
      System.out.println("Prime number");
    } else {
      System.out.println("Not a prime number");
    }
  }
}


```

**[⬆ Back to Top](#list-of-problems)**

## 18. Find GCD / HCF of two numbers

```java
public class test {
  public static void main(String[] args) {
    int n1 = 52;
    int n2 = 10;

    while (n1 > 0 && n2 > 0) {
      if (n1 > n2) {
        n1 = n1 % n2;
      } else {
        n2 = n2 % n1;
      }
    }
    System.out.println("GCD / HCF : " + Math.max(n1, n2));

  }
}
```

**[⬆ Back to Top](#list-of-problems)**

## 10. title

```java

```

**[⬆ Back to Top](#list-of-problems)**

## 10. title

```java

```

**[⬆ Back to Top](#list-of-problems)**
