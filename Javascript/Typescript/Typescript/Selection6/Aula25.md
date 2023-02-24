# Aula24
2023-01-23
tags: [[../Index of typescript]]

## - Mod 46 - :Métodos getters e setters

~~~ts
class SomeClass{
	constructor( private _nome :string, private _senha :string){
	}

	// ---- getters and setters ----

	get nome() return this._nome.toLowerCase()
	get senha() return this._senha.toLowerCase()
	
	set nome(nome :string) nome.toLowerCase() = this._nome
	get senha(senha :string) senha.toLowerCase() = this._senha
}
~~~~ 

Na hora de instanciar e chamar ele, não precisamos usar getNome(), por exemplo, basta chamar o atributo da instância que já chama o set:

~~~ts
const instance :SomeClass = new SomeClass('kkphoenix', '12345678')

//Executando o getter:
console.log(instance.name)

//Executando o setter:
console.log(instance.name = 'kkphoenixgx')
~~~

## - Mod 47 - : Propriedades e métodos estáticos

Essa aula é muito rica... Não vou nem anotar para ver de novo se eu não souber algo...

~~~ts
class SomeClass{

	static localHost :string = '127.0.0.1'

	constructor( private _nome :string, private _senha :string){
	}

	static sendToDbFactory(data){
			return new classDB(data)
	}
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500396?start=15#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500402#overview