#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	int a;
	scanf(" %d", &a);
	int b;
	for (int i = 0;i < a;i++) {
		for (int j = 0;j < a;j++) {
			b = 3;
			while (b != 19683) {
				if (((b / 3) <= (i % b) && (i % b) <= (b / 3) * 2 - 1) && ((b / 3) <= (j % b) && (j % b) <= (b / 3) * 2 - 1)) {
					printf(" ");
					break;
				}
				else
					b = b * 3;
			}
			if (b == 19683) {
				printf("*");
			}
		}
		printf("\n");
	}
}
