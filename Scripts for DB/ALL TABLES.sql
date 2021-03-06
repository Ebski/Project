DROP TABLE PARTNERRANK CASCADE CONSTRAINTS;
DROP TABLE PARTNER CASCADE CONSTRAINTS;
DROP TABLE ADMIN_RANK CASCADE CONSTRAINTS;
DROP TABLE EMPLOYEE_LIST CASCADE CONSTRAINTS;
DROP TABLE USERPASS_EMP CASCADE CONSTRAINTS;
DROP TABLE USERPASS_PARTNER CASCADE CONSTRAINTS;
DROP TABLE CAMPAIGNSTATUS CASCADE CONSTRAINTS;
DROP TABLE CAMPAIGN CASCADE CONSTRAINTS;
DROP TABLE CAMPAIGNLEVEL1 CASCADE CONSTRAINTS;
DROP TABLE CAMPAIGNLEVEL2 CASCADE CONSTRAINTS;
DROP TABLE CAMPAIGNLEVEL3 CASCADE CONSTRAINTS;
DROP TABLE CAMPAIGNLEVEL4 CASCADE CONSTRAINTS;
DROP TABLE MDF;
DROP SEQUENCE SEQ_MDF;

CREATE SEQUENCE SEQ_MDF
MINVALUE 1
START WITH 1
INCREMENT BY 1
CACHE 10;

CREATE TABLE PARTNERRANK(
        PRANK NUMBER(5),
        PRANKSTATUS VARCHAR2(25),

        PRIMARY KEY(PRANK)
);

CREATE TABLE PARTNER (
        PNO VARCHAR2(10),
        PNAME VARCHAR2(80),
        PCONTACTPERSON VARCHAR2(80),
        PMAIL VARCHAR2(80),
        PPHONE VARCHAR2(15),
        PADDRESS VARCHAR2(30),
        PRANK NUMBER(5),

        PRIMARY KEY(PNO),
        FOREIGN KEY (PRANK) REFERENCES PARTNERRANK
);

CREATE TABLE ADMIN_RANK(
        EADMINRANK NUMBER (5),
        ARANKSTATUS VARCHAR2(10),

        PRIMARY KEY (EADMINRANK)
);

CREATE TABLE EMPLOYEE_LIST(
        ENO VARCHAR2(10),
        ENAME VARCHAR2(80),
        EMAIL VARCHAR2 (80),
        EPHONE VARCHAR2 (25),
        EADMINRANK NUMBER(5),
        ESTATUS VARCHAR2(20),

        PRIMARY KEY (ENO),
        FOREIGN KEY (EADMINRANK) REFERENCES ADMIN_RANK
);


CREATE TABLE USERPASS_EMP (
	USERNAME VARCHAR2 (30),
	PASSWORD VARCHAR2 (30),
        ENO VARCHAR2 (10),

	PRIMARY KEY(USERNAME, PASSWORD),
        FOREIGN KEY (ENO) REFERENCES EMPLOYEE_LIST
);

CREATE TABLE USERPASS_PARTNER (
	USERNAME VARCHAR2 (30),
	PASSWORD VARCHAR2 (30),
        PNO VARCHAR2 (10),

	PRIMARY KEY(USERNAME, PASSWORD),
        FOREIGN KEY (PNO) REFERENCES PARTNER
);

CREATE TABLE CAMPAIGNSTATUS (
	CSTATUS NUMBER (10),
	CSTATUSDESCRIPTION VARCHAR2 (30),
	PRIMARY KEY (CSTATUS)
);


CREATE TABLE CAMPAIGN (
	CNO VARCHAR2 (10),
	PNO VARCHAR2 (10),
	ID_MDF NUMBER (20),
	ID_POE NUMBER (20),
	CSTATUS VARCHAR2 (10),
	
	PRIMARY KEY (CNO),
        FOREIGN KEY (PNO) REFERENCES PARTNER,
        FOREIGN KEY (ID_MDF) REFERENCES MDF,
        FOREIGN KEY (ID_POE) REFERENCES POE
);

CREATE TABLE CAMPAIGNAPPROVAL (
	KNO VARCHAR2 (10),
	ENAME VARCHAR2 (80),

	PRIMARY KEY (KNO),
		FOREIGN KEY (KNO) REFERENCES CAMPAIGNAPPROVAL,
		FOREIGN KEY (ENAME) REFERENCES EMPLOYEE_LIST
);

