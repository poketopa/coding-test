#include <stdio.h>

int main() {
	int a,b;
	scanf(" %d %d", &a, &b);
	if (a>0&&b>0) {
		printf("1");
	}
	else if (a>0&&b<0) {
		printf("4");
	}
	else if (a < 0 && b < 0) {
		printf("3");
	}
	else {
		printf("2");
	}
}