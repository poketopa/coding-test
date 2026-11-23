#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int x, y, w, h;
	int x1, y1;
	scanf(" %d %d %d %d", &x, &y, &w, &h);
	if ((w / 2)+1 > x)
		x1 = x;
	else
		x1 = (w - x);
	if ((h / 2)+1 > y)
		y1 = y;
	else
		y1 = (h - y);
	if (x1 > y1)
		printf("%d", y1);
	else
		printf("%d", x1);
}