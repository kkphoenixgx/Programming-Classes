# Aula22
2022-11-28
tags: [[../Index of typescript]]

## - Mod 40 - : Encapsulamento: public

* public = todos podem ver e usar
* protected = Protegido, apenas as classes filhas
* private = somente a própria classe
* readOnly = só pode ser lido, não auterado.

~~~ts
class Home{

	// assim usa encapsulamento
	public sala: string

	// se você nãi informar o encapsulamento, ele é public
	quarto :string

	constructor(sala :sting, quarto :string = ''){
		this.sala = sala
		this.quarto = quarto;
	}

	// assim usa encapsulamento em métodos
	public toString() :string{
		return `Descrição da casa: ${this.sala, this.quarto}`
	}
}

const myHome = new Home('uma linda sala com televisão e uma bela vista')
console.log( myHome.toString() )
~~~

## - Mod 41 - : Encapsulamento: protected

* Quando o construtor não é definido na classe filho, ela automaticamente pega o construtor da classe pai.

~~~ts
class Home{

	protected sala: string
	protected quarto :string

	public corDaCasa :string

	constructor(sala :sting, corDaCasa :string, quarto :string = ''){
		this.sala = sala
		this.quarto = quarto;
	}

	protected descreverInteriorDaCasa() :string{
		return `Descrição da casa: ${this.sala, this.quarto}`
	}

	public descreverInteriorDaCasa() :string{
		return `Descrição da casa: ${this.corDaCasa}`
	}
}

class Apartamento extends Home{

	private emCasa :bool

	constructor(emCasa :bool){
		super();

		this.emCasa = emCasa
	}

	public AtenderInterfone(mensagem :string) :string{
		if(this.emCasa === true){
			console.log('Alo?')
			console.log(mensagem)
		}else console.log('não tem gente casa')
	}
}

function tocarInterfone(apartamento :Apartamento, mensagem){

	apartamento.AtenderInterfone(mensagem)
}

~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500362?start=0#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500368#overview

## Mapa Mental