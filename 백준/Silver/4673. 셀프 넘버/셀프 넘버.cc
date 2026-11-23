#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int b;
	int c;
	int a[10001] = { 0 };
	int temp;
	for (int i = 1;i <= 10000;i++) {
		c = i;
		if (a[i] == 0) {
			printf("%d\n", i);
		}
		temp = i;
		while (temp != 0) {
			b = temp % 10;
			c += b;
			temp = temp / 10;
		}
		if(c<=10000)
			a[c]++;
	}
}