# 18. Find GCD / HCF of two numbers

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
