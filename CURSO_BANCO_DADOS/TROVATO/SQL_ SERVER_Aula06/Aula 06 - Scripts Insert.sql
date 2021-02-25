INSERT INTO dbo.Alunos (id_aluno, nome, data_nascimento, sexo, data_cadastro, login_cadastro) 
VALUES 
(2,'Alessandro Henrique Peres Porfirio','04/10/1989','M','02/11/2019 15:00:00','ALESS');

select * from dbo.Alunos

insert into dbo.Cursos (id_curso, nome_curso, data_cadastro, login_cadastro) values
(1, 'VBA I','02/11/2019 15:00:00','ALESS')

SELECT * FROM DBO.Cursos

insert into dbo.Situacao
(id_situacao, situacao, data_cadastro, login_cadastro)
values
(1,'Presença confirmada', '02/11/2019 15:00:00','ALESS')

insert into dbo.Situacao
(id_situacao, situacao, data_cadastro, login_cadastro)
values
(2,'Ausente Sem Justificativa', '02/11/2019 15:00:00','ALESS')

insert into dbo.Situacao
(id_situacao, situacao, data_cadastro, login_cadastro)
values
(3,'Ausente Com Justificativa', '02/11/2019 15:00:00','ALESS')

select * from dbo.Situacao



insert into dbo.Cursos (id_curso, nome_curso, data_cadastro, login_cadastro) values
(11, 'Word Avançado','12/19/2019 17:00:00','Simol');


Insert into Turmas
(id_turma, id_curso, data_inicio, data_termino, data_cadastro, login_cadastro)
values
(12,6, '02/20/2021','12/12/2021',GETDATE(), 'simol');

Insert into AlunosxTurmas
(id_turma, id_aluno, valor, valor_desconto, data_cadastro, login_cadastro)
values
(1, 10, 1200, 0.1, GETDATE(), 'simol')

select * from AlunosxTurmas