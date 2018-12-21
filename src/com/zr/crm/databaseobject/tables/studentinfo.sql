CREATE TABLE STUDENTINFO(
             STU_ID NUMBER PRIMARY KEY,
             STU_NAME VARCHAR2(20) NOT NULL,
             STU_SEX VARCHAR2(5) NOT NULL,
             STU_AGE NUMBER CHECK(STU_AGE BETWEEN 15 AND 100),
             STU_TEL VARCHAR2(20) NOT NULL,
             STU_EDU VARCHAR2(8) NOT NULL,
             STU_MAIOR VARCHAR2(20) NOT NULL,
             STU_GRADUATE VARCHAR2(30) ,
             STU_ADDRESS VARCHAR2(100) NOT NULL,
             STU_EXPE VARCHAR2(10),
             STU_TRAIN_TIME DATE,
             STU_PROJECT_NO NUMBER NOT NULL,
             LATE_COUNT NUMBER,
             UPDATE_TIME DATE,
             CRETE_TIME DATE
);