FROM openjdk:11
ADD target/masterpiece.jar masterpiece.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "masterpiece.jar"]
