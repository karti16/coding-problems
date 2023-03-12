# Coding-challenge

### Problems and solution from leetcode and other similar sites.

## List of Problems

### 1. [Binary Search](#1-binary-search-1)

### 2. [Array Linear Search](#2.%20Array%20Linear%20Search)

### 3. [Binary Search in Infinte Array](#3.%20Binary%20Search%20in%20Infinte%20Array)

### 4. [Ceil and floor of a number from array](#4.%20Ceil%20and%20floor%20of%20a%20number%20from%20array)

### 5. [Count Numbers with Even Number of Digits](#5.%20Count%20Numbers%20with%20Even%20Number%20of%20Digits)

### 6. [Find First and Last Position of Element in Sorted Array](#6.%20Find%20First%20and%20Last%20Position%20of%20Element%20in%20Sorted%20Array)

### 7. [Find in 2d sorted Array](#7.%20Find%20in%202d%20sorted%20Array)

### 1. Binary Search

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

**[⬆ Back to Top](#List%20of%20Problems)**

### 2. Array Linear Search

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

**[⬆ Back to Top](#List%20of%20Problems)**

### 3. Binary Search in Infinte Array

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

**[⬆ Back to Top](#List%20of%20Problems)**

### 4. Ceil and floor of a number from array

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

**[⬆ Back to Top](#List%20of%20Problems)**

### 5. Count Numbers with Even Number of Digits

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

**[⬆ Back to Top](#List%20of%20Problems)**

### 6. Find First and Last Position of Element in Sorted Array

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

**[⬆ Back to Top](#List%20of%20Problems)**

### 7. Find in 2d sorted Array

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

**[⬆ Back to Top](#List%20of%20Problems)**

### 8. title

```java

```

**[⬆ Back to Top](#List%20of%20Problems)**

### 9. title

```java

```

**[⬆ Back to Top](#List%20of%20Problems)**

### 10. title

    ```java

    ```

**[⬆ Back to Top](#List%20of%20Problems)**
