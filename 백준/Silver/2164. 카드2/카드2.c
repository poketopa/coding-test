#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main() {
	int t = 0;
	int two = 2;
	int a;
	scanf(" %d", &a);
	if (a == 1) {
		printf("1");
	}
	else {
		for (int i = 0;i < a - 1;i++) {
			if (t == two) {
				t = 2;
				two = two*2;
			}
			else
				t += 2;
		}
		printf("%d", t);
	}
}