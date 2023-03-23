# Primeiras aulas simples de typescript

## Mod 1 a 8 -- **03/01/22**

### Como instalar o ambiente de desenvolvimento

Instalando typescript:  
> npm i -g typescript

Tô usando também o tabnine como extensão então tô mudando aqui meu modo de programar um pouco.

### Anotações

* **TSC** = Typescript compiler, é o compilador do typescript para rodar o um arquivo .ts para js, então usando:

>tsc nomeDoAquivo.Extension

> **tsc --watch** → procura auterações no arquivo todo

Dessa forma, podemos transformar um **arquivo ts em js e roda-lo com node**.  Além dessa forma, podemos usar o tsc nomeDoAquivo.Extension --watch para fazer as atualizações automaticmante.

* O typescript **pode ser recompilado para versões mais simples sem o ES6** automaticamente mesmo com o código fonte usando o ES6, então ele não vai compilar com o tsc exatamente igual ao código, quando compilado não vai ter nenhum recurso do ES6, como o const e o let.

* por adicionar tipagem ao js, cria **fácil implementação de design patterns**.

* Ele **pode perceber quanto tem variáveis ou constantes com o mesmo nome** e se um for uma constante, ele vai assimilar como um possível erro.

## Mod 8 após instalação -- **10/01/22**

**Para ver a versão do typescript podemos usar tsc --version**, e eles falaram a mesma coisa do que no curso de design patterns, rodaram o tsc para transformar um arquivo ts em js. Então prefiri só olhar
