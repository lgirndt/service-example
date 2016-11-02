FROM java:8-jre-alpine
MAINTAINER lars

ENV HOME=/home/service \
    APP_DIR=app

RUN adduser -D service && addgroup service service
USER service
WORKDIR $HOME

COPY build/classes/main $APP_DIR/classes
COPY build/deps $APP_DIR/libs

EXPOSE 8080

CMD ["java","-classpath","app/classes:app/libs/*","de.girndt.Main"]