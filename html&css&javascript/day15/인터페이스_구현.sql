/*
 * 1.	hr ������ EMPLOYEES ���̺��  ������ �÷��� �����͸� ���� 
 * (���̺� ����)EMPLOYEES_NEW ���̺��� �����ϴ� SQL���� �ۼ��Ͻÿ�
 * */

CREATE TABLE EMPLOYEES_NEW AS SELECT * FROM EMPLOYEES e ;
SELECT * FROM EMPLOYEES_NEW;

/*
 * 2.	hr ������ DEPARTMENTS ���̺��  ������ �÷��� �����͸� ����(���̺� ����) 
 * DEPARTMENTS_NEW ���̺��� �����ϴ� SQL���� �ۼ��Ͻÿ�.
 */

CREATE TABLE DEPARTMENTS_NEW AS SELECT * FROM DEPARTMENTS d ;
SELECT * FROM DEPARTMENTS_NEW;

/*
 * 3.	EMPLOYEES_NEW ���̺� �������� ������ ������Ÿ���� 
 * USER_NAME �÷�(���� ���̴� ����)�� �߰��Ͻÿ�.
 */

ALTER TABLE EMPLOYEES_NEW ADD USER_NAME varchar2(10);
SELECT * FROM EMPLOYEES_NEW en ;

/*
 * 4.	EMPLOYEES_NEW ���̺� EMPLOYEE_ID �÷��� 
 * Primary Key ��������(���������̸� ����)�� �߰��Ѵ�. 
 */
ALTER TABLE EMPLOYEES_NEW ADD CONSTRAINT employees_pk PRIMARY KEY(employee_id);

/*
 * 5.	DEPARTMENTS_NEW ���̺� DEPARTMENT_ID �÷��� 
 * Primary Key ��������(���������̸� ����)�� �߰��Ѵ�.
 */
ALTER TABLE DEPARTMENTS_NEW  ADD CONSTRAINT department_pk PRIMARY KEY(department_id);

/*
 * 6.	EMPLOYEES_NEW ���̺��� DEPARTMENT_ID �÷��� 
 * DEPARTMENTS_NEW ���̺� DEPARTMENT_ID �÷��� 
 * EMPLOYEES_NEW ���̺��� �ڽ� ���̺�, 
 * DEPARTMENTS_NEW ���̺��� �θ� ���̺�� 
 * Foreign Key ���� ����(���������̸� ����)�� �߰��Ѵ�.
 */

ALTER TABLE EMPLOYEES_NEW ADD CONSTRAINT employees_id 
FOREIGN KEY(department_id) REFERENCES departments_new (department_id);

/*
 * 7.	EMPLOYEES_NEW ���̺�� DEPARTMENTS_NEW ���̺��� ����Ͽ� 
 * DEPARTMENT_ID = 60�� ����� EMPLOYEE_ID , FIRST_NAME , 
 * DEPARTMENT_ID, DEPARTMENT_NAME�� ������������ ��ȸ �Ͻÿ�.
 */
SELECT  en.EMPLOYEE_ID , en.FIRST_NAME , en.DEPARTMENT_ID 
	,	dn.DEPARTMENT_NAME 
FROM 	EMPLOYEES_NEW en 
	LEFT OUTER JOIN DEPARTMENTS_NEW dn 
	ON en.DEPARTMENT_ID  = dn.DEPARTMENT_ID 
WHERE en.DEPARTMENT_ID = 60
ORDER BY EMPLOYEE_ID ;

/*
 *	8.	EMPLOYEES_NEW ���̺��� 
 * DEPARTMENT_ID�� 100�� ������� �޿�(SALARY) ����� ���Ͽ���.  
 */
SELECT 	AVG(SALARY) 
FROM 	EMPLOYEES_NEW en
WHERE 	DEPARTMENT_ID = 100
;

/*
 * 9.	EMPLOYEES_NEW ���̺��� ���� �Ͻÿ�. 
 */
DROP TABLE EMPLOYEES_NEW;

/*
 * 10.	DEPARTMENTS_NEW ���̺��� ���� �Ͻÿ�. 
 */
DROP TABLE DEPARTMENTS_NEW;

/*
 * 11.	EMPLOYEES ���̺�� DEPARTMENTS ���̺��� ����Ͽ� 
 * ��Sales�� �μ��̸��� ���� ������ �̸�(FIRST_NAME), �޿�(SALARY), 
 * �μ��̸�(DEPARTMENT_NAME)�� ��ȸ�Ͻÿ�. 
 * ��, �޿��� 100�� �μ��� ��պ��� ���� �޴� ���� ������ ��µǾ�� �Ѵ�.
 */

