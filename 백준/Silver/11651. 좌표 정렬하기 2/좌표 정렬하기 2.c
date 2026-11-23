#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

typedef struct {
	int x;
	int y;
}POINT;

int static compare(POINT* first, POINT* second)
{
	if (first->y > second->y)
		return 1;
	else if (first->y < second->y)
		return -1;
	else {
		if (first->x > second->x)
			return 1;
		else if (first->x < second->x)
			return -1;
	}
	return 0;
}

int main() {
	int dotNum;
	POINT arr[100000];
	int start;
	scanf(" %d", &dotNum);
	for (int i = 0;i < dotNum;i++) {
		scanf("%d %d", &arr[i].x, &arr[i].y);
	}
	qsort(arr, dotNum, sizeof(POINT), compare);
	for (int i = 0;i < dotNum;i++) {
		printf("%d %d\n", arr[i].x, arr[i].y);
	}
}