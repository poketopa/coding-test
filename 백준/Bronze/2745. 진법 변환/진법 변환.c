#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>

int main() {
	char ch[100];
	int b;
	scanf("%s %d", ch, &b);
	int length;
	int i = 0;
	long long sum=0;
	int value;
	long long temp;
	while (ch[i] != NULL) {
		i++;
	}
	length = i;
	for (int j = 0; j < length; j++) {
		if (ch[j] >= 'a') {
			value = ch[j] - 87;
		}
		else if (ch[j] >= 'A') {
			value = ch[j] - 55;
		}
		else 
			value = ch[j]- 48;
		temp=(long long)(pow(b, (length - j - 1)));
		sum += temp * value;
	}
	printf("%lld", sum);
}