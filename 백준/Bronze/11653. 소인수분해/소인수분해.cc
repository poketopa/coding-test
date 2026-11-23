#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a;
	int number;
	scanf(" %d", &a);
	if (a == 1) {
		return 0;
	}
	number = a;
	for (int i = 0;i < a;i++) {
		for (int j = 2;j <= a;j++) {
			if (number % j == 0) {
				printf("%d\n", j);
				number = (number / j);
				if (number == 1) {
					return 0;
				}
				break;
			}
			else
				continue;
		}
	}
}