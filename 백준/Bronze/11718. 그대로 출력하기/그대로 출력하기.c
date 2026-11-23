#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

int main() {
	
	char s[101];

	while(scanf(" %[^\n]s",s) != EOF) {
		printf("%s\n", s);
	}
}