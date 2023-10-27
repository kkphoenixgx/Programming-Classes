# Dicionário css e HTML
[ReadMe](../ReadMe.md)

## HTML5

### TAGS HTML5

* **a** = pode definir que algo é clicável

  ~~~html
  <a src="link"> <h1>Texto altamente clicável</h1> </a>
  ~~~

  * *src* = define o link
* **Body** = Cria o corpo da página.

  ~~~html
  <body></body>
  ~~~

  .
* **footer** = define o rodapé da página, ótimo para organização.

~~~html
<footer></footer>
~~~

* **head** = cria o cabeçalho da página onde podemos definir os scripts.

  ~~~html
  <header></header>
  ~~~

  .
* **h** = Pode definir um texto na tela, geralmente usado para títulos

  ~~~html
  <h1>Título</h1>
  <h2>Subtítulo</h2>
  <h3>Subtítulo do Subtítulo</h3>
  <h4> Subtítulo do Subtítulo do Subtítulo</h4>
  <h5>Subtítulo do Subtítulo do Subtítulo do Subtítulo</h5>
  <h6>Subtítulo do Subtítulo do Subtítulo do Subtítulo do subtítulo</h6>
  ~~~

  .
* **img** = define uma imagem

  ~~~html
  <img alt="" src=""></img>
  ~~~

  * **src** = define a imagem
  * **alt** = define a descrição de uma imagem
* **link** = direciona para um script frontend, como um css

  ~~~html
  <link></link>
  ~~~

  * *rel ="stylesheet"* = Define que este é o elemento de estilo
  * *href* = define o script.
* **script** = pode criar um espaço para definirmos scripts em js, php...

  ~~~html
  <script></script>
  ~~~

  * *src* = define o script
* **section** = define uma seção da página, o conteúdo principal da página, bom para organização.

  ~~~html
  <section></section>
  ~~~

  .
* **Video** = Cria um espaço onde podemos rodar uma mídia
  
  ~~~html
  <Video></Video>
  ~~~

  * *src* = Define a mídia
  * *autoplay* = faz ele rodar sozinho a media
  * *poster* = define para o uma tag html a imagem que vai ficar como standard, a thumbnail, ela recebe o path do arquivo.
* **audio** = define um player básico para áudios

  ~~~html
  <audio ></audio
  ~~~

  * *src* = define o áudio
  * *autoplay* = faz ele rodar sozinho a media
  * *controls* = define que essa tag vai ter controles básicos.

A mano, preguiça, você já sabe

## CSS

### atributos css

* **none** : nenhum valor específico.
* **length**: qualquer unidade de medida.
* **unset**: desliga;
* **initial**: voltar ao valor inicial.
* **inherit**: herdar do pai.

* **max-content**:
* **min-content**:

* **top**: length;
* **right**: length;
* **bottom**: length;
* **left**: length;

nomes dos espaçamentos dos box-model em ordem(Margin, border, padding, content)

* **fit-content(length)**:

### Propriedades css

* **z-index: number** = (padrão: none)(Valor herdado: não) Pode setar a profundidade de um item

* **height: values** =  
*(padrão auto) (Valor Herdado: não)*
  * **values** =  
    auto;  
    length;  
    initial;  
    inherit;

* **min-height: values** = define valores mínimos  
  *(padrão auto) (Valor Herdado: não)*  
  * **values**:  
    auto;  
    length;  
    initial;  
    inherit;

* **coordinate: valores de box-Model** = determina as posições do selecionado  
*(Valor herdado: não) (não)*

* **Position: values** = Determina qual o tipo de posição determinada pelas coordenadas  
*(sticky)(não)*
  * **values** =  
    **sticky** = determina que a posição é fixada  
    **absolute** = determina que a posição é absoluta a qualquer ordem  
    **relative** = determina que a posição é relativa ao pai}  

### Seletores Css

#### Referencias

* **x** = elemento
  1x, 2x = outro elemento
  x¹ =  elemento filho do x
  x² = elemento filho de x¹
  ...
* **y** = atributo
  1y, 2y = outro atributo
* **z** = valor

#### Seletores

* **.** = para classes;

* **""*""** seleciona todos os itens do arquivo;

* **=** adiciona outro selecionado

* **"">""** = (x > x¹) seleciona todos os x¹ que o pai é x;

* **+** = (x + y)seleciona todos os y depois do x;

* **~** = (x ~ y)todos os x antes do y;;

* **[]** = ([y])seleciona todos os elementos com y target;

* **[x=z]** = seleciona todos os x que são = z;

* **[x~=z]** = seleciona todos os x que contém z;

* **[x|=y]** = seleciona todos os x que contém algo que começa com z;

* **Identificadores**: # Id (Sem espaço)

se quiser ver mais que isso, vai [nesse site](https://tableless.com.br/referencia-seletores-css/)


### Responsivo

~~~css
/* Smartphones (portrait) */
@media only screen and (max-width: 320px) and (max-device-width: 767px) { /* Styles */ } 
/* iPads (portrait and landscape) */
@media only screen and (min-device-width: 768px) and (max-device-width: 1024px) { /* Styles */ }
/* Desktops and laptops */
@media only screen and (min-width: 1224px) { /* Styles */ }
~~~