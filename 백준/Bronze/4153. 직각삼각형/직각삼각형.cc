#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a, b, c;
	while (1) {
		scanf(" %d %d %d", &a, &b, &c);
		if (a == 0 || b == 0 || c == 0)
			return 0;
		int num;
		if (a > b) {
			num = b;
			b = a;
			a = num;
		}
		if (b > c) {
			num = c;
			c = b;
			b = num;
		}
		if ((c * c) == (a * a) + (b * b))
			printf("right\n");
		else
			printf("wrong\n");
	}
}