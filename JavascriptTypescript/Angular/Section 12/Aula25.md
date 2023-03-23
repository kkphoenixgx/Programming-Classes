# Aula25
2023-03-02
tags: [index Angular](../index%20Angular.md)

## - Mod 78 - : Redirecionamento com ts

Temos como redirecionar pelo controller também, basta usarmos o objeto Router:

~~~ts 
import {Router} from "@angular-core/router"

class someComponent implements OnInit{

	/* 
		Isso vai navegar para somePage, 
		é igual as rotas por routeLink
  */
	private navigateTo :Array<string> = ['somePage'] 
	
	constructor(
		private router :Router
	){}

	ngOnInit() :void{

		setTimeInterval( ()=>{ 
			
			// Rapido:
			this.router.navigate(this.navigateTo);

			// NavigateByUrl faz reload da tela:
			this.router.navigateByUrl(this.navigateTo)
			
		}, 5000 )
	
	}

}
~~~

## - Mod 79 - : Rotas filhas

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

-----------------------------------------------
## - Mod 80 - : Lazy Loading

Lazy loading é um **carregamento de módulos**, você carrega somente o módulo que o usuário está entrando, para isso, obviamente precisamos criar um módulo e o component do módulo, contudo, isso torna tudo muito mais simples:

> **ng g m path**
> **ng g c path**

Interessante dizer que se você coloca a linha de export de componente, ele vai ter que carregar a exportação também, então se você acha que não vai usar essa funcionalidade, você retira a linha, é uma ótima sacada para ter em mente.

E vamos aos conceitos, na rota root, usamos o forRoot para carregar as rotas:
![](../img/Pasted%20image%2020230302111725.png)

No caso de uma rota filha, você usa forChild(routes) no componente filho. Além disso, no componente pai, devemos importar, literalmente, o módulo:

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

![](../img/Pasted%20image%2020230302113705.png)

## - Mod 81 - : Estratégia com useHash

Essa aula é só para mostrar em aberto mesmo uma função do angular que se você quiser se aprofundar, você pode, tem como criar aquelas rotas antigas com # também no angular, é só colocar { useHash: true } na chamada de forRoot, como parâmetro:

![](../img/Pasted%20image%2020230302115011.png)

**E aí a rota vai ficar:  localhost:4200/#/**

## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570618?start=0#questions

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570630#questions

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570638#questions

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570638#questions