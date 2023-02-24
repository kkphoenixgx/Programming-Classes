# Aula 23
2022-12-08
tags: [[../Index of typescript]]

## - Mod 42 - : Encapsulamento - private

O private só pode ser chamado no escopo da própria classe, ele é diferente do protected que pode ser chamado pelo filho, este de fato ninguém consegue acessar, somente a própria classe

~~~ts
class Banco{
	private cofreQtd: number = løøøø;
	// This is like a const:
	private static readonly message = "O cofre näo possui a quantidade requisitada" 
	
	private debitarCofre(quantidade: number) : string | number{
	
		if (! this. cofreQtd >= quantidade) return this.message
		else return this.cofreQtd -= quantidade 
	
	}
}
~~~

A diferença entre o private e o protected é que os filhos da classe vão ter acesso ao método protected, enquanto o private não. E isso pode criar uma falha na asegurança, tome cuidado ao usar protected, pode-se injetar uma classe filha em um ataque e pegar os dados protected, então tome cuidado, ao criar uma classe filha, ela pode ter um método público que usa essa variável protected


## - Mod 43 - : Encapsulamento - Private no TypeScript x ECMAScript

~~~ts
class Documento{
	private valor :number = "1236544789-01"; // TS
	#numero :number = 35 // Ecma script (js vanilla)
}
~~~

No typescript, caso o atributo seja privado, **é impossível sobreescrever em uma classe filha no processo de codificação**, já no ecma, é possível. Outra coisa que pesa muito é que usando o private do ts, na hora de compilar o código, ele transforma as variáveis private em pública, vira uma variável comum quando é compilado, então os dois modos tem falhas, um com  a herança se for injetada e o outro na hora da compilação, o código final fica mais fraco.

* Então qual usar?
Depende do que você está codando, se for algo que precisa de uma segurança maior, defenda do inject de outras formas e se for algo mais simples o ts ajuda você em muitas coisas

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500370#overview
