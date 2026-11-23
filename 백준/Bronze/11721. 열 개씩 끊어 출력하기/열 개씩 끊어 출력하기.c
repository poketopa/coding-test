#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

int main() {
	
	char s[101];
	scanf(" %s", s);
	for (int i = 0;i < strlen(s) ;i++) {
		if (i % 10 == 0&&i!=0)
			printf("\n");
		printf("%c", s[i]);
	}
}