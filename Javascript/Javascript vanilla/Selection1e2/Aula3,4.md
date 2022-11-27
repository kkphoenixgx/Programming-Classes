mod 9                                               16/06/21

-Manipulando o DOM:

O DOM é o Document Object Model.

A lista das divs do html que fica no inspecionar elemento do
chrome por exemplo, é a árvore do DOM.

BOM é Browser object model, então não se pode confundir
a window com o document, como o minimizar e o fechar, que 
são da window, não do seu documento.
O js, manipula informações do DOM e do BOM, mas tem que
tomar cuidado, por que usar muito as informações, pode 
deixar bem pesado. E para não ficar tão pesado, é bom 
usar os eventos do js para conseguir diminuir o que precisa
carregar.
No js tem uma função muito utilizada, chamada de 
document.querySelector(#x) sendo x o id do que você quer 
pegar

Em qualquer projeto é bom lembrar que ele precisa iniciar
em algum lugar e esse lugar pode ser o método construtor
com uma função que é feita logo no começo depois dos 
atributos e métodos.

x.innerHTML serve para colocar coisas no dentro 
do html, sendo x uma variável que está representando
algo html.



log:
    Criei o método initialize.
    Criei a base para o que vai acontecer quando iniciar

------------------------------------------------------------
mod 10 

Data e Hora:

Existe uma classe no js chamada Date e dentro do Date tem
uma infinidade de atributos e métodos para manipular a data
e a hora.
Quando uma variável é determinada como um window ou um 
document, no console não precisa mais usar o window. ou o
document. já que ela já é desse tipo de dado.

Como tinham dito, existe diversos métodos da classe date, 
então como não tem como passar todos, eu só vou fazer
os que eles explicaram :

Quando você instancia uma variável em um new Date(), você
cria um novo objeto Date(), e com esse objeto, você consegue
usar essas novas funcionalidades da classe Date(), vai 
algumas:

Todas estão também no dicionário.txt 

x.getDate = pegar a data.
x.getMonth = pegar o mês.
x.getFullYear = pegar o ano todo, sem abreviações.
x.toLocaleDateString(y), sendo y o padrão de ISO que você
quer = para mudar o padrão de Date para y.
x.toTimeDateString(y), sendo y o padrão de ISO que você
quer = para mudar o padrão de Time para y.

dentro dessas funções, como elas são um tipo de array
em seu formato, é possível usar dentro dos parenteses
um [z], sendo z como você quer esse tipo de dado, seja ele
long ou short.

para mudar os segundos da calculadora ou para fazer qualquer
coisa ficar mudando toda hora no código, você pode usar
uma função do javascript que fornece essa função:

setInterval(x, y) sendo x uma arrowfunction que você 
vai utilizar e y o tempo que essa função vai repetir
em milissegundos.

para converter uma function para uma arrowfunction, você
deve tirar a palavra function e colocar uma seta  =>

ex:
    setInterval(()=>{
        this.displayDate = this.currentDate.toLocaleDateString('pt-BR')
    }, 1020)

Uma outra estrutura que tem uma função parecida é um 
setTimeout(x, y), mas ele espera uma quantidade de 
milissegundos e usa essa função, ele não fica usando a cada
e sim toda vez que passar esse tempo. Como uma 
publicidade que aparece depois de 10 segundos. 

E para parar esse código, você deve usar uma variável c
com o id do que você quer parar e usar uma função nativa
chamada de clearInterval(c) 

E assim como tem um clearInterval(), tem um clearTimeout()
que cancela o time out.

ex:
    let c = setInterval(()=>{
        this.displayDate = this.currentDate.toLocaleDateString('pt-BR')
    }, 1020)

    setTimeout(()=>{
        clearInterval(c)
    },10200)

Como já tínhamos dito antes, dá para usar parâmetros para
como você quer as strings Date(), então vai um exemplo
bem legal da calculadora:

ex:
    this.displayDate = this.currentDate.toLocaleDateString(this._locale, {
            day: "2-digit",
            month: "long",
            year: "numeric"
        })
 

log:
    Refatorei a classe.{
        coloquei os atributos do initialize no método 
        construtor
        Mudei para chamar direto os atributos com o innerHTML
    }
    Mudei o currentDate para retornar o Date() do js.
    Criei os getters and setters do time e do date da calc.
    Fiz o display ficar atualizando com o setInterval().
    Fiz o método para esse setInterval que para não esperar
    1s para começar a rodar vou usar ele duas vezes, então, 
    faz uma função.

