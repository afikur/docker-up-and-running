FROM openjdk:8

# set work directory
WORKDIR /src

# copy src folder to container's workdir
COPY $PWD/src/ .

# compiling App.java
RUN javac App.java

# executing our program
CMD [ "java", "App" ]
