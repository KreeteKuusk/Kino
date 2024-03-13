create table movie
(
    id             Integer primary KEY AUTO_INCREMENT,
    name           varchar(50) NOT NULL,
    genre          varchar(50) NOT NULL,
    language       varchar(50) NOT NULL,
    ageRestriction int,
    startTime      varchar(50) NOT NULL
);

--INSERT INTO movies (name, genre, language, ageRestriction, startTime)
--VALUES ('Dune', 'adventure', 'estonian', 12, '2024-03-14 18:00:00');
       --('Bolt', 'family', 'estonian', 0, '2024-03-14 18:00:00');

