#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a;
	char b[101]={0};
	int count = 0;
	int d[26]={0};
	int e = 0;
	scanf(" %d", &a);
	for (int i= 0;i < a;i++) {
		scanf("%s", b);
		for (int j = 0;b[j] != 0;j++) {
			if (d[b[j] - 97] != 0) {
				if (b[j] != b[j - 1]) {
					e++;
				}
			}
			d[b[j] - 97]++;
		}
		if (e == 0)
			count++;
		e = 0;
		for (int k = 0;k < 26;k++) {
			d[k] = 0;
		}
		for (int k = 0;k < 101;k++) {
			b[k] = 0;
		}
	}
	printf("%d", count);
}