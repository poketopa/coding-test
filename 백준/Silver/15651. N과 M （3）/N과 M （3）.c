#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int a,b;
    scanf(" %d %d",&a,&b);
    int *arr=malloc(sizeof(int)*b);
    int lastIndex=b-1;
    int index=lastIndex-1;
    if(b==1){
        for(int i=1;i<a;i++){
            printf("%d\n",i);
        }
        printf("%d",a);
        return 0;
    }
    for(int i=0;i<b;i++){
        arr[i]=1;
    }

    while(1){
        for(int i=0;i<b;i++) {
            printf("%d ", arr[i]);
        }
        arr[lastIndex]++;
        if(arr[lastIndex]==a+1){
            while(arr[index]==a){
                index--;
                if(index==-1)
                    return 0;
            }
            arr[index]++;
            while(index!=lastIndex){
                index++;
                arr[index]=1;
            }
            index--;
        }
        printf("\n");
    }
}