FROM openjdk:8u181-jdk-slim
VOLUME /tmp
ADD *.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS="-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -XX:+UseSerialGC"
CMD [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]