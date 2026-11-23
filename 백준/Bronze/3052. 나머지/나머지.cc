#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a[10];
	int count = 0;
	int b=0;
	for (int i = 0;i < 10;i++) {
		scanf(" %d", &a[i]);
	}
	for (int i = 0;i < 10;i++) {
		a[i] = a[i] % 42;
	}
	for (int i = 0;i < 10;i++) {
		for (int j = 0;j <= i;j++) {
			if (a[j] == a[i])
				count++;
		}
		if (count == 1)
			b++;
		count = 0;
	}
	printf("%d", b);
}