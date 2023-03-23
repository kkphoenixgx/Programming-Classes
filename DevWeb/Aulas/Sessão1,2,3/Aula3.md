mod 20                                               08/06/21
[ReadMe](../../ReadMe.md)

Projeto parte 1- Estrutura do projeto.

    A class container do bootstrap centraliza conteúdos e 
para utilizar esse recurso, a div do container deve ser 
com linhas "row" 

    Não faça alterações direto no arquivo do bootstrap, dá
para criar um arquivo css e modificar as classes, divs etc
em um arquivo css a parte.

    Uma coisa importante que eu já fiquei sabendo por fora 
vendo vídeos é a questão do . no css, ele indica no que 
na realidade em que agrupamento você quer modificar.

    Se for uma classe utilize o . x, sendo x o nome da classe
Exemplo:

div . container {
    background-color : black;
}

Uma boa técnica para identificar uma div e conteúdo ou algo
parecido, é colocar um background-color, um width e um height

<ul></ul> indica uma lista e o <li></li> indica um item dessa
lista

a tag <img></img> é muito boa para colocar imagens na tela 
por causa do seu atributo especial alt que faz com que 
quando a imagem não for carregada, ele deixa o nome da imagem.

Para mudar coisas em especifico, se usa o # para o id

A classe container pode ser usada várias vezes.

O atributo top do css bota uma imagem ou algo para cima
e para baixo.

Nesse módulo também foi apresentado a utilização dos 
atributos position : absolute e relative
Disseram que já utilizaram, mas pelo visto eles não utilizaram
e pelo que vi até agora pelo nome já é bem auto explicativo

absolute é absoluto e relative, relativo.

Toda vez que usar o position relative ou absolute terá que 
determinar as coordenadas desse elemento na tela. Deverá fazer
 isso usando as propriedades top, right, bottom ou left. Caso 
 use top por exemplo não deverá usar a bottom, o mesmo se 
 aplica para right e left.

A diferença de absolute e relative é qual elemento será usado 
como referência para a deslocação das coordenadas. Quando usa 
position absolute o elemento não ocupa mais espaço dentro do 
seu elemento pai. Veja no exemplo abaixo a diferença do 
absolute e do comportamento padrão 
(no caso um position static):

https://img-c.udemycdn.com/redactor/2016-08-31_15-09-57-2b6d491a28e472774e1b69c7f2e4fb65/1.jpg?Expires=1623267450&Signature=Hfi6NXSYUyHlwhZMRfJiVSaJsUsG9oJUTSGsiHn~Njv8o3Bn4oFgMinuXusM8iGJ34qub2rofVnlkR0QfMlQKvnZRux7zEP0PcPd5PnjJpNOOC5gzftkccRF51vhJbQw2j7FQkbrPy5fREpjo0kXlR7NCk1tZvKT4kFoEqbNYuMAZw~SKUYEcDGDt9Jtjm~qDa7~IN6BBFmNtI536coPP~dNG7ICKqYkCw-tj9JwdnVYm-ZJM62wcrA0pzSbNBA9ZwzIxa0srDO9a4HmfduIzCrpeb2gdl2bZ6naCI1dblouG9lOFLilUZMsotGuq57TOB~pO8nBGbdD2PWXYKO3Qw__&Key-Pair-Id=APKAITJV77WS5ZT7262A

Link do exemplo acima: https://jsfiddle.net/joaohcrangel/297myqrq/

Note que a altura do elemento body é afetada.

Uma vez que use top, right, bottom ou left para deslocar esse 
elemento DIV com position absolute o navegador será a 
referência.

Quando desejar que o elemento pai seja a referência para o 
position absolute ser deslocado, o elemento pai deverá ter 
seu position como relative. Veja a imagem abaixo:


Se o elemento DIV com a classe .red não tivesse o position o 
relative, o elemento DIV com a classe .blue seria alinhado à 
direita usando como referência o navegador e não o DIV que é 
seu pai. Como na imagem abaixo:

https://img-c.udemycdn.com/redactor/2016-08-31_15-21-15-25672d0610d7282fb0f32ad5111881eb/2.jpg?Expires=1623267450&Signature=NkZbj1IIPmm5JRnPtG4rq7QN8s8AuflcPQYAtOZsLhQxICq599TK8GY2kO5JgNN4MOoxzmgo7Bfl5-IkLthzlJDCO2ewhNozAjsZmIbZIMBxcmjYA2rLBtGTmZPXw-9mtm3zzekLGkh4LLp-1qBtU3RL7yz~HZ0Si4Oig12LGoGqoMyjB3NAA1i~3SarnEke2s6Ifl8F29GJHmlOJgVusmU69IIa97~XJrFndinSLj7fxUeAQVOZxkLAM21yvGM4jTzUZBCQw2U4Hn0FSDsn5IseZ0TTYH9gkcpphIVKC1qeg9StsPaI0WwQkG5zAwQsSDCGETl8UJtXXQIbmt7c-Q__&Key-Pair-Id=APKAITJV77WS5ZT7262A

Link do exemplo acima: 
https://jsfiddle.net/joaohcrangel/8hm8c86q/1/

==============================================================
mod 21                                                08/06/21

Topo do projeto 2

Para criar a imagem com vários links, tem um truque muito bom,
background-image por trás de tudo, o background image é bem
simples de entender, ele é só uma imagem por trás de tudo e 
depois sai criando divs com os links por cima na imagem.

Ex :
    css:
        header .header-black li{
            background-image: url("../img/clubs.png");
        }
    html:
        <div class="header-black">

                <ul>
                    <li class = "club-01">
                        
                        <a href = "#"></a>
 
                    </li>
                </ul>

            </div>
        Para cada imagem, uma tag a com um href com um id 
        diferente.

Outra coisa bem importante a se notar, é que para selecionar 
o li dentro do header-black, não foi usado um ".".

Então :
background-image: url(x);

para ter um background de fundo e para a imagem não repetir:

background-repeat: no-repeat;

03/07/21------

Eu tive 4 semanas de recesso por causa do problema do
bootstrap, não consegui colocar os itens alinhados com o
lado direito da tela, então depois desse tempo todo temos
uma importante lição

NUNCA, SOBRE HIPÓTESE ALGUMA MUDE O NOME DAS PASTAS DO 
BOOTSTRAP, POIS SE NÃO OS ARQUIVOS SÃO AFETADOS, seu 
bostinha.

inclusive nessa semana de recesso eu aprendi muita coisa
criando uns joguinhos, muito bom, te desafio a tentar.

ele explicou também o que é o box model, dúvidas? olha o 
arquivo dicionário.txt

