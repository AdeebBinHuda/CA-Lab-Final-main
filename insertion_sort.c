#include<stdio.h>
int main()
{
     int arr[]={8,5,1,3,9,34};
     int i,value ,hole;
     for(i=1;i<6;i++)
     {
          value=arr[i];
          hole=i;
          while(hole>0&&arr[hole-1]>value)
          {
               arr[hole]=arr[hole-1];
               hole--;
          }
          arr[hole]=value;
     }
     printf("Sorted array:\n\n");
     for(i=0;i<=5;i++)
     {
          printf(" %d",arr[i]);
     }
     printf("\n\n");
     return 0;
}
