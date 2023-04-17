# Mods 1, 2, 3, 4 -- **02/03/22**

## Git e github

O git e o github serve para trabalhar com organização e melhoria em grupo dos códigos

Git = É um sistema de versionamento de código distribuído (controle de versão) -> Linus Torvalds (Criador) -> Criou o linux e para ajudar na criação criou o git

Git != do github

Possuem outras opções mas esses são os maiores

## Comandos básicos para um bom desempenho no terminal

O git é um CLI

* **GUI** = Possuí interface gráfica
* **CLI** = Não possuí interface gráfica, somente texto no terminal

### Comandos básicos

* flags = -x sendo x o nome da flag e -x aplicada após o comando normal

| atalhos (sistemas que o suporta) | função           |
| -------------------------------- | ---------------- |
| ctrl + L (Linux)                 | limpa o terminal |
| tab (win e linux)                | auto-completa    |
| seta para cima                   | ultimo comando   |

| simbolo | função                           |
| ------- | -------------------------------- |
| **..**  | voltando um diretório            |
| **>**   | direcionador de fluxo, para -> x |
| pipe    | também faça                      |

| comando: windows (shell) \ linux  (bash) | função                                     |
| ---------------------------------------- | ------------------------------------------ |
| dir \ ls                                 | mostrar as pastas                          |
| cd                                       | navegar entre as pastas                    |
| cls \ clear                              | limpar a pasta                             |
| mkdir                                    | cria a pasta                               |
| echo content > arquivo                   | escreve o content no arquivo               |
| del workspace                            | deleta só os arquivos dentro dela          |
| rmdir /S /Q \ rmdir -rf                  | remove o diretório e tudo o que tem dentro |
| mv                                       | move algo                                  |

| flag (sistema) | função                           |
| -------------- | -------------------------------- |
| /S             | ------                           |
| /Q             | ------                           |
| -r             | recursive                        |
| -force         | forçado, sem mensagem de erro    |
| -rf            | deleta tudo sem mensagem de erro |
| -a             | mostra ocultos                   |

## Conceito fundamental, por baixo dos panos

Existe um program criado pela segurança nacional do EUA que encripta em 40 caracteres um hash de código com todas as letras e em cada dígito, números de 0 a 9, o que dá, MUITAS possibilidades, impossível de calcular e nenhum programa de run consegue quebrar, até na calculadora, mas é um total de 1440! de possibilidades, então temos uma segurança bem forte nesse hash de 40 dígitos.

Inclusive podemos usar o comando:
 > git hash-object pathDoArquivo
Podemos passar (--stdin para não passar uma sting)  
E podemos usar o openssl1, que é o comando do programa da segurança nacional dos EUA também:
 > openssl sha1 pathDoArquivo

E esse git com esse hash de 40 dígitos é guardado em um objeto chamado blob(bolha), que é uma sequencia de caracteres composta por ('número de caracteres' + hash de: ('9 \0' *+* **'arquivo'**) )  que por sua vez, as bolhas são guardadas em uma three(árvore) que guarda esses objetos blobs, o nome do arquivo e o path, apontando só para a próxima bolha e por cima de tudo, temos o commit, que aposta para a three, o parente, para o autor, uma mensagem e um timestamp e o mais forte de tudo é que os commits também tem hash, ou seja, qualquer coisa qua você mudar, gera outro sha1

## Chave ssh ssh

Siga os passos

* ssh-keygen -t ed(yourCode)
* digite a senha
* cd (path que deu na mensagem)
* cat public key( id_ed(code).pub, escreve id_ed, dá um tab e digita .pub se não tiver )
* copia o código e adiciona no ssh no site do github
* eval $(ssh-agent -s)
* ssh id_ed(ourCode)
* digite a senha

Tudo certo, para testar clona um a past ai com **git clone** path

## Token de acesso pessoal

Não vale muito a pena fazer... Mas se você for ficar somente um tempo com a maquina em questão, faça-o

* vá no site do github -> settings -> developer settings -> personal access token ->
* coloca o número de dias que você va ficar com essa chave
* clica em repo, bota o nome e gera
* **copia o token**

se quiser da um clone e usa um https e coloca esse token no pop-up que vai abrir, esse token só vai valer até o tempo escolhido
