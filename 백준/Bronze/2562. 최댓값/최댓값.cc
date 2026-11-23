#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a[9] = { 0 };
	int b = 0;
	int big;
	for (int i = 0;i < 9;i++) {
		scanf(" %d", &a[i]);
	}
	for (int i = 0;i < 9;i++) {
		if (b < a[i]) {
			b = a[i];
			big = i+1;
		}
	}
	printf("%d\n%d", b, big);
}