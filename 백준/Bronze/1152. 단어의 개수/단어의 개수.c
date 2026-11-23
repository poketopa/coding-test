#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

char sen[1000000];

int main() {
	int count =0;
	gets(sen);
	if (sen[0] == ' ') {
		if (sen[1] == NULL) {
			printf("0");
			return 0;
		}
	}
	for (int i = 0;sen[i] != NULL;i++) {
		if (sen[i] == ' ') {
			if (i == 0) {
				continue;
			}
			else if (sen[i + 1] == NULL) {
				break;
			}
			else {
				count++;
			}
		}
	}
	printf("%d", count+1);
}