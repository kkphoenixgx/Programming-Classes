# Diretivas
2025-11-23
tags: [[index Angular]]
 
## Diretivas e ngIf
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 5/Aula7.md ]
 
As diretivas säo classes que adicionam comportamentos adicionais aos elementos em aplicativos Angular. Com as diretivas integradas do Angular, vocé pode gerenciar formulårios, listas, estilos e o que os usuårios veem. Dessa forma, temos dois tipos de diretivas, as **diretivas de atributo** e as **diretivas estruturais**.
 
* **Diretivas de atributo**: Aquelas que *alteram aparência ou comportamento* de um elemento
	* **ngClass** = adiciona ou remove classes
	* **ngStyle** = adiciona ou remove um conjunto de estilo css
	* **ngModel** = adiciona vinculação de dados de um formulário (Quando o usuário digita uma variável já pega esse texto digitado)
* **Diretivas estruturais**: Que moldam a estrutura do dom
	* **NgIf**: Condicionalmente cria ou modifica algo
	* **NgFor**: Repete algo para cada item de uma lista
	* **NgSwitch**:: Conjunto de diretivas que alteram entre visões alternativas
 
O ngIf tem uma syntax sugar, assim:
 
~~~html
<p *ngIf="condition" ></p>
~~~
 
Essa condition nada mais é que uma variável do ts, mas o ngIf, na realidade, recebe um bool como valor e é possível também fazer um else
 
~~~html
<p *ngIf="condition; else condition2" ></p>
~~~~ 
 
Nesse caso, " ; " indica a ação caso o if estiver correto e o else indica que, o que está depois é caso esteja incorreto. Para mostrar como realizar ações mais complexas que isso, veremos o conceito de template, que ao meu ver, olhando rapidamente o código de exemplo, é uma div que só vai funcionar quando algo acontece.
 
~~~html
<!--- Caso esteja correto, coloque ok, ao contrário, execute condition2 ---> 
<p *ngIf="condition; else condition2" >ok</p>
 
<ng-template #condition2>
	<p>not ok</p>
</ng-template>
~~~
 
## ngFor e ngSwitch
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 5/Aula8.md ]
 
O ngFor tem um syntax sugar e ele é usado exatamente como um for dentro do html
 
~~~html
<ul>
 <li *ngFor="let item of list" > {{ item.x }} </li>
</ul>
~~~
 
É exatamente como um for, coloca todos os itens de list em item. Sendo list um array no componente ts. Tem como também ver o index do item:
 
~~~html
<ul>
 <li *ngFor="let item of list; let i = index" > [ {{i}}] - {{ item.x }} </li>
</ul>
~~~
 
Desse modo podemos ter o i. E mais adiante, ao colocar o i, ele vira uma variável, ou seja, tem como passar esse i como uma parametro de função
 
~~~html
<ul>
 <li *ngFor = "let item of list" > {{ item.x }} (click)="someFn(i)" </li>
</ul>
~~~
 
Assim, podemos obter o index do item e até mesmo referenciar ele dentro do array se preciso.
 
O ngSwitch é realmente a estrutura de um switch:
 
~~~html
<div [ngSwitch]="variable" >
	<div *ngSwitchCase="caseCondition" > Aparece isso na tela se a condition for true </div>
</div>
~~~
 
Perceba então, que o Switch em si não usa syntax sugar, e sim o case do switch. Ao definir variable, novamente estamos falando de uma variável do componente.ts e lembre-se que o condition do switch não é qualquer condition que recebe um bool, é somente um valor. Desse modo, caseCondition deve ser um 2, 3, 'name' e não uma estrutura de condição como ( 1 > 3 ).
 
~~~html
<div [ngSwitch]="name" >
	<div *ngSwitchCase=" 'kkphoenix' " > creator </div>
	<div *ngSwitchDefault > client </div>
</div>
~~~
 
## diretivas atributo, ngClass e ngStyle
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 5/Aula9.md ]
 
O ngClass é uma diretiva bem interessante, ela serve para fazer validações usando diretamente as classes do css ou do sass. Ela usa essa sintaxe mais robusta e é feita em uma estrutura bem simples: 
**[ngClass]="{'className': tsConditionVariableBoolean, 'classNameTwo': 'tsOtherConditionVariableBoolean }"**
 
~~~html
<h2 [ngClass]="{'enable': blinkToggle, 'disable': !blinkToggle}" > Attribute Directives </h2>
 
// component.ts: public blinkToggle = true;
// css: enable{ color: blue; } -break line- disable: { color: red }
~~~
 
Já a diretiva do NgStyle é parecida com o ngClass mas ela vêm com a função de mudar uma propriedade css pelo ts facilmente:
 
~~~html
<p [ngStyle]="{'font-size': fontSize}" > ngStyle </p>
~~~
 
~~~ts
// Claro que isso tem que estar na classe
public fontSize :string = '2em'
 
ngOnInit(){
 
	setInterval(()=>{
 
		if (this.fontSize === '2em') this.fontSize = '1em'
		else this.fontSize = '2em'
 
	}, 2000 )
}
~~~
 
## ngModel em two-way databinding e ng-template
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 5/Aula10.md ]
 
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
 
As divs de ng-template carregam antes da página ser carregada. E isso implica, que ela é tipo um gato de Schrödinger, tá mas não tá ali. Só carrega na hora de carregar a página se for permitido.
 
```html
<div *ngIf="isValid;then content else other_content">here is ignored</div>
<ng-template #content>content here...</ng-template>
<ng-template #other_content>other content here...</ng-template>
```

## Organizando os elementos de pai para filho com ng-content
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 5/Aula11.md ]

O ng content é uma div assim como o ng-template que tem um papel bem interessante também, ele serve, inicialmente, como um organizador, com atributos como o select. Ele basicamente seleciona do pai para filho e organiza esses elementos html.

~~~html
<ng-content select="element" ></ng-content>
~~~

Vamos dizer que temos essa estrutura no nosso app.component.ts

~~~ts
// file: app.component.ts
@Component({
  selector: 'app-root',
  template: `
    <someComponent>
	    <h1>SomeText</h1>
	    <hr></hr>
    </someComponent>
    <router-outlet></router-outlet>
  `
})
~~~

E esse p deve estar entre o h1 e o hr

~~~html
<p>This text has to be between h1 and hr<p>
~~~

Podemos usar o ng-content para fazer isso:

~~~html
// file: someComponent.component.ts
<ng-content select="h1" ></ng-content>

<p>This text has to be between h1 and hr<p>

<ng-content select="hr" ></ng-content>
~~~

Dessa forma, o component fica organizado do jeito que você quiser no html do seu componente filho e caso queira editar algo, você pode só colocar o valor no componente pai.