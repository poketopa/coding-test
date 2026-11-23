#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	char a[1000];
	int b;
	int c;
	scanf(" %d", &b);
	for (int i = 0;i < b;i++) {
		scanf(" %d %s", &c,a);
		for (int j = 0;a[j] != NULL;j++) {
			for (int k = 0;k < c;k++) {
				printf("%c", a[j]);
			}
		}
		printf("\n");
	}
}