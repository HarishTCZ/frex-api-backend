DROP SCHEMA public CASCADE;
CREATE SCHEMA public;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO public;

CREATE TABLE frex
(
    id bigint PRIMARY KEY,
    name TEXT NOT NULL
);
ALTER TABLE frex owner to postgres;


--product table
CREATE TABLE products
(
    id bigint PRIMARY KEY ,
    productname text,
    price int,
    category text

);
ALTER TABLE products owner to postgres;
-- Figure out how to connect it to local postgres
