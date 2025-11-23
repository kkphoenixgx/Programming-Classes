# Arrays e Collections
2025-10-24
tags: [[IndexJs]]

// Esse arquivo faz parte de um futuro pequeno projeto de reformular essa seção de aulas em js para ficar com o formato das outras sessões 

## Métodos dos Arrays

## `.filter(callback)`

Esse callback deve conter uma expressão booleana que vai filtrar esse callback no seu corpo e uma variável que representará o item iterado do array:

```js
let result = array.filter( element => element != '1' );
```

coloca todos os elementos que são diferentes de `'1'` no resultado.

Filter espera um resultado booleano para cada item dizendo se ele entra ou não no resultado do filter. (Lembre-se da definição de uma `arrowfunction`, quando não a bloco ao lado direito, o lado direito é o que será retornado )

## `.map(callback)`

O `map()` mapeia um novo array baseado em um anterior, adicionando para cada elemento do novo array, o resultado do callback.

```js
let result = array.map(element => element + 1)
```

Para cada elemento, adicione um a esse elemento.


