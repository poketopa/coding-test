#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main() {
	char a[10001] = { 0 };
	char b[10001] = { 0 };
	int sum[10002] = { 0 };
	char swap;
	scanf(" %s %s", a, b);
	for (int i = 0;i < strlen(a) / 2;i++) {
		swap = a[i];
		a[i] = a[strlen(a) - i - 1];
		a[strlen(a) - i - 1] = swap;
	}
	for (int i = 0;i < strlen(b) / 2;i++) {
		swap = b[i];
		b[i] = b[strlen(b) - i - 1];
		b[strlen(b) - i - 1] = swap;
	}
	
	if (strlen(a) > strlen(b)) {
		for (int i = 0;i < strlen(b);i++) {
			sum[i] += a[i] + b[i] - 96;
			if (sum[i] >= 10) {
				sum[i+1]++;
				sum[i] -= 10;
			}
		}
		for (int i = strlen(b);i < strlen(a);i++) {
			sum[i] += a[i]-48;
			if (sum[i] >= 10) {
				sum[i + 1]++;
				sum[i] -= 10;
			}
		}
	}
	else {
		for (int i = 0;i < strlen(a);i++) {
			sum[i] += a[i] + b[i]-96;
			if (sum[i] >= 10) {
				sum[i + 1]++;
				sum[i] -= 10;
			}
		}
		for (int i = strlen(a);i < strlen(b);i++) {
			sum[i] += b[i] - 48;
			if (sum[i] >= 10) {
				sum[i + 1]++;
				sum[i] -= 10;
			}
		}
	}
	if (strlen(a) > strlen(b)) {
		if (sum[strlen(a)]==1) {
			for (int i = strlen(a);i >= 0;i--) {
				printf("%d", sum[i]);
			}
		}
		else {
			for (int i = strlen(a)-1;i >= 0;i--) {
				printf("%d", sum[i]);
			}
		}
	}
	else {
		if (sum[strlen(b)] == 1) {
			for (int i = strlen(b);i >= 0;i--) {
				printf("%d", sum[i]);
			}
		}
		else {
			for (int i = strlen(b) - 1;i >= 0;i--) {
				printf("%d", sum[i]);
			}
		}
	}
}