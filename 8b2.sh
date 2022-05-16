echo -n "enter the login name "
read lname
period=0
echo -n "enter the unit of time (min):"
read min
until who | grep -w "$lname"> /dev/null
do
sleep 4
period=`expr $period + 1`
if [ $period -gt $min ]
then
echo "$lname has not logged in since $min minutes"
exit
fi
done
echo "$lname has logged in"
