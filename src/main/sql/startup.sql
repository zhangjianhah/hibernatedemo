create table zj_depart(
    depart_id bigint primary key auto_increment,
    depart_name varchar(200) default null,
    create_time datetime,
    update_time datetime,
    delflg tinyint default 1
);
create table zj_weixin_user(
    weixin_user_id bigint auto_increment primary key ,
    open_id varchar(50) not null ,
    nick_name varchar(300) not null ,
    create_time datetime,
    update_time datetime,
    delflg tinyint default 1
);


create table zj_user(
    user_id bigint auto_increment primary key ,
    account varchar(50) not null ,
    pwd varchar(300) not null ,
    real_name varchar(100) not null ,
    create_time datetime,
    update_time datetime,
    delflg tinyint default 1,
    depart_id bigint,
    weixin_user_id bigint,
    FOREIGN KEY (`depart_id`) REFERENCES `zj_depart` (`depart_id`),
    FOREIGN KEY (`weixin_user_id`) REFERENCES `zj_weixin_user` (`weixin_user_id`)
);


alter table zj_weixin_user add column user_id bigint;

alter table zj_weixin_user add foreign key (user_id) references zj_user(user_id);
