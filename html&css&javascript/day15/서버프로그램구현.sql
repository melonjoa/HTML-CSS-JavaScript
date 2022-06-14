/*
 * 1.	다음 조건에 맞는 테이블을 생성 하시오.
 */

CREATE TABLE TB_TEAM(
    TEAM_ID         NUMBER(10) ,
    LOCALS          VARCHAR2(10) NOT NULL,
    TEAM_NAME       VARCHAR2(10) NOT NULL,
    PHONE_NUMBER    VARCHAR2(15),
    HOME_PAGE       VARCHAR2(60),
    CONSTRAINT PK_TEAM_T PRIMARY KEY(TEAM_ID)
);

SELECT * FROM tb_team;

CREATE TABLE TB_PLAYER(
    PLAYER_NO	    NUMBER(10) Primary key,
    PLAYER_NAME     VARCHAR2(10) NOT NULL,
    POSITIONS       VARCHAR2(10),
    HEIGHT          NUMBER(3),
    TEAM_ID         NUMBER(10),
     constraints fk_code foreign key(TEAM_ID)
			references tb_team(TEAM_ID) on delete cascade
);

SELECT * FROM TB_PLAYER;

/*
 * 2. TB_TEAM 임의의 팀 2팀 입력
 */

-- TEAM을 두 개만 등록합니다.

INSERT INTO tb_team(TEAM_ID, LOCALS , TEAM_NAME, PHONE_NUMBER, HOME_PAGE)
VALUES (100, '서울', '서울팀', '010-1233-4567', 'WWW.SEOUL.COM');

INSERT INTO tb_team(TEAM_ID, LOCALS , TEAM_NAME, PHONE_NUMBER, HOME_PAGE)
VALUES (200, '부산', '부산팀', '010-9877-6543','WWW.BUSAN.COM');


/*
 * 3.TB_PLAYER 테이블에 임의의 선수 10명 입력
 */

-- TB_PLAYER : 선수 번호, 선수이름, 포지션, 신장, 팀 아이디

INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (01, '일서울', '투수', 175, 100);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (02, '이서울', '타자', 180, 100);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (03, '삼서울', '포수', 182, 100);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (04, '사서울', '타자', 180, 100);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (05, '오서울', '포수', 182, 100);


INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (06, '일부산', '투수', 175, 200);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (07, '이부산', '타자', 180, 200);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (08, '삼부산', '포수', 182, 200);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (09, '사부산', '타자', 180, 200);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (10, '오부산', '포수', 182, 200);

-- TRUNCATE TABLE TB_PLAYER ;

-- 4.	선수 번호, 선수 이름, 포지션, 신장, 팀 명, 홈페이지 조회
SELECT b.PLAYER_NO, b.PLAYER_NAME, b.positions, b.height, a.TEAM_NAME  
FROM	TB_TEAM a
	LEFT OUTER JOIN TB_PLAYER B ON a.team_id = b.team_id
;

/*
 * 5.TB_TEAM, TB_PLAYER 테이블 삭제
 */
drop table TB_PLAYER;
drop table TB_TEAM;

/*
 * 6.	다음의 엔티티 관계도를 보고 외래키(Foreign key)에 대해서 서술하라.
 */

-- 6-1.	LOCATIONS 테이블 COUNTRIES 테이블의 부모 자식 관계?
-- -	부 : COUNTRIES , 자 : LOCATIONS

-- 6-2.	COUNTRIES 테이블과 REGIONS 테이블의 부모 자식 관계? 
-- -	부 : REGIONS, 자 : COUNTRIES

-- 6-3.	외래키 삭제 옵션 ON DELETE CASCADE 에 대해서 설명하시오
---	참조되는 부모 테이블의 행에 대한 DELETE를 허용한다.

-- 6-4.	외래키 삭제 옵션 ON DELETE SET NULL 에 대해서 설명하시오
--부모 테이블의 값이 삭제되면 해당 참조하는 자식테이블의 값들은 null값으로 설정된다.

/*
 * 7.	다음 결과를 출력할 수 있는 view를 생성 하시오. 
 * 	20번 부서 사원의 EMPLOYEE_ID, FIRST_NAME 과 LAST_NAME을 연결 조회, 
 *  DEPARTMENT_ID, HIRE_DATE, DEPARTMENT_NAME을 조회해서 view를 생성하여라.
 */

CREATE OR REPLACE VIEW v_sample4
	(emp_id, name, department_id, hire_date, dept_name)
	AS 	SELECT 	e.EMPLOYEE_ID ,
				e.FIRST_NAME || ' ' || e.LAST_NAME ,
				e.DEPARTMENT_ID,
				e.HIRE_DATE,
				d.department_name
		FROM 	employees e
			LEFT OUTER JOIN departments d 
			ON e.DEPARTMENT_ID = d.DEPARTMENT_ID 
		WHERE 	e.DEPARTMENT_ID = 20
;
 
SELECT * FROM v_sample4;














