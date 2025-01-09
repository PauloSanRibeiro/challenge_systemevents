INSERT INTO TBCATE (descripton) values ('Curso');
INSERT INTO TBCATE (descripton) values ('Oficina');

INSERT INTO TBPART (name, email) values ('José Silva', 'jose@gmail.com');
INSERT INTO TBPART (name, email) values ('José Silva', 'jose@gmail.com');
INSERT INTO TBPART (name, email) values ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO TBPART (name, email) values ('Maria do Rosário', 'maria@gmail.com');
INSERT INTO TBPART (name, email) values ('Teresa Silva', 'teresa@gmail.com');

INSERT INTO TBACTI (name, description, price, categoryid) values ('Curso de HTML', 'Aprenda HTML de forma prática.', 80.00, 1);
INSERT INTO TBACTI (name, description, price, categoryid) values ('Oficina de Github', 'Controle versões de seus projetos.', 50.00, 2);


INSERT INTO TBBLOC(start,fim, activityid) values (TIMESTAMP WITH TIME ZONE '2017-09-25T08:00:00Z',TIMESTAMP WITH TIME ZONE '2017-09-25T11:00:00Z', 1);
INSERT INTO TBBLOC(start,fim, activityid) values (TIMESTAMP WITH TIME ZONE '2017-09-25T14:00:00Z',TIMESTAMP WITH TIME ZONE '2017-09-25T18:00:00Z', 2);
INSERT INTO TBBLOC(start,fim, activityid) values (TIMESTAMP WITH TIME ZONE '2017-09-26T08:00:00Z',TIMESTAMP WITH TIME ZONE '2017-09-26T11:00:00Z', 2);


INSERT INTO TBPARTACT (TBACTIID,TBPARTID)VALUES(1,1);
INSERT INTO TBPARTACT (TBACTIID,TBPARTID)VALUES(2,1);
INSERT INTO TBPARTACT (TBACTIID,TBPARTID)VALUES(1,2);
INSERT INTO TBPARTACT (TBACTIID,TBPARTID)VALUES(1,3);
INSERT INTO TBPARTACT (TBACTIID,TBPARTID)VALUES(2,3);
INSERT INTO TBPARTACT (TBACTIID,TBPARTID)VALUES(2,4);