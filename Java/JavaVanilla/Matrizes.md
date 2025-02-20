# Matrizes
2024-06-05
tags: [[☕ Index Java]]

Uma matriz é nada mais nada menos que dois vetores :). Arranjos bidimensionais, 

![[Pasted image 20240605044014.png]]

para definirmos uma matriz em java, usamos a seguinte sintaxe:

~~~java
int size = 3;
int [][] x = new int[size][size] //new int[3][3]
~~~ 

E aí a gente percorre a matriz com dois for:

~~~java
for(int i = 0; i < size; i++){
	for(int j = 0; j< size; j++){
		x[i][j] = sc.nextInt();
	}
}
~~~

O `sc.nextInt()` é mais para representar alguma manipulação, mas o core do código é esses dois for ai bem bonitinho.

É importante dizer que temos também temos um atributo length na matriz:

~~~java
x.length; // === size
~~~

O que nos permite melhorar:

~~~java
int [][] x = new int[3][3]

for(int i = 0; i < x.length; i++){
	for(int j = 0; j< x[i].length; j++){
		x[i][j] = sc.nextInt();
	}
}
~~~
