---------------------------------------------------------------------------------------------
Estudando a fundo 1.                                                                      28/05/21
[index](DevWeb/index.md)

Eu vou tentar responder algumas perguntas que eu tenho que 
eu não sei se foram respondidas no curso, uma ou várias 
perguntas sobre html.

atributos em html são atributos de tag.



                                                      Atributos

Os atributos são usados para personalizar as tags, modificando
 sua estrutura ou funcionalidade. Igualmente, os atributos são
 utilizados para atribuir uma classe ou id a um elemento.

A maioria das tags tem seus próprios atributos. Contudo, existem
 alguns atributos genéricos que podem ser utilizados na maioria 
das tags HTML, vamos estudá-los:


-      class = "x“ – Atribui uma classe ao elemento (uma classe
 pode ser utilizada para um ou mais elementos);

-      id="x“– Atribui um id ao elemento (um id deve ser único,
ou seja atribuído a um único elemento);

-      style=”x” – Permite incluir elementos CSS (estilos) dentro
 da tag;

-     lang=”x” – Define o idioma principal do elemento;

-     title=”x” – Define o título do elemento;

-     alt=”x” – Define um texto alternativo e, por isso, é muito 
utilizado em imagens, auxilia nas práticas de SEO;

-     hidden – Oculta o elemento;

-     align=”x” – Permite definir o padrão de alinhamento 
desse elemento, como por exemplo: right, center, left e justify;

-     width=”x” – Define uma largura para o elemento;

-     height=”x” – Define uma altura para o elemento.

      Esses são os principais atributos, porém existem diversos 
outros que devem ser estudados e podem ser utilizados no seu
 código, porém alguns são utilizados em lugares especificos.




                                               Tags principais

<html></html> – Esta tag é o elemento básico da estrutura do 
HTML. Assim sendo, ela conterá todos os elementos do seu 
documento. Todo documento HTML deve iniciar e finalizar com 
essa tag;

<head></head> – Essa tag delimita o cabeçalho do documento. 
Não possui nenhum valor visível, porém é capaz de transmitir ao 
navegador diversas informações muito úteis e essenciais a uma 
boa apresentação do seu documento HTML;

<title></title> – Essa tag define o título da sua página, o nome
 que aparecerá na sua aba, janela ou guia. Por esta razão, a tag 
>title> é de grande importância para o SEO;

<meta><meta/> – Essa tag permite inserir metadados ao seu documento,
no caso acima, a informação charset=”UTF-8″, que garante a
compatibilidade do código com os caracteres de padrão latino
americano;

<body></body> – Finalmente, a tag que representa o corpo do
 documento. Em síntese, é nessa tag que todos os elementos 
visíveis do seu site devem ser inseridos.




                                             Tags estruturais

Tags HTML estruturais
As tags abaixo são utilizadas nos documentos em HTML5, e têm
 função estrutural no seu código. Portanto, essas tags têm grande 
importância na questão semântica da sua página, saber utilizá-las 
pode adequar o seu código para uma melhor visualização por parte
 do navegador e do usuário, além de proporcionar uma otimização 
para os processos de SEO.

<header></header> – Essas tags definem um cabeçalho. Portanto, 
todo conteúdo que estiver dentro dela faz parte de um cabeçalho, 
podendo ser utilizado dentro de outras sessões. Não confundir 
com as tags <head>;

<main></main> – Essas tags representam o conteúdo principal 
do seu corpo, ou seja, o conteúdo relacionado diretamente com o
 tópico central da página ou com a funcionalidade central da 
aplicação;

<footer></footer> – Essas tags definem um rodapé para a página, 
geralmente utilizadas no final da página;

<section></section> – Essas tags definem uma sessão para sua 
página, ou seja, onde vai haver um formulário de interação; 

<article></article> – Essas tags definem um artigo da sua página. 
Nesse sentido, são utilizadas para separar o conteúdo da sua 
página. Muito utilizado principalmente por blogs ou páginas de 
conteúdo;

