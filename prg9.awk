BEGIN {
count=0
sent1=0;
sent2=0
recevied=0;
}
{
if($1=="d")
{
count++;
}
else if($1=="+"&&$3==1&&$4==2)
{
sent1++;
}
else if($1=="+"&&$3==0&&$4==2)
{
sent2++;
}
else if($1=="r"&&$3==2&&$4==3)
{
recevied++;
}
}
END{
printf("\n Number of packets dropped is:%d\n",count);
printf("\n Packets sent from source node 1 is:%d",sent1);
printf("\n Packets sent from source node 2 is:%d",sent2);
printf("\n Packet Received:%d",recevied);sent = sent1 + sent2;
printf("\n Packet delivery ratio:%2f\n",(received/sent)*100);
}

