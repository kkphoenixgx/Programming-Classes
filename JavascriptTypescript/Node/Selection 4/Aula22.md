# Http - fs, lendo arquivos html e renderizando eles na tela

Mod 29 -- **23/03/22**

Estamos nessa seção simplesmente fazendo com APIs nativas do node.js, mas veremos posteriormente que é muito mais simples fazer isso com o express. Então vamos ver algo de fato muito útil que é como abrir um arquivo html pelo lado do servidor

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

NOTA: Inclusive, da para rodar com o nodemon com o comando exec()
