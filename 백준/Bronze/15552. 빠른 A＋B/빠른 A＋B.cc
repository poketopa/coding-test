#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>


int main() {
	int a;
	int b, c;
	scanf(" %d", &a);
	for (int i = 1;i <= a;i++) {
		scanf(" %d %d", &b, &c);
		printf("%d\n", b + c);
	}
}