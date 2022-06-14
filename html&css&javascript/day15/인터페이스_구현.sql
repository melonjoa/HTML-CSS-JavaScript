/*
 * 1.	hr 계정의 EMPLOYEES 테이블과  동일한 컬럼과 데이터를 갖는 
 * (테이블 복사)EMPLOYEES_NEW 테이블을 생성하는 SQL문을 작성하시오
 * */

CREATE TABLE EMPLOYEES_NEW AS SELECT * FROM EMPLOYEES e ;
SELECT * FROM EMPLOYEES_NEW;

/*
 * 2.	hr 계정의 DEPARTMENTS 테이블과  동일한 컬럼과 데이터를 갖는(테이블 복사) 
 * DEPARTMENTS_NEW 테이블을 생성하는 SQL문을 작성하시오.
 */

CREATE TABLE DEPARTMENTS_NEW AS SELECT * FROM DEPARTMENTS d ;
SELECT * FROM DEPARTMENTS_NEW;

/*
 * 3.	EMPLOYEES_NEW 테이블에 가변길이 문자형 데이터타입인 
 * USER_NAME 컬럼(문자 길이는 자유)을 추가하시오.
 */

ALTER TABLE EMPLOYEES_NEW ADD USER_NAME varchar2(10);
SELECT * FROM EMPLOYEES_NEW en ;

/*
 * 4.	EMPLOYEES_NEW 테이블 EMPLOYEE_ID 컬럼에 
 * Primary Key 제약조건(제약조건이름 자유)을 추가한다. 
 */
ALTER TABLE EMPLOYEES_NEW ADD CONSTRAINT employees_pk PRIMARY KEY(employee_id);

/*
 * 5.	DEPARTMENTS_NEW 테이블 DEPARTMENT_ID 컬럼에 
 * Primary Key 제약조건(제약조건이름 자유)을 추가한다.
 */
ALTER TABLE DEPARTMENTS_NEW  ADD CONSTRAINT department_pk PRIMARY KEY(department_id);

/*
 * 6.	EMPLOYEES_NEW 테이블의 DEPARTMENT_ID 컬럼과 
 * DEPARTMENTS_NEW 테이블 DEPARTMENT_ID 컬럼을 
 * EMPLOYEES_NEW 테이블이 자식 테이블, 
 * DEPARTMENTS_NEW 테이블이 부모 테이블로 
 * Foreign Key 제약 조건(제약조건이름 자유)을 추가한다.
 */

ALTER TABLE EMPLOYEES_NEW ADD CONSTRAINT employees_id 
FOREIGN KEY(department_id) REFERENCES departments_new (department_id);

/*
 * 7.	EMPLOYEES_NEW 테이블과 DEPARTMENTS_NEW 테이블을 사용하여 
 * DEPARTMENT_ID = 60인 사원의 EMPLOYEE_ID , FIRST_NAME , 
 * DEPARTMENT_ID, DEPARTMENT_NAME을 오름차순으로 조회 하시오.
 */
SELECT  en.EMPLOYEE_ID , en.FIRST_NAME , en.DEPARTMENT_ID 
	,	dn.DEPARTMENT_NAME 
FROM 	EMPLOYEES_NEW en 
	LEFT OUTER JOIN DEPARTMENTS_NEW dn 
	ON en.DEPARTMENT_ID  = dn.DEPARTMENT_ID 
WHERE en.DEPARTMENT_ID = 60
ORDER BY EMPLOYEE_ID ;

/*
 *	8.	EMPLOYEES_NEW 테이블에서 
 * DEPARTMENT_ID가 100인 사원들의 급여(SALARY) 평균을 구하여라.  
 */
SELECT 	AVG(SALARY) 
FROM 	EMPLOYEES_NEW en
WHERE 	DEPARTMENT_ID = 100
;

/*
 * 9.	EMPLOYEES_NEW 테이블을 삭제 하시요. 
 */
DROP TABLE EMPLOYEES_NEW;

/*
 * 10.	DEPARTMENTS_NEW 테이블을 삭제 하시요. 
 */
