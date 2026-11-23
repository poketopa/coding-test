#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	char arr[100];
	int num;
	int sum = 0;
	int sum1 = 0;
	int check;
	int i = 0;
	scanf(" %s", arr);
	int len = strlen(arr);
	sum += atoi(&arr[0]);
	for (;;) {
		while (arr[i] != '+' && arr[i] != '-') {
			i++;
			if (i == len) {
				printf("%d", sum);
				return 0;
			}
		}

		if (arr[i] == '+') {
			i++;
			sum += atoi(arr + i);
		}
		if (arr[i] == '-') {
			i++;
			sum -= atoi(arr + i);
			for (;;) {
				while (arr[i] != '+' && arr[i] != '-') {
					i++;
					if (i == len) {
						printf("%d", sum);
						return 0;
					}
				}
				i++;
				sum -= atoi(arr + i);
			}
		}
	}
}