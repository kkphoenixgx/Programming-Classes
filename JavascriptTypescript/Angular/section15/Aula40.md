# Aula 40
2023-07-14
tags: [index Angular](../index%20Angular.md)

## - Mod 123 - : Can Activate 2

Agora vamos usar a nossa guard, para isso, utilizaremos uma tag a com um [`routerLink` (Aula 23)](../../Typescript/Typescript/Selection6/Aula23.md), e um `queryParams`, que define parâmetros para serem resgatados pela URL,

~~~html
<a [routerLink]="pathName" 
	 [queryParams]={
			{
				 adm_name: "kkphoenix", 
				 password="somePassword"
			}
	 }
></a>
~~~

[Use o exemplo da aula anterior](Aula39.md#Por%20referência,%20dos%20códigos) para entender os parâmetros `state` e `raute` , e então assim, entender o resgate, veja o retorno de `route`:

![](../../../Pasted%20image%2020230714110954.png)

Podemos pegar em `route.params` seus valores passados pelo `queryParams`



## - Mod  - :



-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/30852506?start=195#overview
