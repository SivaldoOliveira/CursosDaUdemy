select * from TURMAS --Select para todos os registros da tabela Turmas
select * from Cursos

select * from dbo.Turmas -- * Todos os registros

--DBA = DataBase Administrador

--Exemplo de Query utilizando o nome da tabela
select turmas.* from turmas

--Selecionar apenas alguns campos da tabela
select id_turma, id_curso, data_inicio
  from dbo.turmas

joins (JUNÇÃO DE TABELAS)

--Utilizar Alias (APELIDO) para Nome da Tabela
Select *
  from dbo.Turmas T

select cc.* from dbo.cursos CC

Select t.*
  from dbo.turmas T

Select T.id_turma, T.id_curso, t.data_inicio
  from dbo.turmas T

--Utilizar Nomes Personalizados para nossos campos
Select T.id_curso AS IDC, t.id_turma AS IDT, T.data_inicio AS "DATA COMEÇO"
  from dbo.turmas T

--Segunda forma
Select tt.id_curso IDC, tt.id_turma IDT, tt.data_inicio "DATA COMEÇO"
  from dbo.turmas TT
--AULA 10

select a.*
from Alunos a
where a.nome <> 'Alvaro queiroz'


select * from
alunos a
where a.sexo = 'F'

select * from
alunos a
where a.sexo = 'M'
and a.data_nascimento >='01/01/2003'

--Joins (JUNTAR ou UNIR)
select *
from AlunosxTurmas at, Turmas t, Cursos c
where at.id_turma = t.id_turma

select c.nome_curso, t.data_inicio, t.data_termino,
floor(at.valor) valor_bruto,floor( (at.valor * at.valor_desconto)) as desconto,
at.valor - (at.valor *  at.valor_desconto ) as Valor_liquido
from AlunosxTurmas at, Turmas t, Cursos c
where at.id_turma = t.id_turma
and t.id_curso  = c.id_curso







