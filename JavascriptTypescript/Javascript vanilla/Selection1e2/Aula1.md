# Introdução rápida ao javascript para migradores  intelectuais

Mod 4 -- **04/04/21**
[IndexJs](../IndexJs.md)

* tudo em js é case sensitive.
* Como já sabemos, a tag script está fortemente ligada ao js, é pela tag src que podemos definir onde está o arquivo js que vai rodar o código. que fica no body do site.
* para comentar no js é tudo nos conformes, /**/ e // tudo certo.
* para criar variáveis no js é só usar o var ou o let e constantes com const.
* o var declara variáveis normais, porém o let só dá para usar no escopo de onde essa variável foi criada.
* **console.log** no javascript é para vc escrever no console o que tiver nas aspas, tipo um echo ou um println
* CallBack é uma função de retorno de dentro de uma função. guarda isso, isso é um conceito usado frequentemente.

## Tipos de dados no js

| Type    | O que é                                |
| ------- | -------------------------------------- |
| String  | Linha de texto                         |
| number  | float ou decimal, números são números. |
| Object  | Array, data                            |
| boolean | verdadeiros e falsos                   |

### type of

Ele mostra o tipo da variável  
Podemos usar o Typeof de duas formas:

~~~js
let x = '(っ °Д °;)っ'
// caso o 
if ( typeof x === 'string') console.log('string'); return

console.log(typeof(x))
~~~

* instance of = mostra a instância.

* tem funções para conversão de variáveis:

| Método       | função              |
| ------------ | ------------------- |
| parseInt()   | passar para inteiro |
| parseFloat() | passar para float   |
| toString()   | passar para string  |

## Operadores em js

| Operador | O que ele faz               |
| -------- | --------------------------- |
| +        | soma duas coisas            |
| -        | diminui duas coisas         |
| /        | divide duas coisas          |
| *        | multiplica algo             |
| !        | inverte uma condição        |
| =        | **iguala**                  |
| %        | pega o resto de uma divisão |
| >        | maior que                   |
| <        | menor que                   |
| ==       | **verifica se é igual**     |

Entenda o conceito desses operadores e os seguintes seguem uma lógica muito simples.

