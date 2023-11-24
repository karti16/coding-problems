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