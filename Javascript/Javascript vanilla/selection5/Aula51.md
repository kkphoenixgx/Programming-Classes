# Usando Restify para consumir uma API REST

Mod 80 -- **02/11/21**

O restify é um framework web service escrito em node.js que permite termos tanto a parte do servidor quanto a parte do client, consumindo o servidor restful

Para instalar o restify no lado do cliente, nós podemos usar:

> npm install restify-clients (--save)

E isso permite conseguirmos acessar os métodos do objeto restify que podemos chamar usando um require(x);

## Usando o restify no cliente

Para usarmos o restify primeiro deveremos requirir ele em um de nossos paths com require e com isso, no lado do cliente temos três tipos de responses:

JsonClient: envia e espera application/json<br>
StringClient: envia e recebe urls encriptadas em text/plain

e isso aqui:<br>
HttpClient: thin wrapper over node’s http/https libraries

Então como exemplo vamos criar json client para ter uma ideia de como funciona:

~~~javascript
const restify = request('restify-client')

var client = restify.createJsonCLient({
    url: 'http//localhost:4000'
})
~~~

O que eu estou fazendo nesse código? criando um json Client, isso auto explica muita coisa, a variável client é abstrata, ela vai criar um client na url passada e esse client quando requisitar ser enviado, será enviado, é confuso mas é entendivel.

~~~javascript
//requirindo as dependencias
const express = require('express');
const router = express.Router();
const restify = request('restify-client');
const assert = request('assert');

// criando o client
var client = restify.createJsonCLient({
    url: 'http//localhost:4000'
})

// Ao requirir na rota / execute:
router.get('/', function(req, res, next) {

    // ao requirir o client na rota /users, execute:
    client.get('/users', function(err, restifyReq, restReq, object){
    // caso tenha um erro mostre o erro.
    assert.ifError(err);

    // e joga na tela meu objeto.
    res.end(JSON.stringify(object, null, 2))

    });

});
~~~
