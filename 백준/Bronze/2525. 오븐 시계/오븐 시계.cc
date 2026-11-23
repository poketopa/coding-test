#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>


int main() {
	int hour;
	int minute;
	int time;
	int sum;
	scanf(" %d %d", &hour, &minute);
	scanf(" %d", &time);
	sum = minute + time;
	if (sum >= 60) {
		while (sum >= 60) {
			hour++;
			sum -= 60;
		}
		if (hour >= 24)
			hour -= 24;
		printf("%d %d", hour, sum);
	}
	else
		printf("%d %d", hour, sum);
}