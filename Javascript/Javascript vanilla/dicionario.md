# Dicionário javascript para todos os problemas

## Variáveis

* ### Declaração de variáveis

  let = só funciona no escopo
  const = variável não mutável
  var = variável normal

  declaração:
  > declaração  nome = x

### Strings

* **split('x')** = com essa função, dá pára criar um array com os itens de uma string de definindo x, sendo x o caractere que você você quer usar para separar, como um espaço entre 1 2 3 4 5, usando um split(' ') eu criaria um item de array para cada número;

* **Template string** = Você usa em uma variável ou em qualquer coisa que possa receber uma variável concatenada como texto a template string, fica muito mais fácil concatenar as coisas, você pode escrever coisas com a template string, escreva o seu texto normal com todos os caracteres e os espaços e quando quiser usar uma variável, utilize ${x} sendo x a variável, a template string deve estar em aspas simples '' para funcionar, lembra disso. Olha o exemplo de template string:

  ~~~javascript
  '${cliente} seu produto: ${produto} ficou pronto';
  ~~~

### Conversão de variáveis

* **parseInt()** = passar para inteiro;
* **parseFloat()** = passar para float;
* **toString()** = passar para string;

## Arrays

* **x.length** = para saber a quantidade de itens do array, x[y], sendo y o array que você quer, COMEÇA COM 0 e pode usar expressões numéricas.

* **x.push**() = adiciona algo a um array

* **x.pop**() = tira esse item x do array

* **x.splice**(index, quantidade) =  No splice, você fala qual item  do array que vc quer tirar com o index e a quantidade de itens contando dele que você quer tirar. exemplo para tirar um item splice(0, 1), vai tirar o item 0 do array e se fosse quantidade = 2, iria tirar o 0 e o 1

* **x.reduce( (previousValue,  newvalue)=>{}, initialValue )** = Com o reduce, ele faz uma operação com todos os itens de um array, começando do initialValue que recebe a posição do array

## Fors

* **for**

~~~javascript
for(variável, até quando, o que fazer toda vez){
    // bloco de código do que fazer para cada x.
}
~~~

* **forEach**

~~~javascript
array.forEach( function(value, index){
    console.log(value);
})
~~~

* **for in**

~~~javascript
for(variável in objeto){
    //bloco de código para cada atributo ou function do objeto
}
~~~

* **for of**

~~~javascript
for(variável of x){
    //bloco de código para cada valor de x
}
~~~

## Switch

Exemplo:

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

## Functions

* ### function

  ~~~javascript
  function Somar(valor1, valor2){
      return valor1 + valor2
  }
  ~~~

* ### anonymous function

~~~js
//uma function anonima não possui nome e pode ser criada como um call back de uma outra função
Funcionário.calcSalary (IdDoFuncionário, function(HorasDeTrabalho, salario){
    const taxa = 1.6
    return `O valor é ${(HorasDeTrabalho * salario) + taxa}`
})
/* 
Uma função assim é difícil explicar fora de contexto, mas seu conceito é 
extremamente simples, ela é uma função que não precisa ser declarada no
escopo0 global, que só vai gastar processamento na hora de usar ela 

Explicando,ela basicamente ela calcula para um funcionário de uma empresa o 
valor  do seu salário e depois envia esse valor para o banco de dados na 
classe, com o IdDoFuncionário, então esse método userSalary para não fazer 
outro método, pode pedir essas variáveis para uma função anonima para não 
chamar outro  método para calcular o salário e evitar refatoração em múltiplos 
lugares da classe. 
*/
~~~

* ### Exemplo arrow function

~~~javascript
/* 
Esse é um simples exemplo de como fazer uma arrow function, 
mas ela é geralmente usada como uma call back.
*/
(x1, x2, operador) => {
    return x1 operador x2;
}
~~~

## Eventos

* Para usar um evento no js é so usar o addEventListener(x), sendo x o evento que você quer escutar:
* Para criar um evento, se cria event = new Event('event') e para despachar o evento , usa HtmlObject.dispatchEvent(event)

