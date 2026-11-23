#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>


int main() {
	int a;
	scanf(" %d", &a);
	for (int i = 1;i <= a;i++) {
		printf("%d\n", i);
	}
}