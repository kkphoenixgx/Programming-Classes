mod 6                                             14/06/21
[IndexJs](../IndexJs.md)

-estruturando projeto.

-baixar o projeto.

mod 7

-Orientação e objeto MVC


Conceitos normais...

    método é uma função na classe
    atributos é uma variável
    instância é quando um objeto representa uma classe usando
    x = new y(y = Classe)

MVC é Model, View e Controller.
é um tipo de organização sendo:

Model = trata os dados.
View = o que o usuário tá vendo.

Controller = regras de negocio.
============================================================
Presta atenção no que a ordem que você chama um arquivo 
em js importa... Chama sempre de acordo com a ordem na 
pasta que fica sempre certinho, se não vai dar erro.
============================================================


Log
    -Fizemos um arquivo chamado calc controller numa pasta 
    -chamada controller, que deve ser onde começa a calc
    -coloquei no arquivo html que ele tem que chamar os 
    arquivos
    -comecei a estrutura base da classe

mod 8

-Método construtor e Encapsulamento.

Conceitos de sempre

    this faz referência ao próprio objeto no momento 
    da instância, logo mesmo se tiver dois objetos
    vão ser tratados diferentemente

Encapsulamento no js, encapsulamento é quando usamos 
public e private para definir quem pode e quem não 
pode ver o método ou o atributo.

existe 3 tipos de encapsulamento como já sabemos:

Private = Não fala com ninguém.
Public = fala com todo mundo.
Protected = fala somente com os iguais.

porém no js, existe uma convenção, quando tem-se uma 
_ na frente do nome do atributo, aquele atributo é privado
e isso significa que somente atributos e métodos dessa classe
conseguem falar com esse cara, porém não acontece isso de 
fato, então por convenção, todos quando percebem o underline
não fazem uso desse atributo.

Então para controlar esses usos, só tem duas coisas que 
você vai fazer com esses atributos e métodos, ou você
quer chamados ou guardar essa informação...
então para isso tem og getters e os setters.

o get basicamente é pegar e set setar....

o get você retorna o valor da variável privada e o set
você muda essa variável, mas na hora de você usar a variável
você usa ela sem o underline, para poder usar o método get ou
o método setter dela em vez de direto a variável com _,
o js identifica que não tem uma variável com esse nome e 
vai direto procurando um método com esse nome.

log
    Criei o construtor
    Criei os atributos displayCalc e dataAtual
    coloquei eles com _ para virarem private
    criei os getters and setters para usar o private
    que é usado com _ por convenção.
    