FROM java:8-jre-alpine
MAINTAINER lars

ENV HOME=/home/service \
    APP_DIR=app \
    WEBAPP_DIR=app/webapp \
    JVM_DEBUG=""

RUN adduser -D service && addgroup service service
USER service
WORKDIR $HOME

EXPOSE 8080 5005

CMD java -classpath 'app/classes:app/libs/*' $JVM_DEBUG de.girndt.Main

# Order in which changes are expected
COPY build/deps $APP_DIR/libs
COPY src/main/webapp $WEBAPP_DIR
COPY build/classes/main $APP_DIR/classes

