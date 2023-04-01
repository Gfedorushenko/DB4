--liquibase formatted sql

--changeset fedorushenko:1
create table ddl.person(
                           id serial primary key ,
                           brand_name varchar(100) not null
);
--rollback drop table brands;