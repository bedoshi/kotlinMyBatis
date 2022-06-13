CREATE DATABASE sample;
USE sample;

CREATE TABLE member(
    id INTEGER,
    blood varchar(20),
    name varchar(20),
    corp varchar(20)
);

INSERT INTO
    member(id, blood, name, corp)
VALUES
    (1, 'A', 'YAMADA', 'EXAMPLE CORP'),
    (2, 'B', 'YAMASHITA', 'EXAMPLE CORP'),
    (3, 'O', 'NAKAYAMA', 'EXAMPLE ALPHA CORP'),
    (4, 'AB', 'NAGATO', 'EXAMPLE CORP')
;
