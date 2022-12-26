# Responsivo
2022-06-10
tags: [[../../Index DevWeb]]

## Desenvolvimento

### Módulo 47

Existe a Tag **<meta>** para podermos usar responsivos no sistema, então sem uma Tag meta com o atributo **name= 'viewport'** e especificar o viewport com o **content**. Nesse content, existe uma ótimo prefixo de valor, que é o **'width: device-width'** que seta automaticamente ao tamanho do dispositivo. Dentro dessa Tag, podemos usar uma vírgula para separar a propriedade width e colocar outras propriedades, como a **inicial-scape = x**, sendo x um number, bem comum o 1. Assim como o initial-scape, existe o **user-scalable=no** que é para o usuário não poder dar zoom na tela com os dedos.

~~~html
<meta name="viewport" content="width=device-wuto, initial-scape=1"></meta>
~~~

### Módulo 48

Aparentemente, usa-se outro arquivo para o responsivo, o que melhora a organização do código, mas ele deve sobrescrever o arquivo style normal, portanto, deve ser chamado em baixo dos arquivo style normal. 

Para definirmos o que fazer para cada tipo de tela, usamos o **@media** como seletor css e esse seletor aceita mais seletores wue vão funilando os dispositivos que vão se encaixar no parâmetro. O **@media only** por exemplo, obviamente diz somente, então somente o que? O próximo seletor: que pode ser **screen**, a tela, **and**, e, (css). Portanto usamos essa @media para ir afunilando os dispositivos. 

~~~css
@media only screen and (max-width: 760px)
~~~

> presta atenção que tem que dar espaço depois do end

Como percebemos, saber a quantidade de pixels para cada dispositivo, em média, é de extrema importância para conseguirmos lidar com o responsivo. No exemplo acima, para o responsivo, foi utilizado **760px**, que é o tamanho de um *Tablet*


| dispositivo | tamanho - max-width |
| ----------- | ------------------- |
| tablet      | 720px               |
| celular     | 480px               |


~~~css
/* Smartphones (portrait) */
@media only screen and (max-width: 320px) and (max-device-width: 767px) { /* Styles */ } 
/* iPads (portrait and landscape) */
@media only screen and (min-device-width: 768px) and (max-device-width: 1024px) { /* Styles */ }
/* Desktops and laptops */
@media only screen and (min-width: 1224px) { /* Styles */ }
~~~

-----------------------------------------------
## Bibliografia

Módulo 48




