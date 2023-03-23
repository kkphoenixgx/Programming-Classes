# Aula19
2022-10-20
tags: [[../Index of typescript]]
## - Mod  36 - O que é POO :

Ah meu brtoher, vc já sabe os conceitos....

### Anotações:

Polimorfismo = métodos com os mesmos nomes mas que, dependendo dos parâmetros da obtidos, só irá ser executado um deles. 

## - Mod  37 - Criando a primeira classe  em ts:

~~~ts
class People{

	name :string
	id :number
	age :number

	constructor(name: string, id: number, age: number ){
		this.name = name
		this.id = id
		this.age = age
	}

	talk(message: string) : void {
		console.log(message)
	}

}

const kkphoenix = new People("Kauã Alves", 1, 17)
~~~

Agora veremos uma coisa muito deveras interessante. Ao concatenar com uma string um objeto, se tivermos um método toString na classe, automaticamente retornamos a string retornada no toString():

~~~ts
class Pessoa{

    name: string
    idade :number

    constructor(name: string, idade: number){
        this.name = name
        this.idade = idade
    }

    toString() :string{
        return `Seu nome é ${this.name} e você tem ${this.idade}`
    }

}

const kkphoenix = new Pessoa('Kauã Alves', 17)

console.log( "Hello, bem vindo. Confira seus dados: " + kkphoenix + "?" )

/* 
  Isso vai retornar: 
  Hello, bem vindo. Confira seus dados: Seu nome é Kauã Alves e você tem 17?
*/
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500212#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500300#questions
## Mapa Mental