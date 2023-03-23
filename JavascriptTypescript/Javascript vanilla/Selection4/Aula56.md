mod 74 <br>[IndexJs](../IndexJs.md)

**14/10/21**

<h2>Obtendo dados de um usuário com NeDB</h2>

No ultimo módulo descobrimos que o método find() do NeDB mostra todos os usuários, todos os itens, da nossa tabela em json, pois estamos usando json, então para achar um em especifico, podemos usar o método findOne(x), sendo x um objeto json com as propriedades de um que você quer encontrar, por exemplo, eu quero encontrar um usuário com um determinado id, eu vou pedir do json, o _id: e passar um req.params.x, sendo x o parametro colocado na url, no json, mas vamos por partes, primeiramente precisamos de um path que tem o id do usuário para chamar, então com o 
consign( ), vamos criar uma rota para o id e depois usar o método findOne( ).

No arquivo index das rotas
~~~js
const express = require('express');
const consign = require('consign');

var app = express()
consign().include('routes').into(app);
// sendo routes a pasta com as paths

~~~

No arquivo da path
~~~js

module.exports{
    //requirindo o NeDb
    const NeDB = require('nedb');
    var db = new NeDN();

    //criando a rota com o id para ser requisitado
    const routeId = app.routes('/users/:id')

    //criando de fato a requisição e a resposta da path
    routeId.get((req, res) => {

        //procurando dentro do db o id
        db.findOne({

            _id: req.params.id

        }).exec((err, user)=> {

            //dizendo o que fazer quando achar o id
            if(err){
                console.log(`error: ${err}`);
                res.statusCode(300).json({
                    error: err
                });
            }else{
                res.status(200).json(user);
            }

        }); 

    })

}
~~~