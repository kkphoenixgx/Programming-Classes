# Aula31
2023-02-21
tags: [Index of typescript](../Index%20of%20typescript.md)

## - Mod 59 - : Interfaces genéricas

~~~ts
interface someInterface<T>{
	value :T;
	someMethod(arg :T) :T
}
~~~

## - Mod 60 - : Classes Genéricas

~~~ts
class someClass <T> {
	create(data :T){
		return { 'x': data.x, 'y': data.y }	
	}
}

interface ISomeInterface{
	//block
}

class referenceClass extends someCLass()<ISomeInterface> {}
let someObject = new referenceClass()
~~~

## - Mod  61 - : Restrições genéricas

~~~ts
interface ISomeRestriction{
	length :number
}

function someFunction <T extends ISomeRestriction> (value :T):T {
	console.log(value)
	return value
}

// param pode ser um objeto com o atributo length ou um array
let param = { 'length' : 1 };

someFunction(param)
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25831370#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25831374#overview

