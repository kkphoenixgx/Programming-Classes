# Aula29
2023-04-26
tags: [index Angular](../index%20Angular.md)

## - Mod 101 e 102 - : Testes Unitários

Um teste unitário é diferente de um teste de fluxo, um teste de fluxo verifica as saídas, os envios de página e vê se tá retornando o esperado, verificando o fluxo do código. Em contrapartida, os testes unitários, verifica uma unidade da aplicação como um todo.

Para realizar os testes unitários, utilizamos o Karma para node e o Jasmine para o angular. O karma dá o suporte necessário para o Jasmine atuar

## - Mod 103 - : Jasmine

Vale ressaltar que isso não é um curso de Jasmine e tem muito mais coisa para aprender, só vamos fazer o básico, *o guia de instalação está linkado na bibliografia, contudo, o Angular já possuí instalado o Jasmine*.

### Instalation

Para começar, instala e salva como dependência o Jasmine

*  Install Jasmine:
> `npm install jasmine --save-dev`

Depois o karma test runner

-   Install Karma test runner:  
	>`npm install karma karma-jasmine jasmine-core karma-chrome-launcher --save-dev`

- Cria um karma.config.json
	~~~json
	module.exports = function (config) {
		config.set({
			basePath: '',
			frameworks: ['jasmine', '@angular-devkit/build-angular'],
			plugins: [
				require('karma-jasmine'),
				require('karma-chrome-launcher'),
				require('@angular-devkit/build-angular/plugins/karma')
			],
			
			client: {
				clearContext: false // leave Jasmine Spec Runner output visible in browser
			},
			
			coverageIstanbulReporter: {
				
				dir: require('path').join(__dirname, '../coverage'),
				reports: ['html', 'lcovonly'],
				fixWebpackSourcePaths: true
			
			},
			
			reporters: ['progress', 'kjhtml'],
			port: 9876,
			colors: true,
			logLevel: config.LOG_INFO,
			autoWatch: true,
			browsers: ['Chrome'],
			singleRun: false,
			restartOnFileChange: true
		});
	};
	~~~


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
### Uderstanding syntax


## Bibliografia

* site do jasmine:  jasmine.github.io/pages/getting_started.html

https://www.udemy.com/course/curso-de-angular/learn/lecture/28124636#reviews

https://www.udemy.com/course/curso-de-angular/learn/lecture/28124814#reviews