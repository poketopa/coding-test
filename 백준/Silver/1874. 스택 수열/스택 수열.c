#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char plus[200001];
int plusNum = 0;
int a[200000];

int main() {
	int temp;
	int no = 0;
	for (int i = 0;i < 100000;i++) {
		a[i] = i;
	}
	int num;
	int t=0;
	scanf(" %d", &temp);
	for (int i = 0;i < temp;i++) {
		scanf(" %d", &num);
		while (num > t) {
			if (a[t] == -1) {
				t++;
				continue;
			}
			else {
				plus[plusNum] = '+';
				plusNum++;
				t++;
			}
		}
		while (num < t) {
			if (a[t] == -1) {
				t--;
				continue;
			}
			else {
				a[t] = -1;
				plus[plusNum] = '-';
				plusNum++;
				t--;
			}
		}
		if (a[t] == -1) {
			no++;
		}
		a[t] = -1;
		plus[plusNum] = '-';
		plusNum++;
		while (a[t] == -1) {
			t--;
		}
	}
	if (no > 0) {
		printf("NO");
		return 0;
	}
	int p = 0;
	while (plus[p] != NULL) {
		if (plus[p + 1] == NULL) {
			printf("%c", plus[p]);
			return 0;
		}
		printf("%c\n", plus[p]);
		p++;
	}
}