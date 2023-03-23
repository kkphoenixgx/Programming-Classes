# Criando e disparando eventos
[IndexJs](../IndexJs.md)

Mod 101 -- **10/01/22**

INCRÍVEL!!!! tem como **criar** eventos em js, só a premissa disso já é algo de outro mundo. Mas a sintaxe para criar eventos parece bem simples, é só instanciar Event("event name") para criar um evento e com isso podemos usar um addEventListener para escutar quando esse evento acontecer, exemplo, temos um método de seleção de arquivos e quando selecionamos, obviamente, poderíamos criar um evento chamado de selectedAItem, por exemplo e quando esse método de seleção acontecesse, poderíamos através de um event listener fazer o que iria acontecer quando alguém selecionasse um evento. Isso é um ótimo jeito de criar vários event.listeners dentro de um programa e até com camadas diferentes. E para algo disparar um evento, podemos usar o **dispatchEvent(event)** para disparar o evento criado

~~~js
var someHtmlElement = document.getElementById('someHtml')
let event = new Event("event")

someHtmlELement.addEventListener("click", function(){

    someHtmlELement.dispatchEvent(event);

})

someHtmlElement.addEventListener("event", function(){

    console.log("Você pode fazer o que quiser")
})
~~~

Selecionamos um objeto html fictício para podermos criar um evento de click nele, assim quando clicarmos nesse objetoHtml estamos disparando o evento criado, que por si só dispara o nosso evento, podemos usar isso para coisas incríveis, javascript é simplesmente incrível.
