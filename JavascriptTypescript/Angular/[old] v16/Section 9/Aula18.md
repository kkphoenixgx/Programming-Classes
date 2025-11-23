# Aula18
2023-01-31
tags: [index Angular](index%20Angular.md)

## - Mod 58 - : Observable + http-Get

Para pegar dados de um servidor, precisamos do **HttpClientModule** que é o modulo de cliente do angular... Para usar ele, precisamos importar .module do componente e cadastra-lo nos imports do module, code exemple 1. Somente assim podemos usar os métodos http do angular no nosso app... é só chamar uma variável do **type HttpClient** com o método get e a url embora tenha que tomar muito cuidado com o link que você tá fazendo a requisção, pois se tiver algo errado não funciona... 

Tem uma boa forma de fazer uma pattern de observers bem facilmente no angular com type Observer e .subscribe(), fuinciona bem simples e sintaxe é bem simples também, **é só fazer um método com o return de uma promisse ou qualquer coisa assíncrona**

### Code Exemple:


~~~ts
// .module
import { HttpClientModule } from  '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
  
@NgModule({

  declarations: [ AppComponent ],
  
  imports: [
    HttpClientModule
  ],
  
  providers: [],
  bootstrap: [ AppComponent ]

})

export class AppModule { }
~~~

~~~ts
// into service
import { Injectable, OnInit, EventEmitter } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IResponse } from '../model/IResponse';

  
@Injectable({
  providedIn: 'root'
})

export class TestingServiceService{

  private _url :string = "http://localhost:3000/"

  constructor(
    public http :HttpClient
  ) {}

  // -------- GET --------
  changePageObserver() :Observable< Array<IResponse> >{
    return this.http.get <Array <IResponse> >(`${this._url}serverResponse`).pipe(
      response => { console.log(response); return response },
      error    => error
    )
  }

	// ----------- getters and setters -----------
  get url(){ return this._url }
}
~~~

~~~ts
// Isso tá dentro de um ngInit em um componente rodando

this.testingService.changePageObserver().subscribe({
		next: (res: Array<IResponse> ) => {
			res.forEach(response => {
				this.addItem(response)
			})
		},
		
		error:(error) => error
});
~~~


## - Mod 59 - : Observable + http-Post

O http Post é bem parecido com o http Get, com a única diferença que o post precisa de um segundo parâmetro que é justamente o que será adicionado...

~~~ts
// into service
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

class someComponent{

	private _url :string = 'http://localhost:3000/'

	constructor(
		public http :HttpCLient
	){}

	menthodAdd(data :string) :Observable<{name :string}>{
		return this.http.post< {name: string} >(`${this._url}serverResponse`,{ name: data }).pipe(
			response => response,
			error    => error
		)
	}
}
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570474#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570478#overview