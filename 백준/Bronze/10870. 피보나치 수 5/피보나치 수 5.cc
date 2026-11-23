#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a;
	int b = 0;
	scanf(" %d", &a);
	int n1 = 0;
	int n2 = 1;
	int n3;
	if (a == 0) {
		printf("0");
		return 0;
	}
	else if (a == 1) {
		printf("1");
		return 0;
	}
	for (int i = 1;i < a;i++) {
		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
	}
	printf("%d", n3);
}