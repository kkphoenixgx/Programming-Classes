# Ciclo de vida de uma aplicação Node.js
2024-01-09
tags: [[-Index node]]

O node não necessariamente precisa ser usado numa aplicação web, ele pode ser usado em IOT, que é a internet das coisas (Internet of things) para comunicação com hardware, para aplicações web, com electron.js e para terminal, como o NPM, por exemplo, podemos até mesmo criar uma CLI, que é uma interface de linha de comando, com node.js.

E além disso em node.js podemos usar os recursos, alguns até já conhecidos:

* Apis assíncronas
* Callbacks functions
* Promises
* Async/Await

Para mim pelo menos de novo é mais o async/await

## A importância dos callbacks no node

Callbacks são funções que são usadas para burlar uma regra do js, basicamente quando chamamos uma função que precisa de uma quantidade de tempo para ser executada, a função só mostra o objeto da função, isso acontece porque na realidade quando retornamos uma função com um return, estamos na realidade retornando o objeto função e não o resultado da função e não tem como resolver isso mantendo o console.log() do lado de fora

Exemplo:

~~~js
function soma(){
    return setTimeout(()=>{
        return 3+1
    }, 3000)
}

console.log(soma());
~~~

isso vai retornar para você o objeto de função, não o 4 que era para retornar, porque meio que implicitamente, já que ela deveria demorar, você não tá pedindo o resultado da função e sim a função, entende? quando você coloca um console.log(função()) você tá pedindo a função em si, o js que entende que se for uma função síncrona, ela deve ser executada, então aí que entra a jogada dos callbacks, e se eu encapsular o que eu tenho que fazer em outra função? a primeira continua sendo síncrona e aí o js vai esperar de fato o tempo, veja o exemplo:

~~~js
function soma(conta, callBack){
    setTimeout(()=>{
        callBack(null, conta)
    }, 3000)
}

function resolverSoma(err, resolve){

    if(err) throw err
    
    console.log(resolve);

}

soma(3+1, resolverSoma);
~~~

O resultado dessa função será 4, pois eu encapsulei o console.log(), fazendo ele ser executado dentro da função, execute algo depois de algo. Isso é um callback

## Manipulando erros

É importante dizer que o `throw new Error('error')` já para a execução do código por default, um exemplo simples do que disse: 

![](./img/Pasted%20image%2020230603180252.png)
Nesse caso, usando try catch, o erro não para a execução pois foi devidamente encapsulado.

Com os eventos, podemos fazer também algo parecido com o `event.addListener()` que faz a mesma coisa que um on()

![](./img/Pasted%20image%2020230603180626.png)

