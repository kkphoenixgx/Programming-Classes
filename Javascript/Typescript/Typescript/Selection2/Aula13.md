# Aula13
2022-09-28 
tags: [[../Index of typescript]]

## Mod 26 - type assertions

Isso aqui é simplesmente INCRIDIBLE, ok? SINTA O PODER... Você pode falar para a máquina que ela tá errada, exemplo:

~~~ts
const site :unknown = "https//site.com"
let sitesFavoritos :string[] = []

// error: sitesFavoritos.push( (site as string) )

// isso agora não será um erro
sitesFavoritos.push( (site as string) )
sitesFavoritos.push( (<string>site) )
~~~

Existe essa primeira forma de escrever justamente por causa do react, pois essa segunda se parece muito com jsx.

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24632162#overview
