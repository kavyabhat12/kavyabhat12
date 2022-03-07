#include<stdio.h>
#include<stdlib.h>
#define MaxSize 3
 int top=-1,stack[MaxSize];
void push();
void pop();
void display();
void main()
{
int ch;
while(1)
{
printf("\n Stack menu:");
printf("\n 1.push\n 2.pop\n 3.display\n 4.exit");
printf("\n Enter your choice:");
scanf("%d",&ch);
switch(ch)
{
case 1:push();
break;
case 2:pop();
break;
case 3:display();
break;
case 4:exit(0);
default:printf("\n Wrong choice:");
}
}
}

void push(int ele)
{
if(top==MaxSize-1)
{
printf("\n stack is full\n");
}
else
{
printf("\n Enter the element to push:");
scanf("%d",&ele);
stack[++top]=ele;
}
}

void pop()
{
if(top==-1)
{
printf("\n stack is empty\n");
}
else
{
printf("\n Deleted element is %d:",stack[top]);
top=top-1;
}
}

void display()
{
int i;
if(top==-1)
{
printf("\n stack is empty");
}
else
{
printf(" stack Elements are:");
for(i=0;i<=top;i++)
printf("\n %d",stack[i]);
}
}



