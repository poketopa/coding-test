#define _CRT_SECURE_NO_WARNINGS
#define _USE_MATH_DEFINES
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main() {
		float a;
		scanf("%f", &a);
		printf("%f\n%f", pow(a,2) * M_PI, pow(a,2) * 2);
}