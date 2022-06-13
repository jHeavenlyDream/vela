insert into authority
values (1, 'ADMIN'),
       (2, 'USER');

insert into users
values (1, 'admin@admin.com', '$2a$12$mFSOJCJ.POME8KeMY.7dSOxCgwB8O526G92TCutB43Q00YhKWF.Ke'),
       (2, 'user@user.com', '$2a$12$gO5Ba77OFjmSXhjUGH.g9eMYeicVvELN7HTRpzggtoisMM8JkXhlC');

insert into user_authority
values (1, 1, 1),
       (2, 2, 2);

insert into facilities (title, content)
values ('Приемно-диверторное устройство', 36723),
       ('Транспортно-шлюзовое устройство', null),
       ('Электромагнитная система КТМ', null),
       ('Система высокочастотного нагрева плазмы', null),
       ('Электромагнитные технологические диагностики', null),
       ('Внешнее электроснабжение', null),
       ('Система импульсного электроснабжения', null),
       ('Вакуумная система', null),
       ('Система автоматизации экспериментов', null),
       ('Разрядная камера', null),
       ('Физические диагностики',36724);