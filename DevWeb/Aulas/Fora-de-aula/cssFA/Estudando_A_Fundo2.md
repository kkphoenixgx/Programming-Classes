Estudando a fundo 2 - Flexbox                                                     02/06/21
[ReadMe](../../../ReadMe.md)

Antes do flexbox tinham 4 tipos de layout -

Blocos, Inline, Table e Layout de posicionamento

    Mas com flexbox tudo fica mais fácil.

Para começar a trabalhar com flexbox tem que existir um contai-
ner que tenha um elemento flex.

O nome usado para a class container é "flex-conteiner";
Não confunda, container é um tipo de *Classe*, não de ID, 
então o elemento flex fica na classe container;

Então vamos por lógica, dentro do container temos atributos 
com valores diferentes para cada e cada valor deve receber 
tipos de nomes para esses valores que são definidos por uma 
certa lógica de escrita, que é feita como se fosse uma
árvore de habilidade em um jogo, cada classe tem habilidades
e cada habilidade possui uma outra rota diferente para
uma continuação dessa habilidade, exemplo:

flex tem{

    flex direction tem [
        colum tem(
            colum-reverse;
        )
        row tem(
            row-reverse;
        )
    ]

}

Percebendo que tá ficando meio confuso, vou só usar endentação

flex 

    flex direction

        colum

            colum-reverse;

        row
            row-reverse;
    
    flex-wrap
    
        wrap
        wrap-reverse
        no-wrap

    flex-grow
    flex-shrink
    flex-basis
    flex-flow

-ms-flex

    -ms-flex-align
    -ms-flex-direction
    -ms-flex-wrap
    -ms-flex-shrink
    -ms-flex-basis
    -ms-flex-flow
    -ms-flex-item-align
    -ms-flex-pack
        -ms-flex-line-pack

-moz-flex