| Operador | O que ele faz                                             |
| -------- | --------------------------------------------------------- |
| ===      | verifica se é idêntico                                    |
| =!       | verifica se é diferente                                   |
| >=       | maior ou igual a                                          |
| <=       | menor ou igual a                                          |
| !==      | se não é igual                                            |
| !===     | se é idêntico a                                           |
| typeof x | [verifica o tipo, podendo igualar a um tipo](### type of) |

## If

* if e else é normal.

~~~js
let x;
let y;

if(x){
    return x
}
else if(y){
    return y
}else{
    return console.log('Coloca uma entrada senhor')
}
~~~

## Switch

* SEMPRE USA SWITCH QUANDO VC JÁ SABE OS RESULTADOS.
* o switch é normal também.

~~~js
switch(cor){
    case "verde":

        console.log("siga");

    break;

    case "amarelo":

        console.log("atenção");

    break;

    case "vermelho":

        console.log("pare");

    break;

    default:

        console.log("sei lá");

}
~~~

## Foreach

* o foreach também é normal.

~~~js
let x = []

// no caso estou usando uma função anonima, que é uma função que não precisa de nome.
x.forEach(function(item){
    console.log(item)
})
~~~

## Template String

Tem o famoso concatenador mutante do js que é bem legal. Que se chama template string. Que dentro de parenteses, você pode fazer aspas simples com variáveis declaradas por ${} e ainda pode escrever dentro da variável.

~~~js
let client = 'Osvaldo'
let Produto = 'Condicionador'

console.log(`${cliente} seu ${produto} ficou pronto`)
~~~

simplesmente incrível.

## Eval

Eval é um método para validar se é possível realizar uma função matemática.

exemplo eval()

~~~js
    function calc(x1, x2, operador){

        return eval(`${x1} ${operador} ${x2}`);
    }

    let result = calc(1, 2, "+");
    console.log(result);
~~~

## Funções

mod 5 -- **09/04/20**

tipos de funções:

* function
* anonima
* arrow function

### function

function cria normal

~~~js
function somar(){
    return 'se tiver que retornar'
}
~~~

### função anonima

* uma função anonima é feita somente tirando o nome da função e definindo ela entre parenteses e você pode usar ela em parenteses depois do parenteses que você definiu

exemplo function anonima:

~~~js
let array = []

array.forEach( function(item){
    console.log(item)
})


~~~

### Arrow function

exemplo arrow function é mais rápido e com ela, dá para usar informações de fora da função dentro da função, como uma variável usada fora do escopo ou uma constante.

arrow function:

~~~js
let calc = (x1, x2, operador) => {

    return eval(`${x1} ${operador} ${x2}`);
}

let result = calc(1, 2, +)
console.log(result)
~~~

## Dom

Dom é a overview da janela do site ;-; eu entendi na hora assim, vc também tem que entender, é as janelinhas com as tabs dá para selecionar a window como uma classe.

MIND BLOWING

ok, voltando, dá para fazer isso mesmo, olha:

document: site (o documento)
window: a janela do browser

* exemplo window class:

~~~js
window.addEventListener('focus' event =>{

    console.log(focus);

});
~~~

* exemplo document class:

~~~js
document.addEventListener('click' event =>{

    console.log(click);

});
~~~

## Date

No js, para trabalhar com tempo, tem uma classe chamada
de Date que tem seus métodos e funções sobre o tempo.

com Date.now() por exemplo dá para pegar o timeStamp
e se você não se lembra o que é o time stamp
é os milissegundos contados dês de a criação da linguagem c
que no js tem +3 casas do que nas outras.

Date:

* x = new Date() Dá para pegar a data formatada;
* x.getDate = pega a data de hoje
* x.getFullYear = pega o ano com 4 dígitos
* x.getMonth e month começa em 0 = Pega o mês
* x.toLocaleDateString("x") = pega a data do formato local

Nos arrays, dizemos que a variável é um array colocando [] para definir a variável como um array.

## Array

* x.length = para saber a quantidade de itens do array.
* x[y], sendo y o array que você quer, COMEÇA COM 0.

O array também é metamórfico, ele se adapta, dá para fazer o que você quiser com a informação do array depois de retira-ló.

O foreach é um método para fazer um laço de repetição que é para cada, basicamente, para cada x você faz isso. Da para fazer um console.log para cada array por exemplo.

## Orientação a objeto

Orientação a objeto tá normal...

com this, new...

obs: objeto é quando você instância uma classe como uma
variável.

Dá para criar classes com funções anonimas meu amigo.

AINDA ESTOU EM cHOQUE, porém pelo que entendi...

dá para criar uma classe do jeito tradicional que eu já vi em java instanciando uma função anonima, porém para fazer a nova classe do js você usa a forma convencional que foi mudada pelo js...

### Antigas classes do js

Exemplo antigo no js:

~~~js
let ExemploClass = function(){

this.name;
this.code;

var ExibirCadastro = function(name, code){
    return console.log('Cliente : ${name} Cadastro: ${code}');
}
}

let Osvaldo = new ExemploClass();

console.log(Osvaldo.name, Osvaldo.code);
console.log(ExibirCadastro(Osvaldo.name, Osvaldo.code));
~~~

um método construtor é um método padrão que faz logo quando se instância nos parenteses.

para criar um método construtor, se usa a palavra constructor(){} e dento do escopo, dá para criar esses métodos e funções.

### Nova class mo js

Exemplo novo js:

~~~js
class ExemploClass{

    constructor{
        this.name;
        this.code;
    }

    exibirCliente(name, code){
        return console.log('Cliente : ${name} Cadastro: ${code}');
    }
}

let Osvaldo = new ExemploClass();

console.log(Osvaldo.name, Osvaldo.code);
console.log(ExibirCadastro(Osvaldo.name, Osvaldo.code));
~~~
