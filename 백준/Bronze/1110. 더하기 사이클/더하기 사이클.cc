#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a;
	int b, c;
	int d;
	int count = 0;
	int e;
	int num;
	scanf(" %d", &a);
	num = a;
	while (1) {
		if (a < 10)
			b = 0;
		else
			b = a / 10;
		c = a % 10;
		e = (b + c)%10;
		d = c * 10 + e;
		count++;
		if (num == d) {
			printf("%d", count);
			return 0;
		}
		a = d;
	}
}