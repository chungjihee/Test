create table nov08_fruit(
	f_name varchar2(7 char) primary key,
	f_price number(5) not null
);

drop table nov08_fruit cascade constraint purge;
select * from nov08_fruit;

insert into nov08_fruit values('포도', 3000);
insert into nov08_fruit values('파인애플', 6000);
insert into nov08_fruit values('사과', 2000);
insert into nov08_fruit values('바나나', 3500);
insert into nov08_fruit values('자두', 1500);

---- gift 테이블

create table nov08_gift(
	g_name varchar2(7 char) primary key,
	g_price number(5) not null,
	g_brand varchar2(7 char) not null
);

drop table nov08_gift cascade constraint purge;

create sequence g_no_seq;
drop sequence g_no_seq;

select * from nov08_gift;

insert into nov08_gift values('신발', 20000, '나이키');
insert into nov08_gift values('모자', 30000, 'MLB');
insert into nov08_gift values('팔찌', 40000, 'Gold');
insert into nov08_gift values('목걸이', 60000, '보세');
insert into nov08_gift values('아우터', 80000, '노스페이스');


