# Componentes
2024-08-19
tags: [[index Angular]]

## como dar build no angular e como gerar componentes
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 3/Aula2.md ]

~~~ts
// Arquivo: app.component.ts
// Importando a API de componente do Angular
import { Component } from '@angular/core';

//Connfigrando o componente:
@Component({
	//Onde vai entrar o que for criado no Angular em seletor css, o html object.
  selector: 'app-root',
  // O html que vai na div root
  templateUrl: './app.component.html',
  // Onde fica o styles.
  styleUrls: ['./app.component.scss']
})

/*
  Ele entende as configurações de componente
acima e automaticamente já faz o componente
abaixo ter as propriedades acima 
*/
export class AppComponent {
  /* Editável, uma classe ts que é exportável para o 
  app.component.html via interpolation */
  public title = 'first-app';
}
~~~

Ao gerar um componente novo, percebe-se um método importado do angular que usa o **ngOnInit()**, que faz parte do ciclo de vida do angular, me lembra os lifecycle methods do react, ele executa algo assim que o componente é montado.

E para chamar o componente (existem outras formas mais organizadas e talvez melhores) pode-se simplesmente chamar uma div com o selector do do componente no arquivo "app.component.ts" desse componente. Esse processo funciona porque você automaticamente tá adicionando o componente no declarations do app.module

~~~ts
// Arquivo: app.module.ts
@NgModule({
	declarations: [
		AppComponent ,
		// EXEMPLO DE COMPONENTE ABAIXO:
		TitleComponent
	],
	imports:[
		BrowserModute,
		AppRoutingModute
	],
	providers: [],
	bootstrap: [AppComponent]
})
export class AppModule { }
~~~~

## Organizando componentes e o lifecycle no angular
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 3/Aula3.md ]

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
Isso é possível pelo uso do **template ao invés do templateUrl**, porque o **template não aponta para um link** e sim para um template em string mesmo.

Precisamos colocar no código do componente duas coisas: o implements; a importação
~~~ts
// Importação, colocando o ngOnInit
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  template: '<router-outlet></router-outlet>'
})

// implements OnInit
export class AppComponent implements OnInit {}
~~~

Sempre que um componente recebe um dado através do @Input o ngOnChanges é invocado.

## O que é ngDoCheck e suas subrotinas, além do ngOnDestroy
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 3/Aula4.md ]

-   **ngOnInit:** é executado uma vez quando o componente é inicializado;
-   **ngOnChanges:** executado também uma vez na criação do componente e toda vez que ele sofrer alguma mudança;
-   **ngDoCheck:** executado a cada mudança que o **ngOnChange** não detecta;
-   **ngOnDestroy:** executado na destruição do componente.

Além desses existem outros quatros **_hooks_** dentro do **ngDoCheck**:

-   **ngAfterContentInit:** sempre que um conteúdo vindo de uma fonte externa do componente é inserido;
-   **ngAfterContentChecked:** quando o conteúdo externo é verificado;
-   **ngAfterViewInit:** executado logo após os dados dos filhos e do próprio componente ser inicializado;
-   **ngAfterViewChecked:** sempre que é detectado uma alteração do conteúdo é chamado esse cara.
