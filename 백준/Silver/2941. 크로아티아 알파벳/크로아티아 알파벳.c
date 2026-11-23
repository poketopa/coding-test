#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	char a[101];
	scanf("%s", a);
	int count = 0;
	for (int i = 0;a[i] != NULL;i++) {
		if (a[i] == 'c') {
			if (a[i + 1] == '=')
				i++;
			else if (a[i + 1] == '-')
				i++;
		}
		if (a[i] == 'd') {
			if (a[i + 1] == 'z') {
				if (a[i + 2] == '=') {
					i += 2;
				}
			}
			else if (a[i + 1] == '-')
				i++;
		}
		if (a[i] == 'l') {
			if (a[i + 1] == 'j')
				i++;
		}
		if (a[i] == 'n') {
			if (a[i + 1] == 'j')
				i++;
		}
		if (a[i] == 's') {
			if (a[i + 1] == '=')
				i++;
		}
		if (a[i] == 'z') {
			if (a[i + 1] == '=')
				i++;
		}
		count++;
	}
	printf("%d", count);
}