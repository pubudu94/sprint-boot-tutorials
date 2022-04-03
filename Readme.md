## Spring boot app with Postgres db docker

This tutorial is all about using postgres db with spring boot application.

Here, I have used postgres docker container

### To run the App

- First, you should do a `maven clean install`
- Then, you have to copy the `jar` file in the `src/main/docker` folder
- `docker-compose up` command will start the application in docker environment
- `docker-compose down` command will stop all containers

### To access the API, 

you can use postman application

URL: http://localhost:8080/users