#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

char sen[1000000];

int main() {
	int a[26]={0};
	int big = -1;
	int count = 0;
	char alpha;
	scanf(" %s", sen);
	for (int i= 0;sen[i] != NULL;i++) {
		if (sen[i] <= 'Z') {
			sen[i] += 32;
		}
		a[sen[i] - 97]++;
	}
	for (int i = 0;i < 26;i++) {
		if (big < a[i]) {
			big = a[i];
			alpha = (i + 65);
		}
	}
	for (int i = 0;i < 26;i++) {
		if (big == a[i])
			count++;
	}
	if (count == 1)
		printf("%c", alpha);
	else
		printf("?");
}