* **keyup** = quando você solta a tecla do teclado
* **keypress** = quando a tecla está pressionada
* **keydown** = o evento ocorre quando a tecla é pressionada e não entende Ctrl, alt e shift
* **click** = quando clicar;
* **dbclick** = quando acontece dois clicks.
* **contextmenu** = quando clica com o botão direito;
* **drag** = quando puxar;
* **mouseover** = quando o mouse em cima do botão;
* **mouseout** = quando o mouse sai do botão;
* **mouseup** = quando o mouse tá po cima de um elemento;
* **mousedown** = quando o mouse tá por baixo de um elemento.

  Exemplo:

  ~~~js
      document.addEventListener('click' event =>{

        console.log(click);

    });
  ~~~

### Propriedades do event

Entre parenteses está o código do evento para o **event.keycode** e entre '' está o **event.key** e estão organizados pelos seus event.keycode

* 'ArrowLeft' = seta para a esquerda (code = 37)
* 'ArrowUp' = seta para cima (code = 38)
* 'ArrowRight' = seta para a direita (code = 39)
* 'ArrowDown' = seta para baixo (code= 40)

## DOM

### window

  Uma coisa muito importante a se ressaltar é que os métodos que estão com (.window) é por que não precisam ser chamados pelo .window, pois já estão no window

* #### window.isNaN(x)

    Essa função valida se algo é um número ou não, retornando um boolean de true ou false e ele valida se é um número ou não mesmo se for uma string, validando false se for um número e true se não for.

* #### (window.)sessionStorage

    Session storage é basicamente uma forma de gravar dados da sessão do usuário, esses dados serão perdidos assim que ele fechar a aba, mesmo que ele abra a mesma aba novamente, porém caso ocorra um f5 a informação continua ali.  
    Lembrando que nem o SessionStorage nem o LocalStorage conseguem guardar todo um objeto, caso seja feito algo do tipo vai aparecer a string do object, aquela mensagem de object: object...  
    Então o necessário para guardar uma informação dessa forma é fazendo um array e percorrendo toda essa seção de atributos de um JSON.  
    Para fazer um insert de um sessionStorage é simplesmente fazendo um **sessionStorage.setItem("x","y")** sendo x o nome do valor e y o valor.

    ~~~js
    sessionStorage.setItem("name","value")
    ~~~

    Para acessar as informações de um session ou local Storage, você ao invés de set, sessionStorage.getItem("x");

    ~~~javascript
    sessionStorage.getItem("name");
    ~~~

* #### (window.)eval(x)

    O eval basicamente calcula uma expressão numérica em string

    ~~~js
    eval('2+2');
    //isso resulta em 4 (number).
    ~~~

* #### window.requestAnimationFrames(fn)

  Esse método da window é bem auto explicativo pelo nome mas ele é extremamente útil, principalmente na hora de criar jogos em js, esse método retorna um temporizador e ele acumula esse temporizador que acumula o tempo passado dês da abertura da tela, esse método deixa as coisas mais suaves entre outras coisas quando usado em animações.  

  exemplo de gameLoop:

  ~~~js
  function gameLoop(time){
    window.requestAnimationFrame(gameLoop)
  }
  window.requestAnimationFrame(gameLoop)
  ~~~
  
## Classes em js

* ### Exemplo classe em js

~~~javascript
class ExemploClass{

    //criando variáveis sem valor prévio
    this.code;
    this.name;

    // construtor
    constructor(name, code){
        this.name = name;
        this.code = code;
    }

    // criando um método
    exibirCliente(name, code){
        return console.log('Cliente : ${name} Cadastro: ${code}');
    }
}

// instanciando 
let Osvaldo = new ExemploClass();

console.log(Osvaldo.name, Osvaldo.code);
console.log(ExibirCadastro(Osvaldo.name, Osvaldo.code));
~~~

* ### Exemplo antigo de classes js

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

## Classes pré determinadas

* ### Date()

  * **x = new Date( )** = Dá para pegar a data formatada

  * **x.getDate** = pega a data de hoje

  * **x.getFullYear** = pega o ano com 4 dígitos  

  * **x.getMonth** = e month começa em 0 = Pega o mês  

  * **x.toLocaleDateString("x")** = pega a data do formato local  

  * **x.getTime()** = retorna em o timeStamp em  milissegundos

* ### Audio

Defina algo como áudio e dê um play nele.

~~~js
var bMusic = new Audio('welcome1.mp3')
bMusic.play()
~~~

* ### Promise()

Uma promise pode encapsular operações assíncronas, trazendo várias vantagens em seu uso.

