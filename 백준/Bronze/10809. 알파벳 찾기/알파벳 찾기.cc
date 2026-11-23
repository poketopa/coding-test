#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	char a[100];
	scanf(" %s", a);
	int b[26];
	for (int i = 0;i < 26;i++) {
		b[i] = -1;
	}
	int i = 0;
	int number;
	while (a[i] != NULL) {
		number = a[i] - 97;
		if(b[number]==-1)
			b[number] = i;
		i++;
	}
	for (int i = 0;i < 26;i++) {
		printf("%d ", b[i]);
	}
}