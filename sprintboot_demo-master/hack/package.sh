#!/bin/bash
mvn package
docker build -t jonyhy/course .
docker push jonyhy/course
mvn clean
