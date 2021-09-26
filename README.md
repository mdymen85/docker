# docker
Project for test docker images

it creates a "docker_default" network

connection string: spring.datasource.url=jdbc:mysql://${MYSQL_HOST:docker-test-mysql}:3306/docker_test_database?allowPublicKeyRetrieval=true&autoReconnect=true

autoReconnect is because its no order to run the containers, the java applications needs to try to connect again to catch after the mysql container is running.

sudo docker-compose up




