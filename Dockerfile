FROM openjdk:jdk-alpine

VOLUME /tmp
RUN apk update && \
	apk add --virtual build-dependencies build-base bash curl wget
    # cd /spark-kotlin-docker && ./gradlew clean && \
    # cd /spark-kotlin-docker && ./gradlew build && \
    # mkdir -p /usr/local/spark-kotlin-docker/lib && \
    # cp -R /spark-kotlin-docker/build/libs/* /usr/local/spark-kotlin-docker/lib/ && \
    # apk del build-dependencies && \
    # rm -rf /var/cache/apk/* && \
    # rm -rf ~/.gradle && \
    # rm -rf /spark-kotlin-docker

ENV GRADLE_VERSION 4.2.1
ENV GRADLE_HOME=/usr/lib/gradle
ENV GRADLE_FOLDER=/root/.gradle
RUN mkdir -p ${GRADLE_HOME} ${GRADLE_FOLDER}
WORKDIR /tmp
RUN set -x \
  && wget https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip \
  && unzip gradle-${GRADLE_VERSION}-bin.zip -d ${GRADLE_HOME}
ENV PATH ${PATH}:${GRADLE_HOME}/gradle-${GRADLE_VERSION}/bin

ENV ROOT_PATH /app
RUN mkdir $ROOT_PATH
WORKDIR /app
ADD . $ROOT_PATH
# RUN adduser -S app
# USER app

RUN gradle wrapper
RUN ./gradlew compileKotlin assemble
# ENV JAVA_OPTS=""

#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar build/libs/atami-*.jar" ]