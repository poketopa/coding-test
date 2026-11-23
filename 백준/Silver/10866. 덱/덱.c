#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int arr[30000];

int main() {
    int a;
    char s[20];
    int num;
    int front=15000,back=14999;
    scanf(" %d",&a);
    for(int i=0;i<a;i++){
        scanf(" %s",s);
        if(!strcmp(s,"push_front")){
            scanf(" %d",&num);
            arr[front++]=num;
        }
        if(!strcmp(s,"push_back")){
            scanf(" %d",&num);
            arr[back--]=num;
        }
        if(!strcmp(s,"pop_front")){
            if(front-back==1)
                printf("-1");
            else
                printf("%d",arr[--front]);
            if(i==a-1)
                return 0;
            printf("\n");
        }
        if(!strcmp(s,"pop_back")){
            if(front-back==1)
                printf("-1");
            else
                printf("%d",arr[++back]);
            if(i==a-1)
                return 0;
            printf("\n");
        }
        if(!strcmp(s,"size")){
            printf("%d",front-back-1);
            if(i==a-1)
                return 0;
            printf("\n");
        }
        if(!strcmp(s,"empty")){
            if(front-1==back)
                printf("1");
            else
                printf("0");
            if(i==a-1)
                return 0;
            printf("\n");
        }
        if(!strcmp(s,"front")){
            if(front-back==1)
                printf("-1");
            else
                printf("%d",arr[front-1]);
            if(i==a-1)
                return 0;
            printf("\n");
        }
        if(!strcmp(s,"back")){
            if(front-back==1)
                printf("-1");
            else
                printf("%d",arr[back+1]);
            if(i==a-1)
                return 0;
            printf("\n");
        }
    }

}