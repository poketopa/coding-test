#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a;
	scanf("%d", &a);
	int b[1000];
	int c;
	for (int i = 0;i < a;i++) {
		scanf("%d", &b[i]);
	}
	for (int i = a-1;i >0;i--) {
		for (int j = 0;j < i;j++) {
			if (b[j] > b[j + 1]) {
				c = b[j];
				b[j] = b[j + 1];
				b[j + 1] = c;
			}
		}
	}
	for (int i = 0;i < a;i++) {
		printf("%d\n", b[i]);
	}
}