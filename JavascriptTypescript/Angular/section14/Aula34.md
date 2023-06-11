# Aula 34
2023-06-04
tags: [index Angular](../index%20Angular.md)

## - Mod 111 - : Criando component investments

![](../img/Pasted%20image%2020230604130822.png)

Lembra sempre de lidar com os testes unitários depois ou antes de criar um componente, verifique se está declarado, sempre aparece uma mensagem parecida com essa:

![](../img/Pasted%20image%2020230604130937.png)

Precisamos sempre fazer essa estrutura, claro, isso é um exemplo do curso mas perceba a estrutura do `describe`, depois os dois `beforEach` e só depois os its

![](../img/Pasted%20image%2020230604131350.png)

### Estrutura básica do Jasmine

~~~ts
	import { TestBed } from '@angular/core/testing';
	import { ComponentName } from './ComponentName';

	describe('ComponentName', () => { 

		let component :ComponentName;
		let fixure :ComponentFixture<ComponentName>

		// ----- Estrutura do tipo de teste -----
				
				// Block
		
		// ----- Teste primário -----
		beforeEach( ()=>{
			fixure = TestBed.createComponent(ComponentName);
			component = fixure.componentInstance;

			fixure.detectChanges();
		})

		// ----- its -------
		
	});
	~~~

Claro que quando colocamos `ComponentName`, estamos nos referindo a um teste unitário. Contudo, um teste de serviço, de interface... Você terá estruturas adicionais e que vão ser modificadas mas ainda seguirão essa estrutura, mudando apenas `ComponentName` para o nome do que está sendo testado... De toda forma, vamos sempre fazer, na maioria das vezes, testes de componentes, que são mais comuns e via de regra se segue essa estrutura.

## - Mod 112 - : Testando o component

* **x.trim()** = Retira os espaços vazios da frente e de trás do conteúdo de uma string para testes de elementos html
* **x.toContain(y)** =  Verifica se existe em x o y. Exemplo: "SomeText" = x, x.toContain("Text") // → true
* **x.toEqual(y)*** = Verifica se x é y. Exemplo: "SomeText" = x, x.toEqual("Text") //→false; x.toEqual("Some Text") //→true


-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/28649672#overview