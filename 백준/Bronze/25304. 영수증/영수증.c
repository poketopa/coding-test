#include <stdio.h>

int main() {
	int price;
	int temp;
	int a,b;
	int sum=0;
	scanf(" %d",&price);
	scanf(" %d",&temp);
	for(int i=0;i<temp;i++){
		scanf(" %d %d",&a,&b);
		sum+=(a*b);
	}
	if(price==sum)
		printf("Yes");
	else
		printf("No");
}