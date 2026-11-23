#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main() {
	char a[11];
	scanf(" %s", a);
	char c;
	for (int i = strlen(a) - 1;i>=0;i--) {
		for (int j = 0;j < i;j++) {
			if (a[j] < a[j + 1]) {
				c = a[j];
				a[j] = a[j + 1];
				a[j + 1] = c;
			}
		}
	}
	printf("%s", a);
}