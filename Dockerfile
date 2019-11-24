# Start with a base image containing Java runtime
FROM openjdk

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/SNET-0.0.1-SNAPSHOT.jar SNET-0.0.1-SNAPSHOT.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","SNET-0.0.1-SNAPSHOT.jar"]