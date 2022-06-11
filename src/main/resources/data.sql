insert into authority
values (1, 'ADMIN'),
       (2, 'USER');

insert into users
values (1, 'admin@admin.com', '$2a$12$mFSOJCJ.POME8KeMY.7dSOxCgwB8O526G92TCutB43Q00YhKWF.Ke'),
       (2, 'user@user.com', '$2a$12$gO5Ba77OFjmSXhjUGH.g9eMYeicVvELN7HTRpzggtoisMM8JkXhlC');

insert into user_authority
values (1, 1, 1),
       (2, 2, 2);

insert into facilities (title)
values ('Приемно-диверторное устройство'),
       ('Транспортно-шлюзовое устройство'),
       ('Электромагнитная система КТМ'),
       ('Система высокочастотного нагрева плазмы'),
       ('Электромагнитные технологические диагностики'),
       ('Внешнее электроснабжение'),
       ('Система импульсного электроснабжения'),
       ('Вакуумная система'),
       ('Система автоматизации экспериментов'),
       ('Разрядная камера'),
       ('Физические диагностики')