# Aula24
2023-03-01
tags: [index Angular](../index%20Angular.md)

## - Mod 76 - : Active Routes

Podemos colocar uma classe css em uma rota que está ativa, o angular fornece isso de uma forma bem fácil e completa, só usar esse atributo html:

> **[routerLinkActive] = "['class']"**
> → sendo class uma classe css

Quando você usar isso, vai perceber que ele usa por padrão um padrão cascata, então quandfo você tiver em /alguma coisa, ele vai colocar a classe tanto na rota "home", a /, quanto na rota alguma coisa. Portanto, precisamos colocar uma outra propriedade:

> **[routerLinkActiveOptions]="{exact: true}"**

## - Mod 77 - : Parâmetros nas rotas

Para parametrizar as rotas, usamos :param, exemplo:

~~~ts
{ path: "about/:username/:id",component: someParameterComponent },
~~~

Perceba que ao fazer isso, perdemos a rota simples about, ela agora deve sempre passar um username e um id, exemplo: *about/kkphoenix/1*

E para podermos usar essas informações, devemos fazer uso do ActivatedRoute:

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
-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570610?start=90#questions

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570618#questions