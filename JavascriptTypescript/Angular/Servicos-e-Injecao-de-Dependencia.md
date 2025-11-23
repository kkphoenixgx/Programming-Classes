# Serviços e Injeção de Dependência
2025-11-23
tags: [[index Angular]]
 
## Insight eventBinding, SERVICES, Comunicação e arquitetura com services
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 9/Aula17.md ]
 
Tem como colocar qualquer evento no event binding, ou seja, inclusive um  **keyup.enter**...
 
UUUUUUUU, não fazia ideia que no angular existia algo assim, nossa, isso é muito bom... O service serve justamente para criar serviços, arquivos de comunicação, encapsulamento de tarefas e injeção de dependências, se você não sabe a definição do que eu falei, recomendo ler Arquitetura Limpa e pesquisar sobre os conceitos. Podemos gerar um arquivo service criando um:
> **ng g s (path)**
> **ng generate service (path)**
 
Sendo path o caminho e por padrão o path que você está, geralmente usado service/servicename. Ao criar o seu service, para importa-lo em qualquer outro lugar da sua aplicação, é só importar como se fosse um método de classe mesmo....
 
~~~ts
// Service file (arquivo service)
import { Injectable } from '@angular/core';
 
@Injectable({
  providedIn: 'root'
})
 
export class TestingServiceService {
  private _message = 'working'
 
  constructor() {}
  
  // ----------- getters and setters -----------
  get message() { return this.message }
 
}
~~~
 
O `@Injectable` diz para o Angular que essa classe é uma classe injetável como dependência em outras classes, e como colocamos `providedIn: 'root'`, está disponível na root do projeto, em sua pasta inicial...
 
~~~ts
import { Component, OnInit } from '@angular/core';
import { TestingServiceService } from './services/testing-service.service';
  
@Component({
  selector: 'app-root',
  template: `
	`
})
export class AppComponent implements OnInit {
	
	constructor( public testingService :TestingServiceService){}
 
  ngOnInit(): void {
    console.log(this.testingService.message);
  }
 
}
~~~
 
Podemos mudar dados em um service e colher os dados do service aplicando em algum lugar, assim, ambos componentes dependem do service e não se comunicam, criando uma perfeita injeção de dependência
 
$$a → service ← b$$
 
O subscribe do angular é um addEventListener de um componente... Ele fica escutando quando um Emitter, uma instância de EventEmitter cria um emit() de algum evento
 
### Code Exemple
 
~~~ts
// Service file (arquivo service)
import { Injectable, EventEmitter } from '@angular/core';
 
@Injectable({
  providedIn: 'root'
})
 
export class TestingServiceService {
  public emitter = new EventEmitter()
	 
  constructor() {}
 
	buttonClick(message :string){
		this.emitter.emit(message)
	}
}
~~~
 
~~~ts
// file: component.ts
import { Component, OnInit } from '@angular/core';
import { TestingServiceService } from './services/testing-service.service';
  
@Component({
  selector: 'app-root',
  template: `
	`
})
export class AppComponent implements OnInit {
	
	constructor( public testingService :TestingServiceService){}
 
  ngOnInit(): void {
    this.testingService.emitter.subscribe({
			next : (res) => console.log(res),
			error: (err) => console.log(err),
		});
  }
 
}
~~~
 
Bom, a aula foi sobre como simular um servidor com uma lib npm chamada: json-server. Basicamente só precisa criar um arquivo chamado db.json com o seguinte formato:
 
> **npm install -g json-server**
> **json-server --watch db.json**