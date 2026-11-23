#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int odd(int a) {
	int count = 0;
	for (int i = 2;i < a;i++) {
		if (a % i == 0) {
			count++;
		}
	}
	if (count == 0)
		return 1;
	else
		return 0;
}

int main() {
	int testCase;
	int a;
	int b;;
	scanf(" %d", &testCase);
	for (int i = 0;i < testCase;i++) {
		scanf(" %d", &a);
		b = a / 2;
		for (int j = b;j > 1;j--) {
			if (odd(j) == 1) {
				if (odd(a - j) == 1) {
					printf("%d %d\n", j, a - j);
					break;
				}
				else
					continue;
			}
		}
	}
}