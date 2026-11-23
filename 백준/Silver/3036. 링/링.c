#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

int main() {
	int a;
	scanf(" %d", &a);
	int* num = malloc(sizeof(int) * a);
	for (int i = 0;i < a;i++) {
		scanf(" %d", &num[i]);
	}
	int temp = num[0];
	int max;
	for (int i = 1;i < a;i++) {
		for (int j = num[i];j > 0;j--) {
			if (temp % j == 0 && num[i] % j == 0) {
				max = j;
				break;
			}
		}
		if (i == a - 1) {
			printf("%d/%d", temp / max,num[i]/max);
			return 0;
		}
		printf("%d/%d\n", temp / max, num[i] / max);
	}
}