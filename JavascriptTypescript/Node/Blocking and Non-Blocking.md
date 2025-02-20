# Blocking and Non-Blocking
2024-01-09
tags: [[-Index node]]

**Single treat** = É quando uma linguagem trabalha numa rota Única, como o javascript, compilando o código de cima para baixo, tendo uma relação, sem considerar async.

Porém o node tem um forma de lidar com essas chamadas, que é bem útil,  o **event loop** que faz várias coisas ao mesmo tempo. Isso entra em um conceito chamado "conexão não bloqueante" ou nonblocking

---
> **blocking** = gera uma fila.  
---  
> **non blocking** = aproveita uma fila para fazer tudo e ele pode usar libs nativas para fazer essas operações.
---

Usando a palavra chave sync no nodejs rodamos o conceito com o conceito blocking e quando não fizermos isso, poderemos rodar o segundo arquivo.

**Nota simples**: relação síncrona e assíncrona não fala sobre as treats, ele fala sobre requisição, quando o user require ou não algo, então um comando pode ser assincrono(ou sincrono) e blocking(ou non blocking);

## Blocking, Non Blocking - Conceitos

### Como ganhar performance com métodos bloqueantes e não bloqueantes

Pense em uma response feita pelo usuário de um formulário, digamos que o tempo para gravar essas informações no banco, seja de 40 milissegundos e para fazer a verificação de campos seja 5 milissegundos. Dessa forma, numa conexão bloqueante, o total é 45 milissegundos, enquanto numa não bloqueante, apenas 40 milissegundos, a diferença de performance é a **concorrência**.

A **concorrencia** é a capacidade que o **eventLoop** possui de executar funções em paralelo, diminuindo o tempo de execução.  
Lembrando que o **eventLoop** é o que dá a capacidade assíncrona do js.

E o **throughput** ou **taxa de transferência**, é o tempo de processamento em si, o tempo necessário para a execução, levando em conta como o sistema carrega as threads da linguagem.

### Cuidados ao utilizar blocking e Non blocking

Se um processo for fazer vários processos simultaneamente e for usar métodos non-blocking é sempre preferível usar tudo non blocking.

Os métodos non blocking, ou seja, que tem `async` no nome, fazem tudo de fato simultaneamente. Dessa forma, digamos que você fale para ler um arquivo com a biblioteca fs e depois, na linha abaixo, você manda apagar o arquivo, o que vai acontecer? O node vai começar a ler o arquivo, e depois, vai mandar para a segunda thread esse async, depois de mandar para a thread, durante a execução do fs, ele vai ler o próximo comando. Seguidamente, como o próximo comando é para deletar o arquivo, ele vai deletar o arquivo e como n existe mais arquivo, não existe mais leitura, então a thread anterior acaba assim que o arquivo for apagado, lendo e entregando para você, só o que ele leu do arquivo enquanto o arquivo ainda existia.

### NodeJs Single thread or multi-Thread?

**Single Thread** = faz todo o processamento dos scripts em ordem de execução, se você chamar um método 1 em cima do 2, o método 2 será depois do 1. Tudo assincronamente

**Multi-Thread** = Vai realizar tudo ao mesmo tempo. Tudo sincronicamente

Node.js é single thread mas pode mandar para uma fila sincrona que vão rodar outros processos simultaneamente, isso é possivel pela capacidade dos computadores atuais de rodar processos em núcleos diferentes

**Thread-Pool** = É o nome dado a capacidade do node de realizar e otimizar esses processos, pense em 4 núcleos e o node com uma biblioteca dele, chamada lib-uv,faz a melhor otimização possivel de threads pesadas em uma rota Multi-Thread, rodando esses processos assincronos da melhor forma possivel, dividindo-os em quatro núcleos.  
Ou seja, o node quando um processo demorar de mais para ser executado, em ultimo caso, a lib-uv vai mandar para o multi-thread essa task e 4 núcleos vão dividir essa tarefa para realiza-la da melhor e mais rápida forna possivel.



## Async, await e promises
### Programação Assíncrona com promises

Ele explicou o que é uma promise. Vou até fazer mais uma aula

~~~js
function Somar(value1, value2){
    return new Promise( (resolve, reject) => {
        if(typeof value1 =! 'number' && typeof value2 =! 'number') return
        
        try{
            setTimeout(function(){
                resolve(value1 + value2)
            },3000)
        }
        catch(error){ reject(error) }
    })
}

somar(10+20).then( result=>{
    console.log(`That is the result of your count Sir: ${result}`)
});
~~~

### Entendendo Async and Await

O async e o await só são usados quando possuímos mais de uma coisa em andamento, pois o intuito deles é não escrever tanto código quando em uma promise padrão se escrevermos vários then e catch, usamos ele para fugir do famoso inferno de promessas.

~~~js
function Somar(value1, value2){

    if(typeof value1 != 'number' && typeof value2 != 'number') return
    
    return new Promise( (resolve, reject) => {
        
        try{
            setTimeout(function(){
                resolve(value1 + value2)
            },3000)
        }
        catch(error){ reject(error) }
    })

}

function Multiplicar(value1, value2){

    if(typeof value1 != 'number' && typeof value2 != 'number') return

    return new Promise( (resolve, reject) => {
        
        try{
            setTimeout(function(){
                resolve(value1 * value2)
            },3000)
        }
        catch(error){ reject(error) }
    })
}

