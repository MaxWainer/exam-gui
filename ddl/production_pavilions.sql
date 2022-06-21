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

INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (1, 3, '88А', 1, 'Свободен', 75, 3308, 0.1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (2, 2, '40А', 3, 'Забронировано', 96, 690, 1.1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (3, 3, '76Б', 2, 'Удален', 199, 4938, 0.9);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (4, 4, '61А', 1, 'Арендован', 186, 2115, 0.9);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (5, 10, '58В', 4, 'Арендован', 98, 1306, 1.9);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (6, 6, '7А', 2, 'Забронировано', 187, 2046, 1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (7, 7, '13Б', 1, 'Забронировано', 141, 1131, 0.1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (8, 8, '60В', 2, 'Забронировано', 94, 361, 0.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (9, 10, '56А', 1, 'Арендован', 148, 1163, 0.6);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (10, 10, '63Г', 2, 'Забронировано', 153, 3486, 0.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (11, 11, '8Г', 1, 'Арендован', 122, 2451, 1.5);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (12, 10, '94В', 3, 'Свободен', 132, 4825, 2);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (13, 13, '87Г', 1, 'Забронировано', 174, 793, 1.5);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (14, 14, '93В', 1, 'Арендован', 165, 4937, 0.8);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (15, 15, '10А', 3, 'Забронировано', 168, 1353, 1.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (16, 23, '53Г', 1, 'Арендован', 99, 3924, 1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (17, 23, '73В', 2, 'Свободен', 116, 3418, 0);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (18, 18, '89Б', 1, 'Свободен', 92, 562, 0.4);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (19, 20, '65А', 2, 'Забронирован', 95, 1381, 1.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (20, 21, '16Г', 2, 'Удален', 150, 747, 0.8);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (21, 22, '61Б', 1, 'Свободен', 58, 1032, 1.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (22, 23, '34Б', 4, 'Забронировано', 102, 4715, 0.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (23, 23, '91Г', 3, 'Арендован', 171, 1021, 1.2);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (24, 25, '70Г', 1, 'Забронировано', 83, 2246, 1.4);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (25, 26, '10А', 1, 'Забронирован', 187, 2067, 0);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (26, 27, '80Г', 1, 'Забронировано', 117, 1049, 1.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (27, 28, '2Б', 1, 'Удален', 176, 1673, 1.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (28, 29, '41А', 1, 'Свободен', 108, 344, 0);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (29, 30, '16Г', 2, 'Арендован', 125, 1037, 1.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (30, 22, '13Б', 2, 'Свободен', 161, 2775.7, 0.4);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (31, 32, '83Г', 2, 'Арендован', 85, 4584, 0.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (32, 33, '9Г', 1, 'Забронировано', 131, 2477, 1.5);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (33, 34, '49Г', 1, 'Арендован', 164, 2728, 0.9);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (34, 35, '1Г', 1, 'Удален', 157, 1963, 1.6);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (35, 22, '37А', 3, 'Арендован', 187, 3173, 0.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (36, 22, '38Г', 4, 'Арендован', 97, 1364, 0.5);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (37, 38, '27В', 1, 'Забронировано', 96, 3134, 0.1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (38, 39, '67Б', 1, 'Удален', 55, 4442, 0.8);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (39, 40, '86Г', 1, 'Свободен', 58, 3707, 0.5);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (40, 42, '11Г', 2, 'Арендован', 194, 827, 0.6);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (41, 48, '42В', 1, 'Свободен', 166, 4216, 0.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (42, 44, '55А', 2, 'Забронировано', 127, 703, 1);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (43, 48, '6Б', 2, 'Свободен', 119, 3262, 1.9);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (44, 46, '15А', 1, 'Забронировано', 90, 1569, 1.3);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (45, 48, '27Б', 3, 'Арендован', 132, 627, 0.4);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (46, 48, '65Б', 4, 'Удален', 60, 3052, 0.6);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (47, 49, '26А', 1, 'Свободен', 95, 670, 1.7);
INSERT INTO production.pavilions (pavilion_id, center_id, pavilion_number, floor, status, square, price_per_square, value_factor) VALUES (48, 49, '53В', 3, 'Арендован', 132, 510, 1.2);