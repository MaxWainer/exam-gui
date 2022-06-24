DROP DATABASE IF EXISTS production;
CREATE DATABASE production;

USE production;

create table centers
(
    center_id      int          not null
        primary key,
    name           varchar(255) null,
    status         varchar(255) null,
    pavilion_count int          null,
    city           varchar(255) null,
    price          double       null,
    value_factor   text         null,
    floor_count    int          null,
    picture        text         null
);

INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (1, 'Ривьера', 'План', 0, 'Москва', 8260042, '0,5', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (2, 'Авиапарк', 'Строительство', 9, 'Санкт-Петербург', 3297976, '0,1', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (3, 'Мега Белая Дача', 'Удален', 16, 'Новосибирск', 9006645, '1,7', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (4, 'Рио', 'Реализация', 5, 'Екатеринбург', 1888653, '0,5', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (5, 'Вегас', 'План', 0, 'Нижний Новгород', 7567411, '0.4', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (6, 'Лужайка', 'Строительство', 10, 'Казань', 4603336, '0,8', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (7, 'Кунцево Плаза', 'Строительство', 8, 'Челябинск', 6797653, '1,1', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (8, 'Мозаика', 'Строительство', 20, 'Самара', 1429419, '0,0', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (9, 'Океания', 'План', 0, 'Самара', 5192089, '1,8', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (10, 'Гранд', 'Строительство', 20, 'Ростов-на-Дону', 2573981, '0,1', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (11, 'Бутово Молл', 'План', 0, 'Москва', 5327641, '1,7', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (12, 'Рига Молл', 'План', 0, 'Ростов-на-Дону', 9788316, '0.7', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (13, 'Шоколад', 'Строительство', 12, 'Челябинск', 2217279, '1,1', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (14, 'АфиМолл Сити', 'Реализация', 9, 'Санкт-Петербург', 8729160, '0,9', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (15, 'Европейский', 'Строительство', 9, 'Москва', 5690500, '0,7', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (16, 'Гагаринский', 'План', 0, 'Екатеринбург', 1508807, '1,6', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (17, 'Метрополис', 'План', 0, 'Санкт-Петербург', 8117913, '0,0', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (18, 'Мега Химки', 'Реализация', 3, 'Нижний Новгород', 3373234, '0,4', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (19, 'Москва', 'Реализация', 12, 'Москва', 4226505, '0,3', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (20, 'Вегас Кунцево', 'Реализация', 12, 'Москва', 3878254, '0,2', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (21, 'Город Лефортово', 'Удален', 12, 'Новосибирск', 1966214, '1,7', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (22, 'Золотой Вавилон Ростокино', 'Реализация', 16, 'Екатеринбург', 1632702, '1,8', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (23, 'Шереметьевский', 'Строительство', 16, 'Новосибирск', 2941379, '1,0', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (24, 'Ханой-Москва', 'План', 0, 'Самара', 9580221, '0,3', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (25, 'Ашан Сити Капитолий', 'Строительство', 4, 'Екатеринбург', 5309117, '1,9', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (26, 'Черемушки', 'Реализация', 15, 'Новосибирск', 7344604, '1,0', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (27, 'Филион', 'Строительство', 8, 'Москва', 5343904, '0,3', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (28, 'Весна', 'Удален', 3, 'Нижний Новгород', 4687701, '0,8', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (29, 'Гудзон', 'Реализация', 3, 'Екатеринбург', 7414460, '0,0', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (30, 'Калейдоскоп', 'Реализация', 10, 'Новосибирск', 7847659, '0,7', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (31, 'Новомосковский', 'План', 0, 'Казань', 7161962.85, '0,4', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (32, 'Хорошо', 'Реализация', 20, 'Ростов-на-Дону', 8306576, '1,9', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (33, 'Щука', 'Строительство', 5, 'Нижний Новгород', 5428485, '0,4', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (34, 'Атриум', 'Реализация', 4, 'Казань', 5059779, '0,2', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (35, 'Принц Плаза', 'Реализация', 8, 'Самара', 1786688, '1,5', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (36, 'Облака', 'План', 0, 'Санкт-Петербург', 1688905, '0,6', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (37, 'Три Кита', 'План', 0, 'Казань', 3089700, '1,7', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (38, 'Реутов Парк', 'Строительство', 4, 'Ростов-на-Дону', 1995904, '1,5', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (39, 'ЕвроПарк', 'Удален', 20, 'Новосибирск', 9391338, '0,7', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (40, 'ГУМ', 'Реализация', 5, 'Санкт-Петербург', 6731491, '1,9', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (41, 'Райкин Плаза', 'Строительство', 12, 'Санкт-Петербург', 8498470, '1,8', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (42, 'Новинский пассаж', 'Реализация', 8, 'Екатеринбург', 3158957, '1,7', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (43, 'Наш Гипермаркет', 'План', 0, 'Ростов-на-Дону', 1088735, '1,2', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (44, 'Красный Кит', 'Строительство', 9, 'Казань', 1912149, '1,1', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (45, 'Мегаполис', 'План', 0, 'Челябинск', 2175218.5, '0,5', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (46, 'Отрада', 'Строительство', 4, 'Санкт-Петербург', 6760316, '0,9', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (47, 'Твой дом', 'План', 0, 'Челябинск', 6810865, '1,7', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (48, 'Фестиваль', 'Удален', 16, 'Новосибирск', 1828013, '0.2', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (49, 'Времена Года', 'Реализация', 15, 'Екатеринбург', 2650484, '1,7', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor,
                                floor_count,
                                picture)
VALUES (50, 'Армада', 'План', 0, 'Ростов-на-Дону', 9172489, '0,9', 1, '');

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
    sex          char(1) charset utf8      not null,
    login        varchar(255) charset utf8 not null,
    photo        blob                      null
);

INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role,
                                  phone_number, sex, login,
                                  photo)
VALUES (1, 'Чашин', 'Елизар', 'Михеевич', 'yntiRS', 'Администратор', '+7 (107) 628-29-16', 'М',
        'Elizor@gmail.com',
        null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role,
                                  phone_number, sex, login,
                                  photo)
VALUES (2, 'Филенкова', 'Владлена', 'Олеговна', '07i7Lb', 'Менеджер А', '+7 (334) 146-01-51', 'Ж',
        'Vladlena@gmail.com',
        null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role,
                                  phone_number, sex, login,
                                  photo)
VALUES (3, 'Ломовцев', 'Адам', 'Владимирович', '7SP9CV', 'Менеджер С', '+7 (856) 519-32-99', 'М',
        'Adam@gmail.com',
        null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role,
                                  phone_number, sex, login,
                                  photo)
VALUES (4, 'Тепляков', 'Кир', 'Федосиевич', '6QF1WB', 'Удален', '+7 (824) 893-24-03', 'М',
        'Kar@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role,
                                  phone_number, sex, login,
                                  photo)
VALUES (5, 'Рюриков', 'Юлий', 'Глебович', 'GwffgE', 'Администратор', '+7 (640) 701-31-91', 'М',
        'Yli@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role,
                                  phone_number, sex, login,
                                  photo)
VALUES (6, 'Беломестина', 'Василиса', 'Тимофеевна', 'd7iKKV', 'Администратор', '+7 (920) 920-74-47',
        'Ж',
        'Vasilisa@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role,
                                  phone_number, sex, login,
                                  photo)
VALUES (7, 'Панькива', 'Галина', 'Якововна', '8KC7wJ', 'Менеджер А', '+7 (405) 088 73 89', 'Ж',
        'Galina@gmail.com',
        null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role,
                                  phone_number, sex, login,
                                  photo)
VALUES (8, 'Зарубин', 'Мирон', 'Мечиславович', 'x58OAN', 'Администратор', '+7 (601) 195-02-09', 'М',
        'Miron@gmail.com',
        null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role,
                                  phone_number, sex, login,
                                  photo)
VALUES (9, 'Веточкина', 'Всеслава', 'Андрияновна', 'fhDSBf', 'Менеджер С', '+7 (078) 429-57-86',
        'Ж',
        'Vseslava@gmail.com', null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role,
                                  phone_number, sex, login,
                                  photo)
VALUES (10, 'Рябова', 'Виктория', 'Елизаровна', '9mlPQJ', 'Удален', '+7 (639) 904-01-61', 'Ж',
        'Victoria@gmail.com',
        null);
INSERT INTO production.employers (employer_id, second_name, name, patronymic, password, role,
                                  phone_number, sex, login,
                                  photo)
VALUES (11, 'Федотов', 'Леон', 'Фёдорович', 'Wh4OYm', 'Менеджер А', '+7 (223) 326-49-59', 'М',
        'Anisa@gmail.com', null);

create table pavilions
(
    pavilion_id      int auto_increment
        primary key,
    center_id        int                       not null,
    pavilion_number  varchar(25) charset utf8  not null,
    floor            int                       not null,
    status           varchar(255) charset utf8 not null,
    square           int                       not null,
    price_per_square double                    not null,
    value_factor     float                     not null,
    constraint pavilions_centers_center_id_fk
        foreign key (center_id) references centers (center_id)
);

INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (1, 3, '88А', 1, 'Свободен', 75, 3308, 0.1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (2, 2, '40А', 3, 'Забронировано', 96, 690, 1.1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (3, 3, '76Б', 2, 'Удален', 199, 4938, 0.9);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (4, 4, '61А', 1, 'Арендован', 186, 2115, 0.9);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (5, 10, '58В', 4, 'Арендован', 98, 1306, 1.9);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (6, 6, '7А', 2, 'Забронировано', 187, 2046, 1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (7, 7, '13Б', 1, 'Забронировано', 141, 1131, 0.1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (8, 8, '60В', 2, 'Забронировано', 94, 361, 0.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (9, 10, '56А', 1, 'Арендован', 148, 1163, 0.6);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (10, 10, '63Г', 2, 'Забронировано', 153, 3486, 0.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (11, 11, '8Г', 1, 'Арендован', 122, 2451, 1.5);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (12, 10, '94В', 3, 'Свободен', 132, 4825, 2);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (13, 13, '87Г', 1, 'Забронировано', 174, 793, 1.5);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (14, 14, '93В', 1, 'Арендован', 165, 4937, 0.8);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (15, 15, '10А', 3, 'Забронировано', 168, 1353, 1.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (16, 23, '53Г', 1, 'Арендован', 99, 3924, 1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (17, 23, '73В', 2, 'Свободен', 116, 3418, 0);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (18, 18, '89Б', 1, 'Свободен', 92, 562, 0.4);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (19, 20, '65А', 2, 'Забронирован', 95, 1381, 1.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (20, 21, '16Г', 2, 'Удален', 150, 747, 0.8);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (21, 22, '61Б', 1, 'Свободен', 58, 1032, 1.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (22, 23, '34Б', 4, 'Забронировано', 102, 4715, 0.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (23, 23, '91Г', 3, 'Арендован', 171, 1021, 1.2);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (24, 25, '70Г', 1, 'Забронировано', 83, 2246, 1.4);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (25, 26, '10А', 1, 'Забронировано', 187, 2067, 0);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (26, 27, '80Г', 1, 'Забронировано', 117, 1049, 1.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (27, 28, '2Б', 1, 'Удален', 176, 1673, 1.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (28, 29, '41А', 1, 'Свободен', 108, 344, 0);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (29, 30, '16Г', 2, 'Арендован', 125, 1037, 1.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (30, 22, '13Б', 2, 'Свободен', 161, 2775.7, 0.4);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (31, 32, '83Г', 2, 'Арендован', 85, 4584, 0.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (32, 33, '9Г', 1, 'Забронировано', 131, 2477, 1.5);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (33, 34, '49Г', 1, 'Арендован', 164, 2728, 0.9);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (34, 35, '1Г', 1, 'Удален', 157, 1963, 1.6);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (35, 22, '37А', 3, 'Арендован', 187, 3173, 0.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (36, 22, '38Г', 4, 'Арендован', 97, 1364, 0.5);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (37, 38, '27В', 1, 'Забронировано', 96, 3134, 0.1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (38, 39, '67Б', 1, 'Удален', 55, 4442, 0.8);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (39, 40, '86Г', 1, 'Свободен', 58, 3707, 0.5);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (40, 42, '11Г', 2, 'Арендован', 194, 827, 0.6);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (41, 48, '42В', 1, 'Свободен', 166, 4216, 0.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (42, 44, '55А', 2, 'Забронировано', 127, 703, 1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (43, 48, '6Б', 2, 'Свободен', 119, 3262, 1.9);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (44, 46, '15А', 1, 'Забронировано', 90, 1569, 1.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (45, 48, '27Б', 3, 'Арендован', 132, 627, 0.4);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (46, 48, '65Б', 4, 'Удален', 60, 3052, 0.6);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (47, 49, '26А', 1, 'Свободен', 95, 670, 1.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square,
                                  price_per_square,
                                  value_factor)
VALUES (48, 49, '53В', 3, 'Арендован', 132, 510, 1.2);

create table renters
(
    renter_id int auto_increment
        primary key,
    name      varchar(255) charset utf8 not null,
    phone     varchar(255) charset utf8 not null,
    address   varchar(255) charset utf8 not null
);

INSERT INTO production.renters (renter_id, name, phone, address)
VALUES (1, 'AG Marine', '+7 (495) 526-14-53', 'Москва, Бабаевская улица д.16');
INSERT INTO production.renters (renter_id, name, phone, address)
VALUES (2, 'Art-elle', '+7 (495) 250-58-94', 'Санкт-Петербург, Амбарная улица д.25 корп.1');
INSERT INTO production.renters (renter_id, name, phone, address)
VALUES (3, 'Atlantis', '+7 (495) 424-11-65', 'Новосибирск, Улица Каменская д.16');
INSERT INTO production.renters (renter_id, name, phone, address)
VALUES (4, 'Corporate Travel', '+7 (495) 245-39-05', 'Екатеринбург, Улица Антона Валека д.56');
INSERT INTO production.renters (renter_id, name, phone, address)
VALUES (5, 'GallaDance', '+7 (495) 316-77-94', 'Нижний Новгород, Улица Ларина д. 34');

create table rent
(
    rent_id     int auto_increment
        primary key,
    renter_id   int                       not null,
    name        varchar(255) charset utf8 not null,
    employer_id int                       not null,
    pavilion_id int                       not null,
    status      varchar(255) charset utf8 not null,
    rent_start  date                      not null,
    rent_end    date                      not null,
    constraint rent_employers_employer_id_fk
        foreign key (employer_id) references employers (employer_id),
    constraint rent_pavilions_pavilion_id_fk
        foreign key (pavilion_id) references pavilions (pavilion_id),
    constraint rent_renters_renter_id_fk
        foreign key (renter_id) references renters (renter_id)
);

INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (1, 2, 'Мега Белая Дача', 2, 1, 'Открыт', '2024-01-20', '2017-11-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (2, 2, 'Авиапарк', 7, 2, 'Ожидание', '2021-11-20', '2018-04-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (3, 5, 'Рио', 11, 4, 'Закрыт', '2012-11-20', '2028-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (4, 1, 'Гранд', 2, 5, 'Закрыт', '2018-10-20', '2016-09-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (5, 5, 'Лужайка', 7, 6, 'Ожидание', '2019-12-20', '2026-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (6, 2, 'Кунцево Плаза', 11, 7, 'Ожидание', '2016-12-20', '2012-05-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (7, 4, 'Мозаика', 2, 8, 'Ожидание', '2006-12-20', '2016-10-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (8, 2, 'Гранд', 11, 9, 'Закрыт', '2003-09-20', '2010-02-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (9, 2, 'Гранд', 2, 10, 'Ожидание', '2004-11-20', '2027-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (10, 4, 'Бутово Молл', 7, 11, 'Закрыт', '2008-11-20', '2016-01-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (11, 1, 'Гранд', 2, 12, 'Открыт', '2007-06-20', '2018-03-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (12, 1, 'Шоколад', 2, 13, 'Ожидание', '2015-11-20', '2020-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (13, 5, 'АфиМолл Сити', 11, 14, 'Закрыт', '2009-10-20', '2022-09-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (14, 5, 'Европейский', 7, 15, 'Ожидание', '2024-11-20', '2017-07-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (15, 1, 'Шереметьевский', 7, 16, 'Закрыт', '2020-07-20', '2007-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (16, 3, 'Шереметьевский', 11, 17, 'Открыт', '2004-02-20', '2008-07-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (17, 2, 'Мега Химки', 2, 18, 'Открыт', '2006-08-20', '2020-08-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (18, 1, 'Золотой Вавилон Ростокино', 7, 21, 'Открыт', '2023-05-20', '2013-05-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (19, 3, 'Шереметьевский', 2, 22, 'Ожидание', '2016-12-20', '2016-03-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (20, 3, 'Шереметьевский', 11, 23, 'Закрыт', '2024-08-20', '2004-08-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (21, 5, 'Ашан Сити Капитотлий', 2, 24, 'Ожидание', '2009-11-20', '2017-08-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (22, 4, 'Европейский', 7, 15, 'Ожидание', '2002-12-20', '2024-07-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (23, 2, 'Филион', 11, 26, 'Ожидание', '2023-11-20', '2006-08-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (24, 4, 'Гудзон', 7, 28, 'Открыт', '2002-05-20', '2024-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (25, 3, 'Кунцево Плаза', 2, 7, 'Ожидание', '2008-12-20', '2017-08-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (26, 3, 'Хорошо', 7, 31, 'Закрыт', '2014-11-20', '2019-04-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (27, 4, 'Щука', 11, 32, 'Ожидание', '2026-12-20', '2013-09-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (28, 1, 'Атриум', 2, 33, 'Закрыт', '2016-09-20', '2012-02-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (29, 3, 'Золотой Вавилон Ростокино', 2, 35, 'Закрыт', '2018-10-20', '2022-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (30, 4, 'Золотой Вавилон Ростокино', 2, 36, 'Закрыт', '2023-06-20', '2026-08-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (31, 3, 'Реутов Парк', 11, 37, 'Ожидание', '2018-12-20', '2023-05-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (32, 5, 'ГУМ', 7, 39, 'Открыт', '2001-04-20', '2019-12-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (34, 3, 'Новинский пассаж', 11, 40, 'Закрыт', '2008-10-20', '2021-07-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (35, 2, 'Фестиваль', 2, 41, 'Открыт', '2007-04-20', '2005-03-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (36, 1, 'Красный Кит', 7, 42, 'Ожидание', '2007-11-20', '2008-03-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (37, 3, 'Фестиваль', 2, 43, 'Открыт', '2015-07-20', '2025-04-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (38, 1, 'Отрада', 2, 44, 'Ожидание', '2009-12-20', '2002-12-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (39, 4, 'Фестиваль', 11, 45, 'Закрыт', '2005-08-20', '2014-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (40, 2, 'Времена Года', 11, 47, 'Открыт', '2019-08-20', '2002-09-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start,
                             rent_end)
VALUES (41, 4, 'Времена Года', 7, 48, 'Закрыт', '2020-09-20', '2012-02-20');