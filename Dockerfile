FROM maven

RUN apt-get install git

RUN git clone https://github.com/spansare/digitalbanking-loansservice

RUN cd /digitalbanking-loansservice

RUN mvn -f /digitalbanking-loansservice/pom.xml clean install -DskipTests

EXPOSE 8100

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "/digitalbanking-loansservice/target/loanservice-1.0.jar"]
