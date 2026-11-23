#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	int a;
	int b;
	while (1) {
		scanf(" %d %d", &a, &b);
		if (a == 0 && b == 0)
			return 0;
		if (a < b) {
			if (b % a == 0)
				printf("factor\n");
		}
		else {
			if (a % b == 0)
				printf("multiple\n");
			else {
				printf("neither\n");
			}
		}
	}
}