Criando uma promise:

Promise é uma classe nativa do js que você instância para uma variável, que em seu construtor precisa de uma função, que possua dois parâmetros por padrão, um **resolve** e um **reject**, que poderiam ser qualquer nome mas os nomes são uma convenção, que é necessária para um clean code.

Sendo os dois funções que podem ser executadas como um callback ou um valor, sendo *resolve* quando a função principal for feita corretamente e *reject* quando a função principal não for bem sucedida.
E para o uso dessas, podemos chamar pela variável instanciada, ou seja, pelo objeto, o método **x.then(fn)** que recebe como função o que fazer com essa informação mas o legal disso é que o then retorna de novo uma nova promise, então eu posso fazer:

> then(value => value).then(value => value).then(value => value)

Infinito, lembrando que esse value ele pode mudar simplesmente transformando esse segundo value em uma arrow function que retorna outra coisa ao invés do then, exemplo:

~~~js
promise.
then(value => {
    return value + 1
})
.then(value => {
    return value * 2
})
/*
      Mas como pode ver a promise pode receber dois then, 
    então a gente só pula linha para n ficar: 

    promise.then(value => value).then()
    Então fica do jeito escrito

    para deixar o código mais legível 
    
    (☞ﾟヮﾟ)☞ clean code ☜(ﾟヮﾟ☜)
*/
~~~

Então além do resolve e o then temos o reject e o **catch( )**, que faz quase a mesma coisa que o then recebendo o valor do resolve, o catch() recebe o valor do reject caso o reject seja invocado, e ele tem um adicional, mesmo que dê certo a Promise, ele receberá o erro de qualquer *then()* que dê errado, então caso um erro ocorra em um dos *then()* ele receberá a mensagem de erro desse *then()*.

Exemplo completo de uma Promise:

~~~js
var promise = new Promise((resolve, reject)=>{
    
    let aNumber = 47;

    if(aNumber === 47){
        
        // passa esse valor para o parâmetro do then
        resolve(aNumber);

    }else {
    
        // passe esse valor para o parâmetro od catch
        reject(aNumber);
    
    }

})


promise
    .then(value => value)
    /* 
        👆 esse => é basicamente a mesma coisa que fazer isso:
    
        promise.then(value => {
                return value
            }) 
        
        Para quem não sabe o => significa retorne, então 
        quando você faz uma arrow function por exemplo, vc 
        diz que você está retornando para uma variável o 
        resultado de uma função ou uma função.
        
    */
    .then(value => {
        value = (value * 4) / 2
        console.log(value);
    })
    .catch(rejectValue => {
        console.log(rejectValue);
    })

~~~

* ### Math methods

  * **Math.random()** = dá para você um número aleatório entre 0 e 1.
  * **Math.floor()** = define um valor máximo com um *ex:

    > Math.floor(Math.random() * 10)
    > Retornará um número de 0 a 10

  * **Math.round()** = arredonda o número para o mais perto de um inteiro
  * **Math.sqrt(x)** = faz a raiz quadrada de x;
  * **Math.pow(x, y)** = faz a a potenciação de x e y sendo x a basa e y o expoente;
  * **Random Floor Round** =  Você pode definir um valor x randômico de -100 a 100 sem o 0:

    ~~~js
    //gera para mim um número de 1 a 100
    var num = Math.floor(Math.random()*99) + 1;

    /*
     seguinte, arredonda um número de 0 a 1 aleatório, se for 1, 
     multiplica com a variável num, se não multiplica -1 com o 1
    */
    num *= Math.round(Math.random()) ? 1 : -1;
    ~~~

* ### XMLHttpRequest() || Ajax

Lembrando que existem dois tipos de formas de tratar esses métodos do ajax, uma como se fosse um atributo = ajax.method = x => {} e outra como realmente um método ajax.x(x, y...) E que ajax seria a instância da classe XMLHttpRequest.

#### Trata-se como método

* ajax open("method", "path") = pega os dados a partir de um método html(post, get, delete...) e uma rota("path")

#### Trata-se como variável

* ajax.onload(event) = quando o ajax for carregado, ele vai mandar um evento e você pode fazer o que quiser com esse evento event => {}

* ajax.onerror(event) = quando o próprio ajax der errado, ele vai mandar um evento de erro  

* ### fetch

