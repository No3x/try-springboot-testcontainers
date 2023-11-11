delete from person;
insert into person(name) VALUES ('John');

delete from project;
insert into project(name) VALUES ('projectA');

delete from personprojects;
insert into personprojects(person_id,project_id) VALUES (1,1);