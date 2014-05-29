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

   constraint if not exists pk_id primary key (id)
);

create index if not exists idx_name on ws320.hospitals(name);


create table if not exists ws320.triggers
(
  selector  varchar(100) null,
  attribute varchar(20)  null,
  oldvalue  varchar(100) null,
  newvalue  varchar(100) null,
  action    varchar(100) not null,
  stage     varchar(10)  not null,
  constraint if not exists pk_action primary key (action)
);


create table if not exists ws320.patients
(
  id  varchar(18) not null,
  name  varchar(10) not null,
  sex varchar(1) not null,
  phone varchar(16) not null,
  insurence_type  int null,

  constraint if not exists pk_action primary key (action)

);