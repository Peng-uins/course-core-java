create table user_info(
    u_id int primary key auto_increment,
    u_name varchar(50) not null,
    u_password varchar(50) not null,
    age int
);


insert into user_info(u_id, u_name, u_password, age) values
(1,'user1','123',19),
(2,'user1','123',19);

select * from user_info;

select * from city_info;

select count(*) from city_info;

select city_id, city_name, city_code, province from city_info limit 10,20
