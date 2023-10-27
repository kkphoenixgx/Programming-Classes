# Aula 40
2023-07-14
tags: [index Angular](../index%20Angular.md)

## - Mod 123 - : Can Activate 2

Agora vamos usar a nossa guard, para isso, utilizaremos uma tag a com um [`routerLink` da  aula 23](../Section%2012/Aula23.md), e um `queryParams`, que define parâmetros para serem resgatados pela URL,

~~~html
<a [routerLink]="pathName" 
	 [queryParams]={
			{
				 account: "accountType", 
				 password: "somePassword"
			}
	 }
></a>
~~~

[Use o exemplo da aula anterior](Aula39.md#Por%20referência,%20dos%20códigos) para entender os parâmetros `state` e `raute` , e então assim, entender o resgate, veja o retorno de `route` de um exemplo a parte:

![](../img/Pasted%20image%2020230714110954.png)

Podemos pegar em `route.params` seus valores passados pelo `queryParams` e usa-los em nossos guards para fazermos validações.

![](../img/Pasted%20image%2020230714112833.png)

## - Mod 124 - : `CanDeactivate`

O `canDeactivate` verifica antes de fechar a aba, ou antes de fechar o navegador, se algum procedimento foi concluído, como ter salvado um arquivo, o modo de implementação é bem parecido para essas guards:

![](../../../Pasted%20image%2020230716105102.png)

Onde tinha um unknown, troca-se pelo componente que terá a guard... Mesma coisa, se retorna true, sai da página, e você pode implementar métodos na sua classe original...

![](../../../Pasted%20image%2020230716105526.png)



-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/30852506?start=195#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/30852518?start=45#overview