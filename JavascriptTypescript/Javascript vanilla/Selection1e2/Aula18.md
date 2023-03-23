mod 24                                             13/07/21
[IndexJs](../IndexJs.md)

-Trabalhando com áudio.

Para criar um áudio na sua aplicação, voce^obviamente deve
primeiro criar uma forma de ligar e desligar o áudio, e para
usar um ádio você pode instanciar uma variável com uma classe
para o seu áudio e usar uma função nativa que é o
x.play(), sendo x a variável.

perceba também, que o áudio quando começa a tocar e você
apertar o botão de novo, ele não vai tocar de novo por que
está em progresso, então o mais interessante que você pode
fazer é antes de dar o play no áudio, seta o currentTime 
dele para 0.

Uma informação muito interessante desse mod também, é que 
é possível fazer uma espécie de negação de valor de uma 
variável.

ex:
    interruptor = false;
    if(interruptor){
        interruptor = !interruptor;
    }
    ou seja, eu tô invertendo o valor do interruptor.

log:
    Musica maestro;