#!/usr/bin/env bash
set -e

mvn clean package

java -Dswarm.project.stage=local -Dswarm.port.offset=200 -jar target/nutrition-service-1.0-SNAPSHOT-swarm.jar