<aside></aside> – Essas tags representam uma seção de uma 
página cujo conteúdo é tangencialmente relacionado ao conteúdo
do seu entorno, que poderia ser considerado separado do 
conteúdo;

<nav></nav> – Essa tag define um conteúdo de navegação. 
Portanto, é muito utilizado em conjunto com listas e na criação 
de menus;

<div></div> – Define uma divisão da página. Desta forma,
 funciona como um container para conteúdo de fluxo. Uma vez 
que não possui um valor semântico, é muito utilizado para 
organizar melhor o conteúdo. Anteriormente ao HTML5, era 
utilizado no lugar das categorias acima.




                                       Tags HTML de título

As tags de título possuem valor semântico, variando entre seis 
níveis hierárquicos. Para fins de otimização SEO é importante 
entender como funcionam, e fazer uma utilização adequada. 
Para definir títulos, utilizamos as tags:

<h1></h1> - Título de maior valor hierárquico
<h2></h2>
<h3></h3>
<h4></h4>
<h5></h5>
<h6></h6> - Título de menor valor hierárquico

Conforme dito anteriormente, a distribuição de título interferem 
no otimização do SEO de uma página.  Com isso, uma página
 contendo apenas h1 não seria bem vista pelos mecanismos de 
busca. Portanto, é importante dividir os títulos deixando o h1 
apenas para o título principal, h2 ou h3 para títulos das seções e 
h4 a h6 para subtítulos ou títulos que possuam baixo valor 
hierárquico em relação aos demais.

                                             Tags HTML de texto

As tags de texto definem textos, estilos de fonte, parágrafos, 
spans, quebras de linhas, etc. Vamos conhecê-las:

<p></p> – Principal tag de texto, compõe um parágrafo;

<span></span> – Apesar de ter uma funcionalidade e 
características parecidas com os parágrafos, costumam ser 
utilizadas apenas para pequenas informações, como legendas de
 um formulário, legendas de uma imagem, etc. Também pode ser 
utilizada para formar um container;

<pre></pre> – Tag utilizada para representar texto pré-formatado. 
Muito utilizada para inserir códigos;

<b></b> – Transforma o conteúdo em negrito;

<i></i> – Transforma o conteúdo em itálico;

<br/> – Essa tag não necessita de fechamento, ela executa a 
função de quebra de linha.

<hr/> – Essa tag não necessita de fechamento, ela forma uma linha
 horizontal.




                                        Tags HTML de multimídia

As tags de multimídia servem para incluir imagens, vídeos, áudios,
 iframes e outros tipos de conteúdo multimídia.

<img>
Essa tag não necessita de fechamento, serve para incluir uma 
imagem ao seu texto. A partir dessa tag, utilizamos o atributo src=””
 onde deve ser digitado o local em que a imagem se encontra. 
Também é muito utilizado em conjunto com o atributo alt para 
definir o texto alternativo da imagem.

Por exemplo:

<img src="imagens/imagem1.jpg" alt=
"imagem 1 da minha página">

<video> e <audio>
Essa tag serve para indicar a inserção de um vídeo. Com isso, 
devemos colocar alguns atributos dentro da tag para poder ativar 
o controle, a principal dela é o controls. Posteriormente, incluímos
 a tag <source> com os atributos src e type, onde receberão o local 
em que está o vídeo e o tipo do vídeo. É recomendado utilizar mais
 de um tipo de source do mesmo vídeo, para garantir maior 
possibilidade de compatibilidade com o navegador. Finalmente, 
podemos incluir uma mensagem que será renderizada apenas se o 
navegador do usuário não suportar a tag video.


Diante disso, vejamos os exemplos a seguir:

<video controls>
  <source src="video.mp4" type="video/mp4">
  <source src="video.ogg" type="video/ogg">
  Seu navegador não possui suporte para Vídeos.
</video>
A tag <audio> funciona da mesma forma que a tag <video>, 
portanto, utilizamos a tag <source> dentro dela. Vejamos o 
exemplo a seguir:

