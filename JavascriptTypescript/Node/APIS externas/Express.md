# Express
2024-03-21
tags: [[Index node]]

Ele é um framework muito rápido, então escalável, flexível e minimalista, ele é prático e muito bom. Ele possui Middlewares, Templates, Rotas e MVC( Model, View e Controller ).

## Express generator e arquitetura de pastas

> `npx express-generator <appName> --view=pug`

entra no `<appName>` e dá um `npm install` para baixar as dependências.

Após isso, vamos setar o debug do express e  e(`&`) iniciar o server express:

> `SET DEBUG =<appName>:* & npm start`

Sendo `<appName>`, o nome do seu projeto, como todas as outras vezes.

![[Pasted image 20240321155205.png]]


## Express básico

```node
const express = require("express"); // import express
const app = express(); // meu app recebe express

// Cria a porta padrão do servidor
app.get('/', (req, res)=>{
	// req = requisição do cliente
	// res = resposta do servidor
	
	// vamos dizer que se respondeu, tudo certo
	res.statusCode = 200;

})

// vai colocar o servidor para escutar em uma porta
app.listen(3000, ()=>{
	// só uma mensagem no console
	console.log("server running on port http://localhost:3000");
})
```

melhorando o código

```node
const express = require("express"); // import express
const app = express(); // meu app recebe express

const dns = "http://localhost";
const port = 3000;

app.get('/', (req, res)=>{
	res.statusCode = 200;
})

app.listen(port, ()=>{
	console.log(`server running on port: ${dns}:${port}`);
})
```

## Rotas

Vamos deixar aqui bem claro que `app.use()` é um middleware, e que usamos um middleware para carregar as rotas. Contudo, dedicaremos um tópico para esse tipo de middleware pois ele é bem importante e é bem legal.

Get de páginas html, delete, update, post de rotas... Rotas para manipular... 

| método     | função                                                             |
| ---------- | ------------------------------------------------------------------ |
| **GET**    | Requisitar algo do servidor                                        |
| **POST**   | Mandar algo para o servidor                                        |
| **PATH**   | Mudar algum dado especifico do servidor, como a senha do seu login |
| **PUT**    | Mudar algo do servidor, como seu login inteiro                     |
| **DELETE** | Tirar algo do servidor                                             |

* Exemplo de GET enviando página
	
	![[Pasted image 20240321163221.png]] 
	Perceba que usamos o método `res.render()` para renderizar arquivos pug para o cliente

* Exemplo roteamento do get
	
	![[Pasted image 20240322224728.png]]
	![[Pasted image 20240322224417.png]]

* Pegando parâmetros na url
	
	![[Pasted image 20240321164939.png]]


```node
import express from "express";

const app = express(); // meu app recebe express
const url = "http://localhost";
const port = 4000;

app.use(express.json())

// ----------- Routes -----------

// GET

app.get('/', (req, res)=>{
  res.statusCode = 200;
  res.send("get response")
})

app.get('/adm', (req, res)=>{
  res.statusCode = 200;
  res.send("Acessando a página adm")
})

app.get('/adm/:id', (req, res)=>{
  res.statusCode = 200;
  res.send("Acessando a página de administração com o id: " + req.params.id)
})


// POST

app.post('/adm', (req, res)=>{
  const userDataRequest = JSON.stringify(req.body);
  res.statusCode = 200
  res.send(`o usuário respondeu com \n${userDataRequest}`)
})

// PUT

app.put('/adm/:id', (req, res)=>{
  res.statusCode = 200
  res.send("Modificando o usuário com id: " + req.params.id)
})

// PATH

app.patch('/adm/:id', (req, res)=>{
  res.statusCode = 200
  res.send("Modificando o usuário com id: " + req.params.id)
})

// DELETE

app.delete('/adm/:id', (req, res)=>{
  res.statusCode = 200
  res.send("Deletando o usuário com id: " + req.params.id)
})  

// ----------- SERVER -----------

app.listen(port, ()=>{
  console.log(`server running on port: ${url}:${port}`);
})
```

Mas perceba que isso tá ficando muito grande, então vamos modularizar isso para criar módulos que encapsulam essas rotas...  

Podemos, por exemplo, criar uma pasta routes que possuirá o arquivo `routes/adm.js`, que vai cuidar da rota adm, perceba que agora as rotas não possuem mais adm, já que só vai para esse arquivo se for da rota adm:

```node
const express = request("express");
const router = express.Router();

// GET
router.get('/', (req, res)=>{
  res.statusCode = 200;
  res.send("Acessando a página adm")
})
router.get('/:id', (req, res)=>{
  res.statusCode = 200;
  res.send("Acessando a página de administração com o id: " + req.params.id)
})

// POST
router.post('/', (req, res)=>{
  const userDataRequest = JSON.stringify(req.body);
  res.statusCode = 200
  res.send(`o usuário respondeu com \n${userDataRequest}`)
})

// PUT
router.put('/:id', (req, res)=>{
  res.statusCode = 200
  res.send("Modificando o usuário com id: " + req.params.id)
})

// PATH
router.patch('/:id', (req, res)=>{
  res.statusCode = 200
  res.send("Modificando o usuário com id: " + req.params.id)
})

// DELETE
router.delete('/:id', (req, res)=>{
  res.statusCode = 200
  res.send("Deletando o usuário com id: " + req.params.id)
})  

module.exports = router
```

