insert into users (id, username, name, password) values (1, 'user', 'User', '$2a$10$cvJ1CtFWzh8Zq/maL3WR.O6hrfX5q2XVEMrcnMjWiAkb0M0KJNmxO');
insert into users (id, username, name, password) values (2, 'admin', 'Admin', '$2a$10$cvJ1CtFWzh8Zq/maL3WR.O6hrfX5q2XVEMrcnMjWiAkb0M0KJNmxO');

insert into roles (id, name) values (1, 'ROLE_NORMAL_USER');
insert into roles (id, name) values (2, 'ROLE_ADMIN_USER');

insert into users_roles (user_id, role_id) values (1,1);
insert into users_roles (user_id, role_id) values (2,2);