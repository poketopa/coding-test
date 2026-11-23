#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main() {
	int a, b;
	int num[100];
	int num1 = 0;
	int num2 = 1;
	int num3 = 2;
	int sum = 0;
	int near;
	int nearest = 1000000;
	int sumNum;
	scanf(" %d %d", &a, &b);
	for (int i = 0;i < a;i++) {
		scanf(" %d", &num[i]);
	}
	while (1) {
		sum = (num[num1] + num[num2] + num[num3]);
		if (sum <= b) {
			near = abs(sum - b);
			if (near < nearest) {
				nearest = near;
				sumNum = sum;
			}
		}
		if (num3 != a - 1) {
			num3++;
		}
		else {
			if (num2 != a - 2) {
				num2++;
				num3 = num2 + 1;
			}
			else {
				if (num1 != a - 3) {
					num1++;
					num2 = num1 + 1;
					num3 = num2 + 1;
				}
				else {
					break;
				}
			}
		}
	}
	printf("%d", sumNum);
}