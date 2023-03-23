# Refatorando a classe HttpRequest
[IndexJs](../IndexJs.md)

Mod 83 -- **14/11/21**

Essa aula foi mais para refatorar o que fizemos em aulas passadas, mas eu vou usar o tempo dessa aula para estudar toda a questão das promises que eu ainda não peguei direito, porém primeiro vou escrever o conteúdo da aula.

## - Notas de enquanto refatoro -

Basicamente o que queremos é criar uma classe de HttpRequest com um método get que retorna uma promise, porque so vamos fazer o request dos dados do banco de dados caso o httpRequest der certo. Essa é a premissa, se tiver alguma nota a fazer vai estar depois desse emoji fofo, se não, só vamos para o conceito de promise que já é lindo e já vale essa nota. ༼ つ ◕_◕ ༽つ

Atualização da nota dos métodos do ajax e adição da classe pré-determinada XMLHttpRequest(), que é o ajax.

## - Promises do js - **15/11/21**

Uma promisee em js é basicamente um objeto que retorna um sucesso ou uma falha de uma operação assincrona. Somente para ficar claro os conceitos base:

### Sincrono e Assincrono

**Assincrona**: Uma operação que acontece independentemente do usuário  
**Sincrona**: Ocorre somente quando acontece um evento do usuário que engatilha uma operação.

Agora uma informação adicional usando esses conhecimentos que vai ajudar você a entender bem esse conceito, o javascript roda o seu código assincronamente, ou seja, ele roda todas as funções que você escreveu linearmente, porém por exemplo quando acontece uma função que é sincrona, como um setTimeOut, você faz algo depois de certo tempo, você seta por exemplo, algo para acontecer daqui a 5 segundos, o js vai tacar essa função para rodar em uma área separada dependendo de algo dessa função e vai continuar rodando as outras funções linearmente e executar a outra função depois dos 5s simultaneamente. E ese caminho linear a gente chama de **main thread**.

### Sintaxe de uma promise

Uma promise pode encapsular operações assincronas, trazendo várias vantagens em seu uso.

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

    para deixar o código mais legivel 
    
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
