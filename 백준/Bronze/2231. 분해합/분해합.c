#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int main() {
	int a;
	scanf(" %d", &a);
	int sum;
	int temp;
	for (int i = a / 2;i < a;i++) {
		sum = i;
		temp = i;
		while (temp != 0) {
			sum += temp % 10;
			temp = temp / 10;
		}
		if (sum == a) {
			printf("%d", i);
			return 0;
		}
		else
			continue;
	}
	printf("0");
}
