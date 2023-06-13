# Aula 35
2023-06-11
tags: [index Angular](../index%20Angular.md)

## - Mod 113 - : Criando um serviço investments

 Nada de novo, ele só fez um service simples usando um server que ele criou.


## - Mod 114 - : Testando services

Bom, logo antes de começar a falar dos services, existe o conceito de mockar algo, que é basicamente fazer o teste sobre um objeto, componente... Veja uma descrição do ChatGPT:
<p style="display:flex; justify-content: end; text-align: right" > <i> No contexto do Jasmine, uma estrutura de teste para JavaScript, "mockar" algo significa substituir ou simular um objeto real ou uma função durante os testes. O objetivo é isolar a unidade de código sendo testada e garantir que o teste seja executado de forma independente, sem depender de outros componentes externos. ~ChatGPT </i></p>
Bom, nesses mocks, existem dois atores principais que vão nos ajudar, o `HttpClientTestingModule` e o `HttpTestingController`, ambos estarão no `@angular/common/http/testing`.

~~~ts
import { HttpClientTestingModule, HttpTestingController } from "@angular/common/http/testing"
~~~

Uma especificação importante de notar ao usar o `HttpClientTestingModule`, é que ele deve ser importado no `configureTestingModule`, que é parte da estrutura para services:

![](../img/Pasted%20image%2020230611102821.png)

Somente assim poderemos utiliza-lo. Diferentemente, o `HttpTestingController` pode ser utilizado ao ser tipado em uma variável e injetado dentro dessa variável, veja no comentário injection:

~~~ts
import { TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component';
import { HttpTestingController, HttpClientTestingModule } from "@angular/common/http/testing"

describe('AppComponent', () => { 
	// ----- Variáveis -----
	let fixure :ComponentFixture<ComponentName>;
	let component :ComponentName;	
	
	let httpTestingController :HttpTestingController; 
	
	// ----- Importação do HttpClientTestingModule -----
	beforeEach( ()=>{
		TestBed.configureTestingModule({
			imports:[HttpClientTestingModule]
		})
		// ----- Injection -----
		httpTestingController = TestBed.inject(HttpTestingController);
	})

	beforeEach( ()=>{
		fixure = TestBed.createComponent(ComponentName);
		app = fixure.componentInstance;
	
		fixure.detectChanges();
		expect(app).toBeTruthy();   
	})

	afterEach(){
		httpTestingController.verify();
	}

	// ----- its -----

});
~~~

Como o usual, não tem como lidar com services sem utilizar o módulo de http do angular, se não tem uma boa base, dá uma checada na [Aula 27](../Section13/Aula27.md), dessa forma, faz o procedimento padrão e faz um inject...

~~~ts
let httpClient :HttpClient;

beforeEach( ()=>{
		TestBed.configureTestingModule({
			imports:[HttpClientTestingModule]
		})
		// ----- Injection -----
		httpClient = TestBed.inject(HttpClient);
	})
~~~

## Dos services

Vamos fazer as seguintes modificações nos lugares específicos, dessa vez seguindo somente [-- Sobre a estrutura base --](Aula29#Aula%2029#--%20Sobre%20a%20estrutura%20base%20--)

~~~ts
import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from "@angular/common/http/testing"
import { HttpClientModule } from '@angular/common/http';

// ----- Components -----

import { ServiceComponent } from './path/to/shared/servicecomponent.ts'

// ----- Variables -----

let service :ServiceComponent;	
let fixure :ComponentFixture<ServiceComponent>;

let httpClient :HttpClient;
let httpTestingController :HttpTestingController; 

// ----- Block -----

beforeEach( ()=>{
	TestBed.configureTestingModule({
		imports:[HttpClientTestingModule]
	})
	
	httpClient = TestBed.inject(HttpClient);
	httpTestingController = TestBed.inject(HttpTestingController);

	service = TestBed.inject(ServiceComponent);
})
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/28649714#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/28649776#announcements/8179882/
