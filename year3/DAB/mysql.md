mysql -u [jmeno] -p


show databases;
show schemas;
+----------------------+
| Database	           |
+----------------------+
| a		               |
| b                    |
+----------------------+

create database [jmeno];
use [jmeno];

drop database [jmeno];

show tables;

data types
char
varchar
tinytext
text
blob
mediumtext
mediumblob
longtext
longblob

int
tinyint
smallint
mediumint
bigint

float
double
decimal

date
datetime
time
timestamp
year

create table tabulka (
    id INT NOT NULL AUTO_INCREMENT,
    jmeno VARCHAR(32) NOT NULL,
    prijmeni VARCHAR(32) NOT NULL,
    PRIMARY KEY ( id )
);

show create table [jmeno]

describe [jmeno]
						?	?
insert into tabulka (jmeno, prijmeni) VALUES ("jan", "till")

select * from [jmeno]

select [nazev_sloupce], [nazev_sloupce] from [nazev_tabulky]
select id, jmeno from tabulka

select [nazev_tabulky.nazev_sloupce], [nazev_tabulky.nazev_sloupce] from [nazev_tabulky]
select tabulka.id, tabulka.jmeno from tabulka

select jmeno as `Jmeno uzivatele`, prijmeni as `Prijmeni uzivatele` from tabulka

select * from `tabulka` where jmeno='vojtik'

select * from `tabulka` where id > 2
=
>
<
>=
<=
<> !=
LIKE
IN
BETWEEN

jmeno zacinajici pismenem v
select * from `tabulka` where jmeno like 'v%';

jmeno koncici pismenem a
select * from `tabulka` where jmeno like '%a';

vyskyt 'li' ve jmene
select * from `tabulka` where jmeno like '%li%';

druhe pismeno 'a'
select * from `tabulka` where jmeno like '_a%';

jmeno zacina na 'a' a konci na 'b'
select * from `tabulka` where jmeno like 'a%b';

prumer
select avg(cislo) from `cisla`;

pocet
select count(*) as pocet FROM `cisla`;

soucet
select sum(cislo) as soucet from `cisla`;

nejvetsi cislo
select max(cislo) as max from cisla;

nejmensi cislo
select min(cislo) as min from cisla;

nejmensi a nejvetsi cislo
select min(cislo) as min, max(cislo) as max from cisla;

nejmensi, prumer, nejvetsi
select min(cislo) as min, avg(cislo) as avg, max(cislo) as max from cisla;

aktualizace
update [nazev_tabulky] set [nazev_sloupce]='hodnota' where [nazev_sloupce]='hodnota';
update tabulka set prijmeni='nekoparu' where jmeno='vojtik';

prenastaveni nekolika hodnot
update tabulka set jmeno='pawel', prijmeni='mlikes';

smazani
delete from tabulka where id = 2;;
delete from tabulka where prijmeni='mlikess';

smaz z tabulky kde jmeno se rovna 'pawela' a zaroven se prijmeni rovna 'mlikesa';
delete from tabulka where jmeno='pawela' and prijmeni='mlikesa';

smazani vsech zaznamu z tabulky
delete from tabulka;

uprava tabulky

alter table cisla 
add cislo2 int;

odstraneni tabulky
drop table [nazev_tabulky]
drop table tabulka

CRUD
Create - insert into 
Read - select 
Update - update
Delete - delete







