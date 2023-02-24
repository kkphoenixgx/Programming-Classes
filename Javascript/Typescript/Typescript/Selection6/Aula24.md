# Aula23
2023-01-16
tags: 

## - Mod 44 - : Encapsulamento: readonly x private

readonly é como se fosse uma constante, você não pode mudar seu valor, só pode ler o valor, já o private, pode mudar mas não vai poder ler... Dessa form , dentro de uma classe cliente, o valor readonly pode ser lido por uma instância de da classe, já o private não poderá ser lido...
Lembrando que o private do Ecma é mais seguro que o private do ts naturalmente, pois gera um erro...

~~~ts
class someClass{
	private someAtributeNumber :number //Ts
	#someAtribute :string //Ecma 
	
	readonly someAtributeString :string 
}
~~~

## - Mod 45 - : Simplificando método constructor

Ao colocar o encapsulamento no construtor, ele automaticamente vira um atributo da classe, isso facilita muito a forma de escrever um código

~~~ts
// Forma grande:
class someClass{
	private someAtributeNumber :number
	someAtribute :string 
	
	constructor( someAtributeNumber :number, someAtribute :string ){
		this.someAtributeNumber = someAtributeNumber
		this.someAtribute = someAtribute
	}
}
~~~

E colocando o encapsulamento no construtor, ele automaticamente já faz o *this.x = x*, logo não precisamos colocar no construtor

~~~ts
// Forma enxuta:
class someClass{
	
	constructor( private someAtributeNumber :number, public someAtribute :string ){
	}
	
}
~~~

Dessa forma, só definimos em cima do constructor quando não vamos usar o atributo no constructor.

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500386?start=450#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500392#overview