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
