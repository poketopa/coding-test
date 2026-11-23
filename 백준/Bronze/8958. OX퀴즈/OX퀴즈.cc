#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a;
	char b[80] = " ";
	int count;
	int score;
	int c = 0;
	char o = 'O';
	scanf(" %d", &a);
	for (int i = 0;i < a;i++) {
		scanf(" %s", b);
		count = 0;
		score = 1;
		while (b[c] != NULL) {
			if (b[c] == o) {
				if (c == 0) {
					count += score;
				}
				else {
					if (b[c - 1] == o) {
						score++;
						count += score;
					}
					else {
						count += score;
					}
				}
			}
			else {
				score = 1;
			}
			c++;
		}
		printf("%d\n", count);
		c = 0;
	}
}