# Servers
2023-05-22
tags: [Index node](Index%20node.md)

~~~js
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

Usando os métodos  *server = http.createServer(req, res)*; *server.listen(port, host, fn)*;  

sendo fn igual a uma function que você vai definir o que vai acontecer após o termino do processo do servidor. Outro ponto muito importante são os parâmetros decididos no create server, estes são o **request** e o **response**

* **request** é quando pedimos a informação para o servidor
* já o **response** é quando o servidor responde.

E usando esses res e req tempos atributos interessantes como por exemplo o statusCode que é o status do servidor sendo "200" tudo certo e métodos interessantes, por exemplo o end() que responde a request de uma forma dita.

E o *setHeader()* que informa a forma que você vai responder o pedido e acho que tem outras funções mas no momento só conheço o 'Content-Type', 'y', sendo y o tipo de arquivo então até como usaram no curso:

~~~js
res.setHeader('content-type', 'text/plain');
~~~

* Outras dicas importantes:

ctrl + c para o servidor.
