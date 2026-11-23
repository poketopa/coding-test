#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int a,b;
    scanf(" %d %d",&a, &b);
    int lastIndex = b-1;
    int index = lastIndex-1;
    int *arr = malloc(sizeof(int)*b);
    for(int i=0;i<b;i++){
        arr[i]=i+1;
    }
    if(a==b){
        for(int i=0;i<a;i++){
            printf("%d ",arr[i]);
        }
        return 0;
    }
    else if(b==1){
        for(int i=1;i<a;i++){
            printf("%d\n",i);
        }
        printf("%d",a);
        return 0;
    }
    else
        while(1){
        for(int i=0;i<b;i++){
            printf("%d ",arr[i]);
        }
        arr[lastIndex]++;
        if(arr[lastIndex]==a+1){
            while(arr[index]==a-lastIndex+index){
                index--;
            }
            arr[index]++;
            if(arr[0]==a-lastIndex){
                arr[lastIndex]--;
                printf("\n");
                for(int i=0;i<b;i++){
                    printf("%d ",arr[i]);
                }
                return 0;
            }
            while(index!=lastIndex){
                index++;
                arr[index]=arr[index-1]+1;
            }
            index--;
        }
        printf("\n");
    }
}