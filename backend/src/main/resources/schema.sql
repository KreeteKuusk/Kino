create table movie
(
    id             Integer primary KEY AUTO_INCREMENT,
    name           varchar(50) NOT NULL,
    genre          varchar(50) NOT NULL,
    language       varchar(50) NOT NULL,
    ageRestriction int,
    startTime      varchar(50) NOT NULL
);
