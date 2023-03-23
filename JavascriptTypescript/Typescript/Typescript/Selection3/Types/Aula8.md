# Mods 15 16 e 17

## Union types

Mod 15 -- **28/02/22**

O union type é uma união de dois tipos, podemos gerar essa união através do uso do | na formulação da variável:

~~~ts
let login :number|string;
~~~

Nesse caso poderíamos fazer login com o nosso email ou com o numero de telefone e são dois dados de types diferentes, então essa variável pode aceitar qualquer um dos dois

## Type boolean

mod 16 -- **28/02/22**

O type boolean é bem simples, ele aceita true or false e podemos gerar um boolean assim:

~~~ts
let admin :boolean; 
~~~

Com o boolean, temos um problema interessante, quando colocamos 1 dentro de uma variável, no js vanilla, subentende-se que ela é true e quando tem um 0, false, porém no ts isso gera um erro, ja que 1 não é true e sim 1, type number, então para resolvermos isso, é até que bem simples, vamos transformar esse value para o valor correto, podemos usar a função pré determinada do Boolean para resolvermos isso.

~~~ts
let value;

let admin :boolean = Boolean(value);
~~~

Essa simples transição vai resolver todos os seus problemas, se for !== 0 vai dar true, se for === 0, null ou undefined, vai dar false

## Array

mod 17 -- **28/02/22**

O array no js é um objeto, mas no ts, ele é sim um type. Quando definimos um type para o array, ele só recebe o type proposto e n quantidade de coisas nesse array caso tenha definido o n, **se eu colocar um number em um array :string vai ocasionar em um erro**

> let array :string[ ] = [ ' x¹ ',' x² ' ]

~~~ts
let array :string[] = ["a", "b", "c"]

// Com union type

let array: (string | number) = ["a", "b", "c", 1]

~~~

~~~ts
//-------ERROS-------

let array :string[] | number[] = ["a", "b", "c", 1] 
// Perceba que nessa forma de declarar o array, ele tá esperando ou um array de numbers ou um array de strings. Portanto não pode ser um array com numbers ou strings

~~~

Para isso usamos uma coisa chamada **precedência de operadores**, usamos () para especificar o conjunto

~~~ts
let array :(number | string)[] = ["a", "b", "c", 1]
~~~

Tem como também declarar um array com o type *Array*, que é o object array e para definir os types desse objeto array vamos usar <>, mas quando usar isso vai ficar para uma outra aula, fica só um exemplo simples:

~~~ts
let array :Array<string> = []
let array :Array<string | number> = []
~~~
