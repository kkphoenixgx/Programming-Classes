# Eventos em node.js
tags: [[-Index node]]

Os eventos no lado do servidor(Back-end), com node.js são diferentes dos eventos no lado do cliente(Front-end) já que os eventos nativos, como 'click' são gerados pelo DOM, e no back-end, não possuí o DOM.  
Porém, podemos usar eventos, usando um módulo nativo do js. E talvez, muito provavelmente não, mas talvez, você esteja se perguntando após parar para analisar esse pequeno mind-blowing: 

> "Por que caralhinhos voadores iriamos usar eventos no back-end?"

Se você já está familiarizado com back-end, talvez já saiba, mas você, meu caro amigo, que como eu está começando agora, vou te explicar 
\\(￣︶￣*\\)).

Pense em um servidor rodando uma tarefa full time, com uma promise, o código ficaria gigantesco e muito mal encapsulado, concorda?  
Por que imagina, em um processamento que está rodando com longo período de duração no lado do servidor, você vai ter uma pilha de métodos para chamar quando acabar a promise e vai ser tudo no then, talvez uma aplicação toda mude com isso, e se você parar para analisar o contexto semântico, isso é um evento. 

Pensa no seu front-end, quando alguém faz um click, você encapsula o evento para realizar alguma tarefa, em uma tarefa multi-thread, a mesma coisa, precisamos encapsular o trecho do código para gerar legibilidade e um código mais leve.

## Criando um evento sem muita profundidade

Usamos o módulo nativo events para gerar eventos, e para criar esse event vamos ter que usar herança, usando extends e os métodos da classe nativa para criar e emitir o evento, usando **on** e **emit**.

~~~js
const EventEmitter = require('events')

class Evento extends EventEmitter {}
const meuEvento = new Evento();

meuEvento.on('finished', (x,y)=>{
    console.log(`finished :${x, y}`)
})

// vamos supor que temos esse método para subir o servidor
function upServer(){
    createServer().
      .then( () => {
				meuEvento.emit('finished');
      }))
			.catch( (err) => { console.error(err) } );
}

upServer();
~~~

## Controlando eventos

Parar controlarmos eventos no Node, usamos uma API de Eventos (Events) que têm acesso a manipulação dos mesmos. No js padrão, usamos os eventos de browser, contudo, no back-end não temos acesso a nenhum deles, apenas a API Event, que, embora tenhamos acesso também no js padrão, no node ela será essencial para lidar com eventos, principalmente quando falamos de padrões de projeto que necessitam da função de eventos, como o padrão Observers e outros.

Veja o código do [[#Criando um evento sem muita profundidade]] Perceba que colocamos `EventEmitter` como `EventEmitter`, não como events... Nós utilizamos todo o event e chamamos ele de `EventEmitter`, então, primeira correção: Vamos deixar o código mais clean e vamos fazer ele mais rápido, simplesmente utilizando apenas o que nós precisamos:

~~~js
const {EventEmitter} = require('events')

class Evento extends EventEmitter {}
const meuEvento = new Evento();

meuEvento.on( 'finished', (x,y) => {
    console.log(`finished :${x, y}`)
})

// vamos supor que temos esse método para subir um servidor
function upServer(){
	createServer().
		.then( () => {
			meuEvento.emit('finished', "xParameter", "yParameter");
		}))
		.catch( (err) => { console.error(err) } );
}

upServer();
~~~

Então perceba que temos dois papeis fundamentais, o Emissor "upServer" e o Assinante `meuevento.on()`, o `on()`, a estrutura que iria compor o `on()`, é o assinante, poderíamos simplesmente encapsular para ficar de melhor entendimento:

~~~js
const {EventEmitter} = require('events')

class Evento extends EventEmitter {}
const meuEvento = new Evento();

// O Assinante
function logServerResponseSubscriber(){
	meuEvento.on( 'finished', () => {
	    console.log(`finished: ${x, y}`)
	})
}

// O emissor
function upServerEmiter(){
	createServer().
		.then( () => {
			meuEvento.emit('finished', "xParameter", "yParameter");
		}))
		.catch( (err) => { console.error(err) } );
}

upServerEmiter();
~~~

