#!/bin/bash

#git pull
git pull

#gradle build
chmod 777 gradlew
./gradlew build --no-daemon

#jar start
java -jar build/libs/DICE-0.0.1-SNAPSHOT.jar
