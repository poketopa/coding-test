#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	int a;
	unsigned long long sum = 0;
	scanf(" %d", &a);
	unsigned long long* dis = malloc(sizeof(unsigned long long) * (a - 1));
	unsigned long long* price = malloc(sizeof(unsigned long long) * a);
	for (int i = 0;i < a - 1;i++) {
		scanf(" %llu", &dis[i]);
	}
	for (int i = 0;i < a ;i++) {
		scanf(" %llu", &price[i]);
	}
	int now = 0;
	int minPriceIndex;
	if (a == 2) {
		printf("%llu", price[0] * dis[0]);
		return 0;
	}

	while (1) {
		for (int i = now + 1;i < a - 1;i++) {
			if (price[now] > price[i]) {
				minPriceIndex = i;
				break;
			}
			if (i == a - 2)
				minPriceIndex = a - 1;
		}
		if (now == a - 2){
			minPriceIndex = a - 1;
		}
		for (int i = now;i < minPriceIndex;i++) {
			sum += price[now]*dis[i];
		}
		if (minPriceIndex == a - 1) {
			printf("%llu", sum);
			return 0;
		}
		now = minPriceIndex;
	}
}