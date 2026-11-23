#include <stdio.h>

int main(){
	int stu[1001];
	int stuNum, cut;
	int swap;
	scanf(" %d %d",&stuNum,&cut);
	for(int i=0;i<stuNum;i++){
		scanf(" %d",&stu[i]);
	}
	for(int i=stuNum-1;i>=0;i--){
		for(int j=0;j<i;j++){
			if(stu[j]<stu[j+1]){
				swap=stu[j];
				stu[j]=stu[j+1];
				stu[j+1]=swap;
			}
		}
	}
	printf("%d",stu[cut-1]);
}