A fetch API, diferentemente do ajax, suporta json, então nela, você pode usar o json direto sem problemas. Ela possui melhor suporte as promises do js, que para uma api, é muito importante para conseguir tratar possíveis erros, imprevistos e outros.

Para chamar os métodos via fetch é bem simples, basta usar fetch(método) e isso retorna para você uma promessa, que como qualquer outra, pode ser pega usando then. e com isso podemos tratar retornando via resolve ou reject o resultado da request

Exemplo de um método que usa fetch:

~~~js
/*
  No caso este é um método que vai conseguir processar todos
os métodos, então faremos aqui um fluxo para o request que
 seria a requisição do express
*/
static request(method, url, params = {}) {

    return new Promise((resolve, reject) => {

        let request;
        switch(method.toLowerCase()){
            /*
              Se for um get só vai precisar da rota então 
            trataremos de uma forma diferente
            */
            case 'get':
                request = url;
            break; 
            /*
                E os outros usando as informações passadas
            */
            default:
                request = new Request( url, {
                    
                    method,
                    body : JSON.stringify(params),
                    Headers : new Headers({
                        'content-type': 'application/json'
                    })

                } );
            break;
        }

        //Faça a requisição da fetch
        fetch(request).then( response=>{
            /*
             faça a requisição via json direto já que 
             agr o Fetch suporta e se der errado
             manda para a promise o erro
            */
            response.json().then( json =>{
            
                resolve(json);
            
            }).catch( e => {
                reject(e);
            });

        /* 
            Se a requisição da fetch der errado manda
            para a promise o erro
        */
        }).catch( e => {
            reject(e);
        });

    });

}
~~~

## Elementos html

### Métodos globais

* **querySelector(cssSelector)**: = Seleciona um objeto html, que pode ser por exemplo colocado em uma variável  
exemplos :  

    > var element = querySelector(#id) para selecionar id  
      var element = querySelector(.class) para classe  

    E suporta todas as outras formas via seletor css. Com isso pode-se acessar métodos desse elemento html.

* **querySelectorAll()** = Ele faz basicamente a mesma coisa que o querySelector() acima, porém o querySelectorAll() seleciona vários elementos html somente colocando , e dizendo o próximo.

    var elements = querySelectorAll(seletorCss1, seletorCss2)

### Métodos de objeto

* **object.preventDefault()** = Que basicamente fala para parar tudo o que esse cara disparou, pode ser usado no event como parâmetro

* **object.style.x** = Com o método style, podemos definir o style x do objeto, exemplo:
  > **gameBoard.style.border = 'black 2px solid'**;

* **object.click()** = Simplesmente faz um clique em um objeto e um macete desse método é que ele pode Frazer um click em objetos que não tem padding.

### Elementos de objeto

* **object.classList** = permite acessar as classes e com ela vêm métodos para adicionar, retirar classes da forma que quiser.
    .add('x') = adiciona a classe x.
    .remove('x') = remove a classe x.
    .toggle('x') se tiver vai tirar e se não tiver, vai colocar.

## JSON

* ### O que é json?

  Json nada mais é do que um objeto que pode ser lido de diversas linguagens em várias formas e é um objeto que pode ser moldado muito facilmente, ele é ótimo para ser usado em banco de dados e transferência de informação. exemplo:

  ~~~javascript
    user = {
        nome,
        idade,
        sexo,
        email,
    }
  ~~~

* ### Criando um json com uma variável já com um valor

    ~~~javascript
    Json{
        "variableName1" : 10,
        "variableName2" : "hola"
    }
    ~~~

* ### Sobrescrever uma variável

  ~~~javascript
  Json{
      "variableName1" : 10,
      "variableName2" : "hola"
  }

  Json.variableName1 = 15;
  ~~~

* ###  Criando uma nova variável em um json

  ~~~javascript
  Json = {}
  Json.newVariable = x
  ~~~

* ### Deletando uma variável em Json

  ~~~javascript
  delete jsonName.variableName;
  ~~~

* ### Métodos utilizáveis em JSONs
  
  * **JSON.stringify(x, ...)** = Isso transforma um json em um json, só que todo em texto, esse é o principal motivo de um json ser tão incrível, isso torna os dados muito moldáveis.
  
  * **JSON.parse(x)** = O JSON.parse transforma um objeto stringficado em um objeto json novamente
