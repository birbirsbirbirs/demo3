#!/bin/bash
sudo apt upgrade -y
sudo apt update -y
sudo apt install openjdk-17-jdk openjdk-17-jre -y
chmod +x gradlew
java -version
git -version
./gradlew --version
./gradlew clean build