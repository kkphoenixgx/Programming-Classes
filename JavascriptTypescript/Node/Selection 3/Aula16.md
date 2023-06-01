# Eventos em node.js

Mod 23 -- **29/01/22**

Os eventos no lado do servidor(Back-end), com node.js são diferentes dos eventos no lado do cliente(Front-end) já que os eventos nativos, como 'click' são gerados pelo DOM, e no back-end, não possuí o DOM, porém podemos usar eventos, usando um módulo nativo do js. E talvez, muito provavelmente não, mas talvez você esteja se perguntando após parar para analisar esse pequeno mind-blowing "Por que caralhinhos voadores iriamos usar eventos no back-end?", se você já está familiarizado com back-end, talvez já saiba, mas você, meu caro amigo, que como eu está começando agora, vou te explicar \\(￣︶￣*\\)).

Pense em um servidor rodando uma tarefa full time, com uma promise, o código ficaria gigantesco e muito mal encapsulado, concorda? Por que imagina, em um processamento que está rodando com longo período de duração no lado do servidor, você vai ter uma pilha de métodos para chamar quando acabar a promise e vai ser tudo no then, talvez uma aplicação toda mude com isso, e se você parar para analisar o contexto semântico, isso é um evento. Pensa no seu front-end, quando alguém faz um click, você encapsula o evento para realizar alguma tarefa, em uma tarefa multi-thread, a mesma coisa, precisamos encapsular o trecho do código para gerar legibilidade e um código mais leve.

## Criando um evento sem muita profundidade

Usamos o módulo nativo events para gerar eventos e para criar esse event vamos ter que usar herança, usando extends e podemos usar os métodos da classe nativa para criar e emitir o evento, usando **on** e **emit**

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
~~~
