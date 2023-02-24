# Aula30
2023-02-05
tags: [Index of typescript](../Index%20of%20typescript.md)

## - Mod 57 - : O que são generics

![](../img/Pasted%20image%2020230205194511.png)

Generics nada mais são que aqueles Array< {name: string, id: number} >... Só que de uma maneira generica, comumente usado como **T** Array< T >

## - Mod 58 - : Tipos Genéricos

~~~ts
function pegaOprimeiroItem <T> (array : Array<T>) :T {
	return array[0]
}
~~~

Que doidera tá rolando ali em cima? kakakakka maneiro neh? Bom, o typescript tá falando assim: olha, eu tenho um type T que eu não sei qual é, mas ele vai funcionar como se fosse um unknown, você vai pegar o type do que vier e definir que é o type de T

Ou seja, mesmo que seja uma string que esteja retornando e seja uma string vindo... Não necessariamente é uma string, portanto, não podemos retornar uma string... Pode testar... Dá erro... 

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25831362#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25831368#overview