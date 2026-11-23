#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

int main() {
	int a, b;
	scanf(" %d %d", &a, &b);
	printf("%d", a - 1 + (b - 1) * a);
}