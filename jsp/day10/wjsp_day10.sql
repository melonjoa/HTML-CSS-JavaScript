CREATE TABLE tbl_member(
	userid		varchar2(200) PRIMARY KEY,
	userpw		varchar2(200),
	username	varchar2(200),
	usergender	varchar2(100),
	userphone	varchar2(100)
);

SELECT * FROM tbl_member;

INSERT INTO TBL_MEMBER VALUES ( 'test1', 'testpw123', '±èÀÚ¹Ù', 'M', '01012345678' );
DELETE FROM TBL_MEMBER tm WHERE USERID  = 'user10';

