# Fs - File system

Mod 26 -- **12/02/22**

* File System é uma API nativa do node que podemos gerenciar arquivos e pastas

Com isso podemos fazer diversas coisas, dês de rotinas na empresa, até funções no backend, vamos por exemplo, fazer nesse módulo uma rotina que lê os arquivos do diretório atual usando *fs.readdir()*.

Temos algumas funções interessantes, que também vão estar disponíveis no meu [dicionário de node](../dicionario.md)

~~~js
const fs = require(fs)

/* 

   Encapsulei em uma variável para podermos brincar com 
 isso e entender podemos colocar aqui nesse arquivo um
 ../ no path e pegar todos os arquivos da pasta anterior, por exemplo

*/
let path = __dirname;

fs.readdir(path, (err, files) => {

    files.foreach(file=> {
        if(err) throw err;

        console.log(path + '/' + file);
    })

});
~~~

Outra função interessante é a função *readFile(path, callback)* que lê para você um arquivo e você pode executar uma ação em js.

* Ele retorna dados em binário, para transformar em texto é só usar um toString()

~~~js
fs = require(fs)
let path = 'textingText.js'

fs.readFile(path, (err, data) => {
    if(err) throw err;

    console.log(data.toString())
})
~~~

## Resumo da aula

* File System é uma API nativa do node que podemos gerenciar arquivos e pastas
  * fs.readFile(path, callback)
  * fs.readdir(path, callback)
