# Trabalhando com módulo utils

Mod 28 -- **16/03/22**

O módulo nativo utils é um módulo nativo bem antigo do node.js que utilizamos para muitas coisas e que hoje já é integrado diretamente com o node.js

## Promisify

O promisify é um módulo do utils que ajuda a lidar com Promises de forma mais simples e mais clean, quando usamos esse módulo recebendo uma fn, transformamos ela em promise, não precisando criar absolutamente nada de promise, porém ainda temos os recursos de return dela, então temos o then e o catch (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

~~~js
const require {writeFile} = require('fs')
const require {promisify} = require('util')

const write = (fileName, content) => { promisify(writeFile(fileName, content)) }
write('Teste.txt', 'É um teste de promisify')
  .then( console.log('Tudo ok senhor') )
  .catch(error) console.error(error)
~~~
