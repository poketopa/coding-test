#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

int main() {
	long a;
	scanf(" %ld", &a);
	long* arr = malloc(sizeof(long) * a);
	for (int i = 0;i < a;i++) {
		scanf(" %ld", &arr[i]);
	}
	long max = 0;
	long min = INT_MAX;
	for (int i = 0;i < a;i++) {
		if (arr[i] > max) {
			max = arr[i];
		}
		if (arr[i] < min) {
			min = arr[i];
		}
	}
	if (min % 2 == 0) {
		printf("%ld", max * 2);
	}
	else {
		printf("%ld", max * min);
	}
}