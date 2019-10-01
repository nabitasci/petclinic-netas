INSERT INTO USERS VALUES('user1','$2a$10$JMifizxGs95opo/NAhWjUenRUdEgPEgYwVHDHuOqe2AJpMt/fVHE.',TRUE);
INSERT INTO USERS VALUES('user2','$2a$10$/A589IROdcD2wn0CF4ctpuqZ2nLfXSh/gM2sd4csC.vEbxO4kq/PC',TRUE);
INSERT INTO USERS VALUES('user3','$2a$10$qpS4Wy9iXagvjYuEOtYvyeSFCAEqcPS1L1sTg1OPVhKlkgQD2SM4K',TRUE);

INSERT INTO AUTHORITIES VALUES('user1','ROLE_USER');
INSERT INTO AUTHORITIES VALUES('user2','ROLE_USER');
INSERT INTO AUTHORITIES VALUES('user2','ROLE_EDITOR');
INSERT INTO AUTHORITIES VALUES('user3','ROLE_USER');

INSERT INTO GROUPS VALUES (1,'SYS_ADMIN');

INSERT INTO GROUP_AUTHORITIES VALUES (1,'ROLE_USER');
INSERT INTO GROUP_AUTHORITIES VALUES (1,'ROLE_EDITOR');

INSERT INTO GROUP_MEMBERS VALUES (1,'user3',1);

insert into acl_class values(1,'com.javaegitimleri.petclinic.model.Owner');
insert into acl_class values(2,'com.javaegitimleri.petclinic.model.Pet');

insert into acl_sid values(1,true,'user1');
insert into acl_sid values(2,false,'ROLE_EDITOR');

insert into acl_object_identity values(1,1,7,null,1,false); -- Owner.class,owner:7,no parent,user1,not inheriting
insert into acl_object_identity values(2,1,8,null,2,false); -- Pet.class,pet:8,no parent,ROLE_EDITOR,not inheriting

--mask values 1:read(2^0) 2:write(2^1) 4:create(2^2) 8:delete(2^3) 16:administer(2^4)
insert into acl_entry values(1,1,0,1,3,true,false,false); --owner:7,ace_order:0,user1,mask:read+write,granting:true,audit_success:false,audit_failure:false 
insert into acl_entry values(2,2,0,2,1,true,false,false); --pet:8,ace_order:0,ROLE_EDITOR,mask:read,granting:false,audit_success:false,audit_failure:false




