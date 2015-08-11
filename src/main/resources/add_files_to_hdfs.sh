#!/bin/bash
if [ "$USER" != "spark" ]; then
    echo 'script must be ran as spark user'
    exit 1;
fi
hdfs -put /vagrant/fileA hdfs://c6401.ambari.apache.org:8020/user/spark/fileA

