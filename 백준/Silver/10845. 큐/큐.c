#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

int main() {
	int a;
	char b[10];
	int c;
	int arr[10000];
	int front = 0;
	int back = 0;
	scanf(" %d", &a);
	for (int i = 0;i < a;i++) {
		scanf(" %s", b);
		if (!strcmp(b, "push")) {
			scanf(" %d", &arr[front]);
			front++;
		}
		if (!strcmp(b, "pop")) {
			if (front == back) {
				printf("-1");
				if (i == a - 1) {
					return 0;
				}
				printf("\n");
				continue;
			}
			printf("%d", arr[back]);
			if (i == a - 1) {
				return 0;
			}
			printf("\n");
			back++;
		}
		if (!strcmp(b, "size")) {
			printf("%d", front - back);
			if (i == a - 1) {
				return 0;
			}
			printf("\n");
		}
		if (!strcmp(b, "empty")) {
			if (front == back) {
				printf("1");
				if (i == a - 1) {
					return 0;
				}
				printf("\n");
			}
			else {
				printf("0");
				if (i == a - 1) {
					return 0;
				}
				printf("\n");
			}
		}
		if (!strcmp(b, "back")) {
			if (front == back) {
				printf("-1");
				if (i == a - 1) {
					return 0;
				}
				printf("\n");
				continue;
			}
			printf("%d", arr[front - 1]);
			if (i == a - 1) {
				return 0;
			}
			printf("\n");
		}
		if (!strcmp(b, "front")) {
			if (front == back) {
				printf("-1");
				if (i == a - 1) {
					return 0;
				}
				printf("\n");
				continue;
			}
			printf("%d", arr[back]);
			if (i == a - 1) {
				return 0;
			}
			printf("\n");
		}
	}

}