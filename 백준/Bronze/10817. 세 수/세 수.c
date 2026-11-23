#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int number[3];
	scanf(" %d %d %d", &number[0], &number[1], &number[2]);
	int max;
	int swap;
	if (number[0] <= number[1]) {
		swap = number[0];
		number[0] = number[1];
		number[1] = swap;
	}
	if (number[1] <= number[2]) {
		swap = number[1];
		number[1] = number[2];
		number[2] = swap;
	}
	if (number[0] <= number[1]) {
		swap = number[0];
		number[0] = number[1];
		number[1] = swap;
	}
	printf("%d", number[1]);
}