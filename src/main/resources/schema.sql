        CREATE TABLE data (
          id              BIGSERIAL PRIMARY KEY,
            title           VARCHAR(100) NOT NULL,
        body VARCHAR(100) NULL,
         created_on timestamp default current_timestamp,
             updated_on timestamp DEFAULT CURRENT_TIMESTAMP

);