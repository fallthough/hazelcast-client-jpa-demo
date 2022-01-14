FROM adoptopenjdk/openjdk11
LABEL maintainer="fallthough"

ENV JAVA_OPTS=""

RUN mkdir /opt/app
ADD build/libs/hazelcast-client-jpa-demo-0.0.1.jar /opt/app

ENTRYPOINT exec java  $JAVA_OPTS -jar "/opt/app/hazelcast-client-jpa-demo-0.0.1.jar"
