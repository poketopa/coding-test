#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>


int main() {
	int a[100];
	int b;
	scanf("%d", &b);
	for (int i = 0; i < b; i++) {
		scanf("%d", &a[i]);
	}
	int c;
	scanf("%d", &c);
	int sum = 0;
	for (int i = 0; i < b; i++) {
		if (a[i] == c) sum++;
	}
	printf("%d",sum);
}