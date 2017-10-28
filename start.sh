#!/bin/bash

sh -c 'java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar build/libs/atami-*.jar' 