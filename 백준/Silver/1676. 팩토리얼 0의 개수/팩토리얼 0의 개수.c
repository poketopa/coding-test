#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

int main() {
	int a, sum = 0, i = 5;
	scanf(" %d", &a);
	while (1) {
		if (i <= a) {
			sum += (a / i);
			i = i * 5;
		}
		else
			break;
	}
	printf("%d", sum);
}