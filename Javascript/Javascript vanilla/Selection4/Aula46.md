mod 62                                            03/10/21

- Introdução ao nodeJs

Todas as informações dessa parte do curso vão entrar no 
dicionario do curso de node.


mod 63 - instalação do node;

mod 64

- Criando um Servidor Web com Node.JS

para criar um servidor rodando na sua maquina é bem 
simples e prático, basicamente você deve falar o que ele
escuta e criar ele, concorda? Para isso em especifico
tem dois metodos que fazem isso para você sem muito 
esforço: o x.createServer e o x.listen
x.createServer cria um servidor e o lestem fala onde ele
vai rodar.

* x.createServer((res, req)=>{bloco de código})
    o create server deve criar um servidor usando um 
    modulo, que por exemplo pode ser o metodo http, 
    nesse caso, x = 'http' e sendo um metodo, o x n pode
    ser uma String, então começamos criando uma constante
    que chama o que conhecemos como modulo http, usando
    o método require(x), que chama um módulo existente.
    então:
    const http = require('http');
    
    http.createServer((req, res)=>{
        console.log("aqui podendo ter tudo o que 
        o servidor vai fazer ao iniciar");
    });

    sendo req uma variável para tudo que o servidor pode
    receber de request e o res o mesmo para as respostas

* x.listen(porta, ip, fn)

    No caso do listen, vamos passar a porta e o ip para
    o servidor rodar e o que fazer enquanto o servidor 
    estiver rodando, sendo x = o próprio server.

    ex:
        server.listen(3000, 127.0.0.1, ()=.{

            console.log("bloco de código para o que fazer
            enquanto o server está rodando.");

        })
