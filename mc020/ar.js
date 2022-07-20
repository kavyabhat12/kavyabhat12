var n=prompt("Enter the number is");
sum=0;
length=3;
for(i=0;i<length;i++){
    sum+=n[i]**length;
}
if(n==sum)
alert(n+"is an Ramstrong number");
else
alert(n+"is not an Ramstrong number");

