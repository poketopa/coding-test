#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

int main() {
	int a;
	scanf(" %d", &a);
	for (int i = a;i > 0;i--) {
		for (int j = 0;j < i;j++) {
			printf("*");
		}
		printf("\n");
	}
}