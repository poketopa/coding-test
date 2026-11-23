#include <cstdio>


int main() {
	int a, b, c;
	scanf(" %d %d %d",&a, &b, &c);
	int plus = c - b;
	if (plus <= 0) {
		printf("-1");
	}
	else {
		printf("%d", (a / plus) + 1);
	}
	return 0;
}