#include<stdio.h>
#include<stdlib.h>
int n,d[10],p[10],cost[6][6];

void dijik(int source)
{
int s[10],i,j,u,v,min;
for(i=0;i<n;i++)
{
d[i]=cost[source][i];
s[i]=0;
p[i]=source;
}
s[source]=1;
for(i=1;i<n;i++)
{
min=99;
u=-1;
for(j=0;j<n;j++)
{
if(s[j]==0)
{
if(d[j]<min)
{
min=d[j];
u=j;
}
}
}
if(u==-1)
return;
s[u]=1;
for(v=0;v<n;v++)
{
if(s[v]==0)
{
if(d[u]+cost[u][v]<d[v])
{
d[v]=d[u]+cost[u][v];
p[v]=u;
}
}
}
}
}

void print_path(int source,int destination)
{
int i;
i=destination;
while(i!=source)
{
printf("%d<--",i);
i=p[i];
}
printf("%d=%d",i,d[destination]);
}


void main()
{
int i,j,source;
printf("Enter the numner of nodes:");
scanf("%d",&n);
printf("Enter the adjancy matrix:\n");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
scanf("%d",&cost[i][j]);
printf("The adjancy matrix:\n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("%d\t",cost[i][j]);
}
printf("\n");
}
printf("Enter the source Vertex:");
scanf("%d",&source);
dijik(source);
printf("The shortes path and distance:\n");
for(j=0;j<n;j++)
{
print_path(source,j);
printf("\n");
}
}


