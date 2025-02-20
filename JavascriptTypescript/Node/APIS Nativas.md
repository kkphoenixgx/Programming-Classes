# APIs nativas do node
tags: [[-Index node]]

API é um trecho de código independente que não precisa do seu projeto, assim como seu projeto não pode depender dela, para funcionar.
O node possui diversas APIs nativas e elas são já pré setadas no node_modules

## File System - FS

* File System é uma API nativa do node que podemos gerenciar arquivos e pastas

Com isso podemos fazer diversas coisas, dês de rotinas na empresa, até funções no backend, vamos por exemplo, fazer nesse módulo uma rotina que lê os arquivos do diretório atual usando *fs.readdir()*.

Temos algumas funções interessantes, que também vão estar disponíveis no meu [dicionário de node](-Dicionario.md)

Pense sobre processamento antes de sair chamando módulos em seu projeto, caso você chamar toda a biblioteca do fs, vai criar problemas em processar esses dados em uma constante a níveis de processamento é melhor simplesmente chamar o que você vai precisar no seu projeto

### `readdir`

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

### `readFile`

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

### `writeFile`

~~~js
const fs = require('fs')
fs.writeFile()

//melhor
const {writeFile} = require('fs');
writeFile()
~~~

* fs.writeFile('nome', 'content', fn) = cria um **arquivo** e executa a fn após a criação

### `fs.mkdir`

fs.mkdir('nome', configObject, fn) = cria um **diretório** e executa a fn após a criação

;-; testa ai... Muito preguiçoso mané

cat é um comando de shell que mostra o conteúdo do arquivo

## Util

O módulo nativo utils é um módulo nativo bem antigo do node.js que utilizamos para muitas coisas e que hoje já é integrado diretamente com o node.js

### Promisify

