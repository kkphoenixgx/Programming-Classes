# Aula9
2022-12-17
tags: [[../index Angular]]

## - Mod 30 - : ngModel

O ngModel é um model de "biresposta", ele possuí dois tipos de entrada, tanto no código quanto recebendo valores do usuário. para que ele funcione, precisamos cadastrar dentro do **app.module.ts**:

~~~ts
import {FormsModule} from '@angular/core'

@NgModule({

  declarations: [
		//...
  ],

  imports: [
	  // ...
    FormsModule
  ],
  // ...
})
~~~

E a sintaxe do ngModule em si é bem simples, embora seja bem diferente das outras diretivas até agora:

~~~html
<input [(ngModel)]='variable' ></input>
~~~

Sendo variable a variável em ts que vai receber esse valor

## - Mod 31 - : ng-template

OH decadedence!!! q(≧▽≦q). Entraremos em ng-module, na minha opinião um dos melhores assuntos do angular....

Então começaremos explicando coisas bem importantes:
1. As divs de ng-module carregam antes da página ser carregada. E isso implica, que ela é tipo um gato de Schrödinger, tá mas não tá ali. Só carrega na hora de carregar a página se dor permitido.
2. As diretivas são usadas de forma diferente... Então não vai achando que é igual, o  menino é diferente

* Templates diferentes:
  ~~~html
  // ngFor normal: <li *ngFor = "let item of list" ></li>

  <ng-template ngFor let-item [ngForOf]='list' ></ng-template>
  ~~~

  ~~~html
  // ngIf normal: <p *ngIf="condition" ></p>

  <ng-template [ngIf]="condition" ></ng-template>
  ~~~

Mas aí você deve estar pensando:  Para que eu vou usar isso? E eu tenho sua resposta (～￣▽￣)～: Velocidade meu amigo. O for normal cria, verifica que não tem nada e tira da tela, já com o ng-template, se não tiver nada ele nem cria 

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569884#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569890#overview