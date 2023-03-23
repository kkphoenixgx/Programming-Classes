# Recebendo arquivos no node.js com formalidade e revisando Body Parser
[IndexJs](../IndexJs.md)

Mod 93 -- **10/12/21**

Existe um módulo chamado formidable do node.js que trabalha mais especificamente com fotos, diferentemente do bodyParser que é mais para dados via json e campos de formulário.

## Formidable

> npm install formidable

O formidable funciona de uma maneira muito interessante, diferentemente de módulos comuns, o formidable tem diferentes classes para suas principais funções, como pode perceber no código de exemplo abaixo, no Router.post, foi usando o Router do express e o express, para ir mais rápido a explicação.  
No exemplo, foi usado o incomingForm, já que isso é feito *no momento em que é envidado o formulário* e quando chegar as imagens podemos tratar elas de várias formas, uma delas é guardar ela no banco, que ali está sendo um diretório do próprio app mesmo, usando o **uploadDir** para mostrar o diretório e o **keepExtensions = true** para manter as extensões de arquivo para poder abrir eles normalmente depois.

* setup formidable:

    ~~~js
    //Express e Router (Não são dependentes para o processo)
    var express = require('express');
    var Router = express.Router();

    // formidable (não depende do express)
    var formidable = require('formidable')

    /*
    Nesse exemplo eu vou criar uma parte de uma api
    isso não está completo, é só o método post usando router do express
    */
    var app = express();
    router.post('/YourPathUpload', function(req, res){

    let form = new formidable.IncomingForm({
        uploadDir : './uploads',
        keepExtensionsFiles: true
    });

    form.parse(FormReq, (error, fields, files) =>{
            res.json({
            files
            });
    });
    });
    ~~~

## Revisão Body Parser

O Body parser é uma forma de obter os dados. Com ele, podemos usar o req.body, requirindo os dados de um formulário

* setup bodyParser:
  
  > npm install body-parser

  ~~~javascript
  var express = require('express');
  var bodyParser = require('body-parser');
  
  /* 
  **bodyParser.json**
  no caso estou usando o formato json para o padrão
  de leitura de arquivos do formulário, mas o formato
  é moldável a sua escolha.
  */
  /*
  **Url encoded:**
  Já o método encoded para a url é um método para
  encriptar a url de forma segura, então é necessário usar este
  */
  app.use(bodyParser.json());
  app.use(bodyParser.url.encoded({extended: false}));
  ~~~

* **req.body**
  A partir do momento que o bodyParser for devidamente colocado em seu script, ele funcionará de uma forma simples e muito útil, defina req.body e você poderá receber na forma que você escolheu, os dados do seu form.
