FROM openjdk:17-jdk-alpine
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN mvn clean install
CMD ["java", "-cp", "target/classes", "tan.jerry.GraphAlgorithms"]