DROP TABLE DEPARTMENTS_NEW;

/*
 * 11.	EMPLOYEES 테이블과 DEPARTMENTS 테이블을 사용하여 
 * ‘Sales’ 부서이름에 속한 직원의 이름(FIRST_NAME), 급여(SALARY), 
 * 부서이름(DEPARTMENT_NAME)을 조회하시오. 
 * 단, 급여는 100번 부서의 평균보다 적게 받는 직원 정보만 출력되어야 한다.
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
 * 12.	EMPLOYEES 테이블과 DEPARTMENTS테이블을 사용하여, 
 * 커미션(COMMISSION_PCT)을 받는 사원의 이름(FIRST_NAME), 직업(JOB_ID), 
 * 부서번호(DEPARTMENT_ID),부서명(DEPARTMENT_NAME)을 출력하라.(총 35건) 
 */

SELECT 	e.FIRST_NAME , e.JOB_ID , e.DEPARTMENT_ID , d.DEPARTMENT_NAME 
FROM EMPLOYEES e 
	LEFT OUTER JOIN DEPARTMENTS d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID 
	WHERE 	e.COMMISSION_PCT IS NOT NULL 
;


/*
 * 13.	EMPLOYEES 테이블에서 사원번호가(EMPLOYEE_ID) 123인 사원의 직업(JOB_ID)과 같고 , 
 * 사원번호(EMPLOYEE_ID)가 192인 사원의 급여(SALARY)보다 많은 사원의 
 * 사원번호(EMPLOYEE_ID),이름(FIRST_NAME),직업(JOB_ID),급여(SALARY)를 출력하라.(총 5건) 
 */

SELECT 	EMPLOYEE_ID , FIRST_NAME , JOB_ID , SALARY 
FROM 	EMPLOYEES e 
WHERE 	JOB_ID = (SELECT JOB_ID FROM EMPLOYEES e2 WHERE EMPLOYEE_ID = 123)
AND 	SALARY > (SELECT SALARY FROM EMPLOYEES e3 WHERE EMPLOYEE_ID = 192)
;

/*
 * 14.	학생 관리를 위한 다음 조건을 만족시키는 STUDENT 테이블을 생성하여라.
		(조건(컬럼명 자유) :
		아이디(숫자-정수3자리,Primary Key), 
		이름(문자-가변 문자 10자리,Not Null), 
		전화번호(숫자-정수11자리,Not Null), 
		주소(문자-가변 문자 100자리), 
		과목수(숫자-정수1자리)
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
 * 15.	STUDENT 테이블의 이름 컬럼에 UNIQUE INDEX를 설정 하세요.( 
 */

CREATE UNIQUE INDEX idx_student_name ON student(name);

/*
 * 16.	STUDENT 테이블에 임의의 데이터 10건을 입력하여라
 */
INSERT INTO STUDENT VALUES (100,'학생1','01012345678','역삼1동',1);
INSERT INTO STUDENT VALUES (200,'학생2','01012345678','역삼1동',2);
INSERT INTO STUDENT VALUES (300,'학생3','01012345678','역삼1동',3);
INSERT INTO STUDENT VALUES (400,'학생4','01012345678','역삼1동',4);
INSERT INTO STUDENT VALUES (500,'학생5','01012345678','역삼1동',5);
INSERT INTO STUDENT VALUES (600,'학생6','01012345678','역삼1동',6);
INSERT INTO STUDENT VALUES (700,'학생7','01012345678','역삼1동',7);
INSERT INTO STUDENT VALUES (800,'학생8','01012345678','역삼1동',8);
INSERT INTO STUDENT VALUES (900,'학생9','01012345678','역삼1동',9);
INSERT INTO STUDENT VALUES (101,'학생10','01012345678','역삼1동',1);

SELECT * FROM STUDENT;

/*
 * 17.	STUDENT 테이블의 이름 컬럼에 UNIQUE INDEX를 삭제 하세요.
 */

DROP INDEX idx_student_name;


















