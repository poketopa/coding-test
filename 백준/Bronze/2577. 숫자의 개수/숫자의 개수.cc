#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a[3];
	for (int i = 0;i < 3;i++) {
		scanf(" %d", &a[i]);
	}
	int b;
	int c[10]={0};
	b = (a[0] * a[1] * a[2]);
	while(b!=0) {
		c[b % 10]++;
		b = b / 10;
	}
	for (int i = 0;i < 10;i++) {
		printf("%d\n", c[i]);
	}
}