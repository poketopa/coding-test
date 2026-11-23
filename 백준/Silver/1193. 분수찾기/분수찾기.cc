#include <stdio.h>

int main() {
	int a;
	scanf(" %d", &a);
	int temp = 1;
	int sum = 0;
	while (1) {
		sum += temp;
		if (sum >= a) {
			if (temp % 2 == 1) {
				printf("%d/%d", (sum - a + 1), (temp - sum + a));
				return 0;
			}
			else {
				printf("%d/%d", (temp - sum + a),(sum - a + 1) );
				return 0;
			}
		}
		temp++;
	}
}