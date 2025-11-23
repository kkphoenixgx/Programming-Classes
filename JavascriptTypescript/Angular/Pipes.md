# Pipes
2025-11-23
tags: [[index Angular]]

## transformando dados com pipe
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 5/Aula11.md ]

O pipe basicamente ajuda a modificar valores do código, é um recurso dentro do angular muito útil...

~~~html
<li *ngFor = "let item of list" >{{item | uppercase}}</li>
~~~

isso transforma o valor em uppercase, simplesmente incrível... Quer ver algo mais incrível ainda?

~~~ts
public date :Date = new Date
~~~
~~~html
{{ date | date: 'dd/MM/yyyy' }}
~~~

Isso retorna a data de hoje no formato certo... Simplesmente incrível...

O que ele faz é basicamente chamar um método chamado transform() e usar como parâmetro o que vêm depois do pipe.