function Divisão(value1, value2){
    
    if(typeof value1 != 'number' && typeof value2 != 'number') return

    return new Promise( (resolve, reject) => {
        try{
            setTimeout(function(){
                resolve(value1 / value2)
            },3000)
        }
        catch(error){ reject(error) }
    })
}

async function main(value1, value2){

    try{ 
        console.log(`O resultado da sua soma é ${await Somar(value1, value2)} O resultado da sua multiplicação é ${await Multiplicar(value1,value2)} e o da sua divisão é ${await Divisão(value1, value2) }`);
    }catch(error){
        console.log(error)
    }
}

main(3, 10)
~~~

> **O resultado desse código foi:**  
O resultado da sua soma é 13 O resultado da sua multiplicação é 30 e o da sua divisão é 0.3

Isso mostra o quão poderoso é esse processo.

## child_process

### Criando processos em segundo plano com o módulo 

O node é single thread, contudo, podemos criar processos unicórnios, processos diferentes, assíncronos. Há quatro maneiras diferentes de se criar um processo filho no Node: `spawn()`, `fork()`, `exec()` e `execFile()`, vamos contemplar aqui o `spawn()`. Para isso, temos o child_process, um módulo ( API ) só de processos unicórnios, a terra sem lei da demora e programação temporal.

Dentro do child_process, temos três caras que vamos brincar nessa aula:

* STDIN→ Para quando colocamos dados 
* STDOUT → Para quando sai dados
* STDERR →Para quando tem algum erro

Esse método, o `spawn()`, **executa comandos de terminal** (bash) pelo child_process, que sempre emite eventos que podem ser capturados e tratados.
Os **eventos** que podemos usar para tratar os métodos do `ChildProcess` são: **"exit" "disconnect", "error", "close" e "message"** (*bem auto explicativos, qualquer dúvida, cheque o link 3 da bibliografia*), chamamos a execução dos processos do child_process de *steams* e cada stream tem seus processos, sendo **uma especificidade das stream que leem algo, o parâmetro data que recebe o input dado pelo usuário**. 

~~~js
const { spawn } = require('child_process');

const child = spawn('pwd'); // Comando de leitura

// Conterá um arquivo lido
child.stdout.on('data', data => {
  console.log(`stdout: \n ${data}`);
});

// Conterá um erro
child.stderr.on('data', data => {
  console.error(`stderr: \n ${data}`);
});
~~~

O comando spawn, têm como estrutura, a seguinte sintaxe:

> spawn('command', [args])

sendo args, argumentos que podem ser passados após o comando de terminal, exemplo: **ls -lh →`spawn( "ls", ["-lh"] )`**, qualquer outro argumento que viria após esse -lh seria colocado como outro item no vetor.

Portanto, o **processo que está sendo executado no `spawn()` possuí propriedades stout, stderr e stdin caso receba algum valor**. Veja o exemplo e junte as peças.

~~~js
const { spawn } = require("child_process");

const ls = spawn("ls", ["lh", "./Client"])

ls.stdout.on("data", data => {
	console.log(`stdout:\n${data}`)
})
ls.stderr.on("data", data => {
	console.error(`stderr:\n${data}`)
})

ls.on("close", code => {
	console.log(`processo realizado com sucesso em código ${code}`)
})
~~~

---

## Notas de conceitos usados nas aulas

Requirindo a biblioteca fs do node com um require podemos usar essa biblioteca para manipulações de arquivos, isso não foi muito bem explicado nessa aula, porém podemos usar os métodos dessa biblioteca:

* **fs.readingFileSync("caminho de um arquivo")** = esse método do fs lê um arquivo. É um método nonblockig

**Nota e insight**: É importante entender também a importância de lidar com eventos e não com promises no node, os processos podem dar errado, podem emitir diferentes erros e diferentes problemas, quando usamos eventos no lugar de promises, temos mais maneabilidade sobre coisas que podem acontecer no código

## Comandos de terminal

E para criarmos um arquivo para ler o professor usou outro conceito bem simples do console mas parece muito legal, para criar um arquivo no console:

O **echo** é um comando para escrever dentro do arquivo algo.
e usando ">" queremos colocar dentro de algo algo e se não temos um arquivo, vamos criar ele. Então:

> `echo "a simple haha" > haha.txt`

Vai criar um arquivo txt escrito haha.

veja o arquivo [fs-sync.js](https://github.com/kkphoenixgx/Nodejs-Course/blob/master/Projetos/arquivosSoltos/fs-sync.js) para entender o uso de non blocking e blocking na prática e aqui vai um guia para entender os métodos tirados do meu [dicionário (～￣▽￣)～](https://github.com/kkphoenixgx/Nodejs-Course/blob/master/Aulas/dicionario.md):

* **fs** = file system = ele pode ler manipular pastas e arquivos.
  * fs.readFile(Sync)(arquivo, (callBack)) = Ele lê um arquivo e se você quiser, lembrando que pode ser Sync ou não Sync, por isso o parenteses e o parenteses no callBack, porque se for Sync precisa do call back dizendo o que fazer enquanto está rodando esse carinha, coloca numa variável, por exemplo, se você dizer que a var = essaFn. *O buffer(tamanho limite) desse read é de 2gb*.

* **process.hrtime()[0]**:  
Isso pega o horario em milissegundos.

