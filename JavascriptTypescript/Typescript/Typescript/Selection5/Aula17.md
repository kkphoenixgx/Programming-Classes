# Aula17
2022-10-17
tags: 

## - Mod - 34:  Arrays em interfaces

É só definir um type de array para o valor da interface

~~~ts
interface Menu {
	itens :string[];
	/ ...
}
~~~

Pode até, inclsive, colocar o ? para deixar ela opcional. Quando se trabalha com arrays, devemos também definir que o índicie é numérico.

~~~ts
interface ITodo{
	[indice: number] :string;
}
~~~
 

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24772612#overview
