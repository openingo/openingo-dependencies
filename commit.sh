#!/bin/bash

cur_date="`date +%Y/%m/%d-%H:%M:%S`" 
commit_content="Site updated at "${cur_date}

echo "pushing to master..."
git pull origin master
git add .
git commit -m "`echo ${commit_content}`"
git push origin master
echo "pushed to master!"
