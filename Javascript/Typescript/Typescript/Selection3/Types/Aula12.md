# Aula 12
2022-09-28 // mod: 21
tags: [[../../Index of typescript]]

No typescript temos dois types primitivos que são formados pela não existência e o indefinido (null, undefined). Estes são geralmente retornos, mas no próprio js tem como utilizar eles como valor.

## Mod 21 - Undefined e Null

### Null

É quando não não existe valor. E isso causa um problema de inferência, pois o ts é uma linguagem fortemente typada e a variável não poderá receber outro valor se não null, contudoo não se esqueça do union type, ela se torna muito útil com o uso desse recurso. Inclusive, esse é muito usado com um outro type do ts chamado de **HTMLElement** que é um type de elemento html dessa forma:

~~~ts
let element :HTMLElement | null = document.querySelector("h1");
~~~

* Lembra que você não pode mudar o type de uma variável, mesmo que você não tenha dito anteriormente o type, isso funciona por causa da **inferência de types**.

### Undefined

Da mesma forma acontecerá com o undefined.

~~~ts
let variable :HTMLElement | undefined;

if(new Date.getDate() == 15) variable = "Hoje é dia 15"
console.log(variable)
~~~

## Mod 22 - Any

O type any consegue suportar qualquer coisa e a **ideia é sustentar qualquer resposta, não voltar a ser um javascript**. Ele pode ser pensado como um *apelido para todos os types*

~~~ts
let variable :any;
~~~

## Mod 23 - Unknown

O type unknow é bem parecido com o any no sentido que ele vai aceitar qualquer coisa, mas mais uma vez, o sentido é quando você não souber o type, não quando vale para qualquer coisa.... A principal diferença do any para o unknow é que o unknow não pode ser colocado alocado como o espaço para outra variável.

~~~ts
let unknowVariable : unknown = 15;

//error:
let number :number = unknowVariable;
~~~

Depois que o unkwnow é estabelecido como um type, ele não pode mudar o type.

## Mode 24 - Void

O void é um type para especificar o não retorno de funções e metodos, ou seja, um type para funções que declaram que a função não vai retornar nada, uma subrotina.

~~~ts
function draw(): void { console.log('1 frame') }

// erro:
function draw() :void{
	return 1 frame
}
~~~

## Mode 25 - Never

O type never é um type que **nunca vai ter um valor**, ou seja, quando uma função, por exemplo, é uma função que **estora um erro** ou um loop de um jogo, ou de um sensor, que estará sempre executando.

~~~ts
function error (error :string):never {
	console.error(error)
} 
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24632162#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24972008#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24972010#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24632174#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24660318#overview