O `promisify` é um módulo do `utils` que ajuda a lidar com Promises de forma mais simples e mais clean, quando usamos esse módulo recebendo uma fn, transformamos ela em promise, não precisando criar absolutamente nada de promise, porém ainda temos os recursos de return dela, então temos o then e o catch (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

~~~js
const require {writeFile} = require('fs')
const require {promisify} = require('util')

const write = (fileName, content) => { promisify(writeFile(fileName, content)) }

write('Teste.txt', 'É um teste de promisify')
  .then( console.log('Tudo ok senhor') )
  .catch(error) console.error(error)
~~~


## Console

A API console é muito mais que somente o `console.log()`, tem algumas funções muito interessantes, como o **console.error(x)**, sendo x o erro, você cria um erro com **new Error('String que você quiser')**, que aí vai criar a mensagem de erro bonitinha no console e **parar a execução do programa**

| console | para que serve                           |
| ------- | ---------------------------------------- |
| error   | cria mensagem de erro                    |
| table   | cria uma tabela para melhor visualização |

## Path
Manipulando caminho de arquivos e pastas

Com a API nativa (módulo) do node: **path**, podemos configurar, extrair, manipular, editar... Caminhos com seus métodos:

~~~js
const path = require(path);

let filePath = './Client/client.js'
console.log( path.basename(filePath) ); // → client.js

filepath = '.\Client//client.js'
console.log( path.normalize( filepath ) ) // → ./Client/client.js


console.log()
~~~

Podemos citar também outros métodos, esses são mais comuns e bem relevantes:
<p style="display:flex; justify-content: end" > <i>Exemplos e descrições do ~chatgpt </i></p>

###  `path.join([...paths])`

Concatena vários segmentos de caminho em um único caminho normalizado. Por exemplo:

~~~javascript
const path = require('path'); 
const fullPath = path.join('/path/to', 'file.txt');
console.log(fullPath); // /path/to/file.txt
~~~

### `path.resolve([...paths])`

Resolve um caminho absoluto a partir de segmentos de caminho dados. Por exemplo:

~~~javascript
const path = require('path');
const absolutePath = path.resolve('relative/path', 'file.txt');
console.log(absolutePath); // /current/working/directory/relative/path/file.txt
~~~

Mesmo que você só coloque o nome do arquivo, ele vai retornar tudo

### `path.basename(path[, ext])`

Retorna o nome base de um caminho. O segundo argumento opcional `ext` pode ser usado para remover uma extensão específica do nome do arquivo. Por exemplo:

 ~~~javascript
const path = require('path');
const fileName = path.basename('/path/to/file.txt'); console.log(fileName); // file.txt 

const fileNameWithoutExt = path.basename('/path/to/file.txt', '.txt');
console.log(fileNameWithoutExt); // file
~~~

### `path.dirname(path)`

Retorna o nome do diretório de um caminho. Por exemplo:

~~~javascript
const path = require('path');
const directoryName = path.dirname('/path/to/file.txt');

console.log(directoryName); // /path/to
~~~

### `path.extname(path)`

Retorna a extensão de um caminho. Por exemplo:

 ~~~javascript
const path = require('path');
const extension = path.extname('/path/to/file.txt');
console.log(extension); // .txt
~~~


## Buffer - manipulando dados binários

Com essa API nativa do node, podemos manipular binários, podemos colocar binários nesse buffer e manipular a informação de forma que fica fácil utilizar binário, podemos por exemplo, converter um texto para binário e traduzir do binário para outras línguas.
E para o buffer, temos alguns métodos muito interessantes, podemos citar aqui o `Buffer.isBuffer(x)` para saber se x é um buffer ou não e têm vários outros métodos simples que ajudam nessa manipulação, o importante aqui é saber que existe esse módulo nativo para necessidades futuras.
<p style="display:flex; justify-content: end" > <i>Exemplos e descrições do ~chatgpt </i></p>

### `Buffer.alloc(size[, fill[, encoding]])`

Cria um novo buffer de tamanho fixo, preenchido com zeros ou com o valor especificado em "fill".

Exemplo:

~~~javascript
const buf = Buffer.alloc(5); // Cria um buffer de 5 bytes preenchido com zeros 

console.log(buf); // <Buffer 00 00 00 00 00>
~~~

### `Buffer.from(array)`

Cria um novo buffer a partir de um array de valores numéricos ou uma string.

É importante dizer que ao criar um novo buffer e colocar ele na tela, você vai receber uma tag com o binário em hexadecimal, não o binário completo e dá até para usar um buff.toString() e converter de volta, dá até para passar para caractere asiático passando o encoding deea (utf16le) como parâmetro

Exemplo:

~~~javascript
const buf = Buffer.from([0x62, 0x75, 0x66, 0x66, 0x65, 0x72]); // Cria um buffer a partir de um array de valores

console.log(buf); // <Buffer 62 75 66 66 65 72>
~~~

### `Buffer.from(string[, encoding])`

Cria um novo buffer a partir de uma string.

Exemplo:

~~~javascript
const buf = Buffer.from('Olá, mundo!', 'utf8'); // Cria um buffer a partir de uma string usando a codificação UTF-8 

console.log(buf); // <Buffer 4f 6c c3 a1 2c 20 6d 75 6e 64 6f 21>
~~~

### `Buffer.byteLength(string[, encoding])`

Retorna o número de bytes que a string ocuparia em uma codificação específica.

Exemplo:

~~~javascript
const len = Buffer.byteLength('Olá, mundo!', 'utf8'); // Retorna o número de bytes da string usando a codificação UTF-8 

console.log(len); // 13
~~~

### `buf.toString([encoding[, start[, end]]])`

Converte o buffer em uma string.

Exemplo:

~~~javascript
const buf = Buffer.from([0x48, 0x65, 0x6c, 0x6c, 0x6f]); // Cria um buffer a partir de um array de valores 
const str = buf.toString('utf8'); // Converte o buffer em uma string usando a codificação UTF-8 

console.log(str); // 'Hello'`
~~~

## Child_Process

Com o `spawn()`, podemos executar um comando e passar parâmetros para ele, diferente do exec que só executa

```node
const {spawn} = require("child_process")
const ls = spawn('ls', ['-lh', "/user"])
```

Podemos ver com o exemplo, como fazemos a inserção desses parâmetros, com um array de strings.
Falando um pouco dessas strings, toda vez que temos uma string, um comando, que se comunica com o sistema operacional, temos três tipos e um secundário: **stdout**, **stdin**, **stdio** e o secundário **stderror**

**stdio** = O que você quer que seja feito. 
**stdout** = O que vai sair do comando. `ls.stdout.on("data", fn)`, esse "data" é o content do stdout
**stdin** = Para mandar informações
**stderr** = Para tratamento de erros. `ls.on("error", fn)`

Perceba que eles são subscribers e por isso, também possuem eventos que podem ser pesados com um listener, como close, exit... (close = quando encerra tudo, exit= quando acaba qualquer processo)

close = `ls.on('close', (code)=> console.error("process closed with error: " + code))`

