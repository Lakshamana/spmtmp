#!/bin/bash
repo_base='src/main/java/br/ufpa/labes/spm/repository'
cd $repo_base
classes=`find . -regextype posix-extended -regex '(.*)Repository.java' | cut -d'/' -f2 | sed -r 's/(.*)Repository.java/\1/'`
daos=`find "$repo_base/impl" -regextype posix-extended -regex '(.*)DAO.java' | cut -d'/' -f3 | sed -r 's/(.*)DAO.java/\1/'`

for c in $classes; do
  class_path=`echo "$c"Repository.java`
  # Add DAO inheritance
  super=`echo I"$c"DAO`
  package=`find interfaces/ -iname "$super".java | cut -d'/' -f2`
  echo package \'$package\'
  if [[ package != '' ]]; then
    package=".$package"
  fi

  sed -rn "/package/ s/(package .*)/\1\n\nimport br.ufpa.labes.spm.repository.interfaces$package.$super;\n/p" $class_path
  sed -rn "/public interface/ s/public interface "$c"Repository extends $super, (.*)/public interface "$c"Repository extends \1/p" $class_path
done

echo 'Finish adding inheritance...'
