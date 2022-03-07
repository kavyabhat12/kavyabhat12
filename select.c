#include<stdio.h>
int n;
void slection(int a[])
{
int i,pos,j,temp;
for(i=0;i<n-1;i++)
{
pos=i;
for(j=i+1;j<n;j++)
{
if(a[pos]<a[j])
{
pos=j;
}
}
if(pos!=i)
{
temp=a[i];
a[i]=a[pos];
a[pos]=temp;
}
}
}
int main()
{
int a[5],i;
printf("Enter the limit:");
scanf("%d",&n);
printf("Enter the array element:");
for(i=0;i<n;i++)
scanf("%d",&a[i]);
slection(a);
printf("sorted order:");
for(i=0;i<n;i++)
printf("%d\t",a[i]);
return 0;
}



