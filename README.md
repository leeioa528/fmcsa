# fmcsa

This project contains one operation to read fmcsa data from LATEST_FF_FMCSA_CENSUS_FULL table.
This is done via rest and it's used to prime the screens that drive the carrier registration.
In the future we will follow a micro service naming convention and this project for is used
for demo purposes   



## Gradle Wrapper

This project is managed through Gradle. The Gradle Wrapper is provided for your convenience. It is recommended to use it.
On Windows you can execute Gradle commands through the gradlew.bat batch script.
On Linux based operating systems, you can run Gradle commands through the gradlew bash script.

## Working in Intellij

If this project is newly checked out and you would like to work with it in Intellij.
Please run the following command.

`./gradlew idea`


# Maria Database

Before running the application make sure you run the following command which will downlaod the docker
image for maria db , and connect to our aurora host. Before running this command please get the password

`docker run -it --rm mysql mysql -hfmcsa-historical-aurora.cluster-cryibycdtabf.us-east-1.rds.amazonaws.com -P3306 -uroot -p{IS_THE_PASSWORD}`


## Running the server

The project is managed through Gradle and runs with Spring Boot and an embedded Tomcat server. To start the server run the following command using the Gradle Wrapper:

`./gradlew clean bootRun`

Or you can create  a spring boot running configuration through the IDE of your choice.


