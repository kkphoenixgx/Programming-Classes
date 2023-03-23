# Aula25
2023-02-01
tags: [Index of typescript](../Index%20of%20typescript.md)

## - Mod 48 - : Polimorfismo

Polimorfismo nada mais é que uma subclasse... :). Eu já sabia polimorfismo, só não sabia que dava para sobreescrever métodos:

~~~ts
class Empresa {
	prestaServiço(){
		return 'prestando serviço'
	}
}

class Padaria extends Empresa{
	prestaServiço(){
		return 'prestar serviço'
	}
}
~~~



## - Mod 49 - : Classes abstratas

![](../img/Pasted%20image%2020230202000827.png)

![](../img/Pasted%20image%2020230202001106.png)

~~~ts
abstract class Empresa(){
	abstract startWork() :void
}

class Padaria extends Empresa {
	public startWork(){
		console.log('starting work into Padaria!!!')
	}
}

class Lanchonete extends Empresa {
	public startWork(){
		console.log('starting work into Lanchonete!!!')
	}
}
~~~

-----------------------------------------------
## - Mod 50 - :  Implementando interface em uma classe

Podemos implementar interfaces com o uso do **implements**, é uma outra forma e mais declarativa de implementar interfaces:

~~~ts
class someClass implements ISomeInterface{}
~~~

Outra informação importante também é que usamos a sintaxe declarativa de parâmetros de instância (a que você coloca as variáveis antes do constructor) quando precisamos fazer um binding de dados, quando temos dados conflitantes ou que precisam ser tratados para convergir em uma única classe... Um exemplo disso é quando precisamos implementar uma interface em uma classe e a classe pai dessa classe já tem uma estrutura a ser seguida....

## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500404#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500408#overview

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500414#overview