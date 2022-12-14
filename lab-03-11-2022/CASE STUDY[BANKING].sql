create database db1;
use db1;
create table BankMaster(Acno int primary key, Cname varchar(10) not null ,City varchar(40) default 'ulhasnagar' , Balance int not null , Branchcode int, foreign key (Branchcode) references Branchs(Branchcode));

create table Branchs(Branchcode int ,location varchar(10) not null ,primary key(Branchcode));

create table BankTransactions(Acno int ,Trantype char(1) , Trandate datetime not null ,Amt int not null);

insert into Branchs(Branchcode , location)
values (101 , 'Kalyan' ),
(102, 'Thane' ),
(103, 'Pune' ),
(104, 'Mumbai'),
(105, 'Diva');

insert into BankMaster(Acno ,Cname ,City ,Balance ,Branchcode)
values (10, 'Akshay' ,'Kalyan' ,7000,101 ),
(20, 'Raj','Thane', 7250, 102),
(30, 'Ravi' ,'Malegaon', 35000,103),
(40, 'Vidhi','Akola', 71000,103),
(50, 'Akash', 'Goregoan', 5500, 104);

insert into  BankTransactions(Acno , Trantype, Trandate, Amt)
values(10 , 'd' , '22-01-2021' , '07:15:10',30000),
(20 , 'd' , '02-10-2021' , '15:20:00',80000),
(40 , 'w' , '26-08-2021' , '23:00:00',60000),
(20, 'w' , '11-04-2021' , '05:12:25',35000),
(10 , 'w' , '25-05-2021' , '02:22:20',65000);


/*
1)List the Bank Master details which customer have at least 30000 and
above?
*/

select * from BankMaster where Balance >=30000;

/*
2)List the All branchs,Bank Master details which branch have the
customers.
*/
select * from branchs, BankMaster where location in Cname;

/*
3)List the Bank master details which customer maximum no.of times
‘w’ transaction done.
*/

select * from BankTransactions where Trantype is 'w';

/*
4)Find the total bal based on branch code and which branch total bal
is above 100000 those branch,customer details.
*/

select * from Branchs where Branchcode >= 100000;


/*
6)To get all transaction details based on date wise.
*/
select * from BankTransactions where Trandate;

/*
7)To list the 3rd maximum balance customer details.
*/

select * from BankMaster where Balance = 60000;
