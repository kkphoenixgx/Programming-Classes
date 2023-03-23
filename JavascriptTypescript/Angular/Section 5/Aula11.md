# Aula10
2022-12-18
tags: [[../index Angular]]

## - Mod  - 32 : ng-content

O ng content é uma div assim como o ng-template que tem um papel bem interessante também, ele serve, inicialmente, como um organizador, com atributos como o select. Ele basicamente seleciona do pai para filho e organiza esses elementos html.

~~~html
<ng-content select="element" ><ng-content>
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
<ng-content select="h1" ><ng-content>

<p>This text has to be between h1 and hr<p>

<ng-content select="hr" ><ng-content>
~~~

Dessa forma, o component fica organizado do jeito que você quiser no html do seu componente filho e caso queira editar algo, você pode só colocar o valor no componente pai.

## - Mod 33 - 33 : Pipes

O pipe basicamente ajuda a modificar valores do código, é um recurso dentro do angular muito útil...

~~~html
<li *ngFor = "let item of list" >{{item | uppercase}}</li>
~~~

isso transforma o valor em uppercase ( ﾉ ﾟｰﾟ)ﾉ ~~ simplsmente incrível... Quer ver algo mais incrível ainda?

~~~ts
public date :Date = new Date
~~~
~~~html
{{ date | date: 'dd/MM/yyyy' }}
~~~

Isso retorna a data de hoje no formato certo... ( ﾉ ﾟｰﾟ)ﾉ ~~ simplsmente incredible...

O que ele faz é basicamente chamar um método chamado transform() e usar como parâmetro o que vêm depois do pipe.

-----------------------------------------------
**Agora o desafio é usar todos esses recursos**

## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569894#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569902#overview