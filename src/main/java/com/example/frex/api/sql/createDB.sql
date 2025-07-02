DROP SCHEMA public CASCADE;
CREATE SCHEMA public;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO public;

CREATE TABLE frex (
                      id BIGINT PRIMARY KEY,
                      name TEXT NOT NULL
);
ALTER TABLE frex OWNER TO postgres;

CREATE TABLE products (
                          id BIGINT PRIMARY KEY,
                          product_name TEXT,
                          price INT,
                          category TEXT
);
ALTER TABLE products OWNER TO postgres;
