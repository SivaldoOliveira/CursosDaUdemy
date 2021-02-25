
Alter table Registro_Presenca
add constraint fk_TurmasRP Foreign key (id_turma) references Turmas (id_turma);

Alter table Registro_Presenca
add constraint fk_AlunoRP foreign key (id_aluno) references Alunos (id_aluno);

Alter table Registro_Presenca
add constraint fk_SituacaoRP foreign key (id_situacao) references Situacao (id_situacao);

Alter table Turmas
add constraint fk_Alunos foreign key (id_aluno) references Alunos (id_aluno);

Alter table Turmas
add constraint fk_Curso foreign key (id_curso) references Cursos (id_curso);