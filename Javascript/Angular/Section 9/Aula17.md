# Aula17
2023-01-29
tags: [index Angular](../index%20Angular.md)

## - Mod 49 - : Hands-on-9

Tem como colocar qualquer evento no event binding, ou seja, inclusive um  **keyup.enter**...

## - Mod 52 - : Service - Injeção de dependências

UUUUUUUU, não fazia ideia que no angular existia algo assim, nossa, isso é muito bom... O service serve justamente para criar serviços, arquivos de comunicação, encapsulamento de tarefas e ingeção de dependências, se você nãos abe a definição do que eu falei, recomendo ler Arquitetura Limpa e pesquisar sobre os conceitos. Podemos gerar um arquivo service criando um:
> **ng g s (path)**
> **ng generate service (path)**

Sendo path o caminho e por padrão o path que você está, geralmente usado service/servicename. Ao criar o seu service, para importa-lo em qualquer outro lugar da sua aplicação, é só importat como se você um método de classe mesmo....

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


## - Mod 53 - : Comunicação de componentes com service

Podemos mudar dados em um service e colher os dados do service aplicando em algum lugar, assim, ambos componentes dependem do service e não se comunicam, criando uma perfeita ingessão de dependência

$$a → service ← b$$

## - Mod 54-55 - : Subscribe

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
### Code Exemple Antigo [Deprecated]

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
    this.testingService.emitter.subscribe( 
	    response=>{ console.log(response) },
	    error=>{ console.log(error) }
    );
  }

}
~~~

-----------------------------------------------

## - Mod 56 - : Fake server

Bom, a aula foi sobre como simular um servidor com uma lib npm chamada: json-server. Basicamente só precisa criar um arquivo chamado db.json com o seguinte formato:

~~~json
{
    "serverResponse": [
        {
            "id": 1,
            "name": "response1"
        },
        {
            "id": 2,
            "name": "response2"
        },
        {
            "id": 3,
            "name": "response3"
        }
    ]
}
~~~

> **npm install -g json-server**
> **json-server --watch db.json**


## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570420#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570438#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570442#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570450#overview