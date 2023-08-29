FROM eclipse-temurin:17
COPY target/mydetails.jar mydetails.jar
CMD ["java","-jar","mydetails.jar"]