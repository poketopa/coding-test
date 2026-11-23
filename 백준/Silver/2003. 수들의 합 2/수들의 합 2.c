#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int main() {
	int a, b;
	scanf(" %d %d", &a, &b);
	int* arr = malloc(sizeof(int) * a);
	for (int i = 0;i < a;i++) {
		scanf(" %d", &arr[i]);
	}
	if (a == 1) {
		if (arr[0] == b) {
			printf("1");
			return 0;
		}
		else {
			printf("0");
			return 0;
		}
	}
	int count = 0;
	int start = 0;
	int end = b;
	int sum;
	int temp;
	for (int i = 0;i < a;i++) {
		sum = 0;
		temp = i;
		while (1) {
			sum += arr[temp];
			if (sum > b) {
				break;;
			}
			else if (sum == b) {
				count++;
				break;
			}
			else {
				temp++;
				if (temp == a) {
					break;
				}
			}
		}
	}
	printf("%d", count);
}
