#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	char a[20];
	int count = 0;
	scanf("%s", a);
	for (int i = 0;i < a[i] != NULL;i++) {
		if (a[i] <= 79) {
			count += ((a[i] - 62) / 3) + 2;
		}
		else if (a[i] >= 80 && a[i] <= 83) {
			count += 8;
		}
		else if (a[i] >= 84 && a[i] <= 86) {
			count += 9;
		}
		else if (a[i] >= 87 && a[i] <= 90) {
			count += 10;
		}
	}
	printf("%d", count);
}