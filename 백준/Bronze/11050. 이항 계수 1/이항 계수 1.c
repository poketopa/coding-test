#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

int main() {
	int a, b;
	scanf(" %d %d", &a, &b);
	int sum = 1;
	for (int i = a;i > a - b;i--) {
		sum = sum * i;
	}
	int pac =1;
	for (int i = b;i > 0;i--) {
		pac = pac * i;
	}
	printf("%d", sum/pac);
}