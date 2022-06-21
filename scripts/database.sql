DROP DATABASE IF EXISTS production;
CREATE DATABASE IF NOT EXISTS production;

USE production;

CREATE TABLE `users`
(
    `user_id`          INT          NOT NULL AUTO_INCREMENT,
    `username`         VARCHAR(16)  NOT NULL,
    `password`         VARCHAR(255) NOT NULL,
    `role_id`          INT          NOT NULL REFERENCES `role_dictionary` (`role_id`),
    `related_employer` INT          NOT NULL REFERENCES `employers` (`employer_id`)
);

CREATE TABLE `role_dictionary`
(
    `role_id`   INT         NOT NULL AUTO_INCREMENT,
    `role_name` VARCHAR(24) NOT NULL
);

CREATE TABLE `employers`
(
    `employer_id`    INT           NOT NULL AUTO_INCREMENT,
    `first_name`     NVARCHAR(255) NOT NULL,
    `second_name`    NVARCHAR(255) NOT NULL,
    `third_name`     NVARCHAR(255) NOT NULL,
    `passport_id`    INT           NOT NULL DEFAULT 0,
    `employer_image` BLOB          NOT NULL,
    `phone_number`   VARCHAR(11)   NOT NULL,
    `gender`         TINYINT       NOT NULL
);

CREATE TABLE `contracts`
(
    `contract_id` INT NOT NULL AUTO_INCREMENT,
    `contract_text` MEDIUMBLOB NOT NULL
);