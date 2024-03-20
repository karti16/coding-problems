#include <stdio.h>
#include <math.h>


int main(void) {
  float a = 3.14;
  float b = 1.2;

  float rem = fmod(a,b);

  printf("%lf", rem);

  
  return 0;
}