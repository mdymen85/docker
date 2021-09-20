# docker
Project for test docker images

sudo docker build -t docker-test .

sudo docker run -d -p 8080:8080 docker-test

sudo docker run --name docker-test-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=mdymen_pass -d mysql:latest

sudo docker exec -i docker-test-mysql sh -c 'exec mysql -uroot -p"$MYSQL_ROOT_PASSWORD"' < data.sql


