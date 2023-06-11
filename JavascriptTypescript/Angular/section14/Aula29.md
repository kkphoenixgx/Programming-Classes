# Aula29
2023-04-26
tags: [index Angular](../index%20Angular.md)

## - Mod 101 e 102 - : Testes Unitários

Um teste unitário é diferente de um teste de fluxo, um teste de fluxo verifica as saídas, os envios de página e vê se tá retornando o esperado, verificando o fluxo do código. Em contrapartida, os testes unitários, verifica uma unidade da aplicação como um todo.

Para realizar os testes unitários, utilizamos o Karma para node e o Jasmine para o angular. O karma dá o suporte necessário para o Jasmine atuar

## - Mod 103 - : Jasmine

Vale ressaltar que isso não é um curso de Jasmine e tem muito mais coisa para aprender, só vamos fazer o básico, *o guia de instalação está linkado na bibliografia, contudo, o Angular já possuí instalado o Jasmine  e eu fiz um quick guide logo abaixo*.

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

### Understanding syntax

Com o Angular funcionando com o Jasmine, vamos só entender o que fizemos dentro do spec:

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

Agora vamos falar sobre a sintaxe que ocorre no *callback do it*.

* **TestBed**: O TestBed é uma classe que fornece um ambiente de teste para o código que está sendo testado, é possível criar e configurar módulos de teste, criar componentes e serviços, bem como criar instâncias do componente para serem testados. *Com isso podemos criar testes que simulam a interação do usuário com o aplicativo*, testar o fluxo de dados entre componentes e serviços e garantir que o aplicativo se comporte de forma previsível em diferentes situações. - **Um ambientador** -

* **fixure**: O fixure é usado para interagir com o componente criado e com seu template, para testar se o comportamento do componente está correto. Criamos um template, uma interface, do Componente para podermos fazer testes, ***Não é uma instância, é a interface do componente***, o app é a instância.


-----------------------------------------------

## Sobre a estrutura base


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

Claro que quando colocamos `ComponentName`, estamos nos referindo a um teste unitário, um teste de componente. Contudo, em um teste de serviço, de interface... Você terá estruturas adicionais que vão ser modificadas, entretanto, ainda seguirão essa estrutura, mudando apenas `ComponentName` para o nome do que está sendo testado... De toda forma, vamos sempre fazer, na maioria das vezes, testes de componentes, que são mais comuns... Via de regra, se segue essa estrutura adicionando partes de acordo com o que você precisa testar e dando retoques.

Nas sessões: Dos Testes x, poderemos ver essas estruturas.

## Bibliografia

_Alguns dos textos desse arquivo foram ajustados com conversas com o ChatGPT sobre o Angular._

* site do jasmine:  jasmine.github.io/pages/getting_started.html

https://www.udemy.com/course/curso-de-angular/learn/lecture/28124636#reviews

https://www.udemy.com/course/curso-de-angular/learn/lecture/28124814#reviews
