-----------Manager Table---------------
create table MANAGER
(
M_id number(11),
M_name varchar(40),
M_email varchar(40),
M_address varchar(100),
M_mobile number(11)
);
---------------Employee Table--------------------
create table employee
(
Em_id number(11),
Em_dept varchar(11),
Em_name varchar(40),
Em_mobile number(11),
Em_email varchar(40)

);

Drop table salary

Alter table employee
Add Em_dept varchar(11);

Select * from employee
Select * from salary
Select * from leave

-----------Leave Table-------------
create table leave
(
Lid number(11),
Ltype varchar(30),
FromDate Date,
Lstatus varchar(30),
Em_id number(11)
);

--------------salary Table-------
create table salary
(
Sid number(11),
DateDis Date,
Amount number(11),
Em_id number(11),
Expense number(11),
TotSal number(11)

);