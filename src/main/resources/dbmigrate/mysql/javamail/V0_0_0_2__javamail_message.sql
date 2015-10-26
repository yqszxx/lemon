

-------------------------------------------------------------------------------
--  javamail message
-------------------------------------------------------------------------------
CREATE TABLE JAVAMAIL_MESSAGE(
        ID BIGINT auto_increment,
	SENDER VARCHAR(200),
	RECEIVER VARCHAR(200),
	CC VARCHAR(200),
	BCC VARCHAR(200),
	SUBJECT VARCHAR(200),
	CONTENT VARCHAR(65535),
	SEND_TIME DATETIME,
	RECEIVE_TIME DATETIME,
	STATUS VARCHAR(50),
	FOLDER VARCHAR(200),
	MESSAGE_ID VARCHAR(200),
	MESSAGE_NUMBER INT,
	CONFIG_ID BIGINT,
        CONSTRAINT PK_JAVAMAIL_MESSAGE PRIMARY KEY(ID),
	CONSTRAINT FK_JAVAMAIL_MESSAGE_CONFIG FOREIGN KEY(CONFIG_ID) REFERENCES JAVAMAIL_CONFIG(ID)
) engine=innodb;

