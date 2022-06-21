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

INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (1, 2, 'Мега Белая Дача', 2, 1, 'Открыт', '2024-01-20', '2017-11-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (2, 2, 'Авиапарк', 7, 2, 'Ожидание', '2021-11-20', '2018-04-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (3, 5, 'Рио', 11, 4, 'Закрыт', '2012-11-20', '2028-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (4, 1, 'Гранд', 2, 5, 'Закрыт', '2018-10-20', '2016-09-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (5, 5, 'Лужайка', 7, 6, 'Ожидание', '2019-12-20', '2026-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (6, 2, 'Кунцево Плаза', 11, 7, 'Ожидание', '2016-12-20', '2012-05-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (7, 4, 'Мозаика', 2, 8, 'Ожидание', '2006-12-20', '2016-10-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (8, 2, 'Гранд', 11, 9, 'Закрыт', '2003-09-20', '2010-02-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (9, 2, 'Гранд', 2, 10, 'Ожидание', '2004-11-20', '2027-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (10, 4, 'Бутово Молл', 7, 11, 'Закрыт', '2008-11-20', '2016-01-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (11, 1, 'Гранд', 2, 12, 'Открыт', '2007-06-20', '2018-03-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (12, 1, 'Шоколад', 2, 13, 'Ожидание', '2015-11-20', '2020-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (13, 5, 'АфиМолл Сити', 11, 14, 'Закрыт', '2009-10-20', '2022-09-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (14, 5, 'Европейский', 7, 15, 'Ожидание', '2024-11-20', '2017-07-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (15, 1, 'Шереметьевский', 7, 16, 'Закрыт', '2020-07-20', '2007-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (16, 3, 'Шереметьевский', 11, 17, 'Открыт', '2004-02-20', '2008-07-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (17, 2, 'Мега Химки', 2, 18, 'Открыт', '2006-08-20', '2020-08-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (18, 1, 'Золотой Вавилон Ростокино', 7, 21, 'Открыт', '2023-05-20', '2013-05-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (19, 3, 'Шереметьевский', 2, 22, 'Ожидание', '2016-12-20', '2016-03-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (20, 3, 'Шереметьевский', 11, 23, 'Закрыт', '2024-08-20', '2004-08-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (21, 5, 'Ашан Сити Капитотлий', 2, 24, 'Ожидание', '2009-11-20', '2017-08-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (22, 4, 'Европейский', 7, 15, 'Ожидание', '2002-12-20', '2024-07-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (23, 2, 'Филион', 11, 26, 'Ожидание', '2023-11-20', '2006-08-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (24, 4, 'Гудзон', 7, 28, 'Открыт', '2002-05-20', '2024-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (25, 3, 'Кунцево Плаза', 2, 7, 'Ожидание', '2008-12-20', '2017-08-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (26, 3, 'Хорошо', 7, 31, 'Закрыт', '2014-11-20', '2019-04-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (27, 4, 'Щука', 11, 32, 'Ожидание', '2026-12-20', '2013-09-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (28, 1, 'Атриум', 2, 33, 'Закрыт', '2016-09-20', '2012-02-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (29, 3, 'Золотой Вавилон Ростокино', 2, 35, 'Закрыт', '2018-10-20', '2022-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (30, 4, 'Золотой Вавилон Ростокино', 2, 36, 'Закрыт', '2023-06-20', '2026-08-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (31, 3, 'Реутов Парк', 11, 37, 'Ожидание', '2018-12-20', '2023-05-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (32, 5, 'ГУМ', 7, 39, 'Открыт', '2001-04-20', '2019-12-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (34, 3, 'Новинский пассаж', 11, 40, 'Закрыт', '2008-10-20', '2021-07-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (35, 2, 'Фестиваль', 2, 41, 'Открыт', '2007-04-20', '2005-03-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (36, 1, 'Красный Кит', 7, 42, 'Ожидание', '2007-11-20', '2008-03-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (37, 3, 'Фестиваль', 2, 43, 'Открыт', '2015-07-20', '2025-04-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (38, 1, 'Отрада', 2, 44, 'Ожидание', '2009-12-20', '2002-12-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (39, 4, 'Фестиваль', 11, 45, 'Закрыт', '2005-08-20', '2014-06-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (40, 2, 'Времена Года', 11, 47, 'Открыт', '2019-08-20', '2002-09-20');
INSERT INTO production.rent (rent_id, renter_id, name, employer_id, pavilion_id, status, rent_start, rent_end) VALUES (41, 4, 'Времена Года', 7, 48, 'Закрыт', '2020-09-20', '2012-02-20');