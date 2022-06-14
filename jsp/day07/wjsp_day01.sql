CREATE TABLE car(
	carnum	varchar2(20),
	brand	varchar2(200),
	color	varchar2(200),
	price	number(10),
	CONSTRAINT car_pk PRIMARY KEY(carnum)
);

SELECT * FROM car;

INSERT INTO car(carnum, BRAND, COLOR, PRICE) 
values('1','Benz','Black',350000000);
INSERT INTO car(carnum, BRAND, COLOR, PRICE) 
values('2','Benz','Black',350000000);








