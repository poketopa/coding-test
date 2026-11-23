#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main() {
	int testCase;
	scanf(" %d", &testCase);
	int x1, y1, r1, x2, y2, r2;
	double length;
	for (int i = 0;i < testCase;i++) {
		scanf(" %d %d %d %d %d %d", &x1, &y1, &r1, &x2, &y2, &r2);
		length = sqrt(pow((x1 - x2), 2) + pow((y1 - y2), 2));
		if (length==0 && r1 == r2) {
			printf("-1\n");
		}
		else if (length == 0 && r1 != r2) {
			printf("0\n");
		}
		else if ((r1 + r2) < length) {
			printf("0\n");
		}
		else if (abs(r1 - r2) > length) {
			printf("0\n");
		}
		else if ((r1 + r2) == length) {
			printf("1\n");
		}
		else if (length == abs(r1 - r2)) {
			printf("1\n");
		}
		else  {
			printf("2\n");
		}
	}
}