# Aula14
2022-09-29  
tags: [[../Index of typescript]]

## - Mod 27 - Tipagem nos parâmetros de retorno da função

[[../img/Funções.pdf]]

Interessante notar uma diferença, quando colocamos :void em uma função, estamos **definindo o type do retorno da função**, não da função. 
E agora falando sobre os parametros, o typescript considera um erro se o type do parametro for um :any implicito. Ou seja, se você não declarar o type da variável nos parametros da função, será um erro.

~~~ts
// erro 
function sum(a) :void{
	console.log(a+1);
}

// sem erro: (Contudo não está correto fazer isso tecnicamente)
function sum(a :any) :void{
	console.log(a+1);
}

// correto 
const add  = (a:number, b:number):void => console.log(a+b)

// exatamente a mesma coisa que isso:
function add(a :number, b:number) :void{
	console.log(a+b);
}

~~~

Existe uma forma de burlar isso, que é usando na compilerOptions: 

> "noImplicityAny": false

Contudo isso perde a ideia principal do ts que é justamente ter esses types e não é recomendado isso.
Dessa forma, perceba que temos um type para o return e um type para cada um dos parâmetros.  Sendo assim, podemos usar o type como union type (tanto para os parâmetros quanto para as funções)

## - Mod 28 - parâmetros com valor padrão ou opcional

A sintaxe continua praticamente a mesma para fazer valor padrão:

~~~ts
function concatenacao (x :string = " ", y?: string):string {
	return x+y
}
~~~

Perceba no exemplo, que eu usei o "?" antes do ":", isso significa que o y é opcional, antigamente colocavamos um = null com js, mas dessa forma fica bem mais elegante. Contudo o y **retorna undefined**, portanto, precisamos tratar a não existência dessa viariável

~~~ts
function concatenacao (x :string = " ", y?: string):string {
	if(y) return x+y
	else return `${y}`
}
~~~

## - Mod 29 - Rest Parameters

Os rest parameters são os parametros do javascript que são também do ts, na realidade eles nasceram no ts e depois foram para o js. Contudo, temos os seguintes operadores:

| operador              | função                                              |
| --------------------- | --------------------------------------------------- |
| ... = spread operator | ele coloca tudo dentro de algo ou tira tudo de algo |

Também foi usado aqui o array. reduce() que se ainda tiver dúvida do que é, dá uma olhada no dicionário de javascript na parte de arrays.

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24772562#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24772564#overview
