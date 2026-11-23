#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int b[1000000] = { 0 };

int main() {
	int a;
	scanf(" %d", &a);
	for (int i = 0;i < a;i++) {
		scanf(" %d", &b[i]);
	}
	int big = -1000000; 
	int min = 1000000;
	for (int i = 0;i < a;i++) {
		if (big <= b[i]) {
			big = b[i];
		}
		if (min >= b[i]) {
			min = b[i];
		}
	}
	printf("%d %d", min, big);
}