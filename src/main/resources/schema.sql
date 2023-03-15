create table category (
    id bigint NOT NULL AUTO_INCREMENT,
    category_name varchar(30) NOT NULL,
    display bit NOT NULL DEFAULT 0,
    deleted bit NOT NULL DEFAULT 0,
    primary key(id)
);
create table post (
    id bigint NOT NULL AUTO_INCREMENT,
    category_name varchar(30) NOT NULL,
    display bit NOT NULL DEFAULT 0,
    deleted bit NOT NULL DEFAULT 0,
    primary key(id)
);
create table file (
    id bigint NOT NULL AUTO_INCREMENT,
    category_name varchar(30) NOT NULL,
    display bit NOT NULL DEFAULT 0,
    deleted bit NOT NULL DEFAULT 0,
    primary key(id)
);create table board (
    id bigint NOT NULL AUTO_INCREMENT,
    category_name varchar(30) NOT NULL,
    display bit NOT NULL DEFAULT 0,
    deleted bit NOT NULL DEFAULT 0,
    primary key(id)
);