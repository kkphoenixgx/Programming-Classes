# Aula29
2023-04-26
tags: [index Angular](../index%20Angular.md)

## - Mod 101 e 102 - : Testes Unitários

Um teste unitário é diferente de um teste de fluxo, um teste de fluxo verifica as saídas, os envios de página e vê se tá retornando o esperado, verificando o fluxo do código. Em contrapartida, os testes unitários, verifica uma unidade da aplicação como um todo.

Para realizar os testes unitários, utilizamos o Karma para node e o Jasmine para o angular. O karma dá o suporte necessário para o Jasmine atuar

## - Mod 103 - : Jasmine

Vale ressaltar que isso não é um curso de Jasmine e tem muito mais coisa para aprender, só vamos fazer o básico, *o guia de instalação está linkado na bibliografia, contudo, o Angular já possuí instalado o Jasmine*.

### Instalation from Chatgpt

To set up an Angular project to start already with Jasmine, you can follow these steps:

1.  Install Jasmine:
> `npm install jasmine --save-dev`
    
-   Install Karma test runner:  
	>`npm install karma karma-jasmine jasmine-core karma-chrome-launcher --save-dev`
    
-   Create a new configuration file for Karma:
  > `npx karma init`
  
-   Create a new folder called src/app if it doesn't exist already. Inside that folder, create a new file called **app.component.spec.ts**. This will be the spec file for your **AppComponent**.
-   Inside the **app.component.spec.ts** file, add a test case using the Jasmine syntax. For example:
~~~ts
import { TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => { 
	it('should create the app', () => { 
    const fixture = TestBed.createComponent(AppComponent);
		const app = fixture.componentInstance;

		expect(app).toBeTruthy();   
	}); 
});
~~~
-   Run the tests using Karma:
> `npx karma start`

-----------------------------------------------
## Bibliografia

* site do jasmine:  jasmine.github.io/pages/getting_started.html

https://www.udemy.com/course/curso-de-angular/learn/lecture/28124636#reviews

https://www.udemy.com/course/curso-de-angular/learn/lecture/28124814#reviews