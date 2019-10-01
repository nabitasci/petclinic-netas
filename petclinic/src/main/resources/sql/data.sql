INSERT INTO t_city(id,version,name) VALUES (1,0,'Ankara');
INSERT INTO t_city(id,version,name) VALUES (2,0,'İstanbul');
INSERT INTO t_city(id,version,name) VALUES (3,0,'İzmir');

INSERT INTO t_clinic(id,version,name) VALUES (1,0,'Harezmi Pet Clinic');

INSERT INTO t_pet_type (id,version,name) VALUES (1, 0, 'kedi');
INSERT INTO t_pet_type (id,version,name) VALUES (2, 0, 'köpek');
INSERT INTO t_pet_type (id,version,name) VALUES (3, 0, 'balık');
INSERT INTO t_pet_type (id,version,name) VALUES (4, 0, 'yılan');
INSERT INTO t_pet_type (id,version,name) VALUES (5, 0, 'kuş');
INSERT INTO t_pet_type (id,version,name) VALUES (6, 0, 'kaplumbağa');
INSERT INTO t_pet_type (id,version,name) VALUES (7, 0, 'at');
INSERT INTO t_pet_type (id,version,name) VALUES (8, 0, 'koyun');
INSERT INTO t_pet_type (id,version,name) VALUES (9, 0, 'timsah');
INSERT INTO t_pet_type (id,version,name) VALUES (10, 0, 'tavuk');

INSERT INTO t_specialty (id,version,name) VALUES (1, 0, 'radyoloji');
INSERT INTO t_specialty (id,version,name) VALUES (2, 0, 'cerrahi');
INSERT INTO t_specialty (id,version,name) VALUES (3, 0, 'dişçilik');
INSERT INTO t_specialty (id,version,name) VALUES (4, 0, 'anestezi');
INSERT INTO t_specialty (id,version,name) VALUES (5, 0, 'doğum');

INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (1, 0, 'Jale', 'Cengiz','jale.cengiz@gmail.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (2, 0, 'Hale', 'Lal','lal@hotmail.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (3, 0, 'Leyla', 'Denge','leyla@gmail.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (4, 0, 'Rafi', 'Orta','rorta@yahoo.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (5, 0, 'Hasan', 'Sarı','hsari@yahoo.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (6, 0, 'Sedat', 'Kuzu','kuzu@gmail.com');

INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (7, 0, 'Ziya', 'Ferit','ziya_ferit@hotmail.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (8, 0, 'Beşir', 'Dal','bdal@msn.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (9, 0, 'Eda', 'Rize','erize@yahoo.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (10, 0, 'Hadi', 'Duru','hadi@gmail.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (11, 0, 'Pınar', 'Mus','pmus@gmail.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (12, 0, 'Çiğdem', 'Su','su@yahoo.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (13, 0, 'Aslı', 'Zor','asli.zor@gmail.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (14, 0, 'Murat', 'Eski','eskim@yahoo.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (15, 0, 'Davut', 'Saz','dsaz@msn.com');
INSERT INTO t_person (id,version,first_name,last_name,email) VALUES (16, 0, 'Kadir', 'Mutlu','kadir.mutlu@gmail.com');

INSERT INTO t_address (person_id,city_id,street,phone,phone_type) VALUES (7, 1, '1. Sokak Keçiören', '5325551023','HOME');
INSERT INTO t_address (person_id,city_id,street,phone,phone_type) VALUES (8, 1, '2. Sokak Çankaya', '5325551749','HOME');
INSERT INTO t_address (person_id,city_id,street,phone,phone_type) VALUES (9, 1, '3. Sokak Çankaya', '5555558763','WORK');
INSERT INTO t_address (person_id,city_id,street,phone,phone_type) VALUES (10, 2, '4. Sokak Acıbadem', '5335553198','HOME');
INSERT INTO t_address (person_id,city_id,street,phone,phone_type) VALUES (11, 2, '5. Sokak Kartal', '5445552765','WORK');
INSERT INTO t_address (person_id,city_id,street,phone,phone_type) VALUES (12, 2, '6. Sokak Beyoğlu', '5055552654','WORK');
INSERT INTO t_address (person_id,city_id,street,phone,phone_type) VALUES (13, 2, '7. Sokak Sarıyer', '5555555387','WORK');
INSERT INTO t_address (person_id,city_id,street,phone,phone_type) VALUES (14, 3,'8. Sokak Konak', '5425557683','HOME');
INSERT INTO t_address (person_id,city_id,street,phone,phone_type) VALUES (15, 3, '9. Sokak Altınordu', '5325559435','HOME');
INSERT INTO t_address (person_id,city_id,street,phone,phone_type) VALUES (16, 3, '10. Sokak Karşıyaka', '5335555487','WORK');

INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,1);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,2);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,3);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,4);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,5);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,6);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,7);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,8);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,9);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,10);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,11);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,12);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,13);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,14);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,15);
INSERT INTO t_clinic_person (clinic_id,person_id) VALUES (1,16);

