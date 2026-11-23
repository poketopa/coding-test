#include <cstdio>
#pragma warning(disable:4996

int main() {
	int a;
	scanf(" %d", &a);
	if (a == 1) {
		printf("1");
		return 0;
	}
	int temp = 0;
	int sum=1;
	int room = 1;
	while (sum < a) {
		temp += 6;
		sum += temp;
		room++;
	}
	printf("%d", room);
}