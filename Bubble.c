#include<stdio.h>
int n;
void Bubble(int a[])
{
int i,j,temp;
for(i=0;i<n-1;i++)
{
for(j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
}
int main()
{
int a[10],i;
printf("Enter the limit:");
scanf("%d",&n);
printf("Enter the array element:");
for(i=0;i<n;i++)
scanf("%d",&a[i]);
Bubble(a);
printf("sorted order:");
for(i=0;i<n;i++)
printf("%d\t",a[i]);
return 0;
}



