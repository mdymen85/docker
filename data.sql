CREATE DATABASE docker_test_database;

USE docker_test_database;

CREATE TABLE PERSON (

 ID BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
 NAME VARCHAR(100) NOT NULL,
 SURNAME VARCHAR(100) NOT NULL,
 PRIMARY KEY (ID)

);

ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'mdymen_pass';
