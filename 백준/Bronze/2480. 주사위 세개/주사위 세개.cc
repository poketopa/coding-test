#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>


int main() {
	int a, b, c;
		scanf(" %d %d %d", &a, &b, &c);
		int count = 0;
		int big = 0;
		int same;
		if (a == b) {
			count++;
			same = a;
		}
		if (b == c) {
			count++;
			same = b;
		}
		if (a == c) {
			count++;
			same = a;
		}
		if (count == 0) {
			if (a >= b)
				big = a;
			else
				big = b;
			if (big <= c)
				big = c;
			printf("%d", big * 100);
		}
		if (count == 1) {
			printf("%d", 1000 + 100 * same);
		}
		if (count == 3) {
			printf("%d", 10000 + same * 1000);
		}
}