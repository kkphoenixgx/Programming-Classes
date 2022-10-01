# Fs - criando pastas e arquivos

Mod 27 -- **23/02/22**

Pense sobre processamento antes de sair chamando módulos em seu projeto, caso você chamar toda a biblioteca do fs, vai criar problemas em processar esses dados em uma constante a níveis de processamento é melhor simplesmente chamar o que você vai precisar no seu projeto

~~~js
const fs = require('fs')
fs.writeFile()

//melhor
const {writeFile} = require('fs');
writeFile()
~~~

* fs.mkdir('nome', configObject, fn) = cria um **diretório** e executa a fn após a criação
* fs.writeFile('nome', 'content', fn) = cria um **arquivo** e executa a fn após a criação

cat é um comando de shell que mostra o conteúdo do arquivo
