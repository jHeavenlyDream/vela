drop table if exists users cascade;
drop table if exists authority cascade;
drop table if exists user_authority cascade;
drop table if exists facilities;
drop table if exists shots;


create table users
(
    id       serial       not null primary key,
    email    varchar(200) not null,
    password varchar(256) not null
);

create table authority
(
    id        serial      not null primary key,
    authority varchar(20) not null
);

create table user_authority
(
    id           serial not null primary key,
    user_id      int    not null,
    authority_id int    not null,
    foreign key (user_id) references users (id),
    foreign key (authority_id) references authority (id)
);

create table facilities
(
    id      serial       not null primary key,
    title   varchar(256) not null,
    content oid
);

create table shots
(
    id          serial     not null primary key,
    number      int unique not null,
    description varchar(1000),
    shot_date   date,
    shot_time   time
);



