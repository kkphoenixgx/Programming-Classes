# Criando um servidor web

Mod 18 -- **11/02/22**

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
