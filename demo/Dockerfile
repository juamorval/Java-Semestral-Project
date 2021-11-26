FROM gradle:7-jdk17-alpine
COPY . /src/semestral_project_backend
WORKDIR /src/semestral_project_backend
RUN gradle build

CMD java -jar build/libs/demo-0.0.1-SNAPSHOT.jar
#CMD gradle bootRun