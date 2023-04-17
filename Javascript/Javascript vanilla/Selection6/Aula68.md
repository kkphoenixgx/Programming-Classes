# Módulos 98 e 99

## Selecionando arquivos

Mod 98 -- **07/01/22**

Hahahhahahhaha essa ual é muito engraçada, era para dar erro quando eles selecionassem o item do drobbox mas não deu, então eles só passaram a aula. O que dá para tirar dessa aula?

Tem uma propriedade para HTML objects que é o HTMLObject.**toggle()** que ele serve coo se fosse um interruptor, no caso eles fizeram em um evento, mas nem sempre vamos só usar em eventos, ele toda vez que acontece algo, faz algo e se fizer de novo, só desfaz

~~~js
li.addEventListener('click', ()=>{
    li.classList.toggle('selected')
})
// toda vez que clicarem, vai colocar a classe e quando clicarem de novo, vai tirar
~~~

## Selecionando arquivos com ctrl ou shift

Mod 99 -- **07/01/22**

Existe uma propriedade em qualquer HTML chamada de **childNodes** que retorna todos os filhos do elemento em questão e outra propriedade chamada de **parentElement** que retorna o Pai do filho em questão.
