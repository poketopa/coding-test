#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>


int main() {
	int m, n;
	scanf("%d %d", &m, &n);
	int num[100] = { 0 };
	int a, b, c;
	for (int i = 0; i < n; i++) {
		scanf("%d %d %d", &a, &b, &c);
		for (int j = a; j <= b; j++) {
			num[j - 1] = c;
		}
	}
	for (int i = 0; i < m; i++) {
		printf("%d ", num[i]);
	}
}