e o nosso arquivo do servidor ficará:  
OBS: Não deixe `app.use('/adm', admRoute)` passar despercebido, precisamos falar par ao express que vamos usar esse arquivo quando usarmos a rota /adm

```node
import express from "express";
const app = express(); 

const url = "http://localhost";
const port = 4000;

const admRoute = require("./routes/adm")

app.use(express.json())

// ----------- Routes -----------

// GET

app.get('/', (req, res)=>{
  res.statusCode = 200;
  res.send("get response")
})

app.use('/adm', admRoute)

// ----------- SERVER -----------

app.listen(port, ()=>{
  console.log(`server running on port: ${url}:${port}`);
})
```

### Roteamento estático

Agora, digamos que queremos queremos rotear para um arquivo html estático, usaremos o `express.static(<path>)`, veja:

* Carregaremos na rota "/" os arquivos estáticos da nossa pasta "public":
	
	```node
	app.use(express.static('public'))
	```

* Carregaremos na rota "/static" os arquivos estáticos da nossa pasta "public":

	![[Pasted image 20240403120602.png]]

Veja a arquitetura de pastas:

![[Pasted image 20240403120805.png]]

Exemplo form:

![[Pasted image 20240424183433.png]]

### Rest Client vscode

![[Pasted image 20240321165412.png]]
	

![[Pasted image 20240321165305.png]]

![[Pasted image 20240322232700.png]]

```server.rest
### GET /
GET http://localhost:4000
### GET /adm/
GET http://localhost:4000/adm
### GET /adm/:id
GET http://localhost:4000/adm/1
### POST adm
POST http://localhost:4000/adm
Content-Type: application/json

{
  "user": "kkphoenix",
  "password": "hello"
}
```


## Middleware

Uma forma que tratar dados, que faz verificações e segurança. Você pode interferir na requisição de algum dado na aplicação com funções como `app.use()` e etc...

Usamos um middleware quando queremos mudar algo da requisição do usuário.

Podemos, por exemplo, parar a requisição no meio para ela aceitar requisições com JSON usando o `app.use()`, veja:

```node
import express from "express";
const app = express(); // meu app recebe express

app.use(express.json())
```

dessa forma, nosso app está usando essa funcionalidade do express de poder aceitar JSON, isso é um exemplo claro de um build in middleware.  
Cuidado para não passar `app.use(express.json)`, sem o (), o servidor não vai rodar

### Build-In

Middlewares do tipo build in modificam in runtime a forma que seu servidor interage com um tipo de requisição, atua em nível de aplicação, como o já usado `app.use(express.json)` que permite que o servidor entenda arquivos json.

Outro tipo que já utilizamos, e de longe o mais standart, o `app.use(<url :string>, <moduleRequired>)` que vai delegar o encaminhamento e gerenciamento de uma rota à um módulo.

### Middleware próprio

É bem simples, bem legal e tudo que queremos com um parâmetro a mais com gosto de diliça. Bom, tem um `<req>`, um `<res>`, que se vc n sabe o que é, saia daqui, e o diferente `<next>`, que é bem legal, ele é a próxima função que será chamada ao executar esse bloco de código.

![[Pasted image 20240329021330.png]]

```node 
app.use((req, res, next)=>{
	//code

	return next()
})
```

Então o bloco de código vai ser executado quando um usuário fizer uma requisição. Dá para passar middlewares em nível de rotas dessa forma:

![[Pasted image 20240329021831.png]]

Então dá para, por exemplo, passar um middleware verificando se um usuário existe no banco de dados

### De terceiros

Como o módulo Body Parser, usamos ele para dar parse em uma requisição e manipular ela. Alguns deles, inclusive, são mantidos pela própria equipe do express, como o próprio body parser, dá uma olhada nos módulos:


![[Pasted image 20240330153524.png]]

Podemos usar esses Middlewares de terceiros usando `app.use(<api>)`, como se fosse um nativo, só que importado...

```node
const express = require("express")
const cookieParser = require("cookie-parser")

const app = express()
app.use(cokieParser())
```

Dessa forma, podemos parar requisições e configurar cookies do usuário na requisição:

```node
app.use('/login/:name', (req, res)=>{

	res.cookie(
		"user",             // chave de acesso do cookie
		req.params.name,    // valor do cookie
		{ maxage: 900000 }, // ano máximo de uso do cookie
		httpOnly: true      // Diz que o cookie só vai usar http
	)

	res.send("cookie salvo")

})
```

Parecido para requerir o cookie:

![[Pasted image 20240330162853.png]]


### Tratando erros

Quando estamos tratando erros no express, colocamos as funções de Middleware antes do `app.listen()` e depois das funções de rota, é uma convenção e precisamos que as funções carreguem. Veja um exemplo.

![[Pasted image 20240403114152.png]]

```node
app.use( (err, req, res, next)=>{
	console.log(err.stack) // emite o erro no console

	// Coloca a mensagem de erro no json da resposta de erro
	res.status(500).json({message: err.message})
})
```

E para testar, podemos forçar um erro na next de uma rota:

![[Pasted image 20240403114717.png]]

Como um outro exemplo, veja tratando esse erro gerado:

![[Pasted image 20240403115003.png]]

## Templates

Pug, EJS...  Um layout html otimizado para interagir com nosso código
