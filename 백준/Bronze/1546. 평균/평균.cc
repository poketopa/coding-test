#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a;
	double big=0;
	scanf(" %d", &a);
	int b[1000]={0};
	for (int i = 0;i < a;i++) {
		scanf(" %d", &b[i]);
	}
	for (int i = 0;i < a;i++) {
		if (big < b[i])
			big = b[i];
	}
	double sum = 0;
	for (int i = 0;i < a;i++) {
		sum += (b[i] / big * 100);
	}
	printf("%f", sum / a);
}