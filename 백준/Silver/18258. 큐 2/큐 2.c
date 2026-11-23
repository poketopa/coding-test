#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int arr[2000001];

int main() {
	char push[] = "push";
	char pop[] = "pop";
	char size[] = "size";
	char empty[] = "empty";
	char front[] = "front";
	char back[] = "back";
	char a[10];
	int num;
	int pushNum;
	int backNum=0;
	int frontNum = 0;
	scanf(" %d", &num);
	for (int i = 0;i < num;i++) {
		scanf(" %s", a);
		if (!strcmp(a,push)) {
			scanf(" %d", &pushNum);
			arr[backNum] = pushNum;
			backNum++;
		}
		if (!strcmp(a, pop)) {
			if (backNum == frontNum) {
				printf("-1\n");
				continue;
			}
			printf("%d\n", arr[frontNum]);
			frontNum++;
		}
		if (!strcmp(a, size)) {
			printf("%d\n",backNum-frontNum);
		}
		if (!strcmp(a, empty)) {
			if (backNum == frontNum) {
				printf("1\n");
			}
			else
				printf("0\n");
		}
		if (!strcmp(a, front)) {
			if (backNum == frontNum) {
				printf("-1\n");
				continue;
			}
			printf("%d\n", arr[frontNum]);
		}
		if (!strcmp(a, back)) {
			if (backNum == frontNum) {
				printf("-1\n");
				continue;
			}
			printf("%d\n", arr[backNum-1]);
		}

	}
}