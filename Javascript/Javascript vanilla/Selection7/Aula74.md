# Aula74
2022-12-02
tags: [[../IndexJs]]

## - Mod  113 - : Generating variables by id

Esse simples método de uma linha transforma textos em padrão camelCase, então se você der o data.id como texto e atribuir esse valor como um atributo json, ele vira "uma variável"

~~~js
text.replace(/-(\w)/g, (m, p1) => p1.toUpperCase())
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/javascript-curso-completo/learn/lecture/10507702#questions/9176020

## Mapa Mental