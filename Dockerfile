FROM ubuntu:20.04
WORKDIR /test
ENV browser=chrome
ENV tags=@UI

RUN apt update -y\
    apt install openjdk-11-jdk &&\
    maven &&\
    xvfb &&\
    google-chrome-stable &&\
    firefox

COPY src/. .

ENTRYPOINT [ "/bin/bash", "-c", "Xvfb :99 & export DISPLAY=:99 && mvn clean verify}" ]
