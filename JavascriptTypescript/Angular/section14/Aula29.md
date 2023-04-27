# Aula29
2023-04-26
tags: [index Angular](../index%20Angular.md)

## - Mod 101 e 102 - : Testes Unitários

Um teste unitário é diferente de um teste de fluxo, um teste de fluxo verifica as saídas, os envios de página e vê se tá retornando o esperado, verificando o fluxo do código. Em contrapartida, os testes unitários, verifica uma unidade da aplicação como um todo.

Para realizar os testes unitários, utilizamos o Karma para node e o Jasmine para o angular. O karma dá o suporte necessário para o Jasmine atuar

## - Mod 103 - : Jasmine

Vale ressaltar que isso não é um curso de Jasmine e tem muito mais coisa para aprender, só vamos fazer o básico, *o guia de instalação está linkado na bibliografia, contudo, o Angular já possuí instalado o Jasmine*.

### Instalação

Para começar, instala e salva como dependência o Jasmine

*  Install Jasmine:
  > `npm install jasmine --save-dev`

-   Depois o karma test runner:  
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

* Cria o arquivo spec que vai realizar o primeiro teste
	
	-   Cria um arquivo em **src/app/app.component.spec.ts**, esse vai ser um o arquvo de testes para o seu **AppComponent** que vêm por padrão no Angular.
	-   Dentro do **app.component.spec.ts**, coloca isso para testar:
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

* Realize o primeiro teste com:
	> **ng test**

### Uderstanding syntax

Com o Agular funcionando com o Jasmine, vamos só entender o que fizemos dentro do spec:

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

Temos diversas classes e métodos que estão ajudando a testar o componente e vamos ir entendendo a sintaxe do Jasmine aos poucos. Começando pelo describe e o it:

* **describe(component, callBack)**: Os testes que ocorrerão no component por meio do callBack;

* **it('description', callback)**: Isso deveria < descrição >. Exemplo: it(O AppComponent) deveria ser criado(description) sendo o Call back os testes que serão feitos. É importante manter a lógica para ficar intuitivo no console;

Agora vamos falar sobre a syntaxe que ocorre no *callback do it* 

-----------------------------------------------
## Bibliografia

* site do jasmine:  jasmine.github.io/pages/getting_started.html

https://www.udemy.com/course/curso-de-angular/learn/lecture/28124636#reviews

https://www.udemy.com/course/curso-de-angular/learn/lecture/28124814#reviews