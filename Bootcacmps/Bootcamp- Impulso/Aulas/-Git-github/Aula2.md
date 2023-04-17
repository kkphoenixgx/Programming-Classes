# Mods: 5 -- **03/04/22**

## Iniciando no git e criando um commit

Comandos git

| comando                        | significado                            |
| ------------------------------ | -------------------------------------- |
| git init                       | começar o repositório                  |
| git add (nomeDoArquivo) (Path) | mover arquivos e iniciar versionamento |
| git commit "mensagem"          | começar o versionamento                |
| git status                     | mostra os arquivos da three            |
| git restore                    | restaura o(s) arquivo(s)               |
| git remote -v                  | lista de repositórios remotos          |

| flag           | significado          |
| -------------- | -------------------- |
| -g ou --global | faz isso globalmente |

## Configuração inicial

tenha certeza de que voê coja fez o git inicial de email e senha

* git config --global user.name 'x'
* git config --global user.email 'y'

Sendo x o nome de usuário  
Sendo y email

## Na configuração do projeto

* git init
* crie o repositório no github
* copia o link
* git remote add origin 'link'

## No uso diário

* git add (* para todos os arquivos)
* git commit -m "mensagem que quiser"
* git push origin (branch)

## Resolvendo conflitos

De uma forma bem resumida, se mandarem um arquivo para o github feito em cima da ultima versão desse arquivo e você fizer também em cima do mesmo arquivo antigo, vai rolar um erro, pois em ordem cronológica só pode existir um, sendo assim para resolver esses conflitos, temos que usar primeiramente um comando de pull, para puxar de volta para a maquina o arquivo em questão e depois fazer a alteração necessária nele

> git pull origin (branch)

E resolve os conflitos presentes, eles ficam com uma marca de '>>>>>>' e '=========' no código

Depois, faça o padrão, git add, git commit -m, git push origin...
