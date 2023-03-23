# Aula28
2023-02-04
tags: [Index of typescript](../Index%20of%20typescript.md)

## - Mod 54 - : O que é namespace

![](../img/Pasted%20image%2020230204101216.png)

São módulos.

## - Mod 55  - : Criando namespaces

~~~ts
namespace Pessoas {
	class kkpoenix{
	}
	class kkphoenixgx{
	}
}
~~~

Dessa forma, em qualquer arquivo, em qualquer lugar eu posso instânciar kkphoenix somente fazendo um: **const usuario = new Pessoas.kkphoenix()** mas no lugar de import, usa-se uma tag reference:

~~~ts
// <reference path="./path">

const usuario = new Pessoas.kkphoenix()
~~~
Sendo ./path o path do seu arquivo com o namespace

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25831352#overview