# Js- preparação para o react
2022-10-13
tags: [[../IndexJs]]

~~~js
// caso seja null ou undefined, aparecerá a segunda mensagem nos dois casos
const variable = 0

// Nesse caso, zero dará o segundo valor
console.log( 'the variable number is:' + (variable || "Insert a valid number") )

// nesse caso aparecerá o 0
console.log( 'the variable number is:' + (variable ?? "Insert a valid number") )
~~~

Você também pode perguntar coisas com parenteses da mesma forma:

~~~js
const object = {
	name: "Kauã"
}

// retorna true
console.log( (name in object) )

// retorna false
console.log( (nickname in object) )
~~~

E têm alguns métodos bem interessantes:

~~~js
// vai retornar um array com todos os valores do object
Object.keys(object)

// retorna os valores de object em um array
Object.values(object)

/*
uma melhoria do código acima. Isso serve para quando tiver um valor com um valor dentro, ele mostrar o valor em si, como um objeto que irá ser um objeto em si
*/
Object.values( Object.stringify(object) )
~~~

Tem a desestruturação, que é bem importante:

~~~js
const object = {
	name: "Kauã",
	age: "17"
}

// name será Kauã
const { name } = object

// terá uma variável, name2, para o name e uma para a age
const { name2, age } = object

console.log( Object.values( Object.stringify({ name2, idade }) ) )
~~~

~~~js
// podemos renomear também

const { idade: age } = object

console.log(age)

// podemos definir um valor padrão:

const { idade  = 0} = object
console.log( 'the variable number is:' + (idade || "Insert a valid number") )
~~~

Podemos até mesmo usar desestruturação nos parâmetros de uma function

~~~js
const object = {
	name: "Kauã",
	age: "17"
}

function inputName( {age} ){
	console.log(age)
}

inputName(object)
~~~

Com rest operator tem como pegar todos os outros valores :

~~~js
const object = {
	name: "Kauã",
	age: 17
}

let {name, ... allOthers} = object

// allOthers vai ter todos os outros valores que não são name
console.log( allOthers )
~~~

Assim como dá para fazer desestruturação com objects, dá para fazer isso com arrays, uma desestruturação pela ordem do array

~~~js
const numbers = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10']

let [ first, second, ...rest ] = number 

console.log(first, second, rest)
~~~

Dá até para você pular um operador só deixando a vírgua dele:

~~~js
const numbers = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10']

let [ first, , third, ...rest ] = number 

console.log(first, third, rest)
~~~

Ainda falando de objetos, dá para fazer uma sintaxe simples de objeto

~~~js
const object = {
	name: "Kauã",
	age: "17"
}
~~~

-----------------------------------------------
## Bibliografia

https://www.youtube.com/watch?v=37SwqREHRGI