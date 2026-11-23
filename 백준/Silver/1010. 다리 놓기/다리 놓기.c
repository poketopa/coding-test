#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

int main() {
	int temp;
	scanf(" %d", &temp);
	int a, b;
	int min, max;
	for (int i = 0;i < temp;i++) {
		scanf(" %d %d", &a, &b);
		if (a > b) {
			if (b > a / 2) {
				max = a;
				min = max - b;
			}
			else {
				max = a;
				min = b;
			}
		}
		else {
			if (a > b / 2) {
				max = b;
				min = max - a;
			}
			else {
				max = b;
				min = a;
			}
		}
		unsigned long long sum = 1;
		for (int i = max;i > max - min;i--) {
			sum = sum * i;
		}
		unsigned long long pac = 1;
		for (int i = min;i > 0;i--) {
			pac = pac * i;
		}
		if (i == temp-1) {
			printf("%llu", sum / pac);
			return 0;
		}
		printf("%llu\n", sum / pac);
	}
}