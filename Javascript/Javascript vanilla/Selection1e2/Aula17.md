mod 23                                             09/07/21

-Ctrl c e Ctrl v para a calculadora

  Uma função muito interessante do js é que ele deixa você 
criar elementos no site facilmente com o crateElement

  Basta você colocar um createElement('x'), sendo x 
a tag que você quer criar, inclusive vale um 
estudando_a_fundo para entender bem esse conceito.

   Lembrando que essa função ela somente cria esse elemento
e para coloca-ló de fato no código, existe duas formas:

appendChild(x) que abraça esse filho, lembrando que essa
função é na realidade um método do documento, então
para chama-lá, deve-se ter um document.body
caso queira no body, claro.

então o document.body.appendChild(x);
vai colocar de fato esse elemento no body.

e o x.select() pode seleciona-ló muito bem, assim como
para acabar com esse x e remove-lo, utilizamos o
input.remove(), que vai remove-lo.

a segunda forma não foi abordada.

   Para executar comandos do próprio sistema operacional
usamos o document.execCommand("x"), sendo x o comando, vale
também um estudando_a_fundo para entender e como exemplo
usaram o copy:

document.execCommand("copy");

e para usar o comando paste, tem que primeiramente usar um
evento para detectar o paste, ele funciona assim como 
um keyup ou keydown e deve-se usar nesse evento um método
clipboardData.getData('Text'), para selecionar essa 
memoria.

ex:
    document.addEventListener('paste', e =>{
            let text = e.clipboardData.getData('Text');

            this.displayCalc = parseFloat(text);
        })

log:
    criei métodos para copiar e colar informações na calc;