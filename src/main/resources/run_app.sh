#!/bin/bash
if [ "$USER" != "spark" ]; then
    echo 'script must be ran as spark user'
    exit 1;
fi
/usr/bin/spark-submit --class org.costa.hadoop.spark.SimpleApp --master local[4] /vagrant/spark-word-count-demo_2.11-1.0-SNAPSHOT.jar 
