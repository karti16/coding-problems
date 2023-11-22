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



