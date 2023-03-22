## 4 Rules in patters

1. Outer loop for the rows and inner loops for the column
2. Inner loop focus on the column and connect then somehow to the outer loops
3. print them inside the inner loops
4. Observe symmetry. [optional]

---

```java
* * * *
* * * *
* * * *
* * * *

public class test {
  public static void main(String[] args) {
    int n = 4;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}
```

---

```java
*
* *
* * *
* * * *

public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}
```

---

```java
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }
}

```

---

```java
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println("");
    }
  }
}
```

---

```java
* * * * *
* * * *
* * *
* *
*

public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}
```

---

```java
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }
}
```

---

```java
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *


public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print("  ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("* ");
      }
      for (int l = 0; l < n - i - 1; l++) {
        System.out.print("  ");
      }
      System.out.println("");
    }
  }
}

```

---

```java
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("  ");
      }
      for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
        System.out.print("* ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("  ");
      }
      System.out.println("");
    }
  }
}
```

---

```java
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

public class test {
  public static void main(String[] args) {
    int n = 5;
    // upside
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print("  ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("* ");
      }
      for (int l = 0; l < n - i - 1; l++) {
        System.out.print("  ");
      }
      System.out.println("");
    }
    // upside down
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("  ");
      }
      for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
        System.out.print("* ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("  ");
      }
      System.out.println("");
    }
  }
}
```

---

```java
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*


public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i <= 2 * n - 1; i++) {
      int star = i;
      if (i > n)
        star = 2 * n - i;
      for (int j = 0; j < star; j++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}

```

---

```java
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

public class test {
  public static void main(String[] args) {
    int n = 5;
    int start;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0)
        start = 0;
      else
        start = 1;
      for (int j = 1; j <= i; j++) {
        System.out.print(start + " ");
        start = 1 - start;
      }
      System.out.println("");
    }
  }
}
```

---

```java
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1


public class test {
  public static void main(String[] args) {
    int n = 5;
    int space = 2 * (n - 1);
    for (int i = 1; i <= n; i++) {
      // numbers
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      // space
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }
      // numbers
      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }
      space -= 2;
      System.out.println("");
    }
  }
}

```

---

```java
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


public class test {
  public static void main(String[] args) {
    int n = 5;
    int count = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(count++ + " ");
      }
      System.out.println("");
    }
  }
}
```

---

```java
A
A B
A B C
A B C D
A B C D E

public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) ('A' + j) + " ");
      }
      System.out.println("");
    }
  }
}
```

---

```java
A B C D E
A B C D
A B C
A B
A


public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < (n - i); j++) {
        System.out.print((char) ('A' + j) + " ");
      }
      System.out.println("");
    }
  }
}
```

---

```java
A
B B
C C C
D D D D
E E E E E


public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) ('A' + i) + " ");
      }
      System.out.println("");
    }
  }
}

```

---

```java
        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A


public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      // space
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print("  ");
      }

      // char
      char ch = 'A';
      int breakPoint = (2 * i + 1) / 2;
      for (int j = 1; j <= 2 * i + 1; j++) {
        System.out.print(ch + " ");
        if (j <= breakPoint)
          ch = (char) (ch + 1);
        else
          ch = (char) (ch - 1);
      }

      // space
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print("  ");
      }
      System.out.println("");
    }
  }
}
```

---

```java
E
E  D
E  D  C
E  D  C  B
E  D  C  B  A


public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) ('A' + (n - j - 1)) + "  ");
      }
      System.out.println("");
    }
  }
}
```

---

```java
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *



public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      // Upside
      // stars
      for (int j = 0; j <= n - i - 1; j++) {
        System.out.print("* ");
      }

      // space
      for (int j = 0; j <= 2 * i - 1; j++) {
        System.out.print("  ");
      }

      // stars
      for (int j = 0; j <= n - i - 1; j++) {
        System.out.print("* ");
      }
      System.out.println("");

    }
    // Upside Down
    // stars
    int space2 = 8;
    for (int i = 0; i < n; i++) {

      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }

      // space
      for (int j = 0; j < space2; j++) {
        System.out.print("  ");
      }

      // stars
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      space2 -= 2;
      System.out.println("");
    }

  }
}
```

---

```java
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *



public class test {
  public static void main(String[] args) {
    int n = 5;
    int space = 2 * n - 2;
    for (int i = 0; i <= 2 * n - 1; i++) {
      int stars = i;
      if (i > n)
        stars = 2 * n - i;
      // stars
      for (int j = 0; j < stars; j++) {
        System.out.print("* ");
      }
      // space
      for (int j = 0; j < space + 2; j++) {
        System.out.print("  ");
      }
      // stars
      for (int j = 0; j < stars; j++) {
        System.out.print("* ");
      }
      if (i < n)
        space -= 2;
      else
        space += 2;
      System.out.println("");
    }

  }
}
```

---

```java
* * * * *
*       *
*       *
*       *
* * * * *



public class test {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
          System.out.print("* ");
        else
          System.out.print("  ");
      }
      System.out.println("");
    }

  }
}

```

---

```java


```