CREATE TABLE CAMPAIGNLEVEL1 (
	CNO VARCHAR2 (10),
	CLEVEL1START VARCHAR2 (30),
	CLEVEL1END VARCHAR2 (30),

	PRIMARY KEY (CNO, CLEVEL1START),
        FOREIGN KEY (CNO) REFERENCES CAMPAIGN
);

CREATE TABLE CAMPAIGNLEVEL2 (
	CNO VARCHAR2 (10),
	CLEVEL2START VARCHAR2 (30),
	CLEVEL2END VARCHAR2 (30),

	PRIMARY KEY (CNO, CLEVEL2START),
        FOREIGN KEY (CNO) REFERENCES CAMPAIGN
);

CREATE TABLE CAMPAIGNLEVEL3 (
	CNO VARCHAR2 (10),
	CLEVEL3START VARCHAR2 (30),
	CLEVEL3END VARCHAR2 (30),

	PRIMARY KEY (CNO, CLEVEL3START),
        FOREIGN KEY (CNO) REFERENCES CAMPAIGN
);

CREATE TABLE CAMPAIGNLEVEL4 (
	CNO VARCHAR2 (10),
	CLEVEL4START VARCHAR2 (30),
	CLEVEL4END VARCHAR2 (30),

	PRIMARY KEY (CNO, CLEVEL4START),
        FOREIGN KEY (CNO) REFERENCES CAMPAIGN
);

CREATE TABLE MDF
(
    ID_MDF NUMBER (20),
    SUBMISSION_DATE VARCHAR2(80),
    COMPANY_ADDRESS VARCHAR2(80),
    CONTACT_NAME VARCHAR2(80),	
    CONTACT_EMAIL VARCHAR2(80),
    COMPANY_NAME VARCHAR2(80),
    CONTACT_PHONE VARCHAR2(80),
    PROGRAM_DATE VARCHAR2(80),
    ESTIMATED_ATTENDEES NUMBER(15),
    START_TIME VARCHAR2(80),
    VENUE_NAME VARCHAR2(80),
    END_TIME VARCHAR2(80),
    VENUE_ADDRESS VARCHAR2(80),
    FACE_TO_FACE NUMBER(1),
    TRADESHOWS NUMBER(1),
    MULTI_TOUCH_CAMPAIGN NUMBER(1),
    DOOR_OPENER_CAMPAIGN NUMBER(1),
    THIRD_PARTY_CAMPAIGN NUMBER(1),
    DIRECT_MAIL NUMBER(1),
    BLITZ_CAMPAIGN NUMBER(1),
    DESCRIPTION_AGENDA VARCHAR2(80),
    DISS_STORAGE_1 NUMBER(1),
    DISS_STORAGE_2 NUMBER(1),
    DISS_STORAGE_3 NUMBER(1),
    DISS_STORAGE_4 NUMBER(1),
    DISS_STORAGE_5 NUMBER(1),
    DISS_STORAGE_6 NUMBER(1),
    DISS_SERVER_1 NUMBER(1),
    DISS_SERVER_2 NUMBER(1),
    DISS_SERVER_3 NUMBER(1),
    DISS_SERVER_4 NUMBER(1),
    DISS_NETWORK_1 NUMBER(1),
    DISS_NETWORK_2 NUMBER(1),
    DISS_SOLUTIONS_1 NUMBER(1),
    DISS_SOLUTIONS_2 NUMBER(1),
    DISS_SOLUTIONS_3 NUMBER(1),
    DISS_SOLUTIONS_4 NUMBER(1),
    DISS_SOLUTIONS_5 NUMBER(1),
    DISS_SOLUTIONS_6 NUMBER(1),
    DISS_TEXT VARCHAR2(80),
    TARGET_1 NUMBER(1),
    TARGET_2 NUMBER(1),
    TARGET_3 NUMBER(1),
    ADDITIONAL_TOTALCOST NUMBER(15),
    ADDITIONAL_TOTALMDF NUMBER(15),
    ADDITIONAL_REIMBURSEMENT VARCHAR2(80),
    ADDITIONAL_PARTICIPATING VARCHAR2(80),
    ADDITIONAL_CONTRIBUTION NUMBER(15),
    ADDITIONAL_OPPORTUNITIES NUMBER(15),
    ADDITIONAL_REVENUE NUMBER(15),
    PRIMARY KEY (ID_MDF)
);
