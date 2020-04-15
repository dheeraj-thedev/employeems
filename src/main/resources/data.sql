insert INTO `roles` VALUES (1,'ADMIN');
insert INTO `roles` VALUES (2,'DEALER');
insert INTO `roles` VALUES (3,'CUSTOMER');
insert INTO `roles` VALUES (4,'TECHNITION');

insert into `users` VALUES (1,true,'admin@gmail.com','Singh','Dheeraj','$2a$10$7PtcjEnWb/ZkgyXyxY1/Iei2dGgGQUbqIIll/dt.qJ8l8nQBWMbYO' ,'bond');
insert into `users` VALUES (2,true,'technition@gmail.com','Singh','Dheeraj','$2a$10$7PtcjEnWb/ZkgyXyxY1/Iei2dGgGQUbqIIll/dt.qJ8l8nQBWMbYO' ,'bond');
insert into `users` VALUES (3,true,'dealer@gmail.com','Singh','Dheeraj','$2a$10$7PtcjEnWb/ZkgyXyxY1/Iei2dGgGQUbqIIll/dt.qJ8l8nQBWMbYO' ,'bond');
insert into `users` VALUES (4,true,'customer@gmail.com','Singh','Dheeraj','$2a$10$7PtcjEnWb/ZkgyXyxY1/Iei2dGgGQUbqIIll/dt.qJ8l8nQBWMbYO' ,'bond');
insert into `users` VALUES (5,true,'custome1@gmail.com','Singh','Dheeraj','$2a$10$7PtcjEnWb/ZkgyXyxY1/Iei2dGgGQUbqIIll/dt.qJ8l8nQBWMbYO' ,'bond');
insert into `USER_ROLE` VALUES (1,1);
insert into `USER_ROLE` VALUES(2,3);
insert into `USER_ROLE` VALUES(3,2);
insert into `USER_ROLE` VALUES(4,3);
insert into `USER_ROLE` VALUES(5,3);




