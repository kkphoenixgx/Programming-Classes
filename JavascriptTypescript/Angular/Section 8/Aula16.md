# Aula16 - Rushando a section
2023-01-21
tags: [[../index Angular]]


## - Mod 42 - :

![[../img/Pasted image 20230121203002.png]]

## - Mod 43 - :

Quando os componentes fazem comunicação diretamente e frequentemente, provavelmente significa que eles são pai e filho...

## - Mod 44 - :

Tem como:

~~~scss
input{
	&[type="x"]{
		/*Block*/
	}
	&.class{
		/*Block*/
	}
}
~~~

## - Mod 45 - :

Tem como referenciar o elemento pai via scss com :host e se escrever um elemento dentro, ele automaticamente vai procurar o elemento filho