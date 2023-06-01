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
~~~

Perceba que colocamos EventEmitter como EventEmitter, não como events... Nós utilizamos todo o event e chamamos ele de EventEmitter, então primeira correção, vamos deixar o código mais clean e vamos fazer ele mais rápido simplesmente utilizando apenas o que nós precisamos:

~~~js
const events = require('events')

class Evento extends events.EventEmitter {}
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
~~~

* Nota: Vale lembrar que ainda estamos utilizando módulos sem o ESX, então os módulos vão ter que vir todos assim mesmo e é bem feio, dá para usar: `import {EventEmitter} from 'events'` e não usar o módulo todo

## - Mod  - :



-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/nodejs-curso-completo/learn/lecture/16743064#overview