# Aula 24
2023-06-01
tags: [Index node](../Index%20node.md)

## - Mod 31 - : Controlando eventos

Parar controlarmos eventos no Node, usamos uma API de Eventos (Events) que têm acesso a manipulação dos mesmos. No js padrão, usamos os eventos de browser, contudo, no back-end não temos acesso a nenhum deles, apenas a API Event, que, embora tenhamos acesso também no js padrão, no node ela será essencial para lidar com eventos, principalmente quando falamos de padrões de projeto que necessitam da função de eventos, como o padrão Observers e outros.

Lembra da [Aula16](../Selection%203/Aula16.md)? Aqui está o código que foi utilizado:

~~~js
const EventEmitter = require('events')

class Evento extends EventEmitter {}
const meuEvento = new Evento();

meuEvento.on( 'finished', (x,y) => {
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

Perceba que colocamos EventEmitter como EventEmitter, não como events... Nós utilizamos todo o event e chamamos ele de EventEmitter, então primeira correção, vamos deixar o código mais clean e vamos fazer ele mais rápido simplesmente utilizando apenas o que nós precisamos:

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

Então perceba que temos dois papeis fundamentais, o Emissor "upServer" e o Assinante meuevento.on(), o on(), a estrutura que iria compor o on(), é o assinante, poderíamos simplesmente encapsular para ficar de melhor entendimento:

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


## - Mod  - : Criando processos em segundo plano



-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/nodejs-curso-completo/learn/lecture/16743064#overview