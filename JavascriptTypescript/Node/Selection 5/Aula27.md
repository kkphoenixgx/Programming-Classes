# Aula27
2023-06-03
tags: [Index node](../Index%20node.md)

## - Mod 36 - : Criando uma plicação com npm init

> **npm init (-y)**

E foi só isso mesmo 0u0.

## - Mod 37 - : Criando módulos

Bom, sobre módulos, a aula acrescenta que quando adicionamos um módulo que não é nativo do node, usamos sempre um path direcional, que possuí um ./, um ../, porque estamos direcionando. Agora quando não usamos, significa que estamos procurando uma API na estrutura do node_modules. Para exportar módulos no node.js, usamos `module.export.thing`, sendo, claro, "thing" o que você quer exportar. Em contraponto, o que você quer importar, usa-se require, levando em conta que estamos criando nesse formato de módulo.

Podemos também digitar código e executar dinamicamente usando só **node** no command prompt, essa forma é conhecida como REPL.

![](../img/Pasted%20image%2020230603185133.png)

Bom, analisaremos esse exemplo com o seguinte exemplo:

![](../../../Pasted%20image%2020230603185342.png)

![](../../../Pasted%20image%2020230603185432.png)

Perceba que o node não reconhece a segunda exportação quando requirimos esse módulo e que ele não exporta a execução das funções e sim um objeto com as funções encapsuladas, ou seja, exporta `function`, não `function()`

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/nodejs-curso-completo/learn/lecture/16747226#questions
