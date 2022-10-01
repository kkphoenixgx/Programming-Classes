mod 11                                              21/06/21

-querySelector

Embora o querySelector seja de fato bem simples, ele é
sem nenhuma dúvida, fundamental.

O querySelector só pega o primeiro filho de algo, pois ele
só pode selecionar uma coisa, não várias.

Para selecionar todos do que você quer, você precisa
usar o querySelectorAll().

log:
    Criei um querySelector que seleciona todos os 
    buttons e agreguei eles a uma variável.

mod 12

adicionando evento click:

O eventListener só funciona com UM evento por vez, então 
algo bem interessante realmente de se fazer é criar um laço
de repetição para criar todos esses events, então a 
pergunta é, qual o laço?
    se você respondeu que precisa de um laço que para
    cada botão você realizará algo, ou seja um foreach():
    acerto, mizeravi.

E no foreach, para usar dois ou mais atributos, esses 
devem estar um (), observe a linha 36. GRAVA ISSO

Ex:
    initButtonsEvents(){
        let buttons =  document.querySelectorAll("#buttons > g, #parts > g");
        
        buttons.forEach( (btn, index) => {
            
            buttons.addEventListener("click", e => {
    
            });
            
        });
    }

E para por exemplo definir o index do exemplo, eles 
usaram assim como se não fosse nada um conceito que eu morri 
para saber, DÁ PARA PEGAR O NOME DA CLASSE E O BASE VAL SÓ 
COM

x.className.baseVal

sendo x a variável.

e mais genial ainda, COMO SE NÃO FOSSE NADA, eles usam uma
função de formatação de string para fazer um replace no que
você não vai usar.

log:
    Adicionei o event para escutar os botões da calculadora

mod 13

-Aplicando vários eventos com split()

Basicamente, não tem um método global para fazer isso no 
js, então basicamente, como se não fosse nada:

-Ah, bora criar um então.

Porém de qualquer forma, quando você criar os parâmetros,
você vai pensar:
-O porra! COMO EU FAÇO PARA PASSAR UMA QUANTIDADE DE 
PARÂMETROS QUE EU NÃO SEI! 

você pode então ter a sacada de GÊNIO de transformar os
parâmetros dos eventos em um array e criar um evento 
para cada um da lista:
mind blowing, mas ai vc pensa um pouco mais:

-Mas o corno fdp, como você vai fazer para fazer isso então
a ideia é boa, mas eu não sei passar isso para o papel.

ACOMPANHE-ME GAFANHOTO!

separa a string pelo espaço

mind blowing;

Então pelo espaço, separa ela, ou seja x, no caso do 
seu método, um dos parâmetro x, com split('x'), sendo
x como você quer separar, pode ser " ," ou "," ou " "
você decide meu companheiro.

EX:
    addEventListenerAll(element, events,fn){

    events.split(' ').forEach(event => {
        
        element.addEventListener(event, fn, false);

    });

    }

log
    Criei um método para suportar vários events.
    
    addEventListenerAll(element, events, fn){
        events.split(' ').forEach(event => {
            element.addEventListener(event, fn, false);
        });
    }