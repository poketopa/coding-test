#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>


int main() {
	char a[4];
	char b[4];
	char c;
	scanf("%s %s", a, b);
	c = a[0];
	a[0] = a[2];
	a[2] = c;
	c = b[0];
	b[0] = b[2];
	b[2] = c;
	if (a[0] > b[0]) {
		printf("%s", a);
	}
	else if (a[0] < b[0]) {
		printf("%s", b);
	}
	else {
		if (a[1] > b[1]) {
			printf("%s", a);
		}
		else if (a[1] < b[1]) {
			printf("%s", b);
		}
		else {
			if (a[2] > b[2]) {
				printf("%s", a);
			}
			else if (a[2] < b[2]) {
				printf("%s", b);
			}
		}
	}
}