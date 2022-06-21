create table centers
(
    center_id      int    not null
        primary key,
    name           text   null,
    status         text   null,
    pavilion_count int    null,
    city           text   null,
    price          double null,
    value_factor   text   null,
    floor_count    int    null,
    picture        text   null
);

INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (1, 'Ривьера', 'План', 0, 'Москва', 8260042, '0,5', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (2, 'Авиапарк', 'Строительсто', 9, 'Санкт-Петербург', 3297976, '0,1', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (3, 'Мега Белая Дача', 'Удален', 16, 'Новосибирск', 9006645, '1,7', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (4, 'Рио', 'Реализация', 5, 'Екатеринбург', 1888653, '0,5', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (5, 'Вегас', 'План', 0, 'Нижний Новгород', 7567411, '0.4', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (6, 'Лужайка', 'Строительсто', 10, 'Казань', 4603336, '0,8', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (7, 'Кунцево Плаза', 'Строительсто', 8, 'Челябинск', 6797653, '1,1', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (8, 'Мозаика', 'Строительсто', 20, 'Самара', 1429419, '0,0', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (9, 'Океания', 'План', 0, 'Самара', 5192089, '1,8', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (10, 'Гранд', 'Строительсто', 20, 'Ростов-на-Дону', 2573981, '0,1', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (11, 'Бутово Молл', 'План', 0, 'Москва', 5327641, '1,7', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (12, 'Рига Молл', 'План', 0, 'Ростов-на-Дону', 9788316, '0.7', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (13, 'Шоколад', 'Строительсто', 12, 'Челябинск', 2217279, '1,1', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (14, 'АфиМолл Сити', 'Реализация', 9, 'Санкт-Петербург', 8729160, '0,9', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (15, 'Европейский', 'Строительсто', 9, 'Москва', 5690500, '0,7', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (16, 'Гагаринский', 'План', 0, 'Екатеринбург', 1508807, '1,6', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (17, 'Метрополис', 'План', 0, 'Санкт-Петербург', 8117913, '0,0', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (18, 'Мега Химки', 'Реализация', 3, 'Нижний Новгород', 3373234, '0,4', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (19, 'Москва', 'Реализация', 12, 'Москва', 4226505, '0,3', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (20, 'Вегас Кунцево', 'Реализация', 12, 'Москва', 3878254, '0,2', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (21, 'Город Лефортово', 'Удален', 12, 'Новосибирск', 1966214, '1,7', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (22, 'Золотой Вавилон Ростокино', 'Реализация', 16, 'Екатеринбург', 1632702, '1,8', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (23, 'Шереметьевский', 'Строительсто', 16, 'Новосибирск', 2941379, '1,0', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (24, 'Ханой-Москва', 'План', 0, 'Самара', 9580221, '0,3', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (25, 'Ашан Сити Капитолий', 'Строительсто', 4, 'Екатеринбург', 5309117, '1,9', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (26, 'Черемушки', 'Реализация', 15, 'Новосибирск', 7344604, '1,0', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (27, 'Филион', 'Строительсто', 8, 'Москва', 5343904, '0,3', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (28, 'Весна', 'Удален', 3, 'Нижний Новгород', 4687701, '0,8', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (29, 'Гудзон', 'Реализация', 3, 'Екатеринбург', 7414460, '0,0', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (30, 'Калейдоскоп', 'Реализация', 10, 'Новосибирск', 7847659, '0,7', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (31, 'Новомосковский', 'План', 0, 'Казань', 7161962.85, '0,4', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (32, 'Хорошо', 'Реализация', 20, 'Ростов-на-Дону', 8306576, '1,9', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (33, 'Щука', 'Строительсто', 5, 'Нижний Новгород', 5428485, '0,4', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (34, 'Атриум', 'Реализация', 4, 'г. Казань', 5059779, '0,2', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (35, 'Принц Плаза', 'Реализация', 8, 'Самара', 1786688, '1,5', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (36, 'Облака', 'План', 0, 'Санкт-Петербург', 1688905, '0,6', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (37, 'Три Кита', 'План', 0, 'Казань', 3089700, '1,7', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (38, 'Реутов Парк', 'Строительсто', 4, 'Ростов-на-Дону', 1995904, '1,5', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (39, 'ЕвроПарк', 'Удален', 20, 'Новосибирск', 9391338, '0,7', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (40, 'ГУМ', 'Реализация', 5, 'Санкт-Петербург', 6731491, '1,9', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (41, 'Райкин Плаза', 'Строительсто', 12, 'Санкт-Петербург', 8498470, '1,8', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (42, 'Новинский пассаж', 'Реализация', 8, 'Екатеринбург', 3158957, '1,7', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (43, 'Наш Гипермаркет', 'План', 0, 'Ростов-на-Дону', 1088735, '1,2', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (44, 'Красный Кит', 'Строительсто', 9, 'Казань', 1912149, '1,1', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (45, 'Мегаполис', 'План', 0, 'Челябинск', 2175218.5, '0,5', 2, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (46, 'Отрада', 'Строительсто', 4, 'Санкт-Петербург', 6760316, '0,9', 1, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (47, 'Твой дом', 'План', 0, 'Челябинск', 6810865, '1,7', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (48, 'Фестиваль', 'Удален', 16, 'Новосибирск', 1828013, '0.2', 4, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (49, 'Времена Года', 'Реализация', 15, 'Екатеринбург', 2650484, '1,7', 3, '');
INSERT INTO production.centers (center_id, name, status, pavilion_count, city, price, value_factor, floor_count, picture) VALUES (50, 'Армада', 'План', 0, 'Ростов-на-Дону', 9172489, '0,9', 1, '');