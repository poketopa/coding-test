#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int main() {
	int a;
	scanf(" %d", &a);
	int* rank = malloc(sizeof(int) * a);
	int* height = malloc(sizeof(int) * a);
	int* weight = malloc(sizeof(int) * a);
	for (int i = 0;i < a;i++)
		rank[i] = 1;
	for (int i = 0;i < a;i++)
		scanf(" %d %d", &weight[i], &height[i]);
	for (int i = 0;i < a;i++) {
		for (int j = 0;j < a;j++) {
			if ((weight[i] > weight[j] && height[i] > height[j]))
				rank[j]++;
		}
	}
	for (int i = 0;i < a;i++) {
		printf("%d ", rank[i]);
	}
}
