#include<stdio.h>
#include<stdlib.h>
int main()
{
int a[100],i,j,p,t,n;
printf("Enter the total number of elements\n");
scanf("%d",&n);
printf("Enter the array element");
for(i=0;i<n;i++)
scanf("%d",&a[i]);
printf("sorted list\n");
for(i=0;i<n-1;i++)
{
p=i;
for(j=i+1;j<n;j++)
{
if(a[p]>a[j])
{
p=j;
}
}
if(p!=i)
{
t=a[i];
a[i]=a[p];
a[p]=t;
}
}
for(i=0;i<n;i++)
printf("%d\t",a[i]);
return 0;
}

