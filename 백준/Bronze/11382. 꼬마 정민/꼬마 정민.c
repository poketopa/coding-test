#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>


int main() {
	long long a, b, c;
	scanf("%lld %lld %lld", &a ,&b ,&c);
	long long d = a + b + c;
	printf("%lld", d);
	return 0;
}