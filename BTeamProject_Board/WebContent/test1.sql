create table user_tbl(
userNum number primary key,
id varchar2(12) not null,
pw varchar2(12) not null,
name varchar2(15) not null,
nickname varchar2(20) not null,
tell number not null,
address varchar2(50) not null,
joined date default sysdate
)

insert into USER_TBL ( userNum, id, pw, name, nickname, address)
values ('1','master@naver.com','master','마스터','마스터','이젠하우스')
update USER_TBL set userid='master@naver.com' where userNum = 1
SELECT * FROM user_tbl where userid = 'master@naver.com'

create table usermenu_tbl(
menuNum number(2) primary key,
sp varchar2(100) not null,
fullname varchar2(100) not null
)

drop table usermenu_tbl

insert into USERMENU_TBL values (1, '/member/insertui.do', 'kr.co.member.command.InsertUICommand')
insert into USERMENU_TBL values (2, '/member/idcheck.do', 'kr.co.member.command.IdCheckCommand')


update USERMENU_TBL set sp = '' where menunum = ?


select * from USERMENU_TBL

commit
