mod 36                                             26/08/21

-Eventos no JavaScript:

Eles explicam o que é um evento do JavaScript.

* Dá para usar o this. ao inves de passar um
parametro na função para se referênciar ao atributo
ou método em questão.

ex: 

    document.querySelectorAll("buttons").forEach( function(){

        this.addEventListener("click", ()=>{
            addNumber();
        })
    });

    ===(é a mesma coisa que:)

    document.querySelectorAll("buttons").
    forEach(function(btn){

        btn.addEventListener("click", ()=>{
            addNumber();
        });
    });

*Spa == Single Page Appplication, é uma página que só tem 
uma página, o método post e action funcionam na própria 
página;

dá para usar como parametro, o próprio evento no js
ex: 
    
    document.getElementById("form-user-create").
    addEventListener("submit", function(){
        event.x
    });

    sendo x o que você quer fazer com o evento.

preventDefault(): Que basicamente fala para parar tudo o
que esse cara disparou

