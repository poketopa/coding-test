#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int x1, x2, x3, y1, y2, y3;
	scanf(" %d %d", &x1, &y1);
	scanf(" %d %d", &x2, &y2);
	scanf(" %d %d", &x3, &y3);
	int x, y;
	if (x1 == x2) {
		x = x3;
	}
	else if (x2 == x3) {
		x = x1;
	}
	else
		x = x2;
	if (y1 == y2) {
		y = y3;
	}
	else if (y2 == y3) {
		y = y1;
	}
	else
		y = y2;
	printf("%d %d", x, y);
}