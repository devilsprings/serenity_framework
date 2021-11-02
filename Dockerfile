FROM    maven:3.8-openjdk-11

RUN     mkdir /docker

WORKDIR /docker

COPY    pom.xml .
COPY    serenity.properties .
COPY    src .

CMD     [mvn clean verify]