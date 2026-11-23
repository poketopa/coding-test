#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int c[1000000];

int static compare(const void* first, const void* second)
{
	if (*(int*)first > *(int*)second)
		return 1;
	else if (*(int*)first < *(int*)second)
		return -1;
	else
		return 0;
}

int main() {
	int a;
	scanf(" %d", &a);
	for (int i = 0;i < a;i++) {
		scanf(" %d", &c[i]);
	}
	qsort(c, a, sizeof(int), compare);
	for (int i = 0;i < a;i++) {
		printf("%d\n", c[i]);
	}
}