SELECT 	e.FIRST_NAME , e.SALARY , d.DEPARTMENT_NAME 
FROM 	EMPLOYEES e 
	LEFT OUTER JOIN DEPARTMENTS d 
	ON 	e.DEPARTMENT_ID  = d.DEPARTMENT_ID 
	WHERE	d.DEPARTMENT_NAME = 'Sales'
	AND 	e.SALARY < (	SELECT 	AVG(SALARY)
							FROM 	EMPLOYEES e2 
							WHERE 	DEPARTMENT_ID = 100
						)
;

/*
 * 12.	EMPLOYEES ���̺�� DEPARTMENTS���̺��� ����Ͽ�, 
 * Ŀ�̼�(COMMISSION_PCT)�� �޴� ����� �̸�(FIRST_NAME), ����(JOB_ID), 
 * �μ���ȣ(DEPARTMENT_ID),�μ���(DEPARTMENT_NAME)�� ����϶�.(�� 35��) 
 */

SELECT 	e.FIRST_NAME , e.JOB_ID , e.DEPARTMENT_ID , d.DEPARTMENT_NAME 
FROM EMPLOYEES e 
	LEFT OUTER JOIN DEPARTMENTS d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID 
	WHERE 	e.COMMISSION_PCT IS NOT NULL 
;


/*
 * 13.	EMPLOYEES ���̺��� �����ȣ��(EMPLOYEE_ID) 123�� ����� ����(JOB_ID)�� ���� , 
 * �����ȣ(EMPLOYEE_ID)�� 192�� ����� �޿�(SALARY)���� ���� ����� 
 * �����ȣ(EMPLOYEE_ID),�̸�(FIRST_NAME),����(JOB_ID),�޿�(SALARY)�� ����϶�.(�� 5��) 
 */

SELECT 	EMPLOYEE_ID , FIRST_NAME , JOB_ID , SALARY 
FROM 	EMPLOYEES e 
WHERE 	JOB_ID = (SELECT JOB_ID FROM EMPLOYEES e2 WHERE EMPLOYEE_ID = 123)
AND 	SALARY > (SELECT SALARY FROM EMPLOYEES e3 WHERE EMPLOYEE_ID = 192)
;

/*
 * 14.	�л� ������ ���� ���� ������ ������Ű�� STUDENT ���̺��� �����Ͽ���.
		(����(�÷��� ����) :
		���̵�(����-����3�ڸ�,Primary Key), 
		�̸�(����-���� ���� 10�ڸ�,Not Null), 
		��ȭ��ȣ(����-����11�ڸ�,Not Null), 
		�ּ�(����-���� ���� 100�ڸ�), 
		�����(����-����1�ڸ�)
		)
 * */

CREATE TABLE student(
	student_id		number(3),
	name			varchar2(10) 	NOT NULL,
	phone_number	number(11) 		NOT NULL,
	addr			varchar2(100),
	subject			number(1),
	PRIMARY KEY (student_id)	
);


/*
 * 15.	STUDENT ���̺��� �̸� �÷��� UNIQUE INDEX�� ���� �ϼ���.( 
 */

CREATE UNIQUE INDEX idx_student_name ON student(name);

/*
 * 16.	STUDENT ���̺� ������ ������ 10���� �Է��Ͽ���
 */
INSERT INTO STUDENT VALUES (100,'�л�1','01012345678','����1��',1);
INSERT INTO STUDENT VALUES (200,'�л�2','01012345678','����1��',2);
INSERT INTO STUDENT VALUES (300,'�л�3','01012345678','����1��',3);
INSERT INTO STUDENT VALUES (400,'�л�4','01012345678','����1��',4);
INSERT INTO STUDENT VALUES (500,'�л�5','01012345678','����1��',5);
INSERT INTO STUDENT VALUES (600,'�л�6','01012345678','����1��',6);
INSERT INTO STUDENT VALUES (700,'�л�7','01012345678','����1��',7);
INSERT INTO STUDENT VALUES (800,'�л�8','01012345678','����1��',8);
INSERT INTO STUDENT VALUES (900,'�л�9','01012345678','����1��',9);
INSERT INTO STUDENT VALUES (101,'�л�10','01012345678','����1��',1);

SELECT * FROM STUDENT;

/*
 * 17.	STUDENT ���̺��� �̸� �÷��� UNIQUE INDEX�� ���� �ϼ���.
 */

DROP INDEX idx_student_name;


















