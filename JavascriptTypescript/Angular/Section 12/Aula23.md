# Aula23
2023-02-25
→ Continuado em 28/02/23
tags: [index Angular](../index%20Angular.md)

## - Mod 72 e 73 - : Entendendo arquivo de rotas

> **ng new projectName**
   → Isso é feito para criar um novo projeto angular, Aula1, se aceitar criar as rotas, ele cria um arquivo de routes.module que deve ser configurado devidamente para o routing da sua aplicação

Enfim, como dito na sessão anterior brevemente, o **Routes** e o **RoutesModule** são duas figuras do *@angular/router* que lidam com as rotas no angular, você pode definir como parâmetro no @NgModule() que você vai usar esses modulos e exportar para toda a aplicação:

~~~ts
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes :Routes = [
	{ path: "",component: someComponent, pathMatch: 'full' },
	{ path: "otherComponent",component: otherComponent }
]

@NgModules({
	imports: [RouterModule.forRoot(routes)],
	exports: [RouterModule]
})

~~~

O router full é para ele seguir com o processamento padrão de routes em rotas raiz, dessa forma, o roteamento via front-end fica bem enxuto em casos de realizar todo o back no front-end.

Esse arquivo de rotas é criado usando o `ng new`

## - Mod 74 -:  Rota Coringa e `redirectTo`

podemos definir o path como " ** " (sem os espaços) e usar, ao invés do component, o `redirectTo: 'path'` para redirecionar para o path, entendendo que o path vai ser igual aos outros paths nos objetos, sem o / no começo

## - Mod 75 -: Navegação entre páginas  

A forma padrão e pior, usando apenas html puro, ficaria assim:
  → A do angular é melhor, desse demora muito

![](../img/Pasted%20image%2020230228223109.png)

Bom, a forma do angular possuí diversas vantagens, uma delas é poder usar rotas parametrizadas, vamos nos aprofundar disso mais a frente mas a ideia é que você usa ['path', 1] e ela sai → path/1 e o legal é que podemos depois transformar isso num array, juntar arrays, pegar os valores e etc... Além de ser muuuito mais rápido, não esquece que o routerLink tem que estar com [].

~~~html
<header>
	<h1>Testing Routes</h1>
	<ul>
			<li> <a routerLink="/" >Home</a> </li>
			<li> <a [routerLink]="['/about']" >about</a> </li>
			<li> <a routerLink="/404" >404</a> </li>
	</ul>
</header>
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570582#overview