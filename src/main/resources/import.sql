INSERT INTO Pessoa(id, nome, anoNascimento) VALUES(1, 'Pedro', 2000);
INSERT INTO Pessoa(id, nome, anoNascimento) VALUES(2, 'Elder', 2001);
INSERT INTO Pessoa(id, nome, anoNascimento) VALUES(3, 'Hugo', 2002);
INSERT INTO Pessoa(id, nome, anoNascimento) VALUES(4, 'Isidro', 2003);

ALTER SEQUENCE pessoa_seq RESTART WITH 4;