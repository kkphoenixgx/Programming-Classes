# Aula 39
2023-07-11
tags: [index Angular](../index%20Angular.md)

## - Mod 120, 121 - : Introdução aos Guards

Um guard de rota no Angular serve para só deixar acessar um caminho caso o usuário tenha completado algum passo prévio... Um bom exemplo é as caixas de diálogo antes de ir para outra rota se precisar salvar alguma coisa.  
Destarte, temos alguns tipos de guards:

![](../../../Pasted%20image%2020230711091325.png)

Para criar u guard usamos:
> **ng g guard path**

As guards geralmente são localizadas em uma **pasta chamada core** que organiza e arquiteta os guards numa "arquitetura de pastas". Contudo, não é sempre que é assim, depende da arquitetura e da organização...

## - Mod 122 - : `CanActivate`

Uma guard `canActivate` é basicamente uma guard que implementa `CanActivate` e possuí o método `canActivate`, esse método permite a mudança para a rota que vai usar o `canActivate` caso a mesma retorne true, ao retornar false, o guarda impede a passagem do usuário. Dê uma olhada na estrutura:

![](../../../Pasted%20image%2020230711092849.png)



-----------------------------------------------
## Bibliografia

https://github.com/troquatte/curso-angular.  
https://www.udemy.com/course/curso-de-angular/learn/lecture/30852430#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/30852504#overview