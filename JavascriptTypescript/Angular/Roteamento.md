# Roteamento
2025-11-23
tags: [[index Angular]]
 
## Entendendo arquivo de rotas
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 12/Aula23.md ]
 
> **ng new projectName**
   → Isso é feito para criar um novo projeto angular, Aula1, se aceitar criar as rotas, ele cria um arquivo de routes.module que deve ser configurado devidamente para o routing da sua aplicação
 
Enfim, como dito na seção anterior brevemente, o **Routes** e o **RoutesModule** são duas figuras do *@angular/router* que lidam com as rotas no angular, você pode definir como parâmetro no @NgModule() que você vai usar esses modulos e exportar para toda a aplicação:
 
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
 
## Rota Coringa e `redirectTo`
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 12/Aula23.md ]
 
podemos definir o path como " ** " (sem os espaços) e usar, ao invés do component, o `redirectTo: 'path'` para redirecionar para o path, entendendo que o path vai ser igual aos outros paths nos objetos, sem o / no começo
 
## Navegação entre páginas
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 12/Aula23.md ]
 
A forma padrão, e pior, usando apenas html puro, ficaria assim:
  → A do angular é melhor, desse demora muito
 
!
 
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
 
## Active Routes
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 12/Aula24.md ]
 
Podemos colocar uma classe css em uma rota que está ativa, o angular fornece isso de uma forma bem fácil e completa, só usar esse atributo html:
 
> **[routerLinkActive] = "['class']"**
> → sendo class uma classe css
 
Quando você usar isso, vai perceber que ele usa por padrão um padrão cascata, então quando você tiver em /alguma coisa, ele vai colocar a classe tanto na rota "home", a /, quanto na rota alguma coisa. Portanto, precisamos colocar uma outra propriedade:
 
> **[routerLinkActiveOptions]="{exact: true}"**
 
## Parâmetros nas rotas
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 12/Aula24.md ]
 
Para parametrizar as rotas, usamos `:param`, exemplo:
 
~~~ts
{ path: "about/:username/:id",component: someParameterComponent },
~~~
 
Perceba que ao fazer isso, perdemos a rota simples about, ela agora deve sempre passar um username e um id, exemplo: *about/kkphoenix/1*
 
E para podermos usar essas informações, devemos fazer uso do `ActivatedRoute`:
 
~~~ts
import { ActivatedRoute } from '@angular/router' 
 
class someParameterComponent implements OnInit{
	constructor(
		private activatedRoute :ActivatedRoute
	){}
 
	ngOnInit() :void{
	
		this.activatedRout.params.subscribe(
			res => { console.log( {res.username, res.id} ) }
		)
	}
 
}
~~~
 
Além disso, para podermos pegar os parametros colocados depois do ?, que são os queryParams, devemos fazer:
 
~~~ts
this.activatedRout.queryParams.subscribe(
	res => { console.log( res ) }
)
~~~
 
## Redirecionamento com ts
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 12/Aula25.md ]
 
Temos como redirecionar pelo controller também, basta usarmos o objeto `Router`:
 
~~~ts 
import {Router} from "@angular-core/router"
 
class someComponent implements OnInit{
 
	/* 
		Isso vai navegar para somePage, 
		é igual as rotas por routeLink
  */
	private navigateTo :Array<string> = ['somePage'] 
	
	constructor( private router :Router ){}
 
	ngOnInit() :void{
 
		setInterval( ()=>{ 
			// Rapido:
			this.router.navigate(this.navigateTo);
 
			// NavigateByUrl faz reload da tela:
			// this.router.navigateByUrl(this.navigateTo)
			
		}, 5000 )
	
	}
 
}
~~~
 
## Rotas filhas
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 12/Aula25.md ]
 
Para criamos rotas filhas, vamos ir lá no routing.module para adicionar, no nosso objeto da rota pai, um atributo chamado children: [], que recebe um array de objetos, objetos que são também objetos de rota:
 
~~~ts
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
 
const routes :Routes = [
	{ path: "",component: someComponent, pathMatch: 'full' },
	{ path: "otherComponent",component: otherComponent, 
		children:[
			{path: ':username/:id', component: otherComponent}
		] 
	}
]
 
@NgModules({
	imports: [RouterModule.forRoot(routes)],
	exports: [RouterModule]
})
 
~~~
 
Observe que colocamos o mesmo componente, o otherComponent para essa rota pai, contudo, poderíamos colocar outro componente... Além disso, não colocamos o primeiro path, vamos navegar para: *otherComponent/:username/:id* mas não colocamos o path do pai pois ele já será adicionado
Além disso, sobre o active routes que fizemos na aula anterior, a rota pai ficará ativa
 
## Lazy Loading
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 12/Aula25.md ]
 
Lazy loading é um **carregamento de módulos**, você carrega somente o módulo que o usuário está entrando, para isso, obviamente precisamos criar um módulo e o component do módulo, contudo, isso torna tudo muito mais simples:
 
> **ng g m path**
> **ng g c path**
 
Interessante dizer que se você coloca a linha de export de componente, ele vai ter que carregar a exportação também, então se você acha que não vai usar essa funcionalidade, você retira a linha, é uma ótima sacada para ter em mente.
 
E vamos aos conceitos, na rota root, usamos o forRoot para carregar as rotas:
!
 
No caso de uma rota filha, **você usa `forChild(routes)` no lugar do `forRoot(routes)` no componente filho**. Além disso, no componente pai, devemos importar, literalmente, o módulo:
 
~~~ts
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
 
const routes :Routes = [
	{ path: "",component: someComponent, pathMatch: 'full' },
	{ 
		path: "otherComponent",
		loadChildren: () => import('./pages/pages.module').then( 
			pages => pages.PagesModule;
		)
	}
]
 
@NgModules({
	imports: [RouterModule.forRoot(routes)],
	exports: [RouterModule]
})
~~~
 
Lembre-se que o RoutingModule do próprio modulo filho deve estar importado  nas configurações desse módulo filho:
 
!
 
## Estratégia com useHash
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 12/Aula25.md ]
 
Essa aula é só para mostrar em aberto mesmo uma função do angular que se você quiser se aprofundar, você pode, tem como criar aquelas rotas antigas com # também no angular, é só colocar { useHash: true } na chamada de forRoot, como parâmetro:
 
!
 
**E aí a rota vai ficar:  localhost:4200/#/**