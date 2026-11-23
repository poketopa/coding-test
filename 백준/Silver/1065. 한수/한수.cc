#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a;
	int count = 0;
	int  a1;
	int a2;
	int a3;
	scanf(" %d", &a);
	if (a < 100) {
		printf("%d", a);
	}
	else {
		count += 99;
		for (int i = 100;i <= a;i++) {
			a1 = i % 10;
			a2 = i % 100;
			a2 = a2 / 10;
			a3 = i / 100;
			if ((a1 - a2) == (a2 - a3))
				count++;
		}
		printf("%d", count);
	}
}