FROM maven:3.8.1-openjdk-17

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src ./src

RUN mvn package

CMD [ "mvn", "spring-boot:run" ]
