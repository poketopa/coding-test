#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

int main() {
	int a;
	scanf(" %d", &a);
	int b, c;
	int big;
	int sum;
	for (int i = 0;i < a;i++) {
		scanf(" %d %d", &b, &c);

		if (b > c) {
			big = b;
			sum = b;
		}
		else {
			big = c;
			sum = c;
		}
		while (1) {
			if (sum % b == 0 && sum % c == 0) {
				if (i == a - 1) {
					printf("%d", sum);
					return 0;
				}
				printf("%d\n", sum);
				break;
			}
			else {
				sum+=big;
			}
		}
	}
}