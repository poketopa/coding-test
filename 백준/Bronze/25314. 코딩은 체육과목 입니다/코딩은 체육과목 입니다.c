#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>


int main() {
	int a;
	scanf("%d", &a);
	int b = a / 4;
	for (int i = 0; i < b; i++) {
		printf("long ");
	}
	printf("int");
}