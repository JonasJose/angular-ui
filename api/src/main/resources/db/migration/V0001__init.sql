create table cliente
(
    id   serial8
        constraint cliente_pk
            primary key,
    nome varchar(255)
);