# Guards
2025-11-23
tags: [[index Angular]]
 
## Introdução aos Guards
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula39.md ]
 
Um guard de rota no Angular serve para só deixar acessar um caminho caso o usuário tenha completado algum passo prévio... Um bom exemplo é as caixas de diálogo antes de ir para outra rota se precisar salvar alguma coisa.  
Destarte, temos alguns tipos de guards:
 
![](Pasted%20image%2020230711091325.png)
 
Para criar um guard usamos:
> **ng g guard path**
 
As guards geralmente são localizadas em uma **pasta chamada core** que organiza e arquiteta os guards numa "arquitetura de pastas". Contudo, não é sempre que é assim, depende da arquitetura e da organização...
 
## `CanActivate`
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula39.md ]
 
Uma guard `canActivate` é basicamente uma guard que implementa `CanActivate` e possui o método `canActivate`, esse método permite a mudança para a rota que vai usar o `canActivate` caso a mesma retorne true, ao retornar false, o guarda impede a passagem do usuário. Dê uma olhada na estrutura:
 
!
 
Olhe esse trecho "melhor" identado:
!
 
Temos o `canActivate` que possui dois parâmetros principais, a route e o state do próprio guard, e dentro do método temos as regras de negócio.  
Já no arquivo de rotas, para a implementação da guard na route, vamos adicionar a propriedade referente a interface implementada pela guard definindo a própria guard:
 
!
 
Desse modo, temos que, se não conseguirmos voltar para a rota account (com o guard barrando), iremos de volta para o `HomeComponent`. Na mesma linha, podemos retornar no nosso `canActivate` um redirecionamento para outro component, vamos ver isso em outros módulos
 
### Por referência, dos códigos
 
No arquivo das rotas:
~~~ts
const routes :Routes = [
	{
		path: 'pathName',
		component: ComponentName,
		canActivate: [GuardClassName]
	},
]
~~~
 
No arquivo da guard:
~~~ts
export class GuardClassName implements CanActivate{
	canActivate(
		route: ActivatedRouteSnapshot,
		state: RouteStateSnapshot
	):
		| Observable< boolean|UrlTree > 
		| Promise< boolean|UrlTree >
		| boolean
		| UrlTree
	{
		// Business Rules
		return true;
	}
}
~~~
 
## `CanActivate` 2
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula40.md ]
 
Agora vamos usar a nossa guard, para isso, utilizaremos uma tag a com um `routerLink` da  aula 23, e um `queryParams`, que define parâmetros para serem resgatados pela URL,
 
~~~html
<a [routerLink]="pathName" 
	 [queryParams]={
			{
				 account: "accountType", 
				 password: "somePassword"
			}
	 }
></a>
~~~
 
Use o exemplo da aula anterior para entender os parâmetros `state` e `route` , e então assim, entender o resgate, veja o retorno de `route` de um exemplo a parte:
 
!
 
Podemos pegar em `route.params` seus valores passados pelo `queryParams` e usa-los em nossos guards para fazermos validações.
 
!
 
## `CanDeactivate`
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula40.md ]
 
O `canDeactivate` verifica antes de fechar a aba, ou antes de fechar o navegador, se algum procedimento foi concluído, como ter salvado um arquivo, o modo de implementação é bem parecido para essas guards:
 
!
 
Onde tinha um unknown, troca-se pelo componente que terá a guard... Mesma coisa, se retorna true, sai da página, e você pode implementar métodos na sua classe original...
 
!
 
## `CanDeactivate` 2
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula41.md ]
 
Assim como o `CanActivate`, o `canDeactivate` também tem seus parâmetros para serem usados, bem úteis, veja:
!
 
`currentRoute`:
!
 
`currentState`:
!
 
`nextState`:
!
 
## `CanLoad`
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula41.md ]
 
No meu entendimento, ele é um guarda de módulos lazy loading, dessa forma, só será preciso carregar a página quando a guard permitir, de modo que o site fique mais leve, **só vai carregar o módulo lazy load quando a guard deixar**.
 
> `ng g module moduleName` **--routing**
 
O `--routing`  já cria a rota a partir do módulo, como uma rota filha, nisso você só precisa adicionar ao componente root sua criancinha: (No exemplo do curso, criamos um módulo dentro da pasta core para encapsular o componente que o  `canLoad` vai ser o guarda e outro componente que vai ser usado também, contudo, por indexação de pontos principais, referencia-se apenas o primeiro como um modelo)
!
 
Ao criar o `canLoad` usando o `ng g guard`, esta é sua configuração:
!
 
Bem parecida mesmo a estrutura, contudo, não tem aqueles snapshots, não se usa esses retornos no `canLoad`.
 
## `CanLoad` 2
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula41.md ]
 
