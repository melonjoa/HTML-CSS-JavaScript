SELECT * FROM car;

SELECT 	* FROM 	CAR WHERE 	CARNUM = '3'
;

SELECT sysdate FROM dual;

CREATE TABLE Member(
	name	varchar2(20),
	age		number(10)
);

SELECT * FROM MEMBER;

INSERT INTO MEMBER values('김자바', 22);
INSERT INTO MEMBER values('홍길동', 200);
INSERT INTO MEMBER values('이순신', 460);

SELECT age FROM MEMBER WHERE name = '이순신';






