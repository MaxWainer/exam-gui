create table employers
(
    employer_id  int auto_increment
        primary key,
    second_name  varchar(255) charset utf8 not null,
    name         varchar(255) charset utf8 not null,
    patronymic   varchar(255) charset utf8 not null,
    password     varchar(16) charset utf8  not null,
    role         varchar(255) charset utf8 not null,
    phone_number varchar(255)              not null,
    sex          varchar(1) charset utf8   not null,
    login        varchar(255) charset utf8 not null,
    photo        blob                      null
);

INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role, phone_number, sex, login, photo) VALUES (1, 'Чашин', 'Елизар', 'Михеевич', 'yntiRS', 'Администратор', '+7 (107) 628-29-16', 'М', 'Elizor@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role, phone_number, sex, login, photo) VALUES (2, 'Филенкова', 'Владлена', 'Олеговна', '07i7Lb', 'Менеджер А', '+7 (334) 146-01-51', 'Ж', 'Vladlena@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role, phone_number, sex, login, photo) VALUES (3, 'Ломовцев', 'Адам', 'Владимирович', '7SP9CV', 'Менеджер С', '+7 (856) 519-32-99', 'М', 'Adam@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role, phone_number, sex, login, photo) VALUES (4, 'Тепляков', 'Кир', 'Федосиевич', '6QF1WB', 'Удален', '+7 (824) 893-24-03', 'М', 'Kar@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role, phone_number, sex, login, photo) VALUES (5, 'Рюриков', 'Юлий', 'Глебович', 'GwffgE', 'Администратор', '+7 (640) 701-31-91', 'М', 'Yli@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role, phone_number, sex, login, photo) VALUES (6, 'Беломестина', 'Василиса', 'Тимофеевна', 'd7iKKV', 'Администратор', '+7 (920) 920-74-47', 'Ж', 'Vasilisa@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role, phone_number, sex, login, photo) VALUES (7, 'Панькива', 'Галина', 'Якововна', '8KC7wJ', 'Менеджер А', '+7 (405) 088 73 89', 'Ж', 'Galina@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role, phone_number, sex, login, photo) VALUES (8, 'Зарубин', 'Мирон', 'Мечиславович', 'x58OAN', 'Администратор', '+7 (601) 195-02-09', 'М', 'Miron@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role, phone_number, sex, login, photo) VALUES (9, 'Веточкина', 'Всеслава', 'Андрияновна', 'fhDSBf', 'Менеджер С', '+7 (078) 429-57-86', 'Ж', 'Vseslava@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role, phone_number, sex, login, photo) VALUES (10, 'Рябова', 'Виктория', 'Елизаровна', '9mlPQJ', 'Удален', '+7 (639) 904-01-61', 'Ж', 'Victoria@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role, phone_number, sex, login, photo) VALUES (11, 'Федотов', 'Леон', 'Фёдорович', 'Wh4OYm', 'Менеджер А', '+7 (223) 326-49-59', 'М', 'Anisa@gmail.com', null);