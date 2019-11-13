#!/bin/sh

PROFILE="node1"
CONFIG_URI="http://10.17.68.113:8888"
JAR="/root/myjava/springcloudtop-eureka-1.0.0.jar"
APP_NAME="springcloudtop-eureka"
LOG_HOME="/home/logs/$APP_NAME"
pid=`ps -ef | grep java | grep "$JAR" | grep -v "grep" | awk '{print $2}'`

if [ $1 = "start" ]; then
  if [ -z "$pid" ]; then
    echo "starting ..."
    mkdir -p "${LOG_HOME}"
    nohup java -jar "$JAR" --spring.profiles.active="$PROFILE" --spring.cloud.config.uri="$CONFIG_URI" >> "${LOG_HOME}/${APP_NAME}.out" 2>&1 &
    echo "started"
  else
    echo "existed process $pid"
  fi
elif [ $1 = "stop" ]; then
  if [ -n "$pid" ]; then
    echo "stopping ..."
    kill -15 $pid
    sleep 3
    pppid=`ps -p $pid | grep $pid`
    if [ -n "$pppid" ]; then
      kill -9 $pid
    fi
    echo "stopped"
  else
    echo "nothing to stop"
  fi
elif [ $1 = "clean" ]; then
  if [ -d "${LOG_HOME}" ]; then
    sub="/*"
    rm -rf ${LOG_HOME}${sub}
    echo "cleaned"
  else
  	echo "nothing to clean"
  fi
else
  echo "unknown command"
fi
