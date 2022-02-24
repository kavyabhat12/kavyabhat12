if [ -e $1 ] 
then
x=`ls -l $1`
for i in $x
do
echo $i
done
else
echo  "File doesnot exist"
fi