O log do `route`:
!
 
O log do `UrlSegment`:
!
 
O mais interessante sem sombra de dúvidas é o `UrlSegment`, que retorna os caminhos fragmentados em um array.
 
O **`canLoad` só faz a validação uma vez, uma vez carregado o módulo, carregado estará** 
 
Então vamos criar uma lógica nisso bem legal:
!
 
Dessa forma, o só será possível carregar 'leads' quando a rota já tiver algo atrás dele... Então leads só será carregado bem depois.
 
## `CanActivateChild`
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula41.md ]
 
O `canActivateChild` segue a mesma lógica do `canActivate`, contudo, ele serve para rotas filhas, veja o exemplo:
 
!
 
Ele tem a estrutura bem parecida com o `canLoad` e de fato deve ser sempre usado com o `canLoad` já que o Lazy Load só faz sentido se usarmos ele numa rota filha
*   `CanActivate`
*   `CanActivateChild`
*   `CanDeactivate`
*   `CanLoad`

Para criar um guard usamos:
> **ng g guard path**

As guards geralmente são localizadas em uma **pasta chamada core** que organiza e arquiteta os guards numa "arquitetura de pastas". Contudo, não é sempre que é assim, depende da arquitetura e da organização...

## `CanActivate`
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula39.md ]

Um guard `canActivate` é basicamente um guard que implementa `CanActivate` e possuí o método `canActivate`, esse método permite a mudança para a rota que vai usar o `canActivate` caso a mesma retorne true, ao retornar false, o guarda impede a passagem do usuário.

No arquivo das rotas:
~~~ts
const routes :Routes = [
	{
		path: 'pathName',
		component: ComponentName,
		canActivate: [GuardClassName]
	},
]
~~~

No arquivo do guard:
~~~ts
export class GuardClassName implements CanActivate{
	canActivate(
		route: ActivatedRouteSnapshot,
		state: RouteStateSnapshot
	):
		| Observable< boolean|UrlTree > 
		| Promise< boolean|UrlTree >
		| boolean
		| UrlTree
	{
		// Business Rules
		return true;
	}
}
~~~

## `CanActivate` 2
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula40.md ]

Agora vamos usar o nosso guard, para isso, utilizaremos uma tag `a` com um `routerLink` e um `queryParams`, que define parâmetros para serem resgatados pela URL.

~~~html
<a [routerLink]="pathName" 
	 [queryParams]="{ account: 'accountType', password: 'somePassword' }"
></a>
~~~

Podemos pegar em `route.params` seus valores passados pelo `queryParams` e usá-los em nossos guards para fazermos validações.

## `CanDeactivate`
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula40.md ]

O `canDeactivate` verifica antes de fechar a aba, ou antes de fechar o navegador, se algum procedimento foi concluído, como ter salvado um arquivo. Onde tinha um `unknown`, troca-se pelo componente que terá a guard. Mesma coisa, se retorna true, sai da página.

## `CanDeactivate` 2
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula41.md ]

Assim como o `CanActivate`, o `canDeactivate` também tem seus parâmetros para serem usados: `currentRoute`, `currentState` e `nextState`.

## `CanLoad`
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula41.md ]

No Angular, o `canLoad` é uma guarda de rota que é usada para controlar o carregamento de módulos de roteamento assincronamente. Ele é usado em conjunto com o `Route` e o `RouterModule` para proteger o carregamento de módulos com base em certas condições.

Ao usar o `canLoad`, você pode implementar regras de autenticação, autorização ou qualquer outra lógica personalizada para decidir se um módulo específico deve ser carregado.

No meu entendimento, ele é um guarda de módulos lazy loading, dessa forma, só será preciso carregar a página quando a guard permitir, de modo que o site fique mais leve, **só vai carregar o módulo lazy load quando a guard deixar**.

> `ng g module moduleName` **--routing**

O `--routing` já cria a rota a partir do módulo, como uma rota filha.

Ao criar o `canLoad` usando o `ng g guard`, esta é sua configuração:

~~~ts
export class AuthGuard implements CanLoad {
  canLoad(
    route: Route,
    segments: UrlSegment[]): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    return true;
  }
}
~~~

## `CanLoad` 2
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula41.md ]

O `UrlSegment` retorna os caminhos fragmentados em um array.

O **`canLoad` só faz a validação uma vez, uma vez carregado o módulo, carregado estará**.

## `CanActivateChild`
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section15/Aula41.md ]

O `canActivateChild` segue a mesma lógica do `canActivate`, contudo, ele serve para rotas filhas. Ele tem a estrutura bem parecida com o `canLoad` e de fato deve ser sempre usado com o `canLoad` já que o Lazy Load só faz sentido se usarmos ele numa rota filha.