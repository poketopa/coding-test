#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	int a;
	int b;
	scanf(" %d %d", &a, &b);
	int* arr = malloc(sizeof(int) * a);
	for (int i = 0;i < a;i++) {
		scanf(" %d", &arr[i]);
	}
	int i;
	int start = a - 1;
	int sum = 0;
	int count = 0;
	while (arr[start] > b)
		start--;
	if (arr[start] == b) {
		printf("1");
		return 0;
	}
	i = start;
	while (1) {
		while (sum + arr[i] <= b) {
			if (sum + arr[i] == b) {
				printf("%d", count + 1);
				return 0;
			}
			else {
				sum += arr[i];
				count++;
			}
		}
		if (i == 0) {
			i = --start;
			continue;
		}
		i--;
	}
}