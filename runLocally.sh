#!/usr/bin/env bash
set -e

mvn clean package

java -Dswarm.project.stage=local -Dswarm.zipkin.url="http://zipkin-$(oc project -q).$(minishift ip).nip.io/api/v1/spans" -Djava.net.preferIPv4Stack=true -Dswarm.port.offset=200 -jar target/nutrition-1.0-SNAPSHOT-swarm.jar
