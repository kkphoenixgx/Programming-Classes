# Navegando entre pastas ou interfaces

Mod 108 -- **19/01/22**

Nessa aula do curso, eu acho interessante como é o processo de criação dos professores, é interessante observar como eles chegam em uma conclusão, mas é interessante também tentar superar o seu processo de pensamento e criar algo mais consistente e aprender com eles o por quê de usar certas escolhas, por exemplo, algo que me intrigou foi a escolha de percorrer um array com um laço *for*, e criando minha versão do laço com um *forEach*, eu entendo o por quê de terem criado dessa forma, claro que tem como fazer com um forEach, mas fica mais fácil percorrer os itens com a variável i do for, de fato tenho muito o que aprender.

Para criar uma barra de navegação, temos primeiro saber em qual pasta estamos, e a melhor forma de fazer isso é sem dúvida alguma, criando um array e dando push para ele a cada nova rota, nessa aula, um conceito que eu achei interessante foi o uso do método join() usado para adicionar o / no path e depois o split() para converter de volta para um array separando pela própria /, a string criada, com um dataset nos spans da barra de navegação, podemos nessa string criada pelo join('/').push(path).join('/') ir adicionando a string ao dataset e só depois separar de volta para obter onde estamos
