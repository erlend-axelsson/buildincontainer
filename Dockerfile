FROM gradle:jdk21 as build

COPY . /project

WORKDIR /project

RUN gradle bootJar

FROM eclipse-temurin:21 as runtime

RUN mkdir /opt/app
COPY --from=build /project/build/libs/buildincontainer-*.*.*-SNAPSHOT.jar /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]