--liquibase formatted sql

--changeset toma:1
-- comment persons-alter-add_pk
ALTER TABLE Persons
ADD PRIMARY KEY (PersonID);

--changeset toma:2
-- comment persons-alter-auto-increment-pk
ALTER TABLE `persons`
	CHANGE COLUMN `PersonID` `PersonID` INT(11) NOT NULL AUTO_INCREMENT FIRST;

--changeset toma:3
-- comment persons-alter-add-collumn-creationdate
ALTER TABLE `persons`
	ADD (creationdate DATETIME);