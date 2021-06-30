#!/bin/bash

while ! nc -z config-server 8888 ; do
    echo "Waiting for config server"
    sleep 10
done
while ! nc -z eureka-peer1 8761 ; do
    echo "Waiting for config server"
    sleep 10
done
while ! nc -z eureka-peer2 8762 ; do
    echo "Waiting for config server"
    sleep 10
done

echo "Config and Eureka Servers are running - starting the Microservice"

java -cp /app/resources:/app/classes:/app/libs/* com.example.activityservice.ActivityServiceApplication
