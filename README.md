# docker
Project for test docker images

sudo docker network create first-app

sudo docker build -t dockerapptest .

sudo docker run --net first-app --name dockerapptest -d -p 8080:8080 dockerapptest

sudo docker run --net first-app --name dockermysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=mdymen_pass -d mysql:latest

sudo docker exec -i dockermysql sh -c 'exec mysql -uroot -p"$MYSQL_ROOT_PASSWORD"' < data.sql


