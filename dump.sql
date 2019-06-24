INSERT INTO `administrador` (`id`, `nome`, `email`, `senha`) VALUES
(1, 'Matheus', 'matheus@gmail.com', '123'),
(2, 'José', 'jose@gmail.com', '123'),
(3, 'Carlo', 'carlo@gmail.com', '123'),
(4, 'Raul', 'raul@gmail.com', '123');


INSERT INTO `aluno` (`id`, `nome`, `email`, `senha`, `perfil`) VALUES
(1, 'Chales', 'charles@gmail.com', '123', 'Teórico'),
(2, 'Diego', 'diego@gmail.com', '123', 'Reflexivo'),
(3, 'Rafael', 'rafael@gmail.com', '123', 'Pragmático'),
(4, 'Jennifer', 'jennifer@gmail.com', '123', 'Ativo'),
(5, 'Nathália', 'nathalia@gmail.com', '123', 'Teórico'),
(6, 'Clara', 'clara@gmail.com', '123', 'Reflexivo'),
(7, 'Raquel', 'raquel@gmail.com', '123', 'Pragmático');

INSERT INTO `professor` (`id`, `nome`, `email`, `senha`) VALUES
(1, 'Revoredo', 'revoredo@gmail.com', '123'),
(2, 'Cleyton', 'cleyton@gmail.com', '123'),
(3, 'Ariane', 'ariane@gmail.com', '123'),
(4, 'Ivaldir', 'ivaldir@gmail.com', '123');

INSERT INTO `turma` (`id`, `id_professor`, `ano`, `descricao`, `disciplina`) VALUES
(1, 1, '7º Período', 'descrição', 'Tópicos Integradores II'),
(2, 1, '1º Período', 'descrição', 'Programação I'),
(3, 2, '5º Período', 'descrição', 'Teoria da computação'),
(4, 2, '6º Período', 'descrição', 'Inteligência Artificial'),
(5, 3, '5º Período', 'descrição', 'Computação Gráfica'),
(6, 4, '7º Período', 'descrição', 'Planejamento e Gerênciamento de projetos');

INSERT INTO `avaliacao_do_professor` (`id`, `id_turma`, `conceito1`, `conceito2`, `conceito3`, `conceito4`, `conceito5`, `conceito6`, `conceito7`, `conceito8`, `conceito9`, `conceito10`, `conceito11`, `conceito12`) VALUES
(1, 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(2, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(3, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);