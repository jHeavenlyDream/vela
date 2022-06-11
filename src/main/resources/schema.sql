drop table if exists  users cascade;
drop table if exists  authority cascade;
drop table if exists  user_authority cascade;


create table users
(
    id       serial       not null primary key,
    email    varchar(200) not null,
    password varchar(256) not null
);

create table authority
(
    id       serial      not null primary key,
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