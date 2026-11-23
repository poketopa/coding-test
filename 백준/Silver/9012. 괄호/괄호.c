#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int main() {
	int a;
	char b[50];
	scanf(" %d", &a);
	int k;
	int count1;
	int sum = 0;
	for(int i=0;i<a;i++){
		for (int j = 0;j < 50;j++) {
			b[j] == 0;
		}
		scanf(" %s", b);


		k = 0;
		count1 = 0;
		while (b[k] != 0) {
			if (b[k] == '(')
				count1++;
			else if (b[k] == ')')
				count1--;
			if (count1 < 0) {
				break;
			}
			k++;
		}
		if (count1 == 0)
			printf("YES\n");
		else
			printf("NO\n");
	}
}