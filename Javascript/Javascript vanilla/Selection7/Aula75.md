# Aula75
2022-12-13
tags: [[../IndexJs]]

## - Mod 114 - : Prototype

Um prototype é uma forma simples de mecher nas propriedades de um elemento, definir métodos que poderão ser usados em um elemento apenas chamadno o método.
Para definir um prototype, temos que entender que não definimos prototype para um só elemento e sim para todos os elementos pois estamos configurando algo para o Element, para qualquer elemento... Assim definimos um prototype

~~~js
// podemos simplesmente definir nessa estura:
Element.prototype.someAtribute = 'Yeah'
Element.prototype.someMethod = function(params){
	// block
}

anyElement.someMethodOrSomeAtribute
// or
anyElement.someMethodOrSomeAtribute(params)
~~~

Importante dizer o pq de usar essa estutura com o anonyms function ao invés de uma arrow function, dessa forma, podemos fechar o escopo da função e usar o this, e ao usar o this estaremos referenciado ao próprio elemento. Aqui vai uma série de prototypes bem utilizados que você pode ate copiar e colar como um arquivo util

~~~js
export function elementsPrototypes(){

    Element.prototype.hide = function () { this.style.display = 'none'; return this }

    Element.prototype.show = function () { this.style.display = 'block'; return this }

    Element.prototype.toggle = function () {

        this.style.display = (this.style.display === 'none') ? 'block' : 'none';

        return this
    }

    Element.prototype.on = function (events, fn) {

        events.split(' ').forEach( event=> {

            this.addEventListener(event, fn)

        });

        return this
    }
    Element.prototype.css = function(styleObject){

        for (const name in styleObject) {

            this.style[name] = styleObject[name]

        }

        return this
    }

    Element.prototype.addClass = function(className){

        this.classList.add(className)

        return this
    }
    Element.prototype.removeClass = function (className){

        this.classList.remove(className)

        return this
    }
    Element.prototype.hasCLass = function (className){

        return this.classList.contains(className)
    }

    Element.prototype.toggleClass = function (className){

        this.classList.toggle(className)

        return this
    }

}
~~~

-----------------------------------------------

## - Mod 115 - :  Criando retro-atividade dos paineis

Não teve conteudos novos, apenas avanço do projeto em si

## Bibliografia

https://www.udemy.com/course/javascript-curso-completo/learn/lecture/10507710?start=555#overview

https://www.udemy.com/course/javascript-curso-completo/learn/lecture/10507712#overview