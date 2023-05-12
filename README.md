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
| 19.   | [Print number 1 to N using recursion](#19-print-number-1-to-n-using-recursion)                                        |
| 20.   | [Find all factorial numbers less than or equal to N](#20-find-all-factorial-numbers-less-than-or-equal-to-n)          |
| 21.   | [Reverse an array](#21-reverse-an-array)                                                                              |
| 22.   | [Reverse an array using Recursion](#22-reverse-an-array-using-recursion)                                              |
| 23.   | [Check palindrome with recursion](#23-check-palindrome-with-recursion)                                                |
| 24.   | [Return array of fibonacci number till N](#24-return-array-of-fibonacci-number-till-n)                                |
| 25.   | [Reverse array in groups](#25-reverse-array-in-groups)                                                                |
| 26.   | [Top K Frequent Elements in Array](#26-top-k-frequent-elements-in-array)                                              |
| 27.   | [Selection Sort](#27-selection-sort)                                                                                  |
| 28.   | [Bubble sort](#28-bubble-sort)                                                                                        |
| 29.   | [Insertion Sort](#29-insertion-sort)                                                                                  |
| 30.   | [Merge Sort](#30-merge-sort)                                                                                          |
| 31.   | [Subarray with given sum](#31-subarray-with-given-sum)                                                                |
| 32.   | [Recursive Bubble Sort](#32-recursive-bubble-sort)                                                                    |
| 33.   | [Recursive Insertion Sort](#33-recursive-insertion-sort)                                                              |
| 34.   | [Quick Sort](#34-quick-sort)                                                                                          |
| 35.   | [Find Largest ELement in Array](#35-find-largest-element-in-array)                                                                                          |
| 36.   | [Second Largest Element in an Array without sorting](#36-second-largest-element-in-an-array-without-sorting)                                                                                          |
| 37.   | [Check if array is sorted or not](#37-check-if-array-is-sorted-or-not)                                                                                          |
| 38.   | [Check if Array Is Sorted and Rotated](#38-check-if-array-is-sorted-and-rotated)                                                                                          |
| 39.   | [Remove Duplicates from Sorted Array](#39-remove-duplicates-from-sorted-array)                                                                                          |
| 40.   | [Rotate Array by k positions](#40-rotate-array-by-k-positions)                                                                                          |
| 41.   | [Quick Left Rotation](#41-quick-left-rotation)                                                                                          |
| 42.   | [Move all zeroes to end of array](#42-move-all-zeroes-to-end-of-array)                                                                                          |
| 43.   | [Union of Two Sorted Arrays](#43-union-of-two-sorted-arrays)                                                                                          |
| 44.   | [Find common numbers in two sorted arrays](#44-find-common-numbers-in-two-sorted-arrays)                                                                                          |
| 45.   | [Find Missing Number in array](#45-find-missing-number-in-array)                                                                                          |

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

## 3. Binary Search in Infinite Array

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

## 19. Print number 1 to N using recursion

```java
public class test {
  public static void main(String[] args) {
    int n = 10;
    print(1, n);
  }

  static void print(int i, int N) {
    if (i == N) {
      System.out.print(i + " ");
      return;
    }
    System.out.print(i + " ");
    print(i + 1, N);
  }
}

```

**[⬆ Back to Top](#list-of-problems)**

## 20. Find all factorial numbers less than or equal to N

```java
import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
    long N = 120;
    ArrayList<Long> list = new ArrayList<Long>();
    long product = 1;
    long i = 2;
    while (product <= N) {
      list.add(product);
      product *= i;
      i++;
    }

    System.out.println(list);
  }

}


```

**[⬆ Back to Top](#list-of-problems)**

## 21. Reverse an array

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int arr[] = { 5, 4, 3, 2, 1 };
    int len = arr.length;
    int res[] = new int[len];
    for (int i = 0; i < len; i++) {
      res[i] = arr[len - i - 1];
    }

    System.out.println(Arrays.toString(res));
  }

}


```

**[⬆ Back to Top](#list-of-problems)**

## 22. Reverse an array using Recursion

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int arr[] = { 5, 4, 3, 2, 1 };
    reverseArr(arr, 0);
    System.out.println(Arrays.toString(arr));
  }

  static void reverseArr(int[] arr, int i) {
    if (i > (arr.length / 2)) {
      return;
    }

    int temp = arr[i];
    arr[i] = arr[arr.length - i - 1];
    arr[arr.length - i - 1] = temp;

    reverseArr(arr, i + 1);
  }

}


```

**[⬆ Back to Top](#list-of-problems)**

## 23. Check palindrome with recursion

```java
public class test {
  public static void main(String[] args) {
    String str = "rhar";
    boolean res = checkPalindrome(str, 0);
    System.out.println(res);
  }

  static boolean checkPalindrome(String str, int i) {
    if (str.length() == 0 || str.length() == 1)
      return true;
    if (i >= 0 && str.charAt(i) != str.charAt(str.length() - i - 1)) {
      return false;
    }
    if (i < (str.length() / 2)) {
      return checkPalindrome(str, i + 1);
    }

    return true;
  }

}

```

**[⬆ Back to Top](#list-of-problems)**

## 24. Return array of fibonacci number till N

```java
import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
    int n = 10;
    ArrayList<Integer> list = new ArrayList<>();
    fibonacci(list, 1, 1, n);
    System.out.println(list);
  }

  static void fibonacci(ArrayList<Integer> list, int first, int second, int n) {
    if (n == 0) {
      return;
    } else {
      list.add(first);
      fibonacci(list, second, (first + second), n - 1);

    }
  }
}

```

**[⬆ Back to Top](#list-of-problems)**

## 25. Reverse array in groups

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int group = 3;
    int len = arr.length - 1;

    for (int i = 0; i < len; i += group) {

      int start = i;
      int end = Math.min(i + group - 1, len);

      while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
    }

    System.out.println(Arrays.toString(arr));
  }
}


```

**[⬆ Back to Top](#list-of-problems)**

## 26. Top K Frequent Elements in Array

```java
/* count the frequency and store it in hashmap.
 * Create array of arrays for size nums length
 * Store the nums by their frequency in List
 * like 5 , 2, occurred 3 times then store 5,3 in the 3rd index of the list
 * Iterate list from hight to lowest and print the numbers
 *
 * link -> https://www.youtube.com/watch?v=YPTqKIgVk-k
 * link -> https://www.geeksforgeeks.org/find-k-numbers-occurrences-given-array/
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class test {
  public static void main(String[] args) {
    int[] a = { 1, 1, 1, 4, 5, 5, 5, 2, 2, 2, 3 };
    int k = 2;
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < a.length; i++) {
      map.put(a[i], map.getOrDefault(a[i], 0) + 1);
    }

    List<List<Integer>> freq = new ArrayList<>();

    for (int i = 0; i < a.length + 1; i++) {
      freq.add(new ArrayList<>());
    }

    for (int key : map.keySet()) {
      freq.get(map.get(key)).add(key);
    }

    int[] res = new int[2];
    int count = 0;
    for (int i = freq.size() - 1; i >= 0; i--) {

      if (freq.get(i).size() > 1) {
        Collections.sort(freq.get(i), Collections.reverseOrder());
      }

      for (int ele : freq.get(i)) {
        if (count >= k)
          break;
        res[count++] = ele;
      }
    }
    System.out.println(Arrays.toString(res));
    System.out.println(freq);
    System.out.println(map);

  }
}


```

**[⬆ Back to Top](#list-of-problems)**

## 27. Selection Sort

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 12, 5, 34, 67, 9, 55 };
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }

      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }

    System.out.println(Arrays.toString(arr));

  }
}

```

**[⬆ Back to Top](#list-of-problems)**

## 28. Bubble sort

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 12, 5, 34, 67, 9, 55 };
    int n = arr.length;

    for (int i = n - 1; i >= 0; i--) {
      int didSwap = 0;
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
          didSwap++;
        }
      }
      if (didSwap == 0) {
        break;
      }
    }

    System.out.println(Arrays.toString(arr));

  }
}

```

**[⬆ Back to Top](#list-of-problems)**

## 29. Insertion Sort

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 12, 5, 34, 67, 9, 55 };
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      int j = i;
      while (j > 0 && arr[j] < arr[j - 1]) {

        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;

      }
    }

    System.out.println(Arrays.toString(arr));

  }
}

```

**[⬆ Back to Top](#list-of-problems)**

## 30. Merge Sort

```java
import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 4, 3, 5, 7, 2, 9 };
    int n = arr.length;
    mergeSort(arr, 0, n - 1);
    for (int i : arr) {
      System.out.print(i + " ");
    }

  }

  static void mergeSort(int[] arr, int start, int end) {
    if (start >= end)
      return;
    int mid = start + (end - start) / 2;
    mergeSort(arr, start, mid);
    mergeSort(arr, mid + 1, end);
    merge(arr, start, mid, end);
  }

  static void merge(int[] arr, int start, int mid, int end) {

    ArrayList<Integer> temp = new ArrayList<>();

    int left = start;
    int right = mid + 1;

    while (left <= mid && right <= end) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }

    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    while (right <= end) {
      temp.add(arr[right]);
      right++;
    }

    for (int i = start; i < end; i++) {
      arr[i] = temp.get(i - start);
    }

  }
}
```

**[⬆ Back to Top](#list-of-problems)**

## 31. [Subarray with given sum](https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&category[]=Arrays&sortBy=submissions)

```Find a continuous sub-array that adds to a given number S
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
```

%

```java
import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 7, 5 };
    int num = 12;
    int sum = arr[0];
    int left = 0;
    int right = 0;
    ArrayList<Integer> res = new ArrayList<>();
    if(num == 0){
      res.add(-1);
      return res;
    }
    while (right < arr.length) {
      if (sum == num) {
        res.add(left);
        res.add(right);
        break;
      }
      if (sum < num) {
        if(right < arr.length){
          sum += arr[++right];
        }
        continue;
      }
      if (sum > num) {
        sum -= arr[left++];
        continue;
      }
    }

    System.out.println(res);

  }

}

```

**[⬆ Back to Top](#list-of-problems)**

## 32. Recursive Bubble Sort

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 6, 9, 12, 7, 5 };
    recursiveBubbleSort(arr, arr.length);
    System.out.println(Arrays.toString(arr));

  }

  static void recursiveBubbleSort(int[] arr, int i) {
    if (i == 0) {
      return;
    }
    for (int j = 0; j < i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        int temp = arr[j + 1];
        arr[j + 1] = arr[j];
        arr[j] = temp;
      }
    }

    recursiveBubbleSort(arr, --i);
  }
}
```

**[⬆ Back to Top](#list-of-problems)**

## 33. Recursive Insertion Sort

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 6, 9, 12, 7, 5 };
    recursiveInsertionSort(arr, 0);
    System.out.println(Arrays.toString(arr));

  }

  static void recursiveInsertionSort(int[] arr, int i) {
    if (i >= arr.length) {
      return;
    }
    for (int j = i; j > 0; j--) {
      if (arr[j] < arr[j - 1]) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
      }
    }

    recursiveInsertionSort(arr, ++i);
  }
}
```

**[⬆ Back to Top](#list-of-problems)**

## 34. Quick Sort

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 6, 9, 12, 7, 5 };
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));

  }

  static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pIndex = partition(arr, low, high);
      quickSort(arr, low, pIndex - 1);
      quickSort(arr, pIndex + 1, high);
    }
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j) {
      while (arr[i] <= pivot && i <= high - 1) {
        i++;
      }

      while (arr[j] > pivot && j >= low + 1) {
        j--;
      }

      if (i < j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }

    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    return j;
  }

}
```

**[⬆ Back to Top](#list-of-problems)**

## 35. Find Largest ELement in Array

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 9, 0, 1, 2 };
    int max = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }

    System.out.println(max);

  }

}
```

**[⬆ Back to Top](#list-of-problems)**
## 36. Second Largest Element in an Array without sorting

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 9, 0, 7, 1, 2 };
    int max = arr[0];
    int max_2 = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max_2 = max;
        max = arr[i];
      } else if (arr[i] < max && arr[i] != max_2) {
        max_2 = arr[i];
      }
    }

    System.out.println(max + ", " + max_2);

  }

}

```

**[⬆ Back to Top](#list-of-problems)**
## 37. Check if array is sorted or not
[Question link](https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted)

%

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 9, 0, 1, 2 };
    for (int i = 0; i < arr.length - 1; i++) {
          if (arr[i] > arr[i + 1]) {
            System.out.println("Not sorted");
          }
        }

    System.out.println("Sorted");

  }

}

```

**[⬆ Back to Top](#list-of-problems)**
## 38. Check if Array Is Sorted and Rotated

[Question link](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/)

[Video Solution Link](https://www.youtube.com/watch?v=t1GLDWqWVQk&t=310s)

%

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 3, 4, 5, 1, 2 };
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > arr[(i + 1) % arr.length]) {
        count++;
      }
    }
    if (count <= 1) {
      System.out.println("Array is sorted and rotated");
    } else {
      System.out.println("Array is not sorted / rotated");
    }
  }
}

```

**[⬆ Back to Top](#list-of-problems)**
## 39. Remove Duplicates from Sorted Array

[Question link](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/)

[Question link](https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=remove-duplicate-elements-from-sorted-array)

[Video Solution Link](https://youtu.be/37E9ckMDdTk?t=1890)

%

```java
// TC -> O(n)
// SC -> O(1)
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1,1,2,2,3,4,4 };
    int i = 0;
    int j = 1;
    while(j < arr.length){
      if(arr[i] != arr[j]){
        arr[i+1] = arr[j];
        i++;
      }
      j++;
    }

    System.out.println(Arrays.toString(arr));
  }
}
```

**[⬆ Back to Top](#list-of-problems)**
## 40. Rotate Array by k positions

[Question link](https://leetcode.com/problems/rotate-array/)

[Video Solution Link](https://www.youtube.com/watch?v=BHr381Guz3Y)

%

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1,2,3,4,5,6,7};
    int k = 3;
    k = k % arr.length;

    reverseArr(arr, 0, arr.length - 1);
    reverseArr(arr, 0, k - 1);
    reverseArr(arr, k, arr.length - 1);

    System.out.println(Arrays.toString(arr));
  }

  static void reverseArr(int[] arr, int start, int end ){
    while(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}

```

**[⬆ Back to Top](#list-of-problems)**
## 41. Quick Left Rotation

[Question link](https://practice.geeksforgeeks.org/problems/quick-left-rotation3806/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=quick-left-rotation)

[Video Solution Link](https://www.youtube.com/watch?v=BHr381Guz3Y)

%

```java
// TC -> O(2n)
// SC -> O(1)
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1,2,3,4,5,6,7};
    int k = 3;
    k = arr.length - (k % arr.length); 

    reverseArr(arr, 0, arr.length - 1);
    reverseArr(arr, 0, k - 1);
    reverseArr(arr, k, arr.length - 1);

    System.out.println(Arrays.toString(arr));
  }

  static void reverseArr(int[] arr, int start, int end ){
    while(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}
```

**[⬆ Back to Top](#list-of-problems)**
## 42. Move all zeroes to end of array

[Question link](https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=move-all-zeroes-to-end-of-array)

[Question link](https://leetcode.com/problems/move-zeroes/)

[Video Solution Link](https://www.youtube.com/watch?v=aayNRwUN3Do)



%

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = {1, 0, 9, 3, 5, 0, 0, 4};
    
    int left = 0;
 

    for ( int right = 0; right < arr.length; right++){
      if(arr[right] != 0){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
      }
    }

    System.out.println(Arrays.toString(arr));
  }
}

```

**[⬆ Back to Top](#list-of-problems)**
## 43. Union of Two Sorted Arrays

[Question link](https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays)

[Video Solution Link](https://youtu.be/wvcQg43_V8U?t=2588)

%

```java
// TC -> O(n1 + n2)
// SC -> O(n1 + n2)
import java.util.ArrayList;
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 1, 2, 3, 7 };
    int n1 = arr1.length;
    int n2 = arr2.length;

    int i = 0;
    int j = 0;

    ArrayList<Integer> result = new ArrayList<Integer>();

    while (i < n1 && j < n2) {
      if (arr1[i] <= arr2[j]) {
        if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
          result.add(arr1[i]);
        }
        i++;
      } else {
        if (result.size() == 0 || result.get(result.size() - 1) != arr2[j]) {
          result.add(arr2[j]);
        }
        j++;
      }
    }

    while (i < n1) {
      if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
        result.add(arr1[i]);
      }
      i++;
    }

    while (j < n2) {
      if (result.size() == 0 || result.get(result.size() - 1) != arr2[j]) {
        result.add(arr2[j]);
      }
      j++;
    }

    System.out.println(result);

  }
}

```

**[⬆ Back to Top](#list-of-problems)**
## 44. Find common numbers in two sorted arrays

[Question link]()

[Video Solution Link](https://youtu.be/wvcQg43_V8U?t=3564)

%

```java

import java.util.ArrayList;
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 3, 4, 5 };
    int[] arr2 = { 1, 2, 3, 7 };
    int n1 = arr1.length;
    int n2 = arr2.length;

    int i = 0;
    int j = 0;

    ArrayList<Integer> result = new ArrayList<Integer>();

    while (i < n1 && j < n2) {
      if (arr1[i] < arr2[j]) {
        i++;
      } else if (arr2[j] < arr1[i]) {
        j++;
      } else {
        
        result.add(arr1[i]);
        i++;
        j++;
      }
    }

    System.out.println(result);

  }
}
```

**[⬆ Back to Top](#list-of-problems)**
## 45. Find Missing Number in array

[Question link](https://practice.geeksforgeeks.org/problems/missing-number4257/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=missing-number)

[Video Solution Link](https://youtu.be/bYWLJb3vCWY?t=72)

%

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 3 };
    int n = 4;
    int[] res = new int[n + 1];

    for (int i = 0; i < arr.length; i++) {
      res[arr[i]] = 1;
    }

    for (int i = 1; i < res.length; i++) {
      if (res[i] == 0) {
        System.out.println(i);
        break;
      }
    }

  }
}

// -----------

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 3 };
    int n = 4;
    int xor1 = 0;
    int xor2 = 0;

    for (int i = 1; i <= n; i++) {
      xor1 ^= i;
    }

    for (int i = 0; i < arr.length; i++) {
      xor2 ^= arr[i];
    }

    System.out.println(xor1 ^ xor2);

  }
}

```

**[⬆ Back to Top](#list-of-problems)**
## 10. title

[Question link]()

[Video Solution Link]()

%

```java


```

**[⬆ Back to Top](#list-of-problems)**
