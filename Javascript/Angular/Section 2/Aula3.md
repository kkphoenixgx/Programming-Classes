# Aula3
2022-12-05
tags: [[../index Angular]]

* 8 estágios no ciclo de vida do angular
* O construtor da classe é executado antes dos métodos de ciclo de vida
* Métodos de ciclo de vida, todos devem retornar :void
	* **ngOnInit ( )** = Antes do componente ser montado na tela
	* **ngOnChanges ( )** = Quando tem mudanças
	* **ngDoCheck ( )** = 
		* **ngAfterContentInit ( )** = Depois do componente ser montado na tela
		* **ngAfterContentChecked ( )** =
		* **ngAfterViewInit ( )** =
		*  **ngAfterViewChecked ( )** =
	* **ngOnDestroy ( )** = Quando o componente é destruído

 * As sintaxes com @ são decorators


## - Mod 11 - Hack para organizar o app.componente :

Para melhor **organizar os arquivos do workspace**, tem uma manha para não ficar com tantos arquivos

~~~ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: '<router-outlet></router-outlet>'
})

export class AppComponent {
  title = 'first-app';
}
~~~

Usando essa configuração, não têm arquivo com router e podemos **apagar** os arquivos: **app.component.html, app.component.scss(scc...) e app.component.spec.ts.** todos esses arquivos têm sim funções mas é mais fácil se simplesmente colocar depois se preciso.
Isso é possível pelo uso do **template ao invés do templateUrl**, porque o **template não aponta para um link** e sim para um template em string mesmo. Essa configuração vêm como default o **templateUrl** no caso de você já ter uma aplicação e usar o **angular somente em algumas partes do projeto**. Portanto, caso queira, é possível só *colocar os componentes em uma templateString*

## - Mod 12 - Lifecycle: ngOnInit :

Precisamos colocar no código do componente duas coisas: o implements; a importação
~~~ts
// Importação, colocando o ngOnInit
import { Component, ngOnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  template: '<router-outlet></router-outlet>'
})

// implements OnInit
export class AppComponent implements OnInit {}
~~~

Importante dizer que podemos implementar duas coisas por vírgula
~~~ts
// implements OnInit
export class AppComponent implements OnInit,  {}
~~~

## - Mod 13 - Lifecycle: ngOnChanges :

Sempre que um componente recebe um dado através do @lnput o ngOnChanges é invocado. Ou seja, se um elemento com um  **decorator input** é alterado, ele detecta o event 'change' e executa o bloco.. Na hora de implementar, usamos:
~~~ts
// Importação, colocando o OnChanges
import { Component, OnChanges } from '@angular/core';

// implements OnInit
export class AppComponent implements OnChanges {}
~~~

Os decorators são as estruturas com @, são nativas do angualat e são utilizadas simplesmente amo usar @decoratorName na frente de uma variável



-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25568848#overview
https://www.udemy.com/course/curso-de-angular/learn/lecture/25568854#overview
https://www.udemy.com/course/curso-de-angular/learn/lecture/25569022#overview