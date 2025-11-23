# HTTP
2025-11-23
tags: [[index Angular]]
 
## Consumindo dados de um SERVICE e Observadores no Angular
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 9/Aula18.md ]
 
Para pegar dados de um servidor, precisamos do **HttpClientModule** que é o modulo de cliente do angular... Para usar ele, precisamos importar .module do componente e cadastra-lo nos imports do module, code exemple 1. Somente assim podemos usar os métodos http do angular no nosso app... é só chamar uma variável do **type HttpClient** com o método get e a url embora tenha que tomar muito cuidado com o link que você tá fazendo a requisição, pois se tiver algo errado não funciona... 
 
Tem uma boa forma de fazer uma pattern de observers bem facilmente no angular com type Observer e .subscribe(), funciona bem simples e sintaxe é bem simples também, **é só fazer um método com o return de uma promisse ou qualquer coisa assíncrona**
 
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
 
O http Post é bem parecido com o http Get, com a única diferença que o post precisa de um segundo parâmetro que é justamente o que será adicionado...
 
~~~ts
// into service
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
 
class someComponent{
 
	private _url :string = 'http://localhost:3000/'
 
	constructor(
		public http :HttpClient
	){}
 
	menthodAdd(data :string) :Observable<{name :string}>{
		return this.http.post< {name: string} >(`${this._url}serverResponse`,{ name: data }).pipe(
			response => response,
			error    => error
		)
	}
}
~~~
 
## Deletando, atualizando dados de uma API e criando headers
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 9/Aula19.md ]
 
Bem parecido com o get e o post, o **put** é para **editar informações**, usamos ele no fake-server apenas com o */id* do campo editado e o que vamos mudar do objeto
 
~~~ts
// Edit
 
menthodEdit(id :number, data :string) :Observable<{name :string}>{
		return this.http.put< {name: string} >(`${this._url}serverResponse/${id}`,{ name: data }).pipe(
			response => response,
			error    => error
		)
}
 
// Delete
menthodEdit(id :number, data :string) :Observable<{name :string}>{
		return this.http.delete< {name: string} >(`${this._url}serverResponse/${id}`).pipe(
			response => response,
			error    => error
		)
}
~~~
 
Para criar um header, podemos usar o código abaixo e chama-lo na hora de fazer a requisição por método:
 
```ts
// Exemplo de HttpHeaders
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Authorization': 'my-auth-token'
  })
};
 
// Exemplo de uso em uma requisição POST
this.http.post<any>(url, data, httpOptions)
```