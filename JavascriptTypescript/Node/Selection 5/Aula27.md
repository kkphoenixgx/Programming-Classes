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

Perceba que o node não reconhece a segunda exportação quando requirimos esse módulo e que ele não exporta a execução das funções e sim um objeto com as funções encapsuladas, ou seja, exporta `function`, não `function()`. Além disso, perceba que o node trabalha com cache também, se eu já chamei esse módulo, não precisamos executar tudo de novo. Então só chama o módulo dele.

## - Mod 38 - : importando e exportando módulos

![](../../../Pasted%20image%2020230603190541.png)

![](../../../Pasted%20image%2020230603190612.png)

![](../../../Pasted%20image%2020230603190639.png)

Nisso, é importante dizer o seguinte, se você importar somente pelo `require("module")`, tudo vai ser importado, independente se você exportou ou não, pois estamos importando o arquivo inteiro, não encapsulando ele, é como se realmente fosse uma extensão, uma herança da programação funcional, e isso é muito ruim porque você quer encapsular.

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/nodejs-curso-completo/learn/lecture/16747226#questions
