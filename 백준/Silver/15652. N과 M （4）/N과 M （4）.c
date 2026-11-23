#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	int a;
	int b;
	int c;
	int k;
	scanf(" %d %d", &a, &b);
	int* arr = malloc(sizeof(int) * b);
	for (int i = 0;i < b;i++) {
		arr[i] = 1;
	}
	while (1) {
		for (int j = 0;j < b;j++) {
			printf("%d ", arr[j]);
		}
		if (arr[0] == a && arr[b - 1] == a)
			return 0;
		arr[b - 1]++;

		c = b - 1;
		if (arr[c] == a + 1) {
			while (arr[c-1] == a) {
				c--;
			}
			arr[c - 1]++;
			for (int i = c;i < b;i++) {
				arr[i] = arr[c-1];
			}
		}
		printf("\n");
	}
}