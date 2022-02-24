filename=$1
if [ -e $filename ] 
then
echo "The creation time of $filename is $6 $7 $8"
else
echo "file doesnot exist"
fi
