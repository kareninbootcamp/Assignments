drop table if exists student_class;
drop table if exists major_class;
drop table if exists class;
drop table if exists instructor;
drop table if exists major;
drop table if exists assignment;
drop table if exists student;

create table major(
	id int primary key auto_increment,
	description varchar(50) not null,
	score int
	);
insert into major (description,score) values('General Business',800);
insert into major (description,score) values('Accounting',1000);
insert into major (description,score) values('Finance',1100);
insert into major (description,score) values('Math',1300);
insert into major (description,score) values('Engineering',1350);
insert into major (description,score) values('Education', 900);
insert into major (description,score) values('General Studies',500);

create table student (
	
	id int primary key,

	gpa decimal(4,2),
	sat int(11),
	first_name varchar(30) not null,
	last_name varchar(30) not null,
	major_id int,
	foreign key (major_id)
	  references major(id)
	);


insert student values(100,3.5,1000,'Eric','Ephram',null);

insert student values(110,3.5,1500,'Greg','Gould',null);

insert student values(120,3.4,1400,'Adam','Ant',null);

insert student values(130,3.3,1300,'Howard','Hess',null);

insert student values(140,3.2,1200,'Charles','Caldwell',null);

insert student values(150,3.1,1100,'James','Joyce',null);

insert student values(160,3.0,1000,'Doug','Dumas',null);

insert student values(170,2.5,1120,'Kevin','Kraft',null);

insert student values(180,2.7,1130,'Frank','Fountain',null);

insert student values(190,2.8,1140,'Brian','Biggs',null);



create table instructor (
	id int primary key,
	first_name varchar(30) not null,
	last_name varchar(30) not null,
	years_of_experience int not null,
	tenured tinyint not null,
	major_id int,
	foreign key (major_id)
	  references major(id)
	);
insert into instructor(id,first_name,last_name, years_of_experience,tenured,major_id) values(10,'Sally','Fields',50, 1,1);
insert into instructor(id,first_name,last_name, years_of_experience,tenured,major_id) values(20,'Robert','Redford', 49, 1,2);
insert into instructor(id,first_name,last_name, years_of_experience,tenured,major_id) values(30,'Jodi','Foster',30, 0,3);
insert into instructor(id,first_name,last_name, years_of_experience,tenured,major_id) values(40,'Greg','Doud',30, 0,4);
insert into instructor(id,first_name,last_name, years_of_experience,tenured,major_id) values(50,'Jarrett','Acey',30, 0,5);
insert into instructor(id,first_name,last_name, years_of_experience,tenured,major_id) values(60,'Karen','Reiter',30, 0,6);
insert into instructor(id,first_name,last_name, years_of_experience,tenured,major_id) values(70,'Elaina','Dunevant',30, 0,7);

create table class(
	id int primary key,
	subject varchar(50) not null,
	section int,
	instructor_id int,
	foreign key (instructor_id)
	  references instructor(id)
);
insert into class(id,subject,section, instructor_id) values(10101,'English',101,10);
insert into class(id,subject,section, instructor_id) values(10102,'English',102,10);
insert into class(id,subject,section, instructor_id) values(10103,'English',103,10);
insert into class(id,subject,section, instructor_id) values(10201,'English',201,10);
insert into class(id,subject,section, instructor_id) values(10202,'English',202,10);
insert into class(id,subject,section, instructor_id) values(10203,'English',203,10);
insert into class(id,subject,section, instructor_id) values(10301,'English',301,10);
insert into class(id,subject,section, instructor_id) values(10302,'English',302,10);
insert into class(id,subject,section, instructor_id) values(10303,'English',303,10);
insert into class(id,subject,section, instructor_id) values(11201,'Math',201,70);
insert into class(id,subject,section, instructor_id) values(11202,'Math',202,70);
insert into class(id,subject,section, instructor_id) values(11203,'Math',203,70);
insert into class(id,subject,section, instructor_id) values(11204,'Math',204,70);
insert into class(id,subject,section, instructor_id) values(11301,'Math',301,70);
insert into class(id,subject,section, instructor_id) values(11302,'Math',302,70);
insert into class(id,subject,section, instructor_id) values(11303,'Math',303,70);
insert into class(id,subject,section, instructor_id) values(11304,'Math',304,70);
insert into class(id,subject,section, instructor_id) values(12101,'History',101,20);
insert into class(id,subject,section, instructor_id) values(12201,'History',201,20);
insert into class(id,subject,section, instructor_id) values(12301,'History',301,20);
insert into class(id,subject,section, instructor_id) values(13311,'Computer Science',311,40);
insert into class(id,subject,section, instructor_id) values(13312,'Computer Science',312,40);
insert into class(id,subject,section, instructor_id) values(13313,'Computer Science',313,40);
insert into class(id,subject,section, instructor_id) values(13441,'Computer Science',441,40);
insert into class(id,subject,section, instructor_id) values(13442,'Computer Science',442,40);
insert into class(id,subject,section, instructor_id) values(13443,'Computer Science',443,40);
insert into class(id,subject,section, instructor_id) values(14221,'Education',221,60);
insert into class(id,subject,section, instructor_id) values(14222,'Education',222,60);
insert into class(id,subject,section, instructor_id) values(14223,'Education',223,60);
insert into class(id,subject,section, instructor_id) values(14351,'Education',351,60);
insert into class(id,subject,section, instructor_id) values(14352,'Education',352,60);
insert into class(id,subject,section, instructor_id) values(14353,'Education',353,60);
insert into class(id,subject,section, instructor_id) values(15101,'Psychology',101,50);
insert into class(id,subject,section, instructor_id) values(15102,'Psychology',102,50);
insert into class(id,subject,section, instructor_id) values(15231,'Psychology',231,50);
insert into class(id,subject,section, instructor_id) values(15232,'Psychology',232,50);

create table assignment (

	id int primary key,

	student_id int not null,

	class_id int not null,
	assignment_nbr int not null,

	grade varchar(30),
	index student_id_idx (student_id),
 
	foreign key (class_id) 

		references class(id)
, 
	
	foreign key (student_id) 

		references student(id)
	
);
insert into assignment(id,student_id, class_id, assignment_nbr,grade) values(1,100,10101,1,'A');
insert into assignment(id,student_id, class_id, assignment_nbr,grade) values(2,110,10102,1,'B');
insert into assignment(id,student_id, class_id, assignment_nbr,grade) values(3,120,10103,1,'A');
insert into assignment(id,student_id, class_id, assignment_nbr,grade) values(4,100,10201,1,'C');

create table major_class_relationship(
	id int primary key auto_increment,
	major_id int not null,
	class_id int not null,
	foreign key (major_id)
	  references major(id),
	foreign key (class_id)
	  references class(id)
	);
INSERT major_class_relationship (major_id, class_id) VALUES(1,10101); 
INSERT major_class_relationship (major_id, class_id) VALUES(1,10102); 
INSERT major_class_relationship (major_id, class_id) VALUES(1,10201); 
INSERT major_class_relationship (major_id, class_id) VALUES(1,10201); 
INSERT major_class_relationship (major_id, class_id) VALUES(1,11202); 

create table student_class_relationship(
	id int primary key auto_increment,
	student_id int not null,
	class_id int not null,
	foreign key (student_id)
	  references student(id),
	foreign key (class_id)
	  references class(id)
	);
INSERT student_class_relationship (student_id, class_id) VALUES(100,12201);


