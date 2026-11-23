#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a;
	char b[100]={0};
	int sum = 0;
	int d;
	scanf(" %d", &a);
	scanf(" %s", b);
	for (int i = 0;i < a;i++) {
		d = b[i];
		sum += (d-48);
	}
	printf("%d", sum);
}