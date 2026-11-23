#include <stdio.h>

int main() {
	int a,b=0;
	scanf(" %d", &a);
	if (a % 5 == 0) {
		printf("%d", a / 5);
	}
	else {
		while (1) {
			a -= 3;
			b++;
			if (a % 5 == 0) {
				printf("%d", (a / 5) + b);
				return 0;
			}
			else if (a <= 0) {
				printf("-1");
				return 0;
			}
		}
	}
}