INSERT INTO t_vet (id,works_full_time) VALUES (1,true);
INSERT INTO t_vet (id,works_full_time) VALUES (2,true);
INSERT INTO t_vet (id,works_full_time) VALUES (3,true);
INSERT INTO t_vet (id,works_full_time) VALUES (4,true);
INSERT INTO t_vet (id,works_full_time) VALUES (5,false);
INSERT INTO t_vet (id,works_full_time) VALUES (6,false);

INSERT INTO t_owner (id,rating) VALUES (7,0);
INSERT INTO t_owner (id,rating) VALUES (8,0);
INSERT INTO t_owner (id,rating) VALUES (9,1);
INSERT INTO t_owner (id,rating) VALUES (10,1);
INSERT INTO t_owner (id,rating) VALUES (11,1);
INSERT INTO t_owner (id,rating) VALUES (12,0);
INSERT INTO t_owner (id,rating) VALUES (13,1);
INSERT INTO t_owner (id,rating) VALUES (14,0);
INSERT INTO t_owner (id,rating) VALUES (15,0);
INSERT INTO t_owner (id,rating) VALUES (16,1);

INSERT INTO t_vet_specialty (vet_id,specialty_id) VALUES (1, 1);
INSERT INTO t_vet_specialty (vet_id,specialty_id) VALUES (1, 2);
INSERT INTO t_vet_specialty (vet_id,specialty_id) VALUES (1, 3);
INSERT INTO t_vet_specialty (vet_id,specialty_id) VALUES (2, 1);
INSERT INTO t_vet_specialty (vet_id,specialty_id) VALUES (2, 2);
INSERT INTO t_vet_specialty (vet_id,specialty_id) VALUES (3, 2);
INSERT INTO t_vet_specialty (vet_id,specialty_id) VALUES (4, 3);
INSERT INTO t_vet_specialty (vet_id,specialty_id) VALUES (5, 2);
INSERT INTO t_vet_specialty (vet_id,specialty_id) VALUES (5, 3);
INSERT INTO t_vet_specialty (vet_id,specialty_id) VALUES (5, 4);

