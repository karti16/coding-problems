# Coding-challenge

### Problems and solution from leetcode and other similar sites.

<br>

### List of Problems

<br>

### 1. [Binary Search](#binary-search)

### 2. [Array Linear Search](#array-linear-search)

### 3. [Binary Search in Infinite Array](#binary-search-in-infinte-array)

### 4. [Ceil and floor of a number from array](#ceil-and-floor-of-a-number-from-array)

### 5. [Count Numbers with Even Number of Digits](#count-numbers-with-even-number-of-digits)

<br>
<br>

1. ### Binary Search?

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

   **[⬆ Back to Top](#1-binary-search)**

2. ### Array Linear Search

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

   **[⬆ Back to Top](#2-array-linear-search)**

3. ### Binary Search in Infinte Array

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

   **[⬆ Back to Top](#3-binary-search-in-infinte-array)**

4. ### Ceil and floor of a number from array

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

   **[⬆ Back to Top](#4-ceil-and-floor-of-a-number-from-array)**

5. ### Count Numbers with Even Number of Digits

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

   **[⬆ Back to Top](#5-count-numbers-with-even-number-of-digits)**
