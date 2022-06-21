create table renters
(
    renter_id int auto_increment
        primary key,
    name      varchar(255) charset utf8 not null,
    phone     varchar(255) charset utf8 not null,
    address   varchar(255) charset utf8 not null
);

INSERT INTO production.renters (renter_id, name, phone, address) VALUES (1, 'AG Marine', '+7 (495) 526-14-53', 'Москва, Бабаевская улица д.16');
INSERT INTO production.renters (renter_id, name, phone, address) VALUES (2, 'Art-elle', '+7 (495) 250-58-94', 'Санкт-Петербург, Амбарная улица д.25 корп.1');
INSERT INTO production.renters (renter_id, name, phone, address) VALUES (3, 'Atlantis', '+7 (495) 424-11-65', 'Новосибирск, Улица Каменская д.16');
INSERT INTO production.renters (renter_id, name, phone, address) VALUES (4, 'Corporate Travel', '+7 (495) 245-39-05', 'Екатеринбург, Улица Антона Валека д.56');
INSERT INTO production.renters (renter_id, name, phone, address) VALUES (5, 'GallaDance', '+7 (495) 316-77-94', 'Нижний Новгород, Улица Ларина д. 34');