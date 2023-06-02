# Aula 25
2023-06-02
tags: [Index node](../Index%20node.md)

## - Mod 33 - : Path - Manipulando caminho de arquivos e pastas

Com a API nativa (módulo) do node **path**, podemos configurar, extrair, manipular, editar... caminhos com seus métodos:

~~~js
const path = require(path);

const FILE_PATH = './Client/client.js'
console.log( path.basename(FILE_PATH) ); // → client.js
~~~

1. `path.join([...paths])`: Concatena vários segmentos de caminho em um único caminho normalizado. Por exemplo:

javascript
`const path = require('path'); const fullPath = path.join('/path/to', 'file.txt'); console.log(fullPath); // /path/to/file.txt`

2. `path.resolve([...paths])`: Resolve um caminho absoluto a partir de segmentos de caminho dados. Por exemplo:

javascript

`const path = require('path'); const absolutePath = path.resolve('relative/path', 'file.txt'); console.log(absolutePath); // /current/working/directory/relative/path/file.txt`

3. `path.basename(path[, ext])`: Retorna o nome base de um caminho. O segundo argumento opcional `ext` pode ser usado para remover uma extensão específica do nome do arquivo. Por exemplo:

javascript

`const path = require('path'); const fileName = path.basename('/path/to/file.txt'); console.log(fileName); // file.txt  const fileNameWithoutExt = path.basename('/path/to/file.txt', '.txt'); console.log(fileNameWithoutExt); // file`

4. `path.dirname(path)`: Retorna o nome do diretório de um caminho. Por exemplo:

javascript

`const path = require('path'); const directoryName = path.dirname('/path/to/file.txt'); console.log(directoryName); // /path/to`

5. `path.extname(path)`: Retorna a extensão de um caminho. Por exemplo:

javascript

`const path = require('path'); const extension = path.extname('/path/to/file.txt'); console.log(extension); // .txt`

## - Mod  - :



-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/nodejs-curso-completo/learn/lecture/16743060?start=0#questions