create table medics (

    id varchar(36) not null,
    name varchar(100) not null,
    email varchar(100) not null unique,
    crm varchar(6) not null unique,
    specialty varchar(100) not null,
    street varchar(100) not null,
    neighborhood varchar(100) not null,
    zip varchar(9) not null,
    complement varchar(100),
    number varchar(20),
    state char(2) not null,
    city varchar(100) not null,

    primary key(id)
);