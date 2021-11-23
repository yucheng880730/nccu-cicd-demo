CREATE TABLE accounts (
                          user_id VARCHAR ( 255 ) PRIMARY KEY,
                          username VARCHAR ( 200 ) NOT NULL,
                          password VARCHAR ( 200 ) NOT NULL,
                          email VARCHAR ( 255 ) UNIQUE NOT NULL,
                          created_on TIMESTAMP NOT NULL,
                          last_login TIMESTAMP
);

insert into accounts values('user1','user1','pass1','user1@demo.com',now(),null);
insert into accounts values('user2','user2','pass2','user2@demo.com',now(),null);
insert into accounts values('user3','user3','pass3','user3@demo.com',now(),null);
insert into accounts values('user4','user4','pass4','user4@demo.com',now(),null);
insert into accounts values('user5','user5','pass5','user5@demo.com',now(),null);
insert into accounts values('user6','user6','pass6','user6@demo.com',now(),null);

commit;