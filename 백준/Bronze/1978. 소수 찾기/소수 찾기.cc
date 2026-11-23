#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int odd(int a) {
	int number = 0;
	for (int i = 1;i < a;i++) {
		if (a % i == 0) {
			number++;
		}
	}
	return number;
}

int main() {
	int a;
	scanf(" %d", &a);
	int b;
	int count = 0;
	for (int i = 0;i < a;i++) {
		scanf(" %d", &b);
		if (odd(b) == 1) {
			count++;
		}
	}
	printf("%d", count);
}