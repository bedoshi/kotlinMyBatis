-- DB作成
CREATE DATABASE sample;
USE sample;
-- テーブル作成
CREATE TABLE item(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(10),
    price INTEGER,
    type INTEGER
);
-- データ挿入
INSERT INTO
    item(name, price, type)
VALUES
    ('Apple', 150, 1),
    ('Onion', 60, 2),
    ('Cherry', 300, 1),
    ('Carrot', 70, 2),
    ('Banana', 80, 1)
;
