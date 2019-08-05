create table student
(
   id integer not null,
   name varchar(255) not null,
   passport_number varchar(255) not null,
   primary key(id)
);

create table products
(
	id varchar(10),
	name varchar(15),
	contents varchar(100),
	reg_date date,
	reg_id varchar(15)
);