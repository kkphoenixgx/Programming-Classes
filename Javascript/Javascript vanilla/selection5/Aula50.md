# Usando express generator para criar um novo projeto

## Notas e ajustes do servidor

Mod 79 -- **30/10/21**

Quero lembrar aqui que essas notas são minhas anotações das aulas do meu curso de javascript, eu não tenho interesse algum de transmitir informações ou copiar conteúdos e repassa-lós como se fosse um blog, essas anotações são para uso pessoal e para mostrar os conteúdos que eu sei para avaliadores e compartilhar anotações com amigos e a própria hcode ao retirar dúvidas sobre as aulas, portanto que existe o **mod** que é justamente o módulo da aula e a data que eu aprendi como se fosse um caderno de anotações.

Tendo isso em mente se você quiser ter o conteúdo do curso, compre-o na Udemy, as aulas são incriveis e a didatica é direto ao ponto.

então com isso em mente, este é a arquitetura do projeto do curso para melhor exemplificação futura de mim para mim.

![arquitetura](..\img\ArquiteturaRESTful.png)

Então essa aula ficaria sendo mais uma aula de estruturação de projeto, uma coisa importante a se notar na imagem é que ela é uma arquitetura de software, não está em blocos como geralmente é feita mas está mais fácil de entender do que como componentes.

## Usando o express Generator

Mod 79 -- **01/10/21**

O express generator é um módulo que auxilia a criação de aplicações, pode ser instalado via npm de forma bem simples, simplesmente usando:

> npm install express-generator (-g)

Ele adiciona vários comandos no express, para ver todas elas:

> express -h

Uma desses comandos é o --ejs que adiciona as pastas que você teria que criar na mão de forma bem simples, você passa o nome da pasta depois do comando e ele já cria para você automaticamente as pastas

> express --ejs X

sendo X o nome da pasta que deve ser criada e lembra que deve ser usado um **npm install** para a dependências do express.

obs: A pasta view é onde vai ficar o index do client mas ele deve ser em um arquivo ejs, que é um arquivo html, basicamente. E a pasta public é onde vai ficar todos os outros arquivos.
