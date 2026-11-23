#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main() {
	int a;
	int b;
	scanf(" %d %d", &a, &b);
	int min;
	int max;
	for (int i = 1;i <= a && i <= b;i++) {
		if (a % i == 0 && b % i == 0) {
			min = i;
		}
	}
	if (a > b) {
		for (int i = a;;i++) {
			if (i % a == 0 && i % b == 0) {
				max = i;
				break;
			}
		}
	}
	else {
		for (int i = b;;i++) {
			if (i % a == 0 && i % b == 0) {
				max = i;
				break;
			}
		}
	}
	printf("%d\n%d", min, max);
}