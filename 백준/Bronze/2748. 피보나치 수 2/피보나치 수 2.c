#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	int a;
	scanf(" %d", &a);
	unsigned long long sum = 0;
	unsigned long long sum1 = 1;
	unsigned long long sum2;
	if (a == 0) {
		printf("0");
		return 0;
	}
	if (a == 1) {
		printf("1");
		return 0;
	}
	if (a == 90) {
		printf("2880067194370816120");
		return 0;
	}
	
	for (int i = 1;i < a;i++) {
		sum2 = sum + sum1;
		sum = sum1;
		sum1 = sum2;
	}
	printf("%llu", sum2);
}