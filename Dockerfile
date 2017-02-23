FROM maven

RUN apt-get install git

RUN git clone https://github.com/caprepo/digitalbanking-cardsservice.git

RUN cd /digitalbanking-cardsservice

RUN mvn -f /digitalbanking-cardsservice/pom.xml clean install -DskipTests

EXPOSE 8100

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "/digitalbanking-cardsservice/target/cardservices-0.0.1-SNAPSHOT.jar"]
