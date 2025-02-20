# Package Managers
2024-01-09
tags: [[-Index node]]

Já que o node tem muitos pacote, criados pelos usuários, precisamos de algo para gerenciar os pacotes e guardar as versões dos pacotes.

## NPM

* **Npm = Node package manager.**

Mas o npm não é algo feito pelo node, é um projeto a parte
só que ele já vem com o node quando ele é instalado.

inclusive o npm é um projeto publico onde se pode baixar e postar módulos. Para baixar um modulo com o npm dá para olhar no próprio site do npm o comando e uma boa adição é que você pode escolher a versão do site se usar um @x sendo x a versão.

npm i x, sendo x o que deve baixar. e se for global, para usar na máquina algo, é só colocar o **-g**


### O que é um arquivo package JSON?  

Um arquivo package json é um arquivo que guarda informações do seu projeto e dependencias necessárias para rodar o seu projeto, então essencialmente não é necessário usa-lo caso não haja modulos de terceiros. Para cria-ló no seu projeto, é necessário usar npm ou yarn init.
> `npm init`

**npm init (-y)** para fazer o setup básico e mais rápido

Isso vai gerar uma série de questionários para as informações iniciais do projeto.  
Usando  o package json também tem como você baixar as dependências de um projeto só pelo arquivo package json, você simplesmente dá o comando no terminal para baixar os arquivos, que é:

>`npm install`

## node_modules

Node_Modules é uma pasta que contém todos os módulos dependentes que você instala via npm ou yarn e esses módulos são muito pesados, então obviamente se deve ignora-lós antes de manda-lós para o diretório do github. Para isso usamos o .gitignore e para usar o .gitignore que ignora os arquivos desnecessários, basta colocar o path do arquivo ou pasta:

~~~.gitignore
# Levando em conta que a pasta está na mesma pasta que o .gitignore 
/node_modules/
# poderiamos usar também = ./.gitignore/
~~~

podemos também selecionar um tipo específico de arquivo simplesmente colocando um *.tipoDeArquivo, exemplo:  

> *.zip

Usando **git status** no console podemos ver os arquivos que estão faltando no nosso repositório e usando o git add *.* podemos colocar os arquivos faltando todos de uma vez, poupando tempo.


## YARN

* **Yarn = também é um gerenciador de pacotes igual o npm**

Mas o yarn não tem alguns módulos, porém ele é mais rápido e garante que todos estejam usando a mesma versão do módulo mas para adicionar algo no teclado ele usa yarn add x e se quiser usar o -g é global ao invés de -g.
Se você usar o [yarn install] ele instala as dependência só com os arquivos de configuração.
Tanto op npm install quanto o yarn install leem o  package.json e instalam as dependências
