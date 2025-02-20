# Node Server
tags: [[-Index node]]

~~~node
const http = require("http");
const host = "127.0.0.1";
const port = 3000;

const server = http.createServer((req, res) =>{
    res.statusCode = 200;
    res.setHeader('Content-type', 'text/plain');
    res.end('Ola Mundo \n Meu primeiro script em node');
});

server.listen(port, host, ()=> {
    console.log(`Server running at http://${host}:${port}`);
});
~~~

## Criando um servidor web

Criar um servidor web com node é uma tarefa extremamente simples, só precisamos definir o servidor e mandar o node escutar ele, podemos fazer isso e inclusive adicionar algumas features bem interessantes, olhe o [projeto de servidor Http](../../Projetos/ServidorHttp/serverLocal.js)

~~~js
//---------------dependencies------------

import http from 'http'
import chalk from 'chalk';
import chalkAnimation from 'chalk-animation'
import child_process from 'child_process'

// -----------------Variables-----------

const PORT = '3000'
const HOST_NAME = '127.0.0.1'

const URL = `http://${HOST_NAME}:${PORT}`
const OPEN = (process.platform == 'win32' || process.platform == 'win64' ? 'start' : process.platform == 'darwin' ? 'open' : 'xdg-opem'  )

// -------------------Server-------------

const server = http.createServer((req, res) => {

    res.statusCode = 200;
    res.setHeader('Content-Type', 'text/html');
    res.end('<div style="text-align: center"> <h1> Page already started </h1> <text> Start working! </text> </div>')

})

server.listen(PORT, HOST_NAME, ()=> {
    chalkAnimation.rainbow('Server started').start();
});

child_process.exec(OPEN + ' ' + URL);
~~~



## Criando um servidor que lê um arquivo

Veremos posteriormente que é muito mais simples fazer isso com o express. Então vamos ver algo de fato muito útil que é como abrir um arquivo html pelo lado do servidor, só que com node nativo.

~~~js
// ------ EMULANDO UM SERVIDOR LOCAL ------
const http = require('http')
const {readFile} = require('fs')

const IP = '127.0.0.1'
const PORT = '3000'
const SITE = `http//${IP}:${PORT}`

// local do arquivo
let path = './index.html'
var content;

// lendo e usando o data da leitura
readFile(path, (error, data)=>{
    if(error) throw error

    content = data
})

// colocando na tela o data(content)
const server = http.createServer((req, res) => {
    
    res.statusCode = 200;
    // text/html para ler como um arquivo html e não como documento de texto
    res.setHeader('Content-type', 'text/html')
    res.end(content)
})

// e para executar o server de uma vez
server.listen(PORT, IP, ()=>{
    console.log('server started');
})

// lembre-se que isso é feito pela diferença de comandos no terminal
const start = (process.platform == 'darwin'? 'open' : process.platform == 'win32'? 'start' : 'xdg-opem')

require('child_process').exec(start + ' ' + SITE)
~~~

* Código sem comentários
	~~~js
	const http = require('http')
	const {readFile} = require('fs')
	
	const IP = '127.0.0.1'
	const PORT = '3000'
	const SITE = `http//${IP}:${PORT}`
	
	// local do arquivo
	let path = './index.html'
	var content;
	
	readFile(path, (error, data)=>{
	    if(error) throw error
	    content = data
	})
	
	const server = http.createServer((req, res) => {    
		res.statusCode = 200;
		res.setHeader('Content-type', 'text/html')
		res.end(content)
	})
	
	server.listen(PORT, IP, ()=>{
	    console.log('server started');
	})
	
	const start = (
		process.platform == 'darwin'? 'open' : 
		process.platform == 'win32'? 'start' : 'xdg-opem'
	)
	
	require('child_process').exec(start + ' ' + SITE)
		~~~

NOTA: Inclusive, da para rodar com o **nodemon** com o comando `exec()`
