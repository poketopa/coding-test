#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a;
	int sum;
	scanf(" %d", &a);
	if (a == 0) {
		printf("1");
		return 0;
	}
	sum = a;
	for (int i = a-1;i > 0;i--) {
		sum = sum * (i);
	}
	printf("%d", sum);
}