# Aula28
2023-03-17
tags: [index Angular](index%20Angular.md)

## - Mod 8, 9 e recaptulações - :

Uma coisa que eu percebi nesses módulos, é que está sendo introduzido conceitos de rxjs (biblioteca do Angular) ná prática, portanto, vou ir listando nas aulas funções importadas e usadas até agora que precisam ser destrinchadas para eu entender melhor, quando precisar citar isso, a flag ( 🏴‍☠→rxjs { content } ) vai ser usada

Primeiro, o RxJs é uma biblioteca para lidar com programação assíncrona (async) usando observadores (observables). Dessa forma, ele vai lidar com esses fluxos de dados de forma mais organizada usando seus métodos:

* **pipe( fn)** = O pipe serve como se fosse um cano de fluxo de dados... Ele transmite para algum lugar assim que algo async for executado
* **tap()** = executa algo.
![Pasted image 20230317093313](Pasted%20image%2020230317093313.png)
* **map()** = é um map, só que feito para ser usado async
![](Pasted%20image%2020230317093823.png)

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/27806738#questions