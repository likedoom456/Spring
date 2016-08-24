DROP DATABASE IF EXISTS db_test;
CREATE DATABASE db_test;

-- user
DROP TABLE IF EXISTS db_test.user;
CREATE TABLE db_test.user (
  id       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  email    VARCHAR(255) NOT NULL  UNIQUE,
  password VARCHAR(255) NOT NULL
);

-- book
DROP TABLE IF EXISTS db_test.book;
CREATE TABLE db_test.book (
  id    BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255) NOT NULL
);

ALTER TABLE db_test.book
AUTO_INCREMENT = 2147483647;

-- student
DROP TABLE IF EXISTS db_test.student;
CREATE TABLE db_test.student (
  id     BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  name   VARCHAR(255),
  gender CHAR(1),
  age    INT,
  dob    DATE
);

SELECT *
FROM db_test.user;

SELECT *
FROM db_test.book;

SELECT *
FROM db_test.student;
