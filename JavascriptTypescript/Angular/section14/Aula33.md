# Aula 33
2023-05-24
tags: [index Angular](../index%20Angular.md)

## - Mod 109 - : Testando a unidade nos ifs do componente

U -> Under Test;  
I -> Interface's test

Sempre cubra todos os testes, muito bom.

## - Mod 110 - : Testando a interface do componente

~~~ts
fixure.debugeElement.nativeElement.querySelector('cssSelector')
~~~

Isso permite você ter um elemento. Contudo, quando você definir elementos, executar funções, todos os estados dos objetos não você ser atualizados como quer. Dessa forma, você deve detectar mudanças com `fixture.detectChanges` 

![](../img/Pasted%20image%2020230524164854.png)

## Dos testes de interface


Continua sendo 

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/28241290?start=75#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/28241296#overview