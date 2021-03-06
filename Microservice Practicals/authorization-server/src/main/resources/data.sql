INSERT INTO oauth_client_details (client_id, client_secret, web_server_redirect_uri, scope, access_token_validity, refresh_token_validity, resource_ids, authorized_grant_types, additional_information) VALUES ('genshin', '{bcrypt}$2a$10$f8ZjYWLcIFfhvl8mV8gS4.55WFFWHEy3ajZ1J.GtlO.1d9fa3siDq', 'http://localhost:8080/code', 'READ,WRITE', '3600', '10000', 'inventory,payment', 'authorization_code,password,refresh_token,implicit', '{}');

 INSERT INTO PERMISSION (NAME) VALUES
 ('create_profile'),
 ('read_profile'),
 ('update_profile'),
 ('delete_profile');

 INSERT INTO role (NAME) VALUES
		('ROLE_admin'),('ROLE_editor'),('ROLE_operator');

 INSERT INTO PERMISSION_ROLE (PERMISSION_ID, ROLE_ID) VALUES
     (1,1), /*create-> admin */
     (2,1), /* read admin */
     (3,1), /* update admin */
     (4,1), /* delete admin */
     (2,2),  /* read Editor */
     (3,2),  /* update Editor */
     (2,3);  /* read operator */

insert into user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('1', 'lochana','{bcrypt}$2a$10$5ihmdQGJiBLVOMNIC8AkQ.a1FSFCLRhK4rCqI4RiMc9YTxSa16ZGm', 'lochi.ranatunga@gmail.com', '1', '1', '1', '1');
 insert into  user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('2', 'kazuha', '{bcrypt}$2a$10$1/YhUiEhRKCrLZJWmyWbfeZO8TfznKpGxvYt3WIEKuRH6VrE2yrH2','kazuha.kaedehara@teyvat.inazuma', '1', '1', '1', '1');
 insert into  user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('3', 'yanfei', '{bcrypt}$2a$10$AlYW3C26IMLO3cMDg92fZOWcINS8i7OC6coHeFsdFKSICCb0/evuu','yanfei@liyue.law', '1', '1', '1', '1');

INSERT INTO ROLE_USER (ROLE_ID, USER_ID)
    VALUES
    (1, 1) /* lochana-admin */,
    (2, 2) /* kazuha-editor */ ,
    (3, 3) /* yanfei-operatorr */ ;