INSERT INTO t_pet (id,version,name,birth_date,type_id,owner_id) VALUES (1, 0, 'Maviş', '2005-09-07', 1, 7);
INSERT INTO t_pet (id,version,name,birth_date,type_id,owner_id) VALUES (2, 0, 'Donetello', '2008-08-06', 6, 8);
INSERT INTO t_pet (id,version,name,birth_date,type_id,owner_id) VALUES (3, 0, 'Karabaş', '2001-04-17', 2, 9);
INSERT INTO t_pet (id,version,name,birth_date,type_id,owner_id) VALUES (4, 0, 'Joe', '2009-03-07', 2, 9);
INSERT INTO t_pet (id,version,name,birth_date,type_id,owner_id) VALUES (5, 0, 'Canavar', '2010-11-30', 3, 10);
INSERT INTO t_pet (id,version,name,birth_date,type_id,owner_id) VALUES (6, 0, 'Tatlım', '2010-01-20', 4, 11);
INSERT INTO t_pet (id,version,name,birth_date,type_id,owner_id) VALUES (7, 0, 'Samanta', '2008-09-04', 1, 12);
INSERT INTO t_pet (id,version,name,birth_date,type_id,owner_id) VALUES (8, 0, 'Boncuk', '2008-09-04', 1, 12);
INSERT INTO t_pet (id,version,name,birth_date,type_id,owner_id) VALUES (9, 0, 'Şanslı', '2007-08-06', 5, 13);
INSERT INTO t_pet (id,version,name,birth_date,type_id,owner_id) VALUES (10, 0, 'Karaburun', '2009-02-24', 2, 13);
INSERT INTO t_pet (id,version,name,birth_date,type_id,owner_id) VALUES (11, 0, 'Twetty', '2000-03-09', 5, 15);
INSERT INTO t_pet (id,version,name,birth_date,type_id,owner_id) VALUES (12, 0, 'Tarçın', '2000-06-24', 2, 16);
INSERT INTO t_pet (id,version,name,birth_date,type_id,owner_id) VALUES (13, 0, 'Sarı', '2002-06-08', 1, 16);

INSERT INTO t_visit (id,version,pet_id,visits_order,visit_date,description) VALUES (1, 0, 7, 0, '2013-03-04', 'yaralanma');
INSERT INTO t_visit (id,version,pet_id,visits_order,visit_date,description) VALUES (2, 0, 7, 1, '2011-03-04', 'hastalık');
INSERT INTO t_visit (id,version,pet_id,visits_order,visit_date,description) VALUES (3, 0, 8, 0, '2010-06-04', 'kontrol');
INSERT INTO t_visit (id,version,pet_id,visits_order,visit_date,description) VALUES (4, 0, 8, 1, '2012-09-04', 'kısırlaştırma');
INSERT INTO t_visit (id,version,pet_id,visits_order,visit_date,description) VALUES (5, 0, 8, 2, '2013-10-14', 'aşı');
INSERT INTO t_visit (id,version,pet_id,visits_order,visit_date,description) VALUES (6, 0, 8, 3, '2014-11-04', 'kontrol');
INSERT INTO t_visit (id,version,pet_id,visits_order,visit_date,description) VALUES (7, 0, 9, 0, '2015-11-22', 'yaralanma');
INSERT INTO t_visit (id,version,pet_id,visits_order,visit_date,description) VALUES (8, 0, 10, 0, '2015-11-22', 'yaralanma');

INSERT INTO t_image_content (id,version,content) VALUES (1,0,rawtohex('image 1 content'));
INSERT INTO t_image_content (id,version,content) VALUES (2,0,rawtohex('image 2 content'));
INSERT INTO t_image_content (id,version,content) VALUES (3,0,rawtohex('image 3 content'));
INSERT INTO t_image_content (id,version,content) VALUES (4,0,rawtohex('image 4 content'));
INSERT INTO t_image_content (id,version,content) VALUES (5,0,rawtohex('image 5 content'));

INSERT INTO t_image (id,version,pet_id,content_id,name,file_path,width,height) VALUES (1,0,1,1,'maviş','c:/mavis1.png',300,600);
INSERT INTO t_image (id,version,pet_id,content_id,name,file_path,width,height) VALUES (2,0,1,2,'miyav','d:/users/mavis2.png',500,700);
INSERT INTO t_image (id,version,pet_id,content_id,name,file_path,width,height) VALUES (3,0,3,3,'havhav','/user/home/kopek.png',400,500);
INSERT INTO t_image (id,version,pet_id,content_id,name,file_path,width,height) VALUES (4,0,3,4,'karabas','kopek2.jpeg',500,200);
INSERT INTO t_image (id,version,pet_id,content_id,name,file_path,width,height) VALUES (5,0,3,5,'tazi','c:/users/kenan/kopek3.gif',100,300);


ALTER SEQUENCE hibernate_sequence RESTART WITH 100;

