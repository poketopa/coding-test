#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a;
	int b;
	int oddCount;
	int count;
	for(;;){
		oddCount = 0;
		scanf(" %d", &a);
		b = 2 * a;
		if (a == 0)
			return 0;
		else if (a == 1) {
			printf("1\n");
			continue;
		}
		for (int i = a+1;i < b;i++) {
			if (i % 2 == 0)
				continue;
			count = 0;
			for (int j = 2;j * j <= i;j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0)
				oddCount++;
		}
		printf("%d\n", oddCount);
	}
}