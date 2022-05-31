--liquibase formatted sql

--changeset jevgenijs:1

CREATE TABLE car(
    id SERIAL PRIMARY KEY,
    make VARCHAR (255) NOT NULL,
    model VARCHAR (255) NOT NULL,
    production_year INT NOT NULL,
    vin_number VARCHAR (255) NOT NULL,
    registration_number VARCHAR (255) NOT NULL
)

--changeset jevgenijs:2

INSERT INTO car(
    MAKE,
    MODEL,
    PRODUCTION_YEAR,
    VIN_NUMBER,
    REGISTRATION_NUMBER
)
VALUES
    ('BMW', '3-Series 328i Wagon', 2009, 'JH4KA4563LC001865', 'ZX-59'),
    ('BMW', '5-Series Executive Midsize Sedan', 2009, 'JH4KA4563LC001865', 'ZX-59'),
    ('Bentley', 'Continental GTC Base', 2005, 'JTJZB1BA8A2400307', 'XX-55'),
    ('Audi', 'A3 Attraction Convertible', 2022, '1FDLF47M6REA05016', 'MZ-89'),
    ('Aston Martin', 'Martin DB11 Coupe', 1997, '1B3ES66S63D169269', 'XO-222'),
    ('Bugatti', 'Veyron', 2001, 'WAULF78K89N032914', 'X-8'),
    ('Ford', 'Everest Ambiente', 2015, 'JNKCV54E46M706213', 'JD-441');