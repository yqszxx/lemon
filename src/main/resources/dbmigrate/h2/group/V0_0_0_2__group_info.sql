
CREATE TABLE GROUP_INFO(
        ID BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL,
	CODE VARCHAR(50),
        NAME VARCHAR(50),
	REF VARCHAR(200),
	TYPE_ID BIGINT,
	TENANT_ID VARCHAR(64),
        CONSTRAINT PK_GROUP_INFO PRIMARY KEY(ID),
        CONSTRAINT FK_GROUP_INFO_TYPE FOREIGN KEY(TYPE_ID) REFERENCES GROUP_TYPE(ID)
);
