# Aula2
2022-11-28
tags: [[../index Angular]]

> **ng build** ou *ng b* → Dá build nos arquivos, faz a aplicação...

## - Mod  9 - : Build

Para setar variáveis de hambiente com o build, mais especificamente, para dar deploy para um ambiente, simplesmente se usa uma flag com o nome do ambiente: ng b --nomeDoAmbiente. Contudo, não se usa variáveis de ambiente constantemente, usa-se em casos especificos, como uma alteração especifica para uma homolagação¹*. 

> O angular já compila o ts automaticamente na produção.

## - Mod  10 - : Componentes

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

~~~ts
//Arquivo: app.component.html
// Esse arquivo é o html que vai dentro da div root

// deixa só isso nesse arquivo, essa div analiza as rotas
<router-outlet></router-outlet>

/*
 Pelo interpolation "{ {x} }", sendo x uma variável
 podemos recuperar dados do app.component.ts
*/
<h1>{ {title} }</h1>

~~~

No angular, podemos criar componentes ou outros via **ng generate x** sendo x o que você quer gerar; Exemplo ng generate component ou **ng g c componentName** sendo componentName também o nome da pasta do componente, me lembra um pouco os packages do java

--22/12/05--
Ao gerar um componente novo, persebe-se um método importado do angular que usa o **ngOnInit()**, que faz parte do ciclo de vida do angular, me lembra os lifecycle methods do react, ele executa algo assim que o componente é montado. 

-----------------------------------------------

* 1 - Ambiente de Homologação
  Quer dizer que um ambiente é um ambiente de homologação significa que ele está em fase de testes e validações. Na prática é uma cópia do ambiente de produção com o objetivo de testar o software, cujo acesso está disponível apenas para os desenvolvedores e o cliente. - [bibliografia](https://www.udemy.com/course/curso-de-angular/learn/lecture/25568820#overview)

## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25568820#overview

## Mapa Mental