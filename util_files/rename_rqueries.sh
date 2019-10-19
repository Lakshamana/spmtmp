#!/bin/bash

cd src/main/java/br/ufpa/labes/spm/repository/interfaces
for file in `find . -regextype posix-extended -regex 'I(.*)RepositoryQuery.java'`; do
  # echo $file
  ename=`echo $file | cut -d'/' -f3 | sed -rn 's/I(.*)RepositoryQuery.java/\1/p'`
  echo $ename
  replace=`echo $file | sed -r 's/I(.*)RepositoryQuery.java/\1RepositoryQueryImpl.java/'`
  # echo 'mv' $file $replace
  sed -ri "s/\<"$ename"RepositoryQuery\>/"$ename"RepositoryQueryImpl/g" $file
  mv $file $replace
done

echo 'Finish renaming entity...'
