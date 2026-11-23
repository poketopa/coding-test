#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>


int main() {
	int a;
	int b;
	int count;
	scanf(" %d %d", &a, &b);
	for (int i = a;i <= b;i++) {
		count = 0;
		for (int j = 1;j*j <= i;j++) {
			if (i % j == 0) {
				count++;
			}
		}
		if (count == 1) {
			if(i!=1)
				printf("%d\n", i);
		}
	}
}