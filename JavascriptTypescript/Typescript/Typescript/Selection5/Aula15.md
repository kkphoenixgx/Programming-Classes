# Aula15
2022-09-29
tags: [[../Index of typescript]], [[../img/Interfaces.pdf]]

As interfaces são nativas da maioria das linguagens de programação. O grande probelma é que esse conceito não existe no javascript puro, contudo, existe no typescript.
As interfaces, de uma maneira mais parruda, é uma estrutura que permite moldar a forma de um objeto. Uma interface é como um contrato, como regras que precisam ser definidas para que o código funcione. Em poucas palavras, nos obriga a seguir um padrão.

## - Mod 30 - Como criar interfaces :

Dessa forma,  uma interface pode ser melhor explicada da seguinte maneira:

~~~ts
let livro : {
	autor: string,
	nome: string,
	codigoDeBarra: number,
	paginas: number,
} 
~~~

Percebe que ao instanciar valores nos livros, eles devem seguir esse padrão. E é importante dizer, que se colocarmos um "?" antes do ":", o valor ficará opcional.
Contudo isso não é uma interface, é uima forma simples de defir uma regra de negócio para os jsons. As interfaces são criadas pela palavra reservada **interface** e podem seguir duas convenções: PascalCase; **I(ClassName)**, que é simplesmente colocar um "I" na frente do nome da classe que terá uma interface. Destarte, para instânciar uma interface, você define que o type do object que você quer é o nome da interface

~~~ts
interface ILivros {
	autor: string;
	nome: string;
	codigoDeBarra: number;
	paginas?: number;
}

let object1 :ILivros = {
	autor: "Kauã",
  nome: "Contos em Midkemia",
  codigoDeBarra: 131212312312131
} 

let object2 :ILivros;
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24772588#overview

## Mapa Mental