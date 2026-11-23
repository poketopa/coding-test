#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a;
	double sum;
	int e;
	int b[1000];
	int count;
	scanf(" %d", &e);
	for (int i = 0;i < e;i++) {
		sum = 0;
		count = 0;
		scanf(" %d", &a);
		for (int j = 0;j < a;j++) {
			scanf(" %d", &b[j]);
			sum += b[j];
		}
		sum = (sum / a);
		for (int j = 0;j < a;j++) {
			if (sum < b[j]) {
				count++;
			}
		}
		double asd = a;
		double dfg = count;
		double temp = dfg / asd;
		printf("%.3f%%\n", temp*100);
	}
}