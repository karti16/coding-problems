## List of Problems

| S. no | Programming Projects                                                               |
| ----- | ---------------------------------------------------------------------------------- |
| 2.1.  | [Print tick pattern](#21-print-tick-pattern)                                       |
| 2.2.  | [Volume of sphere](#22-volume-of-sphere)                                           |
| 2.3.  | [Volume of sphere by user input radius](#23-volume-of-sphere-by-user-input-radius) |
| 2.4.  | [5% tax added](#24-5-tax-added)                                                    |
| 2.5.  | [Solve expression](#24-solve-expression)                                           |
| 2.7.  | [Minimum denomination to amount](#27-minimum-denomination-to-amount)               |
| 2.8.  | [Calculate remaining amount in loan](#28-calculate-remaining-amount-in-loan)       |
| 3.1.  | [Print date format](#31-print-date-format)                                         |
| 3.2.  | [Print formatted content](#32-print-formatted-content)                             |

## 2.1. Print tick pattern


```c
#include<stdio.h>

int main(void) {
  printf("         *\n");
  printf("        *\n");
  printf("       *\n");
  printf(" *    *\n");
  printf("  *  *\n");
  printf("   *\n"); 
  return 0;
  }


```

**[⬆ Back to Top](#list-of-problems)**


## 2.2. Volume of sphere

```c
#include<stdio.h>

int main(void) {
  int radius = 10;
  float volume = 4.0f / 3.0f * 3.14f * (radius * radius * radius);
  printf("Sphere volume: %.2f cubic meters\n", volume);
  return 0;
  return 0;
  }


```

**[⬆ Back to Top](#list-of-problems)**

## 2.3. Volume of sphere by user input radius

```c
#include<stdio.h>

int main(void) {

  int radius;

  printf("Enter radius : ");
  scanf("%d", &radius);

  float volume = 4.0f / 3.0f * 3.14f * (radius * radius * radius);
  printf("Sphere volume: %.2f cubic meters\n", volume);

  return 0;
  }

```

**[⬆ Back to Top](#list-of-problems)**

## 2.4. 5% tax added

```c
#include<stdio.h>

int main(void) {

  int amount;

  printf("Enter amount : ");
  scanf("%d", &amount);

  printf("5%% tax added : %.2f\n", amount * 1.05f);
  return 0;
  }


```

**[⬆ Back to Top](#list-of-problems)**

## 2.5. Solve expression

```c
#include<stdio.h>


int multiply(int n, int x) {
  int sum = 1;
  for (int i = 0; i < n; i++) {
    sum *= x;
    }

  return sum;
  }

int main(void) {

  int x;

  printf("Enter number : ");
  scanf("%d", &x);

  int result = 3 * multiply(5, x) + 2 * multiply(4, x) - 5 * multiply(3, x) - multiply(2, x) + 7 * x - 6;
  printf("Result : %d\n", result);
  return 0;


  }

```

**[⬆ Back to Top](#list-of-problems)**

## 2.7. Minimum denomination to amount

```c
#include<stdio.h>


int main(void) {

  int amount;
  int twenty = 0;
  int ten = 0;
  int five = 0;
  int one = 0;

  printf("Enter amount : ");
  scanf("%d", &amount);

  twenty = amount / 20;
  amount = amount - twenty * 20;

  ten = amount / 10;
  amount = amount - ten * 10;

  five = amount / 5;
  amount = amount - five * 5;

  one = amount / 1;
  amount = amount - one * 1;



  printf("$20  bills: %d\n", twenty);
  printf("$10  bills: %d\n", ten);
  printf("$5  bills: %d\n", five);
  printf("$1  bills: %d\n", one);
  return 0;


  }




```

**[⬆ Back to Top](#list-of-problems)**



## 2.8. Calculate remaining amount in loan

```c
#include <stdio.h>

int main(void) {

  float loan = 0.0f, rate = 0.0f, payment = 0.0f;

  printf("Enter amount of loan: ");
  scanf("%f", &loan);

  printf("Enter interest rate: ");
  scanf("%f", &rate);

  printf("Enter monthly payment: ");
  scanf("%f", &payment);

  loan = loan - payment + (loan * rate / 100.0 / 12.0);
  printf("Balance remaining after first payment: $%.2f\n", loan);

  loan = loan - payment + (loan * rate / 100.0 / 12.0);
  printf("Balance remaining after second payment: $%.2f\n", loan);

  loan = loan - payment + (loan * rate / 100.0 / 12.0);
  printf("Balance remaining after third payment: $%.2f\n", loan);

  return 0;
}
```

**[⬆ Back to Top](#list-of-problems)**

## 3.1. Print date format

```c
#include <stdio.h>

int main(void) {
  int m, d, y;
  scanf("%d/%d/%d", &m, &d, &y);

  printf("%d/%2.2d/%2.2d", y, d, m);
}

```

**[⬆ Back to Top](#list-of-problems)**

## 3.2. Print formatted content

```c
#include <stdio.h>

int main(void) {
  int item_no;
  float price;
  int m, d, y;

  printf("Enter item no. : ");
  scanf("%d", &item_no);

  printf("Enter price : ");
  scanf("%f", &price);

  scanf("%d/%d/%d", &m, &d, &y);

  printf("Item\tUnit\t\tPurchase\n");
  printf("\tPrice\t\tDate\n");
  printf("%d\t$%7.2f\t%d/%2.2d/%2.2d\n", item_no, price, d, m, y);

  return 0;
}
```

**[⬆ Back to Top](#list-of-problems)**

## 2.1. Volume of sphere

```c

```

**[⬆ Back to Top](#list-of-problems)**

