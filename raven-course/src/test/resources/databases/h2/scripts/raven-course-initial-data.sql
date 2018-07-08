--course_status
insert into course_status(course_status_id,name,description,active) values(1,'OPEN','This course is available and enrolls are allowed',true);
insert into course_status(course_status_id,name,description,active) values(2,'DEPRECATED','This course is not longer available for enrolls',true);

--modality
insert into modality(name,description,active) values ('ONLINE','The course is taught online, students and teacher join using an online platform.',true);
insert into modality(name,description,active) values ('ON SITE','The course is taught in a classroom. Students and teacher meet in a specific place.',true);

commit;