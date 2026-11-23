#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	int stack[10000];
	int now = -1;
	int a;
	int temp;
	char com[10]="";
	scanf(" %d", &a);
	for (int i = 0; i < a; i++) {
		scanf(" %s", &com);
		if (!strcmp(com,"push")) {
			scanf(" %d", &temp);
			now++;
			stack[now] = temp;
		}
		else if (!strcmp(com, "pop")) {
			if (now == -1) {
				printf("-1\n");
			}
			else {
				printf("%d\n", stack[now]);
				now--;
			}
		}
		else if (!strcmp(com, "size")) {
			printf("%d\n", (now + 1));
		}
		else if (!strcmp(com, "empty")) {
			if (now == -1)
				printf("1\n");
			else
				printf("0\n");
		}
		else if (!strcmp(com, "top")) {
			if (now == -1) {
				printf("-1\n");
			}
			else {
				printf("%d\n", stack[now]);
			}
		}
	}
}