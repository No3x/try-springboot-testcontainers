delete from person;
insert into person(name) VALUES ('John');
insert into person(name) VALUES ('Peter');

delete from project;
insert into project(name) VALUES ('projectA');

delete from project_persons;
insert into project_persons(project_id, person_id) VALUES (1, 1);
insert into project_persons(project_id, person_id) VALUES (1, 2);