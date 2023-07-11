CREATE TABLE persons (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO persons (name, age) VALUES ('John', 30);
INSERT INTO persons (name, age) VALUES ('Jane', 25);