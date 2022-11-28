# Aula2
2022-11-28
tags: [[../index Angular]]

> **ng build** ou *ng b* → Dá build nos arquivos, faz a aplicação...

## - Mod  9 - : Build

Para setar variáveis de hambiente com o build, mais especificamente, para dar deploy para um ambiente, simplesmente se usa uma flag com o nome do ambiente: ng b --nomeDoAmbiente. Contudo, não se usa variáveis de ambiente constantemente, usa-se em casos especificos, como uma alteração especifica para uma homolagação¹*. 

> O angular já compila o ts automaticamente na produção.

## - Mod  10 - : Componentes

~~~ts
// A linha abaixo Pega o Component do Angular, no npm 
import { Component } from '@angular/core'

@Componet

~~~

-----------------------------------------------

* 1 - Ambiente de Homologação
  Quer dizer que um ambiente é um ambiente de homologação significa que ele está em fase de testes e validações. Na prática é uma cópia do ambiente de produção com o objetivo de testar o software, cujo acesso está disponível apenas para os desenvolvedores e o cliente. - [bibliografia](https://www.udemy.com/course/curso-de-angular/learn/lecture/25568820#overview)

## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25568820#overview

## Mapa Mental