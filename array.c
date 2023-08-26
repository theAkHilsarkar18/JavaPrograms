#include<stdio.h>


int main(int argc, char const *argv[])
{
    int length;
    printf("enter length of array : ");
    scanf("%d",&length);

    int a[length];

    for(int i=0; i<length; i++)
    {
        printf("enter value in a[%d] : ",i);
        scanf("%d",&a[i]);
    }
     printf("\n\n");
    for(int i=0; i<length; i++)
    {
        printf("a[%d] = %d",i,a[i]);
        printf("\n");
    }
    return 0;
}