<audio controls>
  <source src="musica.ogg" type="audio/ogg">
  <source src="musica.mp3" type="audio/mpeg">
  Seu navegador não possui suporte para áudio.
</audio>

<iframe>
Os iframes são muito utilizados na atualidade, servem para incluir 
recursos de uma outra página nesta página. Vale a pena conferir o 
exemplo da W3C Schools, pagina de tutorias pertencente ao grupo
W3C, a organização atualmente responsável pelos padrões da web.

Portanto, para inserir um iframe, basta utilizar a tag com o 
atributo src. Além disso, é possível incluir um texto dentro do 
elemento, caso o navegador do usuário não possua suporte para 
tal. Vejamos então o exemplo abaixo:

<iframe src="https://www.homehost.com.br">
  <p>Seu navegador não possui suporte para iFrames.</p>
</iframe>


                                              Tags HTML de listas
Para poder criar uma lista, podemos utilizar uma lista ordenada, 
a partir das tags <ol></ol>, ou uma lista não ordenada, a partir das
 tags <ul></ul>. Posteriormente, incluímos dentro da lista os 
elementos da mesma, dentro das tags <li></li>.

Vejamos os exemplos a seguir:

<p>Minha lista ordenada:</p>
<ol>
  <li>item 1</li>
  <li>item 2</li>
  <li>item 3</li>
</ol>
<p>Minha lista não ordenada:</p>
<ul>
  <li>item 1</li>
  <li>item 2</li>
  <li>item 3</li>
</ul>

                                             Tags HTML de formulário

As tags de formulário são muito utilizadas para obter informações 
do usuário, realizar cadastros, receber opiniões, entre outros. 
São importantíssimas para qualquer ramo do mercado.

Para iniciar um formulário, incluimos as tags <form> e </form>. 
Posteriormente, devemos incluir o conteúdo do formulário. 
Digamos que, por exemplo, você queira incluir três campos, sendo 
dois para coletar informações e um para receber uma mensagem. 
Desta forma, para criar os campos de preenchimento, deverá
 utilizar a tag <input>, enquanto para o campo referente à 
mensagem, deverá utilizar a tag <textarea>.

A tag <input>
A tag <input> possui o atributo type, que varia entre diversos tipos
 (vamos explicar os principais deles abaixo). Também há o atributo 
placeholder, que é um texto que ficará disponível enquanto nada
 for digitado nesse campo. Também é importante definir um 
atributo name para cada input.

<input type=”text”> – Define um campo que receberá qualquer 
caractere;

<input type=”email”> – Define um campo que receberá caracteres 
e verificará se o mesmo consiste em um e-mail válido;

<input type=”submit” value=”ENVIAR”> – Define um botão que
 servirá para o envio do formulário. Dentro dele, podemos atribuir 
o value, que será o texto dentro do botão de envio.

Existem outros tipos de <inputs> que podem ser estudados na
documentação disponível pela W3C.

As tags <textarea></textarea>
Assim como a tag <input>, essa tag define um campo para o 
formulário. Porém, diferentemente, ela tem como principal 
característica ser uma área de preenchimento de texto, ou seja, 
permite que o usuário escreva um texto ou uma mensagem no seu 
interior. Também traz opções para que o usuário redimensione
 seu tamanho (resize). Dessa forma, podemos incluir uma area de
 texto utilizando as tags <textarea> e </textarea>.




                                            Tags de estilos e scripts

Para podermos concluir esse tutorial, não poderíamos deixar 
de citar as tags <style> e <script>.

A tag <style> e </style> deve ser incluída no <head> do seu código 
HTML. Dentro dessa tag, é possível incluir todo o seu código CSS, 
ou seja, seu código de estilos.

Já a tag <script> e </script> tem como objetivo incluir códigos de 
scripts ao seu HTML, podendo ser incluída em qualquer parte. 
Contudo, recomenda-se fortemente que seja inserida após o 
<footer>. Dessa forma, podemos incluir nela um código javascript.