--liquibase formatted sql

--changeset toma:1
-- comment persons-created
-- Адрес

CREATE TABLE Persons (
    PersonID int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255)
);
--rollback drop table persons;