#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int main() {
	int a, b;
	scanf(" %d %d", &a, &b);
	int* arr = malloc(sizeof(int) * a);
	for (int i = 0;i < a;i++)
		arr[i] = i+1;
	int* num = malloc(sizeof(int) * b);
	for (int i = 0;i < b;i++)
		scanf(" %d", &num[i]);
	int point = 0;
	int up, down;
	int upCount,downCount;
	int sum = 0;
	for (int i = 0;i < b;i++) {
		upCount = 0;
		downCount = 0;
		up = point;
		down = point;
		while (arr[up]!=num[i]) {
			up++;
			if (up == a)
				up = 0;
			upCount++;
			while (arr[up] == -1) {
				up++;
				if (up == a)
					up = 0;
			}
		}
		while (arr[down] != num[i]) {
			down--;
			if (down == -1)
				down = a-1;
			downCount++;
			while (arr[down] == -1) {
				down--;
				if (down == -1)
					down = a-1;
			}
		}
		if (upCount > downCount)
			sum += downCount;
		else
			sum += upCount;
		if (i == b - 1)
			break;
		arr[up] = -1;
		while (arr[up] == -1) {
			up++;
			if (up == a)
				up = 0;
		}
		point = up;
	}
	printf("%d", sum);
}
