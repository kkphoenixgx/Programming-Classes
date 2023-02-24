# Aula16
2022-09-02
tags: [[../Index of typescript]]

## - Mod  -  31: Parâmetros opcionais

Eles só falaram como usar um parâmetro opcional numa Interface.

~~~ts
export interface IClient {

    name ?:string;

    email :string;

    password :string;

}
~~~

Colocando o ? na frente do type, a variável fica opcional

## - Mod - 32: Métodos Readonly

A propriedade readonly imperde que um dos parâmetros da Interface seja sobreescrevido.

~~~ts
export interface IClient {

    name :string;

    readonly email :string;

    password :string;

}
~~~

Dessa forma, o email não pode ser mudado em outrra parte do código, quando a interface for utilizada.

~~~ts
var cliente :IClient =  {
    "name" : "Louiss",
    "email" : "exemple@exemple.com",
    "password": "exemple123"
}

//error:
cliente.email = "anotherEmail@exemple.com"
~~~

## - Mod - 33:  Funções em interface

Para criar uma interface que contém uma função, temos que definir somente a tipagem dos parâmetros e do retorno

~~~ts
export interface IClient {
	(num1: number, num2: number) :number;
	(value1 :number, value2 :number) :void;
}
~~~

Importante dizer que na hora de implemetar, o nome das variáveis, nos parâmetros, não precisa ser igual aos da interface. Além disso, com uma interface, não precisamos declarar os types na hora da implementação, pois eles já estão vinculados à interface.

~~~ts
interface ICalculos {
	somar(a: number, b: number ) : number;
	subtrair (a: number, b: number): number;
	multiplicar(a: number, b: number): number;
	dividir (a: number, b: number): number;
} 

let calculadora :ICalculos;

function adicao(a: number, b: number) {
	return a + b;
}
const subtrair = (n1: number, n2: number) => n1 - n2;

const calculadora = {
	dividir: (numero1: number, numero2: number) => {
		return numero1 / numero2;
	},
	multiplicar: function (numero1: number, numero2: number) {
		return numero1 * numero2;
	},

	somar: adicao,
	subtrair: subtrair
} 
~~~


-----------------------------------------------

## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24772592#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24772596#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24772608#overview
