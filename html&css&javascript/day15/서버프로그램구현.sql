/*
 * 1.	���� ���ǿ� �´� ���̺��� ���� �Ͻÿ�.
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
 * 2. TB_TEAM ������ �� 2�� �Է�
 */

-- TEAM�� �� ���� ����մϴ�.

INSERT INTO tb_team(TEAM_ID, LOCALS , TEAM_NAME, PHONE_NUMBER, HOME_PAGE)
VALUES (100, '����', '������', '010-1233-4567', 'WWW.SEOUL.COM');

INSERT INTO tb_team(TEAM_ID, LOCALS , TEAM_NAME, PHONE_NUMBER, HOME_PAGE)
VALUES (200, '�λ�', '�λ���', '010-9877-6543','WWW.BUSAN.COM');


/*
 * 3.TB_PLAYER ���̺� ������ ���� 10�� �Է�
 */

-- TB_PLAYER : ���� ��ȣ, �����̸�, ������, ����, �� ���̵�

INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (01, '�ϼ���', '����', 175, 100);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (02, '�̼���', 'Ÿ��', 180, 100);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (03, '�Ｍ��', '����', 182, 100);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (04, '�缭��', 'Ÿ��', 180, 100);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (05, '������', '����', 182, 100);


INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (06, '�Ϻλ�', '����', 175, 200);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (07, '�̺λ�', 'Ÿ��', 180, 200);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (08, '��λ�', '����', 182, 200);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (09, '��λ�', 'Ÿ��', 180, 200);
INSERT INTO tb_player(PLAYER_NO, PLAYER_NAME, POSITIONS, HEIGHT, TEAM_ID)
VALUES (10, '���λ�', '����', 182, 200);

-- TRUNCATE TABLE TB_PLAYER ;

-- 4.	���� ��ȣ, ���� �̸�, ������, ����, �� ��, Ȩ������ ��ȸ
SELECT b.PLAYER_NO, b.PLAYER_NAME, b.positions, b.height, a.TEAM_NAME  
FROM	TB_TEAM a
	LEFT OUTER JOIN TB_PLAYER B ON a.team_id = b.team_id
;

/*
 * 5.TB_TEAM, TB_PLAYER ���̺� ����
 */
drop table TB_PLAYER;
drop table TB_TEAM;

/*
 * 6.	������ ��ƼƼ ���赵�� ���� �ܷ�Ű(Foreign key)�� ���ؼ� �����϶�.
 */

-- 6-1.	LOCATIONS ���̺� COUNTRIES ���̺��� �θ� �ڽ� ����?
-- -	�� : COUNTRIES , �� : LOCATIONS

-- 6-2.	COUNTRIES ���̺�� REGIONS ���̺��� �θ� �ڽ� ����? 
-- -	�� : REGIONS, �� : COUNTRIES

-- 6-3.	�ܷ�Ű ���� �ɼ� ON DELETE CASCADE �� ���ؼ� �����Ͻÿ�
---	�����Ǵ� �θ� ���̺��� �࿡ ���� DELETE�� ����Ѵ�.

-- 6-4.	�ܷ�Ű ���� �ɼ� ON DELETE SET NULL �� ���ؼ� �����Ͻÿ�
--�θ� ���̺��� ���� �����Ǹ� �ش� �����ϴ� �ڽ����̺��� ������ null������ �����ȴ�.

/*
 * 7.	���� ����� ����� �� �ִ� view�� ���� �Ͻÿ�. 
 * 	20�� �μ� ����� EMPLOYEE_ID, FIRST_NAME �� LAST_NAME�� ���� ��ȸ, 
 *  DEPARTMENT_ID, HIRE_DATE, DEPARTMENT_NAME�� ��ȸ�ؼ� view�� �����Ͽ���.
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














