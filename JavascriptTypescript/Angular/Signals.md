# Angular Signals
2024-08-19
tags: [[index Angular]]
 
## O que são Signals
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/Signals.md ]
 
Bem simples, se você marcar como um signal um atributo, quando ele mudar vai ser igual um state no react, só que melhor, pois só vai atualizar as coisas relacionadas a variável.
 
 ```ts
 someAtribute = signal("string value");
 ```
 
 ```html
 <p>Hello,here is the signal: {{someAtribute()}}<p>
 ```