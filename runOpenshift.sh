#!/usr/bin/env bash
set -e

sed -i s/MINISHIFT_IP/$(minishift ip)/g src/main/resources/project-stages.yml
sed -i s/MINISHIFT_PROJECT/$(oc project)/g src/main/resources/project-stages.yml

mvn clean fabric8:deploy -Dopenshift
