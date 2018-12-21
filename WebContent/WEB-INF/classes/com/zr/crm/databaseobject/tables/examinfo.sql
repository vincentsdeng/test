CREATE TABLE EXAMINFO(
                       EXAM_ID NUMBER PRIMARY KEY,    
                       EXAM_NAME VARCHAR(20),     
                       EXAM_NO NUMBER,                
                       EXAM_TITLE VARCHAR(20),
                       SUB_EXAM_NO VARCHAR(20),       
                       SUB_EXAM_TITLE VARCHAR(20),   
                       SUB_EXAM_CONTENT VARCHAR(200),
                       SUB_EXAM_SCORE NUMBER,         
                       SUB_EXAM_ANSWER VARCHAR(4),  
                       UPDATE_TIME DATE,              
                       CREAT_TIME  DATE                                                     
);
