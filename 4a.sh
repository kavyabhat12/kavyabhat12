for i in $*
do
	echo "-------------------------$i content are----------------------------"
	if [ -f $i ]
	then
		cat $i | tr "[a-z]" "[A-Z]"
		echo "-----------------------------------"
	else
		echo "$i file doesnot exist"
	fi
done 
