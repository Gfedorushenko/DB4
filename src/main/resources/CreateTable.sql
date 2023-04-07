

create table ddl.PERSON(
                            id serial primary key ,
                            name varchar(50) not null ,
                            surname varchar(50) not null ,
                            age int not null ,
                            phone_number varchar(50) not null ,
                            city varchar(50) not null
);



insert into ddl.PERSON(name, surname, age, phone_number, city)
values ('Ivan','Ivanov',77,'89101111111','Moscow');

insert into ddl.PERSON(name, surname, age, phone_number, city)
values ('Petr','Petrov',22,'89202222222','Yaroslavl');

insert into ddl.PERSON(name, surname, age, phone_number, city)
values ('Anton','Ivanov',33,'89303333333','Ufa');

insert into ddl.PERSON(name, surname, age, phone_number, city)
values ('Maxim','Orlov',44,'89404444444','Moscow');