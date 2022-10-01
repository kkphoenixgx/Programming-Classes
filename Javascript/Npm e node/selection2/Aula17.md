# Variáveis internas e o objeto process (Adquirindo informações do arquivo)

Mod 24 -- **01/02/22**

**__filename** = retorna o nome do arquivo
**__dirname** retorna o nome do diretório

## Process

* process.argv =  é um array de parâmetros que foram passados no terminal
* process.platform = retorna o nome do sistema operacional
* process.exit = sai da rotina
* process.env = retorna todas as variáveis de ambiente e com um . e o nome da variável, podemos pegar os parâmetros, pois é um json com todas as informações
* process.cwd() = retorna o path do arquivo que está invocando o processo, então se você fizer um require, independente de quão longe o arquivo esteja, ele vai retornar a path do arquivo principal que está invocando sub arquivo
