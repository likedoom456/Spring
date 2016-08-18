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
  id    INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255) NOT NULL
);

SELECT *
FROM db_test.user;

SELECT *
FROM db_test.book;