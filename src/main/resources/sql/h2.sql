create schema if not exists ws320;

drop table if exists ws320.hospitals;

create table if not exists ws320.hospitals
(
   id      varchar(10)     not null,
   name    varchar(20)     not null,
   address varchar(100)    not null,
   phone   varchar(20)     not null,
   intro   varchar(500)        null,
   grade   varchar(10)         null,
   kind    varchar(10)         null,

   wsdl    varchar(200)    not null,

   constraint pk primary key (id)
);

create index if not exists idx_name on ws320.hospitals(name);

