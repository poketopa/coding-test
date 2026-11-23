#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int odd(int i) {
	int count = 0;
	for (int j = 1;j < i;j++) {
		if (i % j == 0) {
			count++;
		}
	}
	if (count == 1) {
		return 1;
	}
	else {
		return 2;
	}
}

int main() {
	int a;
	int b;
	int count = 0;
	int sum = 0;
	int first = 0;
	int first_num;
	scanf(" %d", &a);
	scanf(" %d", &b);
	for (int i = a;i <= b;i++) {
		if (odd(i) == 1) {
			sum += i;
			first++;
		}
		if (first == 1) {
			first_num = i;
			first++;
		}
	}
	if (first > 0) {
		printf("%d\n%d", sum,first_num);
	}
	else {
		printf("-1");
	}
}