FROM eclipse-temurin:17-jdk-jammy
EXPOSE 8080 8080

ADD build/libs/demo3-0.0.1-SNAPSHOT.jar remote-debugging.jar
ADD entrypoint.sh entrypoint.sh

ENTRYPOINT ["sh","/